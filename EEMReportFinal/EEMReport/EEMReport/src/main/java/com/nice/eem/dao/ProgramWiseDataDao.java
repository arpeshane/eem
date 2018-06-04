package com.nice.eem.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nice.eem.dto.SummaryReportDto;
import com.nice.eem.entity.ConcentrixProgramEntity;

@Repository
public interface ProgramWiseDataDao extends JpaRepository<ConcentrixProgramEntity, Long> {
	/**
	 * This method will return all data from workflexdatastatus_concentrix. ie. program_wise data
	 */
	
	@Override
	public List<ConcentrixProgramEntity> findAll();

	/**
	 * 
	 * @param ctzDate
	 * @return list of summary of one customer for one day.
	 */
	@Query("select NEW com.nice.eem.dto.SummaryReportDto(Sum(p.totalAgent), SUM(p.totalAgentParticipating), SUM(p.currentDayActiveAgent), SUM(p.ssActiveAgents), SUM(p.scheduleHr), SUM(p.extraHrReqAutoApproved), SUM(p.extraHrHourAutoApproved), SUM(p.extraHrReqApproved), SUM(p.extraHrHoursApproved), SUM(p.extraHrReqDeclined), SUM(p.extraHrHoursDeclined), SUM(p.extraHrReqRtcWaiting), SUM(p.extraHrHoursRtcWaiting), SUM(p.vtoReqAutoApproved), SUM(p.vtoHourAutoApproved), SUM(p.vtoReqApproved), SUM(p.vtoHoursApproved), SUM(p.vtoReqDeclined), SUM(p.vtoHoursDeclined), SUM(p.vtoReqRtcWaiting), SUM(p.vtoHoursRtcWaiting), SUM(p.ttlSwap), SUM(p.ttlSwapHr), SUM(p.tradeReq), SUM(p.ttlTradeAccepted), SUM(p.ttlTradeHr), SUM(p.extraHrRulerCmdAgent), SUM(p.extraHrRtcApproved), SUM(p.extraHrAgtAccepted), SUM(p.extraHrAgtDecliend), SUM(p.extraHrAgtNores), SUM(p.vtoHourRulerCmdAgent), SUM(p.vtoHourRtcApproved), SUM(p.vtoHourAgtAccepted), SUM(p.vtoHourAgtDecliend), SUM(p.vtoHourAgtNores)) FROM ConcentrixProgramEntity p WHERE p.ctzDateTime>= :ctzDate ")
	public List<SummaryReportDto> getSummaryReportForCustomerByDate(@Param("ctzDate") Date ctzDate);
	
	
	
} 