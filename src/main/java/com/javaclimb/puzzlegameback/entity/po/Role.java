package com.javaclimb.puzzlegameback.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 */
public class Role implements Serializable {


	/**
	 * 角色id
	 */
	private String roleId;

	/**
	 * 角色名字
	 */
	private String name;

	/**
	 * 角色立绘url
	 */
	private String pic;

	/**
	 * 角色介绍
	 */
	private String introduction;


	public void setRoleId(String roleId){
		this.roleId = roleId;
	}

	public String getRoleId(){
		return this.roleId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setPic(String pic){
		this.pic = pic;
	}

	public String getPic(){
		return this.pic;
	}

	public void setIntroduction(String introduction){
		this.introduction = introduction;
	}

	public String getIntroduction(){
		return this.introduction;
	}

	@Override
	public String toString (){
		return "角色id:"+(roleId == null ? "空" : roleId)+"，角色名字:"+(name == null ? "空" : name)+"，角色立绘url:"+(pic == null ? "空" : pic)+"，角色介绍:"+(introduction == null ? "空" : introduction);
	}
}
