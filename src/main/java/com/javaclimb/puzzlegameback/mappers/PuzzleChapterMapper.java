package com.javaclimb.puzzlegameback.mappers;

import com.javaclimb.puzzlegameback.entity.po.PuzzleChapter;
import org.apache.ibatis.annotations.Param;

/**
 *  数据库操作接口
 */
public interface PuzzleChapterMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据PuzzleIdAndChapterId更新
	 */
	 Integer updateByPuzzleIdAndChapterId(@Param("bean") T t,@Param("puzzleId") String puzzleId,@Param("chapterId") String chapterId);


	/**
	 * 根据PuzzleIdAndChapterId删除
	 */
	 Integer deleteByPuzzleIdAndChapterId(@Param("puzzleId") String puzzleId,@Param("chapterId") String chapterId);


	/**
	 * 根据PuzzleIdAndChapterId获取对象
	 */
	 T selectByPuzzleIdAndChapterId(@Param("puzzleId") String puzzleId,@Param("chapterId") String chapterId);

	 PuzzleChapter selectByChapterId(@Param("chapterId") String chapterId);
}
