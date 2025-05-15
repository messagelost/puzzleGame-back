package com.javaclimb.puzzlegameback.entity.query;



/**
 * 参数
 */
public class RoleStoryQuery extends BaseParam {


	/**
	 * 角色id
	 */
	private String roleId;

	private String roleIdFuzzy;

	/**
	 * 故事id
	 */
	private String storyId;

	private String storyIdFuzzy;


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

}
