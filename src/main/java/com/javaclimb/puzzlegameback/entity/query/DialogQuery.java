package com.javaclimb.puzzlegameback.entity.query;



/**
 * 参数
 */
public class DialogQuery extends BaseParam {


	/**
	 * 对话id
	 */
	private String dialogId;

	private String dialogIdFuzzy;

	/**
	 * 对话内容
	 */
	private String text;

	private String textFuzzy;

	/**
	 * 对话角色id
	 */
	private String roleId;

	private String roleIdFuzzy;

	/**
	 * 对话所处章节id
	 */
	private String chapterId;

	private String chapterIdFuzzy;


	public void setDialogId(String dialogId){
		this.dialogId = dialogId;
	}

	public String getDialogId(){
		return this.dialogId;
	}

	public void setDialogIdFuzzy(String dialogIdFuzzy){
		this.dialogIdFuzzy = dialogIdFuzzy;
	}

	public String getDialogIdFuzzy(){
		return this.dialogIdFuzzy;
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

	public void setRoleId(String roleId){
		this.roleId = roleId;
	}

	public String getRoleId(){
		return this.roleId;
	}

	public void setRoleIdFuzzy(String roleIdFuzzy){
		this.roleIdFuzzy = roleIdFuzzy;
	}

	public String getRoleIdFuzzy(){
		return this.roleIdFuzzy;
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

}
