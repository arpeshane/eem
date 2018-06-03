package com.nice.eem.mail.batch;

import javax.mail.internet.MimeMessage;

import org.apache.velocity.app.VelocityEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.nice.eem.mail.batch.model.Customer;
import com.nice.eem.service.IndividualCustService;

/**
 * 
 * @author ajit.p
 *
 */
public class CustomerItemProcessor implements ItemProcessor<Customer, MimeMessage> {

	private static final Logger log = LoggerFactory.getLogger(CustomerItemProcessor.class);

	@Autowired
	IndividualCustService custService;

	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	private VelocityEngine engine;

	private String sender;
	private String attachment;
	private Customer customer;
	
	public CustomerItemProcessor(String sender, String attachment) {
		this.sender = sender;
		this.attachment = attachment;
		
	}
	public CustomerItemProcessor(String sender, String attachment, Customer customer) {
		this.sender = sender;
		this.attachment = attachment;
		this.customer = customer;
	}
	
	@Override
	public MimeMessage process(Customer customer) throws Exception {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setFrom(sender);
		helper.setTo(this.customer.getEmails());
		helper.setCc(sender);
		helper.setSubject(this.customer.getSubject());
		helper.setText(this.customer.getEmailBody());

		log.info("Preparing message for: " + this.customer.getEmails());

		FileSystemResource file = new FileSystemResource(attachment);
		helper.addAttachment(file.getFilename(), file);

		return message;
	}

}
