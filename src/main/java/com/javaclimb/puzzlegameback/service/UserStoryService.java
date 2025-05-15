package com.javaclimb.puzzlegameback.service;

import java.util.List;

import com.javaclimb.puzzlegameback.entity.query.UserStoryQuery;
import com.javaclimb.puzzlegameback.entity.po.UserStory;
import com.javaclimb.puzzlegameback.entity.vo.PaginationResultVO;


/**
 *  业务接口
 */
public interface UserStoryService {

	/**
	 * 根据条件查询列表
	 */
	List<UserStory> findListByParam(UserStoryQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(UserStoryQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<UserStory> findListByPage(UserStoryQuery param);

	/**
	 * 新增
	 */
	Integer add(UserStory bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<UserStory> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<UserStory> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(UserStory bean,UserStoryQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(UserStoryQuery param);

	/**
	 * 根据UserIdAndStoryId查询对象
	 */
	UserStory getUserStoryByUserIdAndStoryId(String userId,String storyId);


	/**
	 * 根据UserIdAndStoryId修改
	 */
	Integer updateUserStoryByUserIdAndStoryId(UserStory bean,String userId,String storyId);


	/**
	 * 根据UserIdAndStoryId删除
	 */
	Integer deleteUserStoryByUserIdAndStoryId(String userId,String storyId);

}