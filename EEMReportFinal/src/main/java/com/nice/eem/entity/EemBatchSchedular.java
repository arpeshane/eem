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
@Table(name = "eem_batch_schedular")
public class EemBatchSchedular {

	@Id
	@Column(name = "schedular_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long schedularId;

	@Column(name = "customer_id")
	private Long customerId;
	
	@Column(name = "end_day_report_id")
	private Long endDayReportId;
	 
	@Column(name = "processed_record_count")
	private Long processedRecordCount;

	@Column(name = "process_start_time")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date processStartTime;
	
	@Column(name = "process_end_time")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date processEndTime;

	@Column(name = "report_type")
	private String reportType;
	
	@Column(name = "created_date")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date createdDate;

}
