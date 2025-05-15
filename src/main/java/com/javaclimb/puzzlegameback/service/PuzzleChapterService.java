package com.javaclimb.puzzlegameback.service;

import java.util.List;

import com.javaclimb.puzzlegameback.entity.query.PuzzleChapterQuery;
import com.javaclimb.puzzlegameback.entity.po.PuzzleChapter;
import com.javaclimb.puzzlegameback.entity.vo.PaginationResultVO;
import org.apache.ibatis.annotations.Param;


/**
 *  业务接口
 */
public interface PuzzleChapterService {

	/**
	 * 根据条件查询列表
	 */
	List<PuzzleChapter> findListByParam(PuzzleChapterQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(PuzzleChapterQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<PuzzleChapter> findListByPage(PuzzleChapterQuery param);

	/**
	 * 新增
	 */
	Integer add(PuzzleChapter bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<PuzzleChapter> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<PuzzleChapter> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(PuzzleChapter bean,PuzzleChapterQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(PuzzleChapterQuery param);

	/**
	 * 根据PuzzleIdAndChapterId查询对象
	 */
	PuzzleChapter getPuzzleChapterByPuzzleIdAndChapterId(String puzzleId,String chapterId);


	/**
	 * 根据PuzzleIdAndChapterId修改
	 */
	Integer updatePuzzleChapterByPuzzleIdAndChapterId(PuzzleChapter bean,String puzzleId,String chapterId);


	/**
	 * 根据PuzzleIdAndChapterId删除
	 */
	Integer deletePuzzleChapterByPuzzleIdAndChapterId(String puzzleId,String chapterId);

	PuzzleChapter selectByChapterId(String chapterId);

}