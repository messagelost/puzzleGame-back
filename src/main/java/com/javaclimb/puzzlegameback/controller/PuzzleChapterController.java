package com.javaclimb.puzzlegameback.controller;

import java.util.List;

import com.javaclimb.puzzlegameback.entity.query.PuzzleChapterQuery;
import com.javaclimb.puzzlegameback.entity.po.PuzzleChapter;
import com.javaclimb.puzzlegameback.entity.vo.ResponseVO;
import com.javaclimb.puzzlegameback.service.PuzzleChapterService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *  Controller
 */
@RestController("puzzleChapterController")
@RequestMapping("/puzzleChapter")
public class PuzzleChapterController extends ABaseController{

	@Resource
	private PuzzleChapterService puzzleChapterService;

	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(PuzzleChapterQuery query){
		return getSuccessResponseVO(puzzleChapterService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(@RequestBody PuzzleChapter bean) {
		puzzleChapterService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<PuzzleChapter> listBean) {
		puzzleChapterService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<PuzzleChapter> listBean) {
		puzzleChapterService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据PuzzleIdAndChapterId查询对象
	 */
	@RequestMapping("/getPuzzleChapterByPuzzleIdAndChapterId")
	public ResponseVO getPuzzleChapterByPuzzleIdAndChapterId(String puzzleId,String chapterId) {
		return getSuccessResponseVO(puzzleChapterService.getPuzzleChapterByPuzzleIdAndChapterId(puzzleId,chapterId));
	}

	@RequestMapping("/getPuzzleChapterByChapterId")
	public ResponseVO getPuzzleChapterByChapterId(String chapterId) {
		return getSuccessResponseVO(puzzleChapterService.selectByChapterId(chapterId));
	}

	/**
	 * 根据PuzzleIdAndChapterId修改对象
	 */
	@RequestMapping("/updatePuzzleChapterByPuzzleIdAndChapterId")
	public ResponseVO updatePuzzleChapterByPuzzleIdAndChapterId(@RequestBody PuzzleChapter bean) {
		puzzleChapterService.updatePuzzleChapterByPuzzleIdAndChapterId(bean, bean.getPuzzleId(), bean.getChapterId());
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据PuzzleIdAndChapterId删除
	 */
	@RequestMapping("/deletePuzzleChapterByPuzzleIdAndChapterId")
	public ResponseVO deletePuzzleChapterByPuzzleIdAndChapterId(@RequestParam String puzzleId,@RequestParam String chapterId) {
		puzzleChapterService.deletePuzzleChapterByPuzzleIdAndChapterId(puzzleId,chapterId);
		return getSuccessResponseVO(null);
	}
}