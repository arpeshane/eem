package com.nice.eem.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Tuple;

import com.nice.eem.dto.SummaryReportDto;
import java.util.Calendar;

/**
 * 
 * @author ajit.p
 *
 */
public class CommonUtil {

	public static Date convertStringToDate(String str) throws Exception {
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
		return date;
	}

	public static String convertDateToString(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String strDate = dateFormat.format(date);
		return strDate;

	}

/**
 * 
 * @param date
 * @return
 */
	public static String convertDateToReportDate(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MMM");
		String reportDate = dateFormat.format(date);
		return reportDate;

	}
/**
 * 
 * @param date
 * @return
 */
	public static String convertDateToReportDay(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("E");
		String reportDay = dateFormat.format(date);
		return reportDay;

	}

	public static String getDateByWeekDay(String day) {
		int weekday = 0;
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			switch (day) {
			case "Sunday":
				weekday = 1;
				break;
			case "Monday":
				weekday = 2;
				break;
			case "Tuesday":
				weekday = 3;
				break;
			case "Wednesday":
				weekday = 4;
				break;
			case "Thursday":
				weekday = 5;
				break;
			case "Friday":
				weekday = 6;
				break;
			case "Saturday":
				weekday = 7;
				break;
			}
			Calendar cal = Calendar.getInstance();
			cal.setTime(new Date());
			cal.set(Calendar.WEEK_OF_MONTH, cal.get(Calendar.WEEK_OF_MONTH));
			cal.set(Calendar.DAY_OF_WEEK, weekday);
//			cal.add(Calendar.DAY_OF_YEAR, -1);
			return dateFormat.format(cal.getTime());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
