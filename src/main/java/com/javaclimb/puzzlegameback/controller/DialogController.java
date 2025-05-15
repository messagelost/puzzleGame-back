package com.javaclimb.puzzlegameback.controller;

import java.util.List;

import com.javaclimb.puzzlegameback.entity.query.DialogQuery;
import com.javaclimb.puzzlegameback.entity.po.Dialog;
import com.javaclimb.puzzlegameback.entity.vo.ResponseVO;
import com.javaclimb.puzzlegameback.service.DialogService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *  Controller
 */
@RestController("dialogController")
@RequestMapping("/dialog")
public class DialogController extends ABaseController{

	@Resource
	private DialogService dialogService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(DialogQuery query){
		return getSuccessResponseVO(dialogService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(Dialog bean) {
		dialogService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<Dialog> listBean) {
		dialogService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<Dialog> listBean) {
		dialogService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据DialogId查询对象
	 */
	@RequestMapping("/getDialogByDialogId")
	public ResponseVO getDialogByDialogId(String dialogId) {
		return getSuccessResponseVO(dialogService.getDialogByDialogId(dialogId));
	}

	/**
	 * 根据DialogId修改对象
	 */
	@RequestMapping("/updateDialogByDialogId")
	public ResponseVO updateDialogByDialogId(Dialog bean,String dialogId) {
		dialogService.updateDialogByDialogId(bean,dialogId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据DialogId删除
	 */
	@RequestMapping("/deleteDialogByDialogId")
	public ResponseVO deleteDialogByDialogId(String dialogId) {
		dialogService.deleteDialogByDialogId(dialogId);
		return getSuccessResponseVO(null);
	}
}