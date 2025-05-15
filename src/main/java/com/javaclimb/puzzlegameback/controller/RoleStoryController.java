package com.javaclimb.puzzlegameback.controller;

import java.util.List;

import com.javaclimb.puzzlegameback.entity.query.RoleStoryQuery;
import com.javaclimb.puzzlegameback.entity.po.RoleStory;
import com.javaclimb.puzzlegameback.entity.vo.ResponseVO;
import com.javaclimb.puzzlegameback.service.RoleStoryService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *  Controller
 */
@RestController("roleStoryController")
@RequestMapping("/roleStory")
public class RoleStoryController extends ABaseController{

	@Resource
	private RoleStoryService roleStoryService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(RoleStoryQuery query){
		return getSuccessResponseVO(roleStoryService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(RoleStory bean) {
		roleStoryService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<RoleStory> listBean) {
		roleStoryService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<RoleStory> listBean) {
		roleStoryService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据RoleIdAndStoryId查询对象
	 */
	@RequestMapping("/getRoleStoryByRoleIdAndStoryId")
	public ResponseVO getRoleStoryByRoleIdAndStoryId(String roleId,String storyId) {
		return getSuccessResponseVO(roleStoryService.getRoleStoryByRoleIdAndStoryId(roleId,storyId));
	}

	/**
	 * 根据RoleIdAndStoryId修改对象
	 */
	@RequestMapping("/updateRoleStoryByRoleIdAndStoryId")
	public ResponseVO updateRoleStoryByRoleIdAndStoryId(RoleStory bean,String roleId,String storyId) {
		roleStoryService.updateRoleStoryByRoleIdAndStoryId(bean,roleId,storyId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据RoleIdAndStoryId删除
	 */
	@RequestMapping("/deleteRoleStoryByRoleIdAndStoryId")
	public ResponseVO deleteRoleStoryByRoleIdAndStoryId(String roleId,String storyId) {
		roleStoryService.deleteRoleStoryByRoleIdAndStoryId(roleId,storyId);
		return getSuccessResponseVO(null);
	}
}