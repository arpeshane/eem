package com.nice.eem.mail.batch.model;

/**
 * 
 * @author ajit.p
 *
 */
public class Customer {

	private String fullname;
	private String code;
	private String email;
	private String[] emails;
	private String subject;
	private String emailBody;

	public Customer() {
	}

	
	/**
	 * @param fullname
	 * @param email
	 * @param emails
	 * @param subject
	 * @param emailBody
	 */
	public Customer(String fullname, String email, String[] emails, String subject, String emailBody) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.emails = emails;
		this.subject = subject;
		this.emailBody = emailBody;
	}


	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the emails
	 */
	public String[] getEmails() {
		return emails;
	}

	/**
	 * @param emails
	 *            the emails to set
	 */
	public void setEmails(String[] emails) {
		this.emails = emails;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the emailBody
	 */
	public String getEmailBody() {
		return emailBody;
	}

	/**
	 * @param emailBody
	 *            the emailBody to set
	 */
	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}

}
