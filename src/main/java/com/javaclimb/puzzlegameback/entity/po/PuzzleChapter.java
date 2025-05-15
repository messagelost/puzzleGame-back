package com.javaclimb.puzzlegameback.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 */
public class PuzzleChapter implements Serializable {


	/**
	 * 谜题id
	 */
	private String puzzleId;

	/**
	 * 章节id
	 */
	private String chapterId;


	public void setPuzzleId(String puzzleId){
		this.puzzleId = puzzleId;
	}

	public String getPuzzleId(){
		return this.puzzleId;
	}

	public void setChapterId(String chapterId){
		this.chapterId = chapterId;
	}

	public String getChapterId(){
		return this.chapterId;
	}

	@Override
	public String toString (){
		return "谜题id:"+(puzzleId == null ? "空" : puzzleId)+"，章节id:"+(chapterId == null ? "空" : chapterId);
	}
}
