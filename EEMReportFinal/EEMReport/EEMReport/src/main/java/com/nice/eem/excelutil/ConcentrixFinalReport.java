package com.nice.eem.excelutil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.mail.internet.MimeMessage;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.nice.eem.constants.EemConstants;
import com.nice.eem.dto.ProgramWiseDataDto;
import com.nice.eem.dto.SiteWiseDataDto;
import com.nice.eem.dto.SummaryReportDto;
import com.nice.eem.entity.EemIndividualCustomer;
import com.nice.eem.mail.batch.CustomerItemProcessor;
import com.nice.eem.mail.batch.model.Customer;
import com.nice.eem.service.EemCommonService;
import com.nice.eem.service.IndividualCustService;
import com.nice.eem.service.ProgramWiseDataService;
import com.nice.eem.service.SiteWiseDataService;
import com.nice.eem.util.CommonUtil;
import com.nice.eem.util.EemProperties;
import com.nice.eem.util.FileReadUtil;
import com.nice.eem.util.MailUtil;

/**
 * Created by Ajit on 18-05-2018.
 */
@Component
public class ConcentrixFinalReport {

	Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private ProgramWiseDataService programWiseDataService;

	@Autowired
	private EemCommonService eemCommonService;

	@Autowired
	private SiteWiseDataService siteWiseDataService;

	@Autowired
	private FileReadUtil fileRead;

	@Autowired
	private ExcelSheetCreation excelGeneration;

	@Autowired
	private EemProperties eemProperties;

	@Autowired
	private IndividualCustService eemIndividualCustService;

	@Autowired
	private JavaMailSender mailSender;

	/**
	 * @author ajit.p
	 * @throws Exception
	 */
	public Customer buildExcelDocument() throws Exception {

		Customer customer = null;
		Workbook workbook = null;
		// get the file from location
		String excelFilePath = fileRead.getFile();
		logger.info("Next File path: " + excelFilePath);
		try {

			List<String> customerNames = eemProperties.getCustomerNames();
			Date ctzDate = CommonUtil.convertStringToDate("2018-05-10");
			for (String customerName : customerNames) {

				FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

				workbook = WorkbookFactory.create(inputStream);

				System.out.println(workbook.toString());

				List<ProgramWiseDataDto> programAgents = programWiseDataService.findAllProgramWiseData();

				List<SiteWiseDataDto> siteAgents = siteWiseDataService.findAllSiteWiseData();

				List<SummaryReportDto> summaryReport = eemCommonService.getSummaryReportData(customerName, ctzDate);

				logger.info(summaryReport.toString());

				/*
				 * SummaryReportDto summaryReportDto =
				 * programWiseDataService.getSummaryReport();
				 * 
				 * ExcelUtil.getSummaryReportDto(summaryReportDto);
				 */
				excelGeneration.createSiteWiseSheet(siteAgents, workbook, 2);
				excelGeneration.createProgramWiseSheet(programAgents, workbook, 1);
				// excelGeneration.createSummaryReport(summaryReportDto,
				// workbook,
				// 0);
				excelGeneration.createSummaryReport(summaryReport, workbook, 0);
				inputStream.close();
				String attachment = customerName.concat(EemConstants.OUTPUT_FILE_NAME).concat(String.valueOf(ctzDate.getTime())).concat(EemConstants.XLSX_FORMAT);

				FileOutputStream outputStream = new FileOutputStream(attachment);
				/* "./generated-reports/Telus Dashboard 23-05-18.xlsx" */
				System.out.println(outputStream);
				workbook.write(outputStream);
				workbook.close();
				outputStream.close();
				EemIndividualCustomer eemCustomer = eemIndividualCustService.findByCustName(customerName);
				// MimeMessage message = sendEmailsToCustomers(customer);
				String[] customerEmailsTo = eemCustomer.getEmailReportTo().split(",");
				String[] attachments = { attachment };
				customer = new Customer(customerName, EemConstants.EMAIL_SENDER, customerEmailsTo, null, null, EemConstants.REPORT_MAIL_SUBJECT, EemConstants.REPORT_MAIL_BODY, attachments);
				MimeMessage sendEmailsToCustomers = sendEmailsToCustomers(customer);
				customer.setMessage(sendEmailsToCustomers);
			}

		} catch (IOException | EncryptedDocumentException ex) {
			logger.error(ex.getMessage());
		}

		return customer;
	}

	public MimeMessage sendEmailsToCustomers(Customer customer) throws Exception {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		helper.setFrom(customer.getSender());
		helper.setTo(customer.getEmailsTo());
		helper.setSubject(customer.getSubject());
		helper.setText(customer.getEmailBody());

		String[] attachments = customer.getAttachments();
		for (String attachment : attachments) {
			FileSystemResource file = new FileSystemResource(attachment);
			helper.addAttachment(file.getFilename(), file);
		}
		mailSender.send(message);
		return message;
	}
}