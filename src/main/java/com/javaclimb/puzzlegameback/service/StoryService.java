package com.javaclimb.puzzlegameback.service;

import java.util.List;

import com.javaclimb.puzzlegameback.entity.query.StoryQuery;
import com.javaclimb.puzzlegameback.entity.po.Story;
import com.javaclimb.puzzlegameback.entity.vo.PaginationResultVO;


/**
 *  业务接口
 */
public interface StoryService {

	/**
	 * 根据条件查询列表
	 */
	List<Story> findListByParam(StoryQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(StoryQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<Story> findListByPage(StoryQuery param);

	/**
	 * 新增
	 */
	String add(Story bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<Story> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Story> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(Story bean,StoryQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(StoryQuery param);

	/**
	 * 根据StoryId查询对象
	 */
	Story getStoryByStoryId(String storyId);


	/**
	 * 根据StoryId修改
	 */
	Integer updateStoryByStoryId(Story bean,String storyId);


	/**
	 * 根据StoryId删除
	 */
	Integer deleteStoryByStoryId(String storyId);

}