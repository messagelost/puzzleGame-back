package com.javaclimb.puzzlegameback.controller;

import java.util.List;

import com.javaclimb.puzzlegameback.entity.query.StoryQuery;
import com.javaclimb.puzzlegameback.entity.po.Story;
import com.javaclimb.puzzlegameback.entity.vo.ResponseVO;
import com.javaclimb.puzzlegameback.service.StoryService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *  Controller
 */
@RestController("storyController")
@RequestMapping("/story")
public class StoryController extends ABaseController{

	@Resource
	private StoryService storyService;
	/**
	 * 查询所有故事
	 */
	@RequestMapping("/loadStoryList")
	public ResponseVO loadStoryList(StoryQuery query){
		query.setPageSize(Integer.MAX_VALUE);
		return getSuccessResponseVO(storyService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(@RequestBody Story bean) {
		String storyId = storyService.add(bean);
		return getSuccessResponseVO(storyId);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<Story> listBean) {
		storyService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<Story> listBean) {
		storyService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据StoryId查询对象
	 */
	@RequestMapping("/getStoryByStoryId")
	public ResponseVO getStoryByStoryId(@RequestParam String storyId) {
		return getSuccessResponseVO(storyService.getStoryByStoryId(storyId));
	}

	/**
	 * 根据StoryId修改对象
	 */
	@RequestMapping("/updateStoryByStoryId")
	public ResponseVO updateStoryByStoryId(@RequestBody Story bean) {
		storyService.updateStoryByStoryId(bean,bean.getStoryId());
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据StoryId删除
	 */
	@RequestMapping("/deleteStoryByStoryId")
	public ResponseVO deleteStoryByStoryId(@RequestParam String storyId) {
		storyService.deleteStoryByStoryId(storyId);
		return getSuccessResponseVO(null);
	}
}