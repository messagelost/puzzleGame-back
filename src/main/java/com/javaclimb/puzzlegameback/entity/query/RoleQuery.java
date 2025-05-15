package com.javaclimb.puzzlegameback.entity.query;



/**
 * 参数
 */
public class RoleQuery extends BaseParam {


	/**
	 * 角色id
	 */
	private String roleId;

	private String roleIdFuzzy;

	/**
	 * 角色名字
	 */
	private String name;

	private String nameFuzzy;

	/**
	 * 角色立绘url
	 */
	private String pic;

	private String picFuzzy;

	/**
	 * 角色介绍
	 */
	private String introduction;

	private String introductionFuzzy;


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

}
