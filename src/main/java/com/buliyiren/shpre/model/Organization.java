package com.buliyiren.shpre.model;

import javax.persistence.Table; 

/**
* Organization 实体类
* Thu Nov 16 09:52:30 CST 2017 cennanfang
*/ 
@Table(name = "t_organization")
public class Organization extends BaseModel {

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
	private Long parentId;

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

	public void setParentId(Long parentId){
		this.parentId = parentId;
	}

	public Long getParentId(){
		return parentId;
	}

	public void setAvailable(Boolean available){
		this.available = available;
	}

	public Boolean getAvailable(){
		return available;
	}
}

