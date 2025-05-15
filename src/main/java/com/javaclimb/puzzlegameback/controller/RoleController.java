package com.javaclimb.puzzlegameback.controller;

import java.util.List;

import com.javaclimb.puzzlegameback.entity.query.RoleQuery;
import com.javaclimb.puzzlegameback.entity.po.Role;
import com.javaclimb.puzzlegameback.entity.vo.ResponseVO;
import com.javaclimb.puzzlegameback.service.RoleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *  Controller
 */
@RestController("roleController")
@RequestMapping("/role")
public class RoleController extends ABaseController{

	@Resource
	private RoleService roleService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(RoleQuery query){
		return getSuccessResponseVO(roleService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(Role bean) {
		roleService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<Role> listBean) {
		roleService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<Role> listBean) {
		roleService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据RoleId查询对象
	 */
	@RequestMapping("/getRoleByRoleId")
	public ResponseVO getRoleByRoleId(String roleId) {
		return getSuccessResponseVO(roleService.getRoleByRoleId(roleId));
	}

	/**
	 * 根据RoleId修改对象
	 */
	@RequestMapping("/updateRoleByRoleId")
	public ResponseVO updateRoleByRoleId(Role bean,String roleId) {
		roleService.updateRoleByRoleId(bean,roleId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据RoleId删除
	 */
	@RequestMapping("/deleteRoleByRoleId")
	public ResponseVO deleteRoleByRoleId(String roleId) {
		roleService.deleteRoleByRoleId(roleId);
		return getSuccessResponseVO(null);
	}
}