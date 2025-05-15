package com.javaclimb.puzzlegameback.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 */
public class StoryChapter implements Serializable {


	/**
	 * 故事id
	 */
	private String storyId;

	/**
	 * 章节id
	 */
	private String chapterId;

	/**
	 * 章节次序
	 */
	private Integer order;

	@TableField(exist = false)
	private String chapterName;

	@TableField(exist = false)
	private String chapterText;

	public String getChapterName(){
		return this.chapterName;
	}
	public void setChapterName(String chapterName){
		this.chapterName = chapterName;
	}
	public String getChapterText(){
		return this.chapterText;
	}
	public void setChapterText(String chapterText){
		this.chapterText = chapterText;
	}

	public void setStoryId(String storyId){
		this.storyId = storyId;
	}

	public String getStoryId(){
		return this.storyId;
	}

	public void setChapterId(String chapterId){
		this.chapterId = chapterId;
	}

	public String getChapterId(){
		return this.chapterId;
	}

	public void setOrder(Integer order){
		this.order = order;
	}

	public Integer getOrder(){
		return this.order;
	}

	@Override
	public String toString (){
		return "故事id:"+(storyId == null ? "空" : storyId)+"，章节id:"+(chapterId == null ? "空" : chapterId)+"，章节次序:"+(order == null ? "空" : order);
	}
}
