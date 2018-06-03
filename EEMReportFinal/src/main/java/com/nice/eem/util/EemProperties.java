package com.nice.eem.util;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:./eem.properties")
public class EemProperties {

	@Value("${customer.names}")
	private String customerNames;

	@Value("${find.summary.data.by.date}")
	private String summaryReportQuery;

	@Value("${find.program.data.by.date}")
	private String programDataQuery;

	@Value("${find.site.data.by.date}")
	private String siteDataQuery;

	@Value("${mail.sender}")
	private String mailSender;

	/**
	 * 
	 * @return customerNames
	 */
	public List<String> getCustomerNames() {
		return (customerNames != null && !customerNames.isEmpty()) ? Arrays.asList(customerNames.split(",")) : null;
	}

	/**
	 * 
	 * @return summaryReportQuery
	 */
	public String getSummaryReportQuery() {
		return summaryReportQuery;
	}

	/**
	 * @return the programDataQuery
	 */
	public String getProgramDataQuery() {
		return programDataQuery;
	}

	/**
	 * @return the siteDataQuery
	 */
	public String getSiteDataQuery() {
		return siteDataQuery;
	}

	/**
	 * @return the mailSender
	 */
	public String getMailSender() {
		return mailSender;
	}

	public static String setQueryValues(String query, String value) {
		String formattedMessage = MessageFormat.format(query, value);
		return formattedMessage;
	}

}
