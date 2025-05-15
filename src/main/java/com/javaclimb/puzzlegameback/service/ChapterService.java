package com.javaclimb.puzzlegameback.service;

import java.util.List;

import com.javaclimb.puzzlegameback.entity.query.ChapterQuery;
import com.javaclimb.puzzlegameback.entity.po.Chapter;
import com.javaclimb.puzzlegameback.entity.vo.PaginationResultVO;


/**
 *  业务接口
 */
public interface ChapterService {

	/**
	 * 根据条件查询列表
	 */
	List<Chapter> findListByParam(ChapterQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(ChapterQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<Chapter> findListByPage(ChapterQuery param);

	/**
	 * 新增
	 */
	String add(Chapter bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<Chapter> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Chapter> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(Chapter bean,ChapterQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(ChapterQuery param);

	/**
	 * 根据ChapterId查询对象
	 */
	Chapter getChapterByChapterId(String chapterId);


	/**
	 * 根据ChapterId修改
	 */
	Integer updateChapterByChapterId(Chapter bean,String chapterId);


	/**
	 * 根据ChapterId删除
	 */
	Integer deleteChapterByChapterId(String chapterId);

}