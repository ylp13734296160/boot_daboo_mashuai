package com.jk.model;

import java.io.Serializable;

public class UserBean implements Serializable {

	private static final long serialVersionUID = 1073342260767858953L;
	private Integer id;
	
	private String name;
	
	private String account;
	
	private Integer age;
	
	private String password;
	
	private Integer deptId;
	
	private String deptName;
	
	private Integer sex;
	
	private String headImg;
	
	private Integer provinceId;
	
	private String provinceName;
	
	private Integer cityId;
	
	private String cityName;
	
	private Integer status;
	
	private String roleId;
	
	private String roleName;
	
	private String startTime;
	
	private String endTime;
	
	private String  login;

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

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public Integer getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", account=" + account + ", age=" + age + ", password="
				+ password + ", deptId=" + deptId + ", deptName=" + deptName + ", sex=" + sex + ", headImg=" + headImg
				+ ", provinceId=" + provinceId + ", provinceName=" + provinceName + ", cityId=" + cityId + ", cityName="
				+ cityName + ", status=" + status + ", roleId=" + roleId + ", roleName=" + roleName + ", startTime="
				+ startTime + ", endTime=" + endTime + ", login=" + login + "]";
	}

	
	
	
}
