package com.javaclimb.puzzlegameback.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.javaclimb.puzzlegameback.entity.enums.PageSize;
import com.javaclimb.puzzlegameback.entity.query.DialogQuery;
import com.javaclimb.puzzlegameback.entity.po.Dialog;
import com.javaclimb.puzzlegameback.entity.vo.PaginationResultVO;
import com.javaclimb.puzzlegameback.entity.query.SimplePage;
import com.javaclimb.puzzlegameback.mappers.DialogMapper;
import com.javaclimb.puzzlegameback.service.DialogService;
import com.javaclimb.puzzlegameback.utils.StringTools;


/**
 *  业务接口实现
 */
@Service("dialogService")
public class DialogServiceImpl implements DialogService {

	@Resource
	private DialogMapper<Dialog, DialogQuery> dialogMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Dialog> findListByParam(DialogQuery param) {
		return this.dialogMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(DialogQuery param) {
		return this.dialogMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<Dialog> findListByPage(DialogQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<Dialog> list = this.findListByParam(param);
		PaginationResultVO<Dialog> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(Dialog bean) {
		return this.dialogMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<Dialog> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.dialogMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Dialog> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.dialogMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(Dialog bean, DialogQuery param) {
		StringTools.checkParam(param);
		return this.dialogMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(DialogQuery param) {
		StringTools.checkParam(param);
		return this.dialogMapper.deleteByParam(param);
	}

	/**
	 * 根据DialogId获取对象
	 */
	@Override
	public Dialog getDialogByDialogId(String dialogId) {
		return this.dialogMapper.selectByDialogId(dialogId);
	}

	/**
	 * 根据DialogId修改
	 */
	@Override
	public Integer updateDialogByDialogId(Dialog bean, String dialogId) {
		return this.dialogMapper.updateByDialogId(bean, dialogId);
	}

	/**
	 * 根据DialogId删除
	 */
	@Override
	public Integer deleteDialogByDialogId(String dialogId) {
		return this.dialogMapper.deleteByDialogId(dialogId);
	}
}