package com.javaclimb.puzzlegameback.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.javaclimb.puzzlegameback.entity.enums.PageSize;
import com.javaclimb.puzzlegameback.entity.query.PuzzleQuery;
import com.javaclimb.puzzlegameback.entity.po.Puzzle;
import com.javaclimb.puzzlegameback.entity.vo.PaginationResultVO;
import com.javaclimb.puzzlegameback.entity.query.SimplePage;
import com.javaclimb.puzzlegameback.mappers.PuzzleMapper;
import com.javaclimb.puzzlegameback.service.PuzzleService;
import com.javaclimb.puzzlegameback.utils.StringTools;


/**
 *  业务接口实现
 */
@Service("puzzleService")
public class PuzzleServiceImpl implements PuzzleService {

	@Resource
	private PuzzleMapper<Puzzle, PuzzleQuery> puzzleMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<Puzzle> findListByParam(PuzzleQuery param) {
		return this.puzzleMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(PuzzleQuery param) {
		return this.puzzleMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<Puzzle> findListByPage(PuzzleQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<Puzzle> list = this.findListByParam(param);
		PaginationResultVO<Puzzle> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public String add(Puzzle bean) {
		Date curDate = new Date();
		String puzzleId = StringTools.getPuzzleId();
		bean.setPuzzleId(puzzleId);
		bean.setCreateTime(curDate);
		bean.setUpdateTime(curDate);
		this.puzzleMapper.insert(bean);
		return puzzleId;
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<Puzzle> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.puzzleMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<Puzzle> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.puzzleMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(Puzzle bean, PuzzleQuery param) {
		StringTools.checkParam(param);
		return this.puzzleMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(PuzzleQuery param) {
		StringTools.checkParam(param);
		return this.puzzleMapper.deleteByParam(param);
	}

	/**
	 * 根据PuzzleId获取对象
	 */
	@Override
	public Puzzle getPuzzleByPuzzleId(String puzzleId) {
		return this.puzzleMapper.selectByPuzzleId(puzzleId);
	}

	/**
	 * 根据PuzzleId修改
	 */
	@Override
	public Integer updatePuzzleByPuzzleId(Puzzle bean, String puzzleId) {
		return this.puzzleMapper.updateByPuzzleId(bean, puzzleId);
	}

	/**
	 * 根据PuzzleId删除
	 */
	@Override
	public Integer deletePuzzleByPuzzleId(String puzzleId) {
		return this.puzzleMapper.deleteByPuzzleId(puzzleId);
	}
}