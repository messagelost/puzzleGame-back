package com.javaclimb.puzzlegameback.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.javaclimb.puzzlegameback.entity.enums.PageSize;
import com.javaclimb.puzzlegameback.entity.query.PuzzleChapterQuery;
import com.javaclimb.puzzlegameback.entity.po.PuzzleChapter;
import com.javaclimb.puzzlegameback.entity.vo.PaginationResultVO;
import com.javaclimb.puzzlegameback.entity.query.SimplePage;
import com.javaclimb.puzzlegameback.mappers.PuzzleChapterMapper;
import com.javaclimb.puzzlegameback.service.PuzzleChapterService;
import com.javaclimb.puzzlegameback.utils.StringTools;


/**
 *  业务接口实现
 */
@Service("puzzleChapterService")
public class PuzzleChapterServiceImpl implements PuzzleChapterService {

	@Resource
	private PuzzleChapterMapper<PuzzleChapter, PuzzleChapterQuery> puzzleChapterMapper;

	/**
	 * 根据条件查询列表
	 */
	@Override
	public List<PuzzleChapter> findListByParam(PuzzleChapterQuery param) {
		return this.puzzleChapterMapper.selectList(param);
	}

	/**
	 * 根据条件查询列表
	 */
	@Override
	public Integer findCountByParam(PuzzleChapterQuery param) {
		return this.puzzleChapterMapper.selectCount(param);
	}

	/**
	 * 分页查询方法
	 */
	@Override
	public PaginationResultVO<PuzzleChapter> findListByPage(PuzzleChapterQuery param) {
		int count = this.findCountByParam(param);
		int pageSize = param.getPageSize() == null ? PageSize.SIZE15.getSize() : param.getPageSize();

		SimplePage page = new SimplePage(param.getPageNo(), count, pageSize);
		param.setSimplePage(page);
		List<PuzzleChapter> list = this.findListByParam(param);
		PaginationResultVO<PuzzleChapter> result = new PaginationResultVO(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(), list);
		return result;
	}

	/**
	 * 新增
	 */
	@Override
	public Integer add(PuzzleChapter bean) {
		return this.puzzleChapterMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	@Override
	public Integer addBatch(List<PuzzleChapter> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.puzzleChapterMapper.insertBatch(listBean);
	}

	/**
	 * 批量新增或者修改
	 */
	@Override
	public Integer addOrUpdateBatch(List<PuzzleChapter> listBean) {
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.puzzleChapterMapper.insertOrUpdateBatch(listBean);
	}

	/**
	 * 多条件更新
	 */
	@Override
	public Integer updateByParam(PuzzleChapter bean, PuzzleChapterQuery param) {
		StringTools.checkParam(param);
		return this.puzzleChapterMapper.updateByParam(bean, param);
	}

	/**
	 * 多条件删除
	 */
	@Override
	public Integer deleteByParam(PuzzleChapterQuery param) {
		StringTools.checkParam(param);
		return this.puzzleChapterMapper.deleteByParam(param);
	}

	/**
	 * 根据PuzzleIdAndChapterId获取对象
	 */
	@Override
	public PuzzleChapter getPuzzleChapterByPuzzleIdAndChapterId(String puzzleId, String chapterId) {
		return this.puzzleChapterMapper.selectByPuzzleIdAndChapterId(puzzleId, chapterId);
	}

	/**
	 * 根据PuzzleIdAndChapterId修改
	 */
	@Override
	public Integer updatePuzzleChapterByPuzzleIdAndChapterId(PuzzleChapter bean, String puzzleId, String chapterId) {
		return this.puzzleChapterMapper.updateByPuzzleIdAndChapterId(bean, puzzleId, chapterId);
	}

	/**
	 * 根据PuzzleIdAndChapterId删除
	 */
	@Override
	public Integer deletePuzzleChapterByPuzzleIdAndChapterId(String puzzleId, String chapterId) {
		return this.puzzleChapterMapper.deleteByPuzzleIdAndChapterId(puzzleId, chapterId);
	}

	@Override
	public PuzzleChapter selectByChapterId(String chapterId) {
		return this.puzzleChapterMapper.selectByChapterId(chapterId);
	}
}