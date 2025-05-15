package com.javaclimb.puzzlegameback.service;

import java.util.List;

import com.javaclimb.puzzlegameback.entity.query.PuzzleQuery;
import com.javaclimb.puzzlegameback.entity.po.Puzzle;
import com.javaclimb.puzzlegameback.entity.vo.PaginationResultVO;


/**
 *  业务接口
 */
public interface PuzzleService {

	/**
	 * 根据条件查询列表
	 */
	List<Puzzle> findListByParam(PuzzleQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(PuzzleQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<Puzzle> findListByPage(PuzzleQuery param);

	/**
	 * 新增
	 */
	String add(Puzzle bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<Puzzle> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Puzzle> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(Puzzle bean,PuzzleQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(PuzzleQuery param);

	/**
	 * 根据PuzzleId查询对象
	 */
	Puzzle getPuzzleByPuzzleId(String puzzleId);


	/**
	 * 根据PuzzleId修改
	 */
	Integer updatePuzzleByPuzzleId(Puzzle bean,String puzzleId);


	/**
	 * 根据PuzzleId删除
	 */
	Integer deletePuzzleByPuzzleId(String puzzleId);

}