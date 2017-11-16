package com.buliyiren.shpre.model;

import javax.persistence.Table; 

/**
* UserRole 实体类
* Thu Nov 16 09:52:30 CST 2017 cennanfang
*/ 
@Table(name = "t_user_role")
public class UserRole extends BaseModel {

	/**
	* 
	*/ 
	private Long userId;

	/**
	* 
	*/ 
	private Long roleId;

	public void setUserId(Long userId){
		this.userId = userId;
	}

	public Long getUserId(){
		return userId;
	}

	public void setRoleId(Long roleId){
		this.roleId = roleId;
	}

	public Long getRoleId(){
		return roleId;
	}
}

