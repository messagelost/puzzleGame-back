package com.javaclimb.puzzlegameback.entity.query;

import java.util.Date;


/**
 * 参数
 */
public class PuzzleQuery extends BaseParam {


	/**
	 * 谜题id
	 */
	private String puzzleId;

	private String puzzleIdFuzzy;

	/**
	 * 谜题文本
	 */
	private String text;

	private String textFuzzy;

	/**
	 * 谜题答案
	 */
	private String answer;

	private String answerFuzzy;

	/**
	 * 谜题图片url
	 */
	private String pic;

	private String picFuzzy;

	/**
	 * 谜题音频url
	 */
	private String sound;

	private String soundFuzzy;

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

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return this.text;
	}

	public void setTextFuzzy(String textFuzzy){
		this.textFuzzy = textFuzzy;
	}

	public String getTextFuzzy(){
		return this.textFuzzy;
	}

	public void setAnswer(String answer){
		this.answer = answer;
	}

	public String getAnswer(){
		return this.answer;
	}

	public void setAnswerFuzzy(String answerFuzzy){
		this.answerFuzzy = answerFuzzy;
	}

	public String getAnswerFuzzy(){
		return this.answerFuzzy;
	}

	public void setPic(String pic){
		this.pic = pic;
	}

	public String getPic(){
		return this.pic;
	}

	public void setPicFuzzy(String picFuzzy){
		this.picFuzzy = picFuzzy;
	}

	public String getPicFuzzy(){
		return this.picFuzzy;
	}

	public void setSound(String sound){
		this.sound = sound;
	}

	public String getSound(){
		return this.sound;
	}

	public void setSoundFuzzy(String soundFuzzy){
		this.soundFuzzy = soundFuzzy;
	}

	public String getSoundFuzzy(){
		return this.soundFuzzy;
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

}
