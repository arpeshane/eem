package com.nice.eem.entity;

//Generated May 17, 2018 12:04:17 PM by Hibernate Tools 4.3.1

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
 * @author pooja.v
 */
@Entity
@Table(name = "eem_individual_customer")
public class EemIndividualCustomer {

	@Id
	@Column(name = "customer_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerId;

	@Column(name = "customer_name")
	private String custName;

	@Column(name = "cust_mail_id")
	private String custMailId;

	@Column(name = "week_start_day")
	private String weekStartDay;

	@Column(name = "week_end_day")
	private String weekEndDay;

	@Column(name = "daily_scheduled_time")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date dailyScheduledTime;

	@Column(name = "email_report_to")
	private String emailReportTo;

	@Column(name = "email_alerts_to")
	private String emailAlertsTo;

	@Column(name = "cust_status")
	private String custStatus;

	@Column(name = "deactivated_by")
	private String deactivatedBy;

	@Column(name = "reason_for_deactivation")
	private String reasonForDeactivation;

	@Column(name = "cust_deactivation_date")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date custDeactivationDate;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date createdDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	@Column(name = "last_modified_date")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date lastModifiedDate;

	public EemIndividualCustomer() {
		super();
	}

	public EemIndividualCustomer(Long customerId) {
		super();
		this.customerId = customerId;
	}

	public EemIndividualCustomer(Long customerId, String custName, String custMailId, String weekStartDay,
			String weekEndDay, Date dailyScheduledTime, String emailReportTo, String emailAlertsTo, String custStatus,
			String deactivatedBy, String reasonForDeactivation, Date custDeactivationDate, String createdBy,
			Date createdDate, String modifiedBy, Date lastModifiedDate) {
		this.customerId = customerId;
		this.custName = custName;
		this.custMailId = custMailId;
		this.weekStartDay = weekStartDay;
		this.weekEndDay = weekEndDay;
		this.dailyScheduledTime = dailyScheduledTime;
		this.emailReportTo = emailReportTo;
		this.emailAlertsTo = emailAlertsTo;
		this.custStatus = custStatus;
		this.deactivatedBy = deactivatedBy;
		this.reasonForDeactivation = reasonForDeactivation;
		this.custDeactivationDate = custDeactivationDate;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.lastModifiedDate = lastModifiedDate;
	}

	public Long getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustMailId() {
		return this.custMailId;
	}

	public void setCustMailId(String custMailId) {
		this.custMailId = custMailId;
	}

	public String getWeekStartDay() {
		return weekStartDay;
	}

	public void setWeekStartDay(String weekStartDay) {
		this.weekStartDay = weekStartDay;
	}

	public String getWeekEndDay() {
		return weekEndDay;
	}

	public void setWeekEndDay(String weekEndDay) {
		this.weekEndDay = weekEndDay;
	}

	public Date getDailyScheduledTime() {
		return dailyScheduledTime;
	}

	public void setDailyScheduledTime(Date dailyScheduledTime) {
		this.dailyScheduledTime = dailyScheduledTime;
	}

	public String getEmailReportTo() {
		return emailReportTo;
	}

	public void setEmailReportTo(String emailReportTo) {
		this.emailReportTo = emailReportTo;
	}

	public String getEmailAlertsTo() {
		return emailAlertsTo;
	}

	public void setEmailAlertsTo(String emailAlertsTo) {
		this.emailAlertsTo = emailAlertsTo;
	}

	public String getCustStatus() {
		return custStatus;
	}

	public void setCustStatus(String custStatus) {
		this.custStatus = custStatus;
	}

	public String getDeactivatedBy() {
		return deactivatedBy;
	}

	public void setDeactivatedBy(String deactivatedBy) {
		this.deactivatedBy = deactivatedBy;
	}

	public String getReasonForDeactivation() {
		return reasonForDeactivation;
	}

	public void setReasonForDeactivation(String reasonForDeactivation) {
		this.reasonForDeactivation = reasonForDeactivation;
	}

	public Date getCustDeactivationDate() {
		return custDeactivationDate;
	}

	public void setCustDeactivationDate(Date custDeactivationDate) {
		this.custDeactivationDate = custDeactivationDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

}
