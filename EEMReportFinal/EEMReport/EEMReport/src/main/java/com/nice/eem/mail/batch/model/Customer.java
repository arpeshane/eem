package com.nice.eem.mail.batch.model;

import javax.mail.internet.MimeMessage;

/**
 * 
 * @author ajit.p
 *
 */
public class Customer {

	private String name;
	private String sender;
	private String[] emailsTo;
	private String[] emailsCc;
	private String[] emailsBcc;
	private String subject;
	private String emailBody;
	private String[] attachments;
	MimeMessage message;
	
	
	/**
	 * 
	 */
	public Customer() {
		super();
	}
	/**
	 * @param name
	 * @param sender
	 * @param emailsTo
	 * @param emailsCc
	 * @param emailsBcc
	 * @param subject
	 * @param emailBody
	 * @param attachments
	 */
	public Customer(String name, String sender, String[] emailsTo, String[] emailsCc, String[] emailsBcc, String subject, String emailBody, String[] attachments) {
		super();
		this.name = name;
		this.sender = sender;
		this.emailsTo = emailsTo;
		this.emailsCc = emailsCc;
		this.emailsBcc = emailsBcc;
		this.subject = subject;
		this.emailBody = emailBody;
		this.attachments = attachments;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sender
	 */
	public String getSender() {
		return sender;
	}
	/**
	 * @param sender the sender to set
	 */
	public void setSender(String sender) {
		this.sender = sender;
	}
	/**
	 * @return the emailsTo
	 */
	public String[] getEmailsTo() {
		return emailsTo;
	}
	/**
	 * @param emailsTo the emailsTo to set
	 */
	public void setEmailsTo(String[] emailsTo) {
		this.emailsTo = emailsTo;
	}
	/**
	 * @return the emailsCc
	 */
	public String[] getEmailsCc() {
		return emailsCc;
	}
	/**
	 * @param emailsCc the emailsCc to set
	 */
	public void setEmailsCc(String[] emailsCc) {
		this.emailsCc = emailsCc;
	}
	/**
	 * @return the emailsBcc
	 */
	public String[] getEmailsBcc() {
		return emailsBcc;
	}
	/**
	 * @param emailsBcc the emailsBcc to set
	 */
	public void setEmailsBcc(String[] emailsBcc) {
		this.emailsBcc = emailsBcc;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
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
	 * @param emailBody the emailBody to set
	 */
	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}
	/**
	 * @return the attachments
	 */
	public String[] getAttachments() {
		return attachments;
	}
	/**
	 * @param attachments the attachments to set
	 */
	public void setAttachments(String[] attachments) {
		this.attachments = attachments;
	}
	/**
	 * @return the message
	 */
	public MimeMessage getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(MimeMessage message) {
		this.message = message;
	}

	
}
