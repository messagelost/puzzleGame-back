package com.javaclimb.puzzlegameback.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 */
public class Dialog implements Serializable {


	/**
	 * 对话id
	 */
	private String dialogId;

	/**
	 * 对话内容
	 */
	private String text;

	/**
	 * 对话角色id
	 */
	private String roleId;

	/**
	 * 对话所处章节id
	 */
	private String chapterId;


	public void setDialogId(String dialogId){
		this.dialogId = dialogId;
	}

	public String getDialogId(){
		return this.dialogId;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return this.text;
	}

	public void setRoleId(String roleId){
		this.roleId = roleId;
	}

	public String getRoleId(){
		return this.roleId;
	}

	public void setChapterId(String chapterId){
		this.chapterId = chapterId;
	}

	public String getChapterId(){
		return this.chapterId;
	}

	@Override
	public String toString (){
		return "对话id:"+(dialogId == null ? "空" : dialogId)+"，对话内容:"+(text == null ? "空" : text)+"，对话角色id:"+(roleId == null ? "空" : roleId)+"，对话所处章节id:"+(chapterId == null ? "空" : chapterId);
	}
}
