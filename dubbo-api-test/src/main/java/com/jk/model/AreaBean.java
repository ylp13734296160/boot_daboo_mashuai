package com.jk.model;

import java.io.Serializable;

public class AreaBean implements  Serializable{

	
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String name;
	
	private Integer pid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "AreaBean [id=" + id + ", name=" + name + ", pid=" + pid + "]";
	}
	
	
}
