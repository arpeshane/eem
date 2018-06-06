package com.nice.eem.service;

import java.util.Date;
import java.util.List;

import com.nice.eem.dto.ProgramWiseDataDto;
import com.nice.eem.dto.SummaryReportDto;

/**
 * 
 * @author ajit.p
 * generate Summary report and list of program wise data
 */
public interface ProgramWiseDataService {

	public List<ProgramWiseDataDto> findAllProgramWiseData(String tablename, Date date);

	//public List<SummaryReportDto> getSummaryReportForCustomerByDate(Date ctzDate, String tablename);

	/*
	
	public int getTotalAgentsByDate();

	public int getParticipatingAgentsByDate();

	public int getLoggedInAgentsByDate();

	public int getScheduleChangeAgentsByDate();
	
	public double getscheduleChangeAgentsToLoggedInAgents();
	
	public double getScheduleModifyReqPerAgent();
	
	public double scheduleModifyHoursPerAgent();
	
	public double modifiedHouresForTotalAgentsFourWeeks();
	
	public double totalModifiedHouresFourWeeks(); 
	
	public double getScheduleHoursByDate();
	
	public int extraHoursOfSelfServiceRequestByDate();
	
	public double extraTotalHoursOfSelfServiceByDate();
	
	public int extraHrReqAutoApprovedByDate();
	
	public double extraHrHourAutoApprovedByDate();
	
	public int extraHrReqApprovedByDate();

	public double extraHrHoursApprovedByDate();
	
	public int extraHrReqDeclinedByDate();
	
	public double extraHrHoursDeclinedByDate();
	
	public double extraHrReqRtcWaitingByDate();
	
	public int vtoHrRequestByDate();
	
	public double vtoHrTotalByDate();
	
	public int vtoReqAutoApprovedByDate();
	
	public double vtoHourAutoApprovedByDate();
	
	public int vtoReqApprovedByDate();
	
	public double vtoHoursApprovedDate();
	
	public int vtoReqDeclinedByDate();

	public double vtoHoursDeclinedByDate();

	public int vtoReqRtcWaitingByDate();
	
	public double vtoHoursRtcWaitingByDate();
	
	public int ttlSwapByDate();
	
	public double ttlSwapHrByDate();
	
	public int tradeReqByDate();
	
	public int ttlTradeAcceptedByDate();
	
	public double ttlTradeHrByDate();
	
	public int extraHrRulercmdAgentByDate();
	
	public int extraHrRtcApprovedByDate();
	
	public int extraHrAgtAcceptedByDate();
	
	public int extraHrAgtDecliendByDate();
	
	public int extraHrAgtNoresByDate();
	
	public int vtoHourRulercmdAgentByDate();
	
	public int vtoHourRtcApprovedByDate();
	
	public int vtoHourAgtAcceptedByDate();
	
	public int vtoHourAgtDecliendByDate();
	
	public int vtoHourAgtNoresByDate();
	
	
	*/
	public SummaryReportDto getSummaryReport();

}
