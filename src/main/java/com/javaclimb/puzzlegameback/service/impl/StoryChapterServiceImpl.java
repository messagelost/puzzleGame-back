package com.javaclimb.puzzlegameback.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.javaclimb.puzzlegameback.entity.enums.PageSize;
import com.javaclimb.puzzlegameback.entity.query.StoryChapterQuery;
import com.javaclimb.puzzlegameback.entity.po.StoryChapter;
import com.javaclimb.puzzlegameback.entity.vo.PaginationResultVO;
import com.javaclimb.puzzlegameback.entity.query.SimplePage;
import com.javaclimb.puzzlegameback.mappers.StoryChapterMapper;
import com.javaclimb.puzzlegameback.service.StoryChapterService;
import com.javaclimb.puzzlegameback.utils.StringTools;


/**
 *  业务接口实现
 */
@Service("storyChapterService")
public class StoryChapterServiceImpl implements StoryChapterService {

	@Resource
	private StoryChapterMapper<StoryChapter, StoryChapterQuery> storyChapterMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<StoryChapter> findListByParam(StoryChapterQuery param) {
		return this.storyChapterMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(StoryChapterQuery param) {
		return this.storyChapterMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<StoryChapter> findListByPage(StoryChapterQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<StoryChapter> list = this.findListByParam(param);
		PaginationResultVO<StoryChapter> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(StoryChapter bean) {
		return this.storyChapterMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<StoryChapter> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.storyChapterMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<StoryChapter> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.storyChapterMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(StoryChapter bean, StoryChapterQuery param) {
		StringTools.checkParam(param);
		return this.storyChapterMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(StoryChapterQuery param) {
		StringTools.checkParam(param);
		return this.storyChapterMapper.deleteByParam(param);
	}

	/**
	 * 根据StoryId获取对象
	 */
	@Override
	public StoryChapter getStoryChapterByStoryId(String storyId) {
		return this.storyChapterMapper.selectByStoryId(storyId);
	}

	/**
	 * 根据StoryId修改
	 */
	@Override
	public Integer updateStoryChapterByStoryId(StoryChapter bean, String storyId) {
		return this.storyChapterMapper.updateByStoryId(bean, storyId);
	}

	/**
	 * 根据StoryId删除
	 */
	@Override
	public Integer deleteStoryChapterByStoryId(String storyId) {
		return this.storyChapterMapper.deleteByStoryId(storyId);
	}

	@Override
	public Integer deleteStoryChapterByChapterId(String chapterId) {
		return this.storyChapterMapper.deleteByChapterId(chapterId);
	}

	@Override
	public List<StoryChapter> selectChapterByStoryId(String storyId) {
		return this.storyChapterMapper.selectChapterByStoryId(storyId);
	}
}