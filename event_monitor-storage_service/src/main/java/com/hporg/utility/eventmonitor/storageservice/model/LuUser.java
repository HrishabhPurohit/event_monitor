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

}
