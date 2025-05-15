package com.javaclimb.puzzlegameback.service;

import java.util.List;

import com.javaclimb.puzzlegameback.entity.query.StoryChapterQuery;
import com.javaclimb.puzzlegameback.entity.po.StoryChapter;
import com.javaclimb.puzzlegameback.entity.vo.PaginationResultVO;
import org.apache.ibatis.annotations.Param;


/**
 *  业务接口
 */
public interface StoryChapterService {

	/**
	 * 根据条件查询列表
	 */
	List<StoryChapter> findListByParam(StoryChapterQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(StoryChapterQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<StoryChapter> findListByPage(StoryChapterQuery param);

	/**
	 * 新增
	 */
	Integer add(StoryChapter bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<StoryChapter> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<StoryChapter> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(StoryChapter bean,StoryChapterQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(StoryChapterQuery param);

	/**
	 * 根据StoryId查询对象
	 */
	StoryChapter getStoryChapterByStoryId(String storyId);


	/**
	 * 根据StoryId修改
	 */
	Integer updateStoryChapterByStoryId(StoryChapter bean,String storyId);


	/**
	 * 根据StoryId删除
	 */
	Integer deleteStoryChapterByStoryId(String storyId);

	Integer deleteStoryChapterByChapterId(String ChapterId);

	List<StoryChapter> selectChapterByStoryId(String storyId);
}