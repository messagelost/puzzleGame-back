package com.javaclimb.puzzlegameback.controller;

import java.util.List;

import com.javaclimb.puzzlegameback.entity.query.StoryChapterQuery;
import com.javaclimb.puzzlegameback.entity.po.StoryChapter;
import com.javaclimb.puzzlegameback.entity.vo.ResponseVO;
import com.javaclimb.puzzlegameback.service.StoryChapterService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *  Controller
 */
@RestController("storyChapterController")
@RequestMapping("/storyChapter")
public class StoryChapterController extends ABaseController{

	@Resource
	private StoryChapterService storyChapterService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(StoryChapterQuery query){
		return getSuccessResponseVO(storyChapterService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(@RequestBody StoryChapter bean) {
		storyChapterService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<StoryChapter> listBean) {
		storyChapterService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<StoryChapter> listBean) {
		storyChapterService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据StoryId查询对象
	 */
	@RequestMapping("/getStoryChapterByStoryId")
	public ResponseVO getStoryChapterByStoryId(String storyId) {
		return getSuccessResponseVO(storyChapterService.getStoryChapterByStoryId(storyId));
	}

	/**
	 * 根据StoryId查询章节
	 */
	@RequestMapping("/selectChapterByStoryId")
	public ResponseVO selectChapterByStoryId(String storyId) {
		return getSuccessResponseVO(storyChapterService.selectChapterByStoryId(storyId));
	}

	/**
	 * 根据StoryId修改对象
	 */
	@RequestMapping("/updateStoryChapterByStoryId")
	public ResponseVO updateStoryChapterByStoryId(StoryChapter bean,String storyId) {
		storyChapterService.updateStoryChapterByStoryId(bean,storyId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据StoryId删除
	 */
	@RequestMapping("/deleteStoryChapterByStoryId")
	public ResponseVO deleteStoryChapterByStoryId(@RequestParam String storyId) {
		storyChapterService.deleteStoryChapterByStoryId(storyId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据ChapterId删除
	 */
	@RequestMapping("/deleteStoryChapterByChapterId")
	public ResponseVO deleteStoryChapterByChapterId(@RequestParam String chapterId) {
		storyChapterService.deleteStoryChapterByChapterId(chapterId);
		return getSuccessResponseVO(null);
	}
}