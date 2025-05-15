package com.javaclimb.puzzlegameback.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;


/**
 * 
 */
public class RoleStory implements Serializable {


	/**
	 * 角色id
	 */
	private String roleId;

	/**
	 * 故事id
	 */
	private String storyId;


	public void setRoleId(String roleId){
		this.roleId = roleId;
	}

	public String getRoleId(){
		return this.roleId;
	}

	public void setStoryId(String storyId){
		this.storyId = storyId;
	}

	public String getStoryId(){
		return this.storyId;
	}

	@Override
	public String toString (){
		return "角色id:"+(roleId == null ? "空" : roleId)+"，故事id:"+(storyId == null ? "空" : storyId);
	}
}
