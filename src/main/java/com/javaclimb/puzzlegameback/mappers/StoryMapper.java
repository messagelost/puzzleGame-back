package com.javaclimb.puzzlegameback.mappers;

import org.apache.ibatis.annotations.Param;

/**
 *  数据库操作接口
 */
public interface StoryMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据StoryId更新
	 */
	 Integer updateByStoryId(@Param("bean") T t,@Param("storyId") String storyId);


	/**
	 * 根据StoryId删除
	 */
	 Integer deleteByStoryId(@Param("storyId") String storyId);


	/**
	 * 根据StoryId获取对象
	 */
	 T selectByStoryId(@Param("storyId") String storyId);


}
