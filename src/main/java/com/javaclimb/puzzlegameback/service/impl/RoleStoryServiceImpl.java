package com.javaclimb.puzzlegameback.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.javaclimb.puzzlegameback.entity.enums.PageSize;
import com.javaclimb.puzzlegameback.entity.query.RoleStoryQuery;
import com.javaclimb.puzzlegameback.entity.po.RoleStory;
import com.javaclimb.puzzlegameback.entity.vo.PaginationResultVO;
import com.javaclimb.puzzlegameback.entity.query.SimplePage;
import com.javaclimb.puzzlegameback.mappers.RoleStoryMapper;
import com.javaclimb.puzzlegameback.service.RoleStoryService;
import com.javaclimb.puzzlegameback.utils.StringTools;


/**
 *  业务接口实现
 */
@Service("roleStoryService")
public class RoleStoryServiceImpl implements RoleStoryService {

	@Resource
	private RoleStoryMapper<RoleStory, RoleStoryQuery> roleStoryMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<RoleStory> findListByParam(RoleStoryQuery param) {
		return this.roleStoryMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(RoleStoryQuery param) {
		return this.roleStoryMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<RoleStory> findListByPage(RoleStoryQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<RoleStory> list = this.findListByParam(param);
		PaginationResultVO<RoleStory> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(RoleStory bean) {
		return this.roleStoryMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<RoleStory> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.roleStoryMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<RoleStory> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.roleStoryMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(RoleStory bean, RoleStoryQuery param) {
		StringTools.checkParam(param);
		return this.roleStoryMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(RoleStoryQuery param) {
		StringTools.checkParam(param);
		return this.roleStoryMapper.deleteByParam(param);
	}

	/**
	 * 根据RoleIdAndStoryId获取对象
	 */
	@Override
	public RoleStory getRoleStoryByRoleIdAndStoryId(String roleId, String storyId) {
		return this.roleStoryMapper.selectByRoleIdAndStoryId(roleId, storyId);
	}

	/**
	 * 根据RoleIdAndStoryId修改
	 */
	@Override
	public Integer updateRoleStoryByRoleIdAndStoryId(RoleStory bean, String roleId, String storyId) {
		return this.roleStoryMapper.updateByRoleIdAndStoryId(bean, roleId, storyId);
	}

	/**
	 * 根据RoleIdAndStoryId删除
	 */
	@Override
	public Integer deleteRoleStoryByRoleIdAndStoryId(String roleId, String storyId) {
		return this.roleStoryMapper.deleteByRoleIdAndStoryId(roleId, storyId);
	}
}