package com.javaclimb.puzzlegameback.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.javaclimb.puzzlegameback.entity.enums.PageSize;
import com.javaclimb.puzzlegameback.entity.query.UserStoryQuery;
import com.javaclimb.puzzlegameback.entity.po.UserStory;
import com.javaclimb.puzzlegameback.entity.vo.PaginationResultVO;
import com.javaclimb.puzzlegameback.entity.query.SimplePage;
import com.javaclimb.puzzlegameback.mappers.UserStoryMapper;
import com.javaclimb.puzzlegameback.service.UserStoryService;
import com.javaclimb.puzzlegameback.utils.StringTools;


/**
 *  业务接口实现
 */
@Service("userStoryService")
public class UserStoryServiceImpl implements UserStoryService {

	@Resource
	private UserStoryMapper<UserStory, UserStoryQuery> userStoryMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<UserStory> findListByParam(UserStoryQuery param) {
		return this.userStoryMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(UserStoryQuery param) {
		return this.userStoryMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<UserStory> findListByPage(UserStoryQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<UserStory> list = this.findListByParam(param);
		PaginationResultVO<UserStory> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(UserStory bean) {
		return this.userStoryMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<UserStory> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.userStoryMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<UserStory> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.userStoryMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(UserStory bean, UserStoryQuery param) {
		StringTools.checkParam(param);
		return this.userStoryMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(UserStoryQuery param) {
		StringTools.checkParam(param);
		return this.userStoryMapper.deleteByParam(param);
	}

	/**
	 * 根据UserIdAndStoryId获取对象
	 */
	@Override
	public UserStory getUserStoryByUserIdAndStoryId(String userId, String storyId) {
		return this.userStoryMapper.selectByUserIdAndStoryId(userId, storyId);
	}

	/**
	 * 根据UserIdAndStoryId修改
	 */
	@Override
	public Integer updateUserStoryByUserIdAndStoryId(UserStory bean, String userId, String storyId) {
		return this.userStoryMapper.updateByUserIdAndStoryId(bean, userId, storyId);
	}

	/**
	 * 根据UserIdAndStoryId删除
	 */
	@Override
	public Integer deleteUserStoryByUserIdAndStoryId(String userId, String storyId) {
		return this.userStoryMapper.deleteByUserIdAndStoryId(userId, storyId);
	}
}