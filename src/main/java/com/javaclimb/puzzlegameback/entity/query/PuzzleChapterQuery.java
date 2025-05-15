package com.javaclimb.puzzlegameback.entity.query;



/**
 * 参数
 */
public class PuzzleChapterQuery extends BaseParam {


	/**
	 * 谜题id
	 */
	private String puzzleId;

	private String puzzleIdFuzzy;

	/**
	 * 章节id
	 */
	private String chapterId;

	private String chapterIdFuzzy;


	public void setPuzzleId(String puzzleId){
		this.puzzleId = puzzleId;
	}

	public String getPuzzleId(){
		return this.puzzleId;
	}

	public void setPuzzleIdFuzzy(String puzzleIdFuzzy){
		this.puzzleIdFuzzy = puzzleIdFuzzy;
	}

	public String getPuzzleIdFuzzy(){
		return this.puzzleIdFuzzy;
	}

	public void setChapterId(String chapterId){
		this.chapterId = chapterId;
	}

	public String getChapterId(){
		return this.chapterId;
	}

	public void setChapterIdFuzzy(String chapterIdFuzzy){
		this.chapterIdFuzzy = chapterIdFuzzy;
	}

	public String getChapterIdFuzzy(){
		return this.chapterIdFuzzy;
	}

}
