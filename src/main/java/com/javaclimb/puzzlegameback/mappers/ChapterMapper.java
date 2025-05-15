package com.javaclimb.puzzlegameback.mappers;

import org.apache.ibatis.annotations.Param;

/**
 *  数据库操作接口
 */
public interface ChapterMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据ChapterId更新
	 */
	 Integer updateByChapterId(@Param("bean") T t,@Param("chapterId") String chapterId);


	/**
	 * 根据ChapterId删除
	 */
	 Integer deleteByChapterId(@Param("chapterId") String chapterId);


	/**
	 * 根据ChapterId获取对象
	 */
	 T selectByChapterId(@Param("chapterId") String chapterId);


}
