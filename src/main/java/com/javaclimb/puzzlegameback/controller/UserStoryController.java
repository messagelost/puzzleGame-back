package com.javaclimb.puzzlegameback.controller;

import java.util.List;

import com.javaclimb.puzzlegameback.entity.query.UserStoryQuery;
import com.javaclimb.puzzlegameback.entity.po.UserStory;
import com.javaclimb.puzzlegameback.entity.vo.ResponseVO;
import com.javaclimb.puzzlegameback.service.UserStoryService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *  Controller
 */
@RestController("userStoryController")
@RequestMapping("/userStory")
public class UserStoryController extends ABaseController{

	@Resource
	private UserStoryService userStoryService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(UserStoryQuery query){
		return getSuccessResponseVO(userStoryService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(UserStory bean) {
		userStoryService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<UserStory> listBean) {
		userStoryService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<UserStory> listBean) {
		userStoryService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserIdAndStoryId查询对象
	 */
	@RequestMapping("/getUserStoryByUserIdAndStoryId")
	public ResponseVO getUserStoryByUserIdAndStoryId(String userId,String storyId) {
		UserStory userStory = userStoryService.getUserStoryByUserIdAndStoryId(userId,storyId);
		if(userStory == null) {
			userStory = new UserStory();
			userStory.setUserId(userId);
			userStory.setStoryId(storyId);
			userStory.setCurrentChapter(0);
			userStoryService.add(userStory);
		}
		return getSuccessResponseVO(userStory);
	}

	/**
	 * 根据UserIdAndStoryId修改对象
	 */
	@RequestMapping("/updateUserStoryByUserIdAndStoryId")
	public ResponseVO updateUserStoryByUserIdAndStoryId(@RequestBody UserStory bean) {
		userStoryService.updateUserStoryByUserIdAndStoryId(bean, bean.getUserId(), bean.getStoryId());
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据UserIdAndStoryId删除
	 */
	@RequestMapping("/deleteUserStoryByUserIdAndStoryId")
	public ResponseVO deleteUserStoryByUserIdAndStoryId(String userId,String storyId) {
		userStoryService.deleteUserStoryByUserIdAndStoryId(userId,storyId);
		return getSuccessResponseVO(null);
	}
}