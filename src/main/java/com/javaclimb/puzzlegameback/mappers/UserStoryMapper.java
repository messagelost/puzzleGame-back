package com.javaclimb.puzzlegameback.mappers;

import org.apache.ibatis.annotations.Param;

/**
 *  数据库操作接口
 */
public interface UserStoryMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据UserIdAndStoryId更新
	 */
	 Integer updateByUserIdAndStoryId(@Param("bean") T t,@Param("userId") String userId,@Param("storyId") String storyId);


	/**
	 * 根据UserIdAndStoryId删除
	 */
	 Integer deleteByUserIdAndStoryId(@Param("userId") String userId,@Param("storyId") String storyId);


	/**
	 * 根据UserIdAndStoryId获取对象
	 */
	 T selectByUserIdAndStoryId(@Param("userId") String userId,@Param("storyId") String storyId);


}
