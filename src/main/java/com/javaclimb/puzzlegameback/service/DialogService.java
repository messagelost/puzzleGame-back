package com.javaclimb.puzzlegameback.service;

import java.util.List;

import com.javaclimb.puzzlegameback.entity.query.DialogQuery;
import com.javaclimb.puzzlegameback.entity.po.Dialog;
import com.javaclimb.puzzlegameback.entity.vo.PaginationResultVO;


/**
 *  业务接口
 */
public interface DialogService {

	/**
	 * 根据条件查询列表
	 */
	List<Dialog> findListByParam(DialogQuery param);

	/**
	 * 根据条件查询列表
	 */
	Integer findCountByParam(DialogQuery param);

	/**
	 * 分页查询
	 */
	PaginationResultVO<Dialog> findListByPage(DialogQuery param);

	/**
	 * 新增
	 */
	Integer add(Dialog bean);

	/**
	 * 批量新增
	 */
	Integer addBatch(List<Dialog> listBean);

	/**
	 * 批量新增/修改
	 */
	Integer addOrUpdateBatch(List<Dialog> listBean);

	/**
	 * 多条件更新
	 */
	Integer updateByParam(Dialog bean,DialogQuery param);

	/**
	 * 多条件删除
	 */
	Integer deleteByParam(DialogQuery param);

	/**
	 * 根据DialogId查询对象
	 */
	Dialog getDialogByDialogId(String dialogId);


	/**
	 * 根据DialogId修改
	 */
	Integer updateDialogByDialogId(Dialog bean,String dialogId);


	/**
	 * 根据DialogId删除
	 */
	Integer deleteDialogByDialogId(String dialogId);

}