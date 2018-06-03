package com.nice.eem.util;

import com.nice.eem.constants.EemConstants;
import com.nice.eem.entity.EemIndividualCustomer;
import com.nice.eem.mail.batch.model.Customer;

public class MailUtil {

	public static Customer getCustomerDetails(EemIndividualCustomer eemCustomer) {

		Customer customer = new Customer();
		String[] customerEmails = eemCustomer.getCustMailId().split(",");
		String custName = eemCustomer.getCustName();
		customer.setEmails(customerEmails);
		customer.setFullname(custName);
		customer.setSubject(EemConstants.REPORT_MAIL_SUBJECT);
		customer.setEmailBody(EemConstants.REPORT_MAIL_BODY);
		
		return customer;
	
	}

}
