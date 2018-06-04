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
	@Table(name = "eem_daily_activity_log")
	public class EemDailyActivityLog {

		@Id
		@Column(name = "id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@Column(name = "customer_id")
		private Long customerId;
		
		@Column(name = "customer_name")
		private String customerName;
		
		@Column(name = "schedular_id")
		private Long schedularId;

		@Column(name = "report_run_date_time")
		@Temporal(javax.persistence.TemporalType.DATE)
		private Date reportRunDateTime;
		
		@Column(name = "report_status")
		private String reportStatus;
		
		@Column(name = "failure_reason")
		private String failureReason;
		
		@Column(name = "notification_to_user")
		private String notificationToUser;
		
		@Column(name = "error_occurance_time")
		@Temporal(javax.persistence.TemporalType.DATE)
		private Date errorOccuranceTime;
		
		@Column(name = "report_generated_by")
		private String reportGeneratedBy;
		
		
	}

