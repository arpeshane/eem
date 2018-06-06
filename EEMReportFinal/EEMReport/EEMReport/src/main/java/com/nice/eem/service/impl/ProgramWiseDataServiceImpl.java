package com.nice.eem.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nice.eem.dao.ProgramWiseDataDao;
import com.nice.eem.dto.ProgramWiseDataDto;
import com.nice.eem.dto.SummaryReportDto;
import com.nice.eem.entity.ConcentrixProgramEntity;
import com.nice.eem.service.ProgramWiseDataService;
/**
 * 
 * @author ajit.p
 *
 */
@Service
public class ProgramWiseDataServiceImpl implements ProgramWiseDataService {

	@Autowired
	private ProgramWiseDataDao programWiseDataDao;

	@Override
	public List<ProgramWiseDataDto> findAllProgramWiseData(String tablename, Date date) {
		List<ProgramWiseDataDto> programWiseDataDtos = new ArrayList<ProgramWiseDataDto>();
		List<ConcentrixProgramEntity> workflexConcentrics = programWiseDataDao.findAll();
		ObjectMapper mapper = new ObjectMapper();
		
		for (ConcentrixProgramEntity workflexConcentric : workflexConcentrics) {
			programWiseDataDtos.add(mapper.convertValue(workflexConcentric,ProgramWiseDataDto.class));
		}

		return programWiseDataDtos;
	}
	
	/*@Override
	public List<SummaryReportDto> getSummaryReportForCustomerByDate(Date ctzDate, String tablename){
	
		return programWiseDataDao.getSummaryReportForCustomerByDate(ctzDate);
		
	}*/

	@Override
	public SummaryReportDto getSummaryReport() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

	
	
