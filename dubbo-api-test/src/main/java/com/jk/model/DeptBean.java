package com.jk.model;

import java.io.Serializable;
import java.util.List;

public class DeptBean implements  Serializable{

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String text;
	
	private Integer pid;
	
	private List<DeptBean> children;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public List<DeptBean> getChildren() {
		return children;
	}

	public void setChildren(List<DeptBean> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "DeptBean [id=" + id + ", text=" + text + ", pid=" + pid + ", children=" + children + "]";
	}
	
}
