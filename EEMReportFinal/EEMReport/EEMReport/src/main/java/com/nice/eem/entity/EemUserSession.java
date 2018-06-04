package com.nice.eem.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
/**
 * 
 * @author ajit.p
 *
 */
	@Entity
	@Table(name = "eem_user_session")
	public class EemUserSession {

		@Id
		@Column(name = "id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@Column(name = "user_id")
		private Long userId;

		@Column(name = "user_name")
		private String userName;

		@Column(name = "user_status")
		private String userStatus;

		@Column(name = "last_login_time")
		@Temporal(javax.persistence.TemporalType.DATE)
		private Date lastLoginTime;

		@Column(name = "last_log_out_time")
		@Temporal(javax.persistence.TemporalType.DATE)
		private Date lastLogOutTime;
		
		@Column(name = "created_date")
		@Temporal(javax.persistence.TemporalType.DATE)
		private Date createdDate;
		
		@Column(name = "last_modified_date")
		@Temporal(javax.persistence.TemporalType.DATE)
		private Date lastModifiedDate;
}
