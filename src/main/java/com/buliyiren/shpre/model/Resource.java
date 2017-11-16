package com.buliyiren.shpre.model;

import javax.persistence.Table; 

/**
* Resource 实体类
* Thu Nov 16 10:04:51 CST 2017 cennanfang
*/ 
@Table(name = "t_resource")
public class Resource extends BaseModel {

	/**
	* 
	*/ 
	private Long id;

	/**
	* 
	*/ 
	private String name;

	/**
	* 
	*/ 
	private String type;

	/**
	* 
	*/ 
	private String url;

	/**
	* 
	*/ 
	private Long parentId;

	/**
	* 
	*/ 
	private String permission;

	/**
	* 
	*/ 
	private Boolean available;

	public void setId(Long id){
		this.id = id;
	}

	public Long getId(){
		return id;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setParentId(Long parentId){
		this.parentId = parentId;
	}

	public Long getParentId(){
		return parentId;
	}

	public void setPermission(String permission){
		this.permission = permission;
	}

	public String getPermission(){
		return permission;
	}

	public void setAvailable(Boolean available){
		this.available = available;
	}

	public Boolean getAvailable(){
		return available;
	}
}

