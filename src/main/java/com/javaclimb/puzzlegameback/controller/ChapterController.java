package com.javaclimb.puzzlegameback.controller;

import java.util.List;

import com.javaclimb.puzzlegameback.entity.query.ChapterQuery;
import com.javaclimb.puzzlegameback.entity.po.Chapter;
import com.javaclimb.puzzlegameback.entity.vo.ResponseVO;
import com.javaclimb.puzzlegameback.service.ChapterService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *  Controller
 */
@RestController("chapterController")
@RequestMapping("/chapter")
public class ChapterController extends ABaseController{

	@Resource
	private ChapterService chapterService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(ChapterQuery query){
		return getSuccessResponseVO(chapterService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(Chapter bean) {
		String chapterId = chapterService.add(bean);
		return getSuccessResponseVO(chapterId);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<Chapter> listBean) {
		chapterService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<Chapter> listBean) {
		chapterService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据ChapterId查询对象
	 */
	@RequestMapping("/getChapterByChapterId")
	public ResponseVO getChapterByChapterId(@RequestParam String chapterId) {
		return getSuccessResponseVO(chapterService.getChapterByChapterId(chapterId));
	}

	/**
	 * 根据ChapterId修改对象
	 */
	@RequestMapping("/updateChapterByChapterId")
	public ResponseVO updateChapterByChapterId(@RequestBody Chapter bean) {
		chapterService.updateChapterByChapterId(bean, bean.getChapterId());
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据ChapterId删除
	 */
	@RequestMapping("/deleteChapterByChapterId")
	public ResponseVO deleteChapterByChapterId(@RequestParam String chapterId) {
		chapterService.deleteChapterByChapterId(chapterId);
		return getSuccessResponseVO(null);
	}
}