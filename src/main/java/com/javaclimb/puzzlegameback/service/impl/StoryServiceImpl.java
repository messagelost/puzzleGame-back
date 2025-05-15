package com.javaclimb.puzzlegameback.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.javaclimb.puzzlegameback.entity.enums.PageSize;
import com.javaclimb.puzzlegameback.entity.query.StoryQuery;
import com.javaclimb.puzzlegameback.entity.po.Story;
import com.javaclimb.puzzlegameback.entity.vo.PaginationResultVO;
import com.javaclimb.puzzlegameback.entity.query.SimplePage;
import com.javaclimb.puzzlegameback.mappers.StoryMapper;
import com.javaclimb.puzzlegameback.service.StoryService;
import com.javaclimb.puzzlegameback.utils.StringTools;


/**
 *  业务接口实现
 */
@Service("storyService")
public class StoryServiceImpl implements StoryService {

	@Resource
	private StoryMapper<Story, StoryQuery> storyMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Story> findListByParam(StoryQuery param) {
		return this.storyMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(StoryQuery param) {
		return this.storyMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<Story> findListByPage(StoryQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<Story> list = this.findListByParam(param);
		PaginationResultVO<Story> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public String add(Story bean) {
		Date curDate = new Date();
		String storyId = StringTools.getStoryId();
		bean.setStoryId(storyId);
		if(bean.getName() == null){
			bean.setName("未命名故事");
		}
		bean.setCreateTime(curDate);
		bean.setUpdateTime(curDate);
		this.storyMapper.insert(bean);
		return storyId;
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<Story> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.storyMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Story> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.storyMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(Story bean, StoryQuery param) {
		StringTools.checkParam(param);
		return this.storyMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(StoryQuery param) {
		StringTools.checkParam(param);
		return this.storyMapper.deleteByParam(param);
	}

	/**
	 * 根据StoryId获取对象
	 */
	@Override
	public Story getStoryByStoryId(String storyId) {
		return this.storyMapper.selectByStoryId(storyId);
	}

	/**
	 * 根据StoryId修改
	 */
	@Override
	public Integer updateStoryByStoryId(Story bean, String storyId) {
		return this.storyMapper.updateByStoryId(bean, storyId);
	}

	/**
	 * 根据StoryId删除
	 */
	@Override
	public Integer deleteStoryByStoryId(String storyId) {
		return this.storyMapper.deleteByStoryId(storyId);
	}
}