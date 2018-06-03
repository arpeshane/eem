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
	public class EemDailyReport {

		@Id
		@Column(name = "task_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long taskId;
		
		@Column(name = "customer_id")
		private Long customerId;
		
		@Column(name = "task_name")
		private String taskName;
		
		@Column(name = "scheduled_time")
		@Temporal(javax.persistence.TemporalType.DATE)
		private Date scheduledTime;
		
		@Column(name = "report_type")
		private String reportType;


}