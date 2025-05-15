package com.javaclimb.puzzlegameback.service;

import java.util.List;

import com.javaclimb.puzzlegameback.entity.query.RoleQuery;
import com.javaclimb.puzzlegameback.entity.po.Role;
import com.javaclimb.puzzlegameback.entity.vo.PaginationResultVO;


/**
 *  业务接口
 */
public interface RoleService {

	/**
	 * 根据条件查询列表
	 */
	List<Role> findListByParam(RoleQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(RoleQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<Role> findListByPage(RoleQuery param);

	/**
	 * 新增
	 */
	Integer add(Role bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<Role> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Role> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(Role bean,RoleQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(RoleQuery param);

	/**
	 * 根据RoleId查询对象
	 */
	Role getRoleByRoleId(String roleId);


	/**
	 * 根据RoleId修改
	 */
	Integer updateRoleByRoleId(Role bean,String roleId);


	/**
	 * 根据RoleId删除
	 */
	Integer deleteRoleByRoleId(String roleId);

}