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

import com.nice.eem.excelutil.ConcentrixFinalReport;
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
	private IndividualCustService custService;

	@Autowired
	private ConcentrixFinalReport concentrixFinalReport;

	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	private VelocityEngine engine;


	/**
	 * 
	 */
	public CustomerItemProcessor() {

	}

	@Override
	public MimeMessage process(Customer customer) throws Exception {
		customer = concentrixFinalReport.buildExcelDocument();
		//MimeMessage message = sendEmailsToCustomers(customer);
		return customer.getMessage();
	}

	public MimeMessage sendEmailsToCustomers(Customer customer) throws Exception {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setFrom(customer.getSender());
		helper.setTo(customer.getEmailsTo());
		helper.setSubject(customer.getSubject());
		helper.setText(customer.getEmailBody());

		log.info("Preparing message for: " + customer.getEmailsTo());
		String[] attachments = customer.getAttachments();
		for (String attachment : attachments) {
			FileSystemResource file = new FileSystemResource(attachment);
			helper.addAttachment(file.getFilename(), file);
		}
		
		return message;
	}

}
