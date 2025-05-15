package com.javaclimb.puzzlegameback.entity.query;



/**
 * 参数
 */
public class UserStoryQuery extends BaseParam {


	/**
	 * 用户id
	 */
	private String userId;

	private String userIdFuzzy;

	/**
	 * 故事id
	 */
	private String storyId;

	private String storyIdFuzzy;

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

	public void setUserIdFuzzy(String userIdFuzzy){
		this.userIdFuzzy = userIdFuzzy;
	}

	public String getUserIdFuzzy(){
		return this.userIdFuzzy;
	}

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

	public void setCurrentChapter(Integer currentChapter){
		this.currentChapter = currentChapter;
	}

	public Integer getCurrentChapter(){
		return this.currentChapter;
	}

}
