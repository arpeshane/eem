package com.nice.eem.constants;

import java.io.File;

/**
 * 
 * @author AJIT
 *
 */
public class EemConstants {

	public static final String XLSX_FORMAT = ".xlsx";

	public static final String OUTPUT_FILE_NAME = "Dashboard";

	public static final String INPUT_FILE_PATH = "." + File.separator + "templates" + File.separator + "Dashboard.xlsx";

	public static final int DL = 115;

	public static final String REPORT_MAIL_SUBJECT = "Final Report";

	public static final String ALERT_MAIL_SUBJECT = "Failure Report";

	public static final String REPORT_MAIL_BODY = "Please find attachment for Final Report.";

	public static final String ALERT_MAIL_BODY = "Failure Report for Last day.";

	public static final String SUMMARY_REPORT_MAPPING = "SummaryReportDto";
	
	public static final String EMAIL_SENDER = "ajit2java@gmail.com";

}
