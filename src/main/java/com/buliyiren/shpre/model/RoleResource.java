package com.buliyiren.shpre.model;

import javax.persistence.Table; 

/**
* RoleResource 实体类
* Thu Nov 16 10:04:51 CST 2017 cennanfang
*/ 
@Table(name = "t_role_resource")
public class RoleResource extends BaseModel {

	/**
	* 
	*/ 
	private Long roleId;

	/**
	* 
	*/ 
	private Long resourceId;

	public void setRoleId(Long roleId){
		this.roleId = roleId;
	}

	public Long getRoleId(){
		return roleId;
	}

	public void setResourceId(Long resourceId){
		this.resourceId = resourceId;
	}

	public Long getResourceId(){
		return resourceId;
	}
}

