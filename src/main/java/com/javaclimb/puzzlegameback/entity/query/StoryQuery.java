package com.javaclimb.puzzlegameback.entity.query;

import java.util.Date;


/**
 * 参数
 */
public class StoryQuery extends BaseParam {


	/**
	 * 故事id
	 */
	private String storyId;

	private String storyIdFuzzy;

	/**
	 * 故事名称
	 */
	private String name;

	private String nameFuzzy;

	/**
	 * 故事类型
	 */
	private Integer type;

	/**
	 * 故事简介
	 */
	private String introduction;

	private String introductionFuzzy;

	/**
	 * 封面图片url
	 */
	private String cover;

	private String coverFuzzy;

	/**
	 * 章节数
	 */
	private Integer chapterCount;

	private String chapterCountFuzzy;

	/**
	 * 创建时间
	 */
	private String createTime;

	private String createTimeStart;

	private String createTimeEnd;

	/**
	 * 更新时间
	 */
	private String updateTime;

	private String updateTimeStart;

	private String updateTimeEnd;

	/**
	 * 创建者id
	 */
	private String createrId;

	private String createrIdFuzzy;


	public void setStoryId(String storyId){
		this.storyId = storyId;
	}

	public String getStoryId(){
		return this.storyId;
	}

	public void setStoryIdFuzzy(String storyIdFuzzy){
		this.storyIdFuzzy = storyIdFuzzy;
	}

	public String getStoryIdFuzzy(){
		return this.storyIdFuzzy;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setNameFuzzy(String nameFuzzy){
		this.nameFuzzy = nameFuzzy;
	}

	public String getNameFuzzy(){
		return this.nameFuzzy;
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

	public void setIntroductionFuzzy(String introductionFuzzy){
		this.introductionFuzzy = introductionFuzzy;
	}

	public String getIntroductionFuzzy(){
		return this.introductionFuzzy;
	}

	public void setCover(String cover){
		this.cover = cover;
	}

	public String getCover(){
		return this.cover;
	}

	public void setCoverFuzzy(String coverFuzzy){
		this.coverFuzzy = coverFuzzy;
	}

	public String getCoverFuzzy(){
		return this.coverFuzzy;
	}

	public void setChapterCount(Integer chapterCount){
		this.chapterCount = chapterCount;
	}

	public Integer getChapterCount(){
		return this.chapterCount;
	}

	public void setChapterCountFuzzy(String chapterCountFuzzy){
		this.chapterCountFuzzy = chapterCountFuzzy;
	}

	public String getChapterCountFuzzy(){
		return this.chapterCountFuzzy;
	}

	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}

	public String getCreateTime(){
		return this.createTime;
	}

	public void setCreateTimeStart(String createTimeStart){
		this.createTimeStart = createTimeStart;
	}

	public String getCreateTimeStart(){
		return this.createTimeStart;
	}
	public void setCreateTimeEnd(String createTimeEnd){
		this.createTimeEnd = createTimeEnd;
	}

	public String getCreateTimeEnd(){
		return this.createTimeEnd;
	}

	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
	}

	public String getUpdateTime(){
		return this.updateTime;
	}

	public void setUpdateTimeStart(String updateTimeStart){
		this.updateTimeStart = updateTimeStart;
	}

	public String getUpdateTimeStart(){
		return this.updateTimeStart;
	}
	public void setUpdateTimeEnd(String updateTimeEnd){
		this.updateTimeEnd = updateTimeEnd;
	}

	public String getUpdateTimeEnd(){
		return this.updateTimeEnd;
	}

	public void setCreaterId(String createrId){
		this.createrId = createrId;
	}

	public String getCreaterId(){
		return this.createrId;
	}

	public void setCreaterIdFuzzy(String createrIdFuzzy){
		this.createrIdFuzzy = createrIdFuzzy;
	}

	public String getCreaterIdFuzzy(){
		return this.createrIdFuzzy;
	}

}
