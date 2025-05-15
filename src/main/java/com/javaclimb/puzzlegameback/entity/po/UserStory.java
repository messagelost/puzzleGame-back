package com.javaclimb.puzzlegameback.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 */
public class UserStory implements Serializable {


	/**
	 * 用户id
	 */
	private String userId;

	/**
	 * 故事id
	 */
	private String storyId;

	/**
	 * 目前章节
	 */
	private Integer currentChapter;


	public void setUserId(String userId){
		this.userId = userId;
	}

	public String getUserId(){
		return this.userId;
	}

	public void setStoryId(String storyId){
		this.storyId = storyId;
	}

	public String getStoryId(){
		return this.storyId;
	}

	public void setCurrentChapter(Integer currentChapter){
		this.currentChapter = currentChapter;
	}

	public Integer getCurrentChapter(){
		return this.currentChapter;
	}

	@Override
	public String toString (){
		return "用户id:"+(userId == null ? "空" : userId)+"，故事id:"+(storyId == null ? "空" : storyId)+"，目前章节:"+(currentChapter == null ? "空" : currentChapter);
	}
}
