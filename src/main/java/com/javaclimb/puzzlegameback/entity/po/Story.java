package com.javaclimb.puzzlegameback.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.javaclimb.puzzlegameback.entity.enums.DateTimePatternEnum;
import com.javaclimb.puzzlegameback.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 
 */
public class Story implements Serializable {


	/**
	 * 故事id
	 */
	private String storyId;

	/**
	 * 故事名称
	 */
	private String name;

	/**
	 * 故事类型
	 */
	private Integer type;

	/**
	 * 故事简介
	 */
	private String introduction;

	/**
	 * 封面图片url
	 */
	private String cover;

	/**
	 * 章节数
	 */
	private Integer chapterCount;

	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 更新时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	/**
	 * 创建者id
	 */
	private String createrId;


	public void setStoryId(String storyId){
		this.storyId = storyId;
	}

	public String getStoryId(){
		return this.storyId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setType(Integer type){
		this.type = type;
	}

	public Integer getType(){
		return this.type;
	}

	public void setIntroduction(String introduction){
		this.introduction = introduction;
	}

	public String getIntroduction(){
		return this.introduction;
	}

	public void setCover(String cover){
		this.cover = cover;
	}

	public String getCover(){
		return this.cover;
	}

	public void setChapterCount(Integer chapterCount){
		this.chapterCount = chapterCount;
	}

	public Integer getChapterCount(){
		return this.chapterCount;
	}

	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}

	public Date getUpdateTime(){
		return this.updateTime;
	}

	public void setCreaterId(String createrId){
		this.createrId = createrId;
	}

	public String getCreaterId(){
		return this.createrId;
	}

	@Override
	public String toString (){
		return "故事id:"+(storyId == null ? "空" : storyId)+"，故事名称:"+(name == null ? "空" : name)+"，故事类型:"+(type == null ? "空" : type)+"，故事简介:"+(introduction == null ? "空" : introduction)+"，封面图片url:"+(cover == null ? "空" : cover)+"，章节数:"+(chapterCount == null ? "空" : chapterCount)+"，创建时间:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，更新时间:"+(updateTime == null ? "空" : DateUtil.format(updateTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，创建者id:"+(createrId == null ? "空" : createrId);
	}
}
