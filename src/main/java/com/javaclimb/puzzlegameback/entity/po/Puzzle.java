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
public class Puzzle implements Serializable {


	/**
	 * 谜题id
	 */
	private String puzzleId;

	/**
	 * 谜题文本
	 */
	private String text;

	/**
	 * 谜题答案
	 */
	private String answer;

	/**
	 * 谜题图片url
	 */
	private String pic;

	/**
	 * 谜题音频url
	 */
	private String sound;

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


	public void setPuzzleId(String puzzleId){
		this.puzzleId = puzzleId;
	}

	public String getPuzzleId(){
		return this.puzzleId;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return this.text;
	}

	public void setAnswer(String answer){
		this.answer = answer;
	}

	public String getAnswer(){
		return this.answer;
	}

	public void setPic(String pic){
		this.pic = pic;
	}

	public String getPic(){
		return this.pic;
	}

	public void setSound(String sound){
		this.sound = sound;
	}

	public String getSound(){
		return this.sound;
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

	@Override
	public String toString (){
		return "谜题id:"+(puzzleId == null ? "空" : puzzleId)+"，谜题文本:"+(text == null ? "空" : text)+"，谜题答案:"+(answer == null ? "空" : answer)+"，谜题图片url:"+(pic == null ? "空" : pic)+"，谜题音频url:"+(sound == null ? "空" : sound)+"，创建时间:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()))+"，更新时间:"+(updateTime == null ? "空" : DateUtil.format(updateTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
