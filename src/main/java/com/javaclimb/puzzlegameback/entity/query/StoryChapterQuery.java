package com.javaclimb.puzzlegameback.entity.query;



/**
 * 参数
 */
public class StoryChapterQuery extends BaseParam {


	/**
	 * 故事id
	 */
	private String storyId;

	private String storyIdFuzzy;

	/**
	 * 章节id
	 */
	private String chapterId;

	private String chapterIdFuzzy;

	/**
	 * 章节次序
	 */
	private Integer order;


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

	public void setOrder(Integer order){
		this.order = order;
	}

	public Integer getOrder(){
		return this.order;
	}

}
