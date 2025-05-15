package com.javaclimb.puzzlegameback.mappers;

import org.apache.ibatis.annotations.Param;

/**
 *  数据库操作接口
 */
public interface RoleStoryMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据RoleIdAndStoryId更新
	 */
	 Integer updateByRoleIdAndStoryId(@Param("bean") T t,@Param("roleId") String roleId,@Param("storyId") String storyId);


	/**
	 * 根据RoleIdAndStoryId删除
	 */
	 Integer deleteByRoleIdAndStoryId(@Param("roleId") String roleId,@Param("storyId") String storyId);


	/**
	 * 根据RoleIdAndStoryId获取对象
	 */
	 T selectByRoleIdAndStoryId(@Param("roleId") String roleId,@Param("storyId") String storyId);


}
