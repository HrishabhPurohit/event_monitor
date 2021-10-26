package com.hporg.utility.eventmonitor.storageservice.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lu_users")
public class LuUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "pk_lu_user_id")
	private Integer pkLuUserId;
	
	@Column(name = "username", nullable = false)
	private String username;
	
	@Column(name = "user_full_name", nullable = true)
	private String userFullName;
	
	@Column(name = "create_user", nullable = true)
	private String createUser;

	@Column(name = "update_user", nullable = true)
	private String updateUser;
	
	@Column(name = "update_time", nullable = true)
	private Date updateTime;
	
	@Column(name = "create_time", nullable = true)
	private Date createTime;
	
	@Column(name = "user_email_id", nullable = false)
	private String userEmailId;
	
	public Integer getPkLuUserId() {
		return pkLuUserId;
	}

	public void setPkLuUserId(Integer pkLuUserId) {
		this.pkLuUserId = pkLuUserId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

}