	/*
	
	@Override
	public int getTotalAgentsByDate() {
		int totalAgents = programWiseDataDao.getTotalAgentsByDate();
		return totalAgents;
	}

	@Override
	public int getParticipatingAgentsByDate() {
		int participatingAgents = programWiseDataDao.getParticipatingAgentsByDate();
		return participatingAgents;
	}

	@Override
	public int getLoggedInAgentsByDate() {
		int loggedInAgents = programWiseDataDao.getLoggedInAgentsByDate();
		return loggedInAgents;
	}

	@Override
	public int getScheduleChangeAgentsByDate() {
		int scheduleChangeAgents = programWiseDataDao.getScheduleChangeAgentsByDate();
		return scheduleChangeAgents;
	}
	@Override
	public double getscheduleChangeAgentsToLoggedInAgents() {
		  double scheduleChangeAgentsToLoggedInAgents = getScheduleChangeAgentsByDate()/ getLoggedInAgentsByDate();
		    return scheduleChangeAgentsToLoggedInAgents;		   	  
	}
	@Override
	public double getScheduleModifyReqPerAgent() {
		double d  = 00.0;
		return d;
	}
	@Override
	public double scheduleModifyHoursPerAgent() {
		double d  = 00.0;
		return d;
	}
	
	@Override
	public double modifiedHouresForTotalAgentsFourWeeks() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalModifiedHouresFourWeeks() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getScheduleHoursByDate() {
		double scheduleHours = programWiseDataDao.getScheduleHoursByDate();
		return scheduleHours;	
	}
	
	//cnanges to be made
	@Override
	public int extraHoursOfSelfServiceRequestByDate() {
		int extraHoursOfSelfServiceRequest = programWiseDataDao.extraHoursOfSelfServiceRequestByDate();
		return extraHoursOfSelfServiceRequest;
	}
	
	@Override
	public double extraTotalHoursOfSelfServiceByDate() {
		double extraTotalHoursOfSelfService = programWiseDataDao.extraTotalHoursOfSelfServiceByDate();
		return extraTotalHoursOfSelfService;
	}
	// change need to be ddone
	@Override
	public int extraHrReqAutoApprovedByDate() {
		int extraHrReqAutoApproved = programWiseDataDao.extraHrReqAutoApprovedByDate();
		return extraHrReqAutoApproved;
	}
	
	@Override
	public double extraHrHourAutoApprovedByDate() {
		double extraHrHourAutoApproved = programWiseDataDao.extraHrHourAutoApprovedByDate();
		return extraHrHourAutoApproved;
	}
	
	@Override
	public int extraHrReqApprovedByDate() {
		int extraHrReqApproved = programWiseDataDao.extraHrReqApprovedByDate();
		return extraHrReqApproved;
	}

	@Override
	public double extraHrHoursApprovedByDate() {
		double extraHrHoursApproved = programWiseDataDao.extraHrHoursApprovedByDate();
		return extraHrHoursApproved;
	}
	
	@Override
	public int extraHrReqDeclinedByDate() {
		int extraHrReqDeclined = programWiseDataDao.extraHrReqDeclinedByDate();
		return extraHrReqDeclined;
	}
	
	@Override
	public double extraHrHoursDeclinedByDate() {
		double extraHrHoursDeclined = programWiseDataDao.extraHrHoursDeclinedByDate();
		return extraHrHoursDeclined;
	}

 
	@Override
	public double extraHrReqRtcWaitingByDate() {
		double extraHrReqRtcWaiting = programWiseDataDao.extraHrReqRtcWaitingByDate();
		return extraHrReqRtcWaiting;
	}
	
	@Override
	public int vtoHrRequestByDate() {
		int vtoHrRequestByDate = programWiseDataDao.vtoHrRequestByDate();
		return vtoHrRequestByDate;
	}

	@Override
	public double vtoHrTotalByDate() {
		double vtoHrTotalByDate = programWiseDataDao.vtoHrTotalByDate();
		return vtoHrTotalByDate;
	}

	@Override
	public int vtoReqAutoApprovedByDate() {
		int vtoReqAutoApproved = programWiseDataDao.vtoReqAutoApprovedByDate();
		return vtoReqAutoApproved;
	}
	
	@Override
	public double vtoHourAutoApprovedByDate() {
	double vtoHourAutoApproved = programWiseDataDao.vtoHourAutoApprovedByDate();
		return vtoHourAutoApproved;
	}

	@Override
	public int vtoReqApprovedByDate() {
		int vtoReqApproved = programWiseDataDao.vtoReqApprovedByDate();
		return vtoReqApproved;
	}

	@Override
	public double vtoHoursApprovedDate() {
	double vtoHoursApproved = programWiseDataDao.vtoHoursApprovedDate();
		return vtoHoursApproved;
	}

	@Override
	public int vtoReqDeclinedByDate() {
		int vtoReqDeclined = programWiseDataDao.vtoReqDeclinedByDate();
		return vtoReqDeclined;
	}
	
	@Override
	public double vtoHoursDeclinedByDate() {
	double vtoHoursDeclined = programWiseDataDao.vtoHoursDeclinedByDate();
		return vtoHoursDeclined;
	}

	@Override
	public int vtoReqRtcWaitingByDate() {
		int vtoReqRtcWaiting = programWiseDataDao.vtoReqRtcWaitingByDate();
		return vtoReqRtcWaiting;
	}
	
	@Override
	public double vtoHoursRtcWaitingByDate() {
		double vtoHoursRtcWaiting = programWiseDataDao.vtoHoursRtcWaitingByDate();
		return vtoHoursRtcWaiting;
	}
	
	
	@Override
	public SummaryReportDto getSummaryReport() {
		SummaryReportDto summaryReportDto =  new SummaryReportDto();
		summaryReportDto.setTotalAgent(getTotalAgentsByDate());
		summaryReportDto.setTotalAgentParticipating(getParticipatingAgentsByDate());
		summaryReportDto.setCurrentDayActiveAgent(getLoggedInAgentsByDate());
		summaryReportDto.setSsActiveAgents(getScheduleChangeAgentsByDate());
		summaryReportDto.setScheduleChangeToLoggedInAgents(getscheduleChangeAgentsToLoggedInAgents());
		summaryReportDto.setScheduleHr(getScheduleHoursByDate());
		summaryReportDto.setExtraHrRequest(0);    //changes to be made
		summaryReportDto.setExtraHrTotal(0);
		summaryReportDto.setExtraHrReqAutoApproved(extraHrReqAutoApprovedByDate());
		summaryReportDto.setExtraHrHourAutoApproved(extraHrHourAutoApprovedByDate());
		summaryReportDto.setExtraHrReqApproved(extraHrReqApprovedByDate());
		summaryReportDto.setExtraHrHoursApproved(extraHrHoursApprovedByDate());
		summaryReportDto.setExtraHrReqDeclined(extraHrReqDeclinedByDate());
		summaryReportDto.setExtraHrHoursDeclined(extraHrHoursDeclinedByDate());
		summaryReportDto.setExtraHrReqRtcWaiting(extraHrReqRtcWaitingByDate());
		summaryReportDto.setVtoHrRequest(0);
		summaryReportDto.setVtoHrTotal(0);
		summaryReportDto.setVtoHrRequest(vtoReqAutoApprovedByDate());
		summaryReportDto.setVtoHourAutoApproved(vtoHourAutoApprovedByDate());
		summaryReportDto.setVtoReqApproved(vtoReqApprovedByDate());
		summaryReportDto.setVtoHoursApproved(vtoHoursApprovedDate());
		summaryReportDto.setVtoReqDeclined(vtoReqDeclinedByDate());
		summaryReportDto.setVtoHoursDeclined(vtoHoursDeclinedByDate());
		summaryReportDto.setVtoReqRtcWaiting(vtoReqRtcWaitingByDate());
		summaryReportDto.setVtoHoursRtcWaiting(vtoHoursRtcWaitingByDate());
		
		
		return summaryReportDto;
	}

	
	

	@Override
	public int ttlSwapByDate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double ttlSwapHrByDate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int tradeReqByDate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int ttlTradeAcceptedByDate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double ttlTradeHrByDate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int extraHrRulercmdAgentByDate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int extraHrRtcApprovedByDate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int extraHrAgtAcceptedByDate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int extraHrAgtDecliendByDate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int extraHrAgtNoresByDate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int vtoHourRulercmdAgentByDate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int vtoHourRtcApprovedByDate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int vtoHourAgtAcceptedByDate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int vtoHourAgtDecliendByDate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int vtoHourAgtNoresByDate() {
		// TODO Auto-generated method stub
		return 0;
	}
*/
}
