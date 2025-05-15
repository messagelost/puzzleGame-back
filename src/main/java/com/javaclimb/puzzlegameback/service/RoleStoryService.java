package com.javaclimb.puzzlegameback.service;

import java.util.List;

import com.javaclimb.puzzlegameback.entity.query.RoleStoryQuery;
import com.javaclimb.puzzlegameback.entity.po.RoleStory;
import com.javaclimb.puzzlegameback.entity.vo.PaginationResultVO;


/**
 *  业务接口
 */
public interface RoleStoryService {

	/**
	 * 根据条件查询列表
	 */
	List<RoleStory> findListByParam(RoleStoryQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(RoleStoryQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<RoleStory> findListByPage(RoleStoryQuery param);

	/**
	 * 新增
	 */
	Integer add(RoleStory bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<RoleStory> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<RoleStory> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(RoleStory bean,RoleStoryQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(RoleStoryQuery param);

	/**
	 * 根据RoleIdAndStoryId查询对象
	 */
	RoleStory getRoleStoryByRoleIdAndStoryId(String roleId,String storyId);


	/**
	 * 根据RoleIdAndStoryId修改
	 */
	Integer updateRoleStoryByRoleIdAndStoryId(RoleStory bean,String roleId,String storyId);


	/**
	 * 根据RoleIdAndStoryId删除
	 */
	Integer deleteRoleStoryByRoleIdAndStoryId(String roleId,String storyId);

}