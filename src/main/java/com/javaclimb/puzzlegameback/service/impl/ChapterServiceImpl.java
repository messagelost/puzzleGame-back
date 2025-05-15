package com.javaclimb.puzzlegameback.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.javaclimb.puzzlegameback.entity.enums.PageSize;
import com.javaclimb.puzzlegameback.entity.query.ChapterQuery;
import com.javaclimb.puzzlegameback.entity.po.Chapter;
import com.javaclimb.puzzlegameback.entity.vo.PaginationResultVO;
import com.javaclimb.puzzlegameback.entity.query.SimplePage;
import com.javaclimb.puzzlegameback.mappers.ChapterMapper;
import com.javaclimb.puzzlegameback.service.ChapterService;
import com.javaclimb.puzzlegameback.utils.StringTools;


/**
 *  业务接口实现
 */
@Service("chapterService")
public class ChapterServiceImpl implements ChapterService {

	@Resource
	private ChapterMapper<Chapter, ChapterQuery> chapterMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Chapter> findListByParam(ChapterQuery param) {
		return this.chapterMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(ChapterQuery param) {
		return this.chapterMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<Chapter> findListByPage(ChapterQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<Chapter> list = this.findListByParam(param);
		PaginationResultVO<Chapter> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public String add(Chapter bean) {
		Date curdate = new Date();
		String chapterId = StringTools.getChapterId();
		bean.setChapterId(chapterId);
		bean.setCreateTime(curdate);
		bean.setUpdateTime(curdate);
		this.chapterMapper.insert(bean);
		return chapterId;
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<Chapter> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.chapterMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Chapter> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.chapterMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(Chapter bean, ChapterQuery param) {
		StringTools.checkParam(param);
		return this.chapterMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(ChapterQuery param) {
		StringTools.checkParam(param);
		return this.chapterMapper.deleteByParam(param);
	}

	/**
	 * 根据ChapterId获取对象
	 */
	@Override
	public Chapter getChapterByChapterId(String chapterId) {
		return this.chapterMapper.selectByChapterId(chapterId);
	}

	/**
	 * 根据ChapterId修改
	 */
	@Override
	public Integer updateChapterByChapterId(Chapter bean, String chapterId) {
		return this.chapterMapper.updateByChapterId(bean, chapterId);
	}

	/**
	 * 根据ChapterId删除
	 */
	@Override
	public Integer deleteChapterByChapterId(String chapterId) {
		return this.chapterMapper.deleteByChapterId(chapterId);
	}
}