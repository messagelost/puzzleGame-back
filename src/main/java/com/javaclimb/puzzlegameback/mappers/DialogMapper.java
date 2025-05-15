package com.javaclimb.puzzlegameback.mappers;

import org.apache.ibatis.annotations.Param;

/**
 *  数据库操作接口
 */
public interface DialogMapper<T,P> extends BaseMapper<T,P> {

	/**
	 * 根据DialogId更新
	 */
	 Integer updateByDialogId(@Param("bean") T t,@Param("dialogId") String dialogId);


	/**
	 * 根据DialogId删除
	 */
	 Integer deleteByDialogId(@Param("dialogId") String dialogId);


	/**
	 * 根据DialogId获取对象
	 */
	 T selectByDialogId(@Param("dialogId") String dialogId);


}
