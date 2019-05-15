package com.jk.model;

import java.io.Serializable;

public class PowerMenuBean implements Serializable {
	private static final long serialVersionUID = -4070028774644760897L;
	private Integer id;
	private String name;
	private String path;
	private String remark;
	private Integer powerId;

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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getPowerId() {
		return powerId;
	}

	public void setPowerId(Integer powerId) {
		this.powerId = powerId;
	}

	@Override
	public String toString() {
		return "PowerMenuBean [id=" + id + ", name=" + name + ", path=" + path + ", remark=" + remark + ", powerId="
				+ powerId + "]";
	}

}
