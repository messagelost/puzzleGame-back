package com.javaclimb.puzzlegameback.mappers;

import org.apache.ibatis.annotations.Param;

/**
 *  数据库操作接口
 */
public interface PuzzleMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据PuzzleId更新
	 */
	 Integer updateByPuzzleId(@Param("bean") T t,@Param("puzzleId") String puzzleId);


	/**
	 * 根据PuzzleId删除
	 */
	 Integer deleteByPuzzleId(@Param("puzzleId") String puzzleId);


	/**
	 * 根据PuzzleId获取对象
	 */
	 T selectByPuzzleId(@Param("puzzleId") String puzzleId);


}
