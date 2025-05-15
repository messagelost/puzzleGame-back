package com.javaclimb.puzzlegameback.controller;

import java.util.List;

import com.javaclimb.puzzlegameback.entity.query.PuzzleQuery;
import com.javaclimb.puzzlegameback.entity.po.Puzzle;
import com.javaclimb.puzzlegameback.entity.vo.ResponseVO;
import com.javaclimb.puzzlegameback.service.PuzzleChapterService;
import com.javaclimb.puzzlegameback.service.PuzzleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *  Controller
 */
@RestController("puzzleController")
@RequestMapping("/puzzle")
public class PuzzleController extends ABaseController{

	@Resource
	private PuzzleService puzzleService;

	@Resource
	private PuzzleChapterService puzzleChapterService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(PuzzleQuery query){
		return getSuccessResponseVO(puzzleService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(@RequestBody Puzzle bean) {
		String puzzleId = puzzleService.add(bean);
		return getSuccessResponseVO(puzzleId);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<Puzzle> listBean) {
		puzzleService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<Puzzle> listBean) {
		puzzleService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据PuzzleId查询对象
	 */
	@RequestMapping("/getPuzzleByPuzzleId")
	public ResponseVO getPuzzleByPuzzleId(@RequestParam String puzzleId) {
		return getSuccessResponseVO(puzzleService.getPuzzleByPuzzleId(puzzleId));
	}

	/**
	 * 根据PuzzleId修改对象
	 */
	@RequestMapping("/updatePuzzleByPuzzleId")
	public ResponseVO updatePuzzleByPuzzleId(@RequestBody Puzzle bean) {
		puzzleService.updatePuzzleByPuzzleId(bean, bean.getPuzzleId());
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据PuzzleId删除
	 */
	@RequestMapping("/deletePuzzleByPuzzleId")
	public ResponseVO deletePuzzleByPuzzleId(@RequestParam String puzzleId) {
		puzzleService.deletePuzzleByPuzzleId(puzzleId);
		return getSuccessResponseVO(null);
	}
}