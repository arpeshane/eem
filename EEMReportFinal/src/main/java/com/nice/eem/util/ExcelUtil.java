/**
 * 
 */
package com.nice.eem.util;

import org.springframework.stereotype.Component;

import com.nice.eem.dto.SummaryReportDto;

/**
 * @author AJIT
 *
 */

public class ExcelUtil {

	
public static SummaryReportDto getSummaryReportDto(SummaryReportDto summaryReportDto){
		
		summaryReportDto.setScheduleChangeToLoggedInAgents(summaryReportDto.getSsActiveAgents()/summaryReportDto.getCurrentDayActiveAgent());
		
		summaryReportDto.setScheduleModifyReqPerAgent((summaryReportDto.getExtraHrRequest()+summaryReportDto.getVtoHrRequest()+summaryReportDto.getTtlSwap()+summaryReportDto.getTradeReq())/summaryReportDto.getTotalAgent());
		
		summaryReportDto.setScheduleModifyReqPerAgent((summaryReportDto.getExtraHrTotal()+summaryReportDto.getVtoHrTotal()+summaryReportDto.getTtlSwapHr()*2+summaryReportDto.getTtlTradeHr()*2)/summaryReportDto.getTotalAgent());
		
		return summaryReportDto;
	}
}
