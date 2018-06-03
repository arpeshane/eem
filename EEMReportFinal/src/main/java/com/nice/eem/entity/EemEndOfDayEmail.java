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
@Table(name = "eem_endofday_email")
public class EemEndOfDayEmail {

	@Id
	@Column(name = "end_day_report_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long endDayReportId;

	@Column(name = "customer_id")
	private Long customerId;

	@Column(name = "recipient_email_id")
	private String recipientEmailId;

	@Column(name = "mail_sent_status")
	private String mailSentStatus;

	@Column(name = "mail_description")
	private String mailDescription;

	@Column(name = "mail_sent_date")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date mailSentDate;

}
