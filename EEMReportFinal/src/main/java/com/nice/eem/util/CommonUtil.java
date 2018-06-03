package com.nice.eem.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Tuple;

import com.nice.eem.dto.SummaryReportDto;

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

	public static List<SummaryReportDto> map(List<Tuple> tuples) {
		List<SummaryReportDto> summaryReport = new ArrayList<SummaryReportDto>();
		for (Tuple tuple : tuples) {
			summaryReport.add(map(tuple));
		}
		return summaryReport;
	}

	public static SummaryReportDto map(Tuple tuple) {
		SummaryReportDto  summaryReportDto = new SummaryReportDto((Long)tuple.get("totalAgent"), (Long)tuple.get("totalAgentParticipating"),(Long) tuple.get("currentDayActiveAgent"),(Long) tuple.get("ssActiveAgents"), (Double)tuple.get("scheduleHr"), 
				(Long)tuple.get("extraHrReqAutoApproved"),(Double)tuple.get("extraHrHourAutoApproved") ,(Long)tuple.get("extraHrReqApproved") ,(Double)tuple.get("extraHrHoursApproved") ,(Long) tuple.get("extraHrReqDeclined"),(Double) tuple.get("extraHrHoursDeclined"), 
				(Long)tuple.get("extraHrReqRtcWaiting"),(Double) tuple.get("extraHrHoursRtcWaiting"), (Long)tuple.get("vtoReqAutoApproved"),(Double)tuple.get("vtoHourAutoApproved") , (Long)tuple.get("vtoReqApproved"),(Double)tuple.get("vtoHoursApproved") ,(Long)tuple.get("vtoReqDeclined") , 
				(Double)tuple.get("vtoHoursDeclined"), (Long)tuple.get("vtoReqRtcWaiting"), (Double)tuple.get("vtoHoursRtcWaiting"),(Long)tuple.get("ttlSwap") ,(Double)tuple.get("ttlSwapHr") , (Long)tuple.get("tradeReq"),(Long)tuple.get("ttlTradeAccepted") ,(Double) tuple.get("ttlTradeHr"), (Double)tuple.get("extraHrRulerCmdAgent"), 
				(Double)tuple.get("extraHrRtcApproved"),(Double)tuple.get("extraHrAgtAccepted") ,(Double)tuple.get("extraHrAgtDecliend") ,(Double) tuple.get("extraHrAgtNores"),(Double)tuple.get("vtoHourRulerCmdAgent") ,(Double)tuple.get("vtoHourRtcApproved") ,(Double)tuple.get("vtoHourAgtAccepted") , 
				(Double)tuple.get("vtoHourAgtDecliend"),(Double)tuple.get("vtoHourAgtNores"));
		return summaryReportDto;
	}
}
















