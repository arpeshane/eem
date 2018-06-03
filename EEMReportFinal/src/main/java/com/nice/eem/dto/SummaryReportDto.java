/**
 * 
 */
package com.nice.eem.dto;

import java.math.BigDecimal;

/**
 * @author ajit.p
 *
 */
public class SummaryReportDto{

	private static final Long serialVersionUID = 1L;
	/* Summary */
	private BigDecimal totalAgent;
	private BigDecimal totalAgentParticipating;
	private BigDecimal currentDayActiveAgent;
	private BigDecimal ssActiveAgents;
	private Double scheduleChangeToLoggedInAgents;
	private Double scheduleModifyReqPerAgent;
	private Double scheduleModifyHoursPerAgents;
	private Double modHrForTotalAgtsFourWeeks;
	private Double totalModHrFourWeeks;
	private Double scheduleHr;
	/*Self Service*/
	// Extra Hours
	private BigDecimal extraHrRequest;
	private Double extraHrTotal;
	private BigDecimal extraHrReqAutoApproved;
	private Double extraHrHourAutoApproved;
	private BigDecimal extraHrReqApproved;
	private Double extraHrHoursApproved;
	private BigDecimal extraHrReqDeclined;
	private Double extraHrHoursDeclined;
	private BigDecimal extraHrReqRtcWaiting;
	private Double extraHrHoursRtcWaiting;
	// Time Off	
	private BigDecimal vtoHrRequest;
	private Double vtoHrTotal;
	private BigDecimal vtoReqAutoApproved;
	private Double vtoHourAutoApproved;
	private BigDecimal vtoReqApproved;
	private Double vtoHoursApproved;
	private BigDecimal vtoReqDeclined;
	private Double vtoHoursDeclined;
	private BigDecimal vtoReqRtcWaiting;
	private Double vtoHoursRtcWaiting;
	//Swap and Trade
	private BigDecimal ttlSwap;
	private Double ttlSwapHr;
	private BigDecimal tradeReq;
	private BigDecimal ttlTradeAccepted;
	private Double ttlTradeHr;
	
	/*Rule Recommendation*/
	//Extra Hours
	private Double extraHrRulerCmdAgent;
	private Double extraHrRtcApproved;
	private Double extraHrAgtAccepted;
	private Double extraHrAgtDecliend;
	private Double extraHrAgtNores;
	// Time Off
	private Double vtoHourRulerCmdAgent;
	private Double vtoHourRtcApproved;
	private Double vtoHourAgtAccepted;
	private Double vtoHourAgtDecliend;
	private Double vtoHourAgtNores;
	public SummaryReportDto() {
		super();
	}
	
	public SummaryReportDto(BigDecimal totalAgent, BigDecimal totalAgentParticipating, BigDecimal currentDayActiveAgent, BigDecimal ssActiveAgents,
			Double scheduleHr, BigDecimal extraHrReqAutoApproved, Double extraHrHourAutoApproved, BigDecimal extraHrReqApproved,
			Double extraHrHoursApproved, BigDecimal extraHrReqDeclined, Double extraHrHoursDeclined, BigDecimal extraHrReqRtcWaiting,
			Double extraHrHoursRtcWaiting, BigDecimal vtoReqAutoApproved, Double vtoHourAutoApproved, BigDecimal vtoReqApproved,
			Double vtoHoursApproved, BigDecimal vtoReqDeclined, Double vtoHoursDeclined, BigDecimal vtoReqRtcWaiting,
			Double vtoHoursRtcWaiting, BigDecimal ttlSwap, Double ttlSwapHr, BigDecimal tradeReq, BigDecimal ttlTradeAccepted,
			Double ttlTradeHr, Double extraHrRulerCmdAgent, Double extraHrRtcApproved, Double extraHrAgtAccepted,
			Double extraHrAgtDecliend, Double extraHrAgtNores, Double vtoHourRulerCmdAgent, Double vtoHourRtcApproved,
			Double vtoHourAgtAccepted, Double vtoHourAgtDecliend, Double vtoHourAgtNores) {
		super();
		this.totalAgent = totalAgent;
		this.totalAgentParticipating = totalAgentParticipating;
		this.currentDayActiveAgent = currentDayActiveAgent;
		this.ssActiveAgents = ssActiveAgents;
		this.scheduleHr = scheduleHr;
		this.extraHrReqAutoApproved = extraHrReqAutoApproved;
		this.extraHrHourAutoApproved = extraHrHourAutoApproved;
		this.extraHrReqApproved = extraHrReqApproved;
		this.extraHrHoursApproved = extraHrHoursApproved;
		this.extraHrReqDeclined = extraHrReqDeclined;
		this.extraHrHoursDeclined = extraHrHoursDeclined;
		this.extraHrReqRtcWaiting = extraHrReqRtcWaiting;
		this.extraHrHoursRtcWaiting = extraHrHoursRtcWaiting;
		this.vtoReqAutoApproved = vtoReqAutoApproved;
		this.vtoHourAutoApproved = vtoHourAutoApproved;
		this.vtoReqApproved = vtoReqApproved;
		this.vtoHoursApproved = vtoHoursApproved;
		this.vtoReqDeclined = vtoReqDeclined;
		this.vtoHoursDeclined = vtoHoursDeclined;
		this.vtoReqRtcWaiting = vtoReqRtcWaiting;
		this.vtoHoursRtcWaiting = vtoHoursRtcWaiting;
		this.ttlSwap = ttlSwap;
		this.ttlSwapHr = ttlSwapHr;
		this.tradeReq = tradeReq;
		this.ttlTradeAccepted = ttlTradeAccepted;
		this.ttlTradeHr = ttlTradeHr;
		this.extraHrRulerCmdAgent = extraHrRulerCmdAgent;
		this.extraHrRtcApproved = extraHrRtcApproved;
		this.extraHrAgtAccepted = extraHrAgtAccepted;
		this.extraHrAgtDecliend = extraHrAgtDecliend;
		this.extraHrAgtNores = extraHrAgtNores;
		this.vtoHourRulerCmdAgent = vtoHourRulerCmdAgent;
		this.vtoHourRtcApproved = vtoHourRtcApproved;
		this.vtoHourAgtAccepted = vtoHourAgtAccepted;
		this.vtoHourAgtDecliend = vtoHourAgtDecliend;
		this.vtoHourAgtNores = vtoHourAgtNores;
	}
	
	public SummaryReportDto(Long totalAgent, Long totalAgentParticipating, Long currentDayActiveAgent, Long ssActiveAgents,
			Double scheduleHr, Long extraHrReqAutoApproved, Double extraHrHourAutoApproved, Long extraHrReqApproved,
			Double extraHrHoursApproved, Long extraHrReqDeclined, Double extraHrHoursDeclined, Long extraHrReqRtcWaiting,
			Double extraHrHoursRtcWaiting, Long vtoReqAutoApproved, Double vtoHourAutoApproved, Long vtoReqApproved,
			Double vtoHoursApproved, Long vtoReqDeclined, Double vtoHoursDeclined, Long vtoReqRtcWaiting,
			Double vtoHoursRtcWaiting, Long ttlSwap, Double ttlSwapHr, Long tradeReq, Long ttlTradeAccepted,
			Double ttlTradeHr, Double extraHrRulerCmdAgent, Double extraHrRtcApproved, Double extraHrAgtAccepted,
			Double extraHrAgtDecliend, Double extraHrAgtNores, Double vtoHourRulerCmdAgent, Double vtoHourRtcApproved,
			Double vtoHourAgtAccepted, Double vtoHourAgtDecliend, Double vtoHourAgtNores) {
		super();
		
	}
	

	public BigDecimal getTotalAgent() {
		return totalAgent;
	}
	public void setTotalAgent(BigDecimal totalAgent) {
		this.totalAgent = totalAgent;
	}
	public BigDecimal getTotalAgentParticipating() {
		return totalAgentParticipating;
	}
	public void setTotalAgentParticipating(BigDecimal totalAgentParticipating) {
		this.totalAgentParticipating = totalAgentParticipating;
	}
	public BigDecimal getCurrentDayActiveAgent() {
		return currentDayActiveAgent;
	}
	public void setCurrentDayActiveAgent(BigDecimal currentDayActiveAgent) {
		this.currentDayActiveAgent = currentDayActiveAgent;
	}
	public BigDecimal getSsActiveAgents() {
		return ssActiveAgents;
	}
	public void setSsActiveAgents(BigDecimal ssActiveAgents) {
		this.ssActiveAgents = ssActiveAgents;
	}
	public Double getScheduleChangeToLoggedInAgents() {
		return scheduleChangeToLoggedInAgents;
	}
	public void setScheduleChangeToLoggedInAgents(Double scheduleChangeToLoggedInAgents) {
		this.scheduleChangeToLoggedInAgents = scheduleChangeToLoggedInAgents;
	}
	public Double getScheduleModifyReqPerAgent() {
		return scheduleModifyReqPerAgent;
	}
	public void setScheduleModifyReqPerAgent(Double scheduleModifyReqPerAgent) {
		this.scheduleModifyReqPerAgent = scheduleModifyReqPerAgent;
	}
	public Double getScheduleModifyHoursPerAgents() {
		return scheduleModifyHoursPerAgents;
	}
	public void setScheduleModifyHoursPerAgents(Double scheduleModifyHoursPerAgents) {
		this.scheduleModifyHoursPerAgents = scheduleModifyHoursPerAgents;
	}
	public Double getModHrForTotalAgtsFourWeeks() {
		return modHrForTotalAgtsFourWeeks;
	}
	public void setModHrForTotalAgtsFourWeeks(Double modHrForTotalAgtsFourWeeks) {
		this.modHrForTotalAgtsFourWeeks = modHrForTotalAgtsFourWeeks;
	}
	public Double getTotalModHrFourWeeks() {
		return totalModHrFourWeeks;
	}
	public void setTotalModHrFourWeeks(Double totalModHrFourWeeks) {
		this.totalModHrFourWeeks = totalModHrFourWeeks;
	}
	public Double getScheduleHr() {
		return scheduleHr;
	}
	public void setScheduleHr(Double scheduleHr) {
		this.scheduleHr = scheduleHr;
	}
	public BigDecimal getExtraHrRequest() {
		return extraHrRequest;
	}
	public void setExtraHrRequest(BigDecimal extraHrRequest) {
		this.extraHrRequest = extraHrRequest;
	}
	public Double getExtraHrTotal() {
		return extraHrTotal;
	}
	public void setExtraHrTotal(Double extraHrTotal) {
		this.extraHrTotal = extraHrTotal;
	}
	public BigDecimal getExtraHrReqAutoApproved() {
		return extraHrReqAutoApproved;
	}
	public void setExtraHrReqAutoApproved(BigDecimal extraHrReqAutoApproved) {
		this.extraHrReqAutoApproved = extraHrReqAutoApproved;
	}
	public Double getExtraHrHourAutoApproved() {
		return extraHrHourAutoApproved;
	}
	public void setExtraHrHourAutoApproved(Double extraHrHourAutoApproved) {
		this.extraHrHourAutoApproved = extraHrHourAutoApproved;
	}
	public BigDecimal getExtraHrReqApproved() {
		return extraHrReqApproved;
	}
	public void setExtraHrReqApproved(BigDecimal extraHrReqApproved) {
		this.extraHrReqApproved = extraHrReqApproved;
	}
	public Double getExtraHrHoursApproved() {
		return extraHrHoursApproved;
	}
	public void setExtraHrHoursApproved(Double extraHrHoursApproved) {
		this.extraHrHoursApproved = extraHrHoursApproved;
	}
	public BigDecimal getExtraHrReqDeclined() {
		return extraHrReqDeclined;
	}
	public void setExtraHrReqDeclined(BigDecimal extraHrReqDeclined) {
		this.extraHrReqDeclined = extraHrReqDeclined;
	}
	public Double getExtraHrHoursDeclined() {
		return extraHrHoursDeclined;
	}
	public void setExtraHrHoursDeclined(Double extraHrHoursDeclined) {
		this.extraHrHoursDeclined = extraHrHoursDeclined;
	}
	public BigDecimal getExtraHrReqRtcWaiting() {
		return extraHrReqRtcWaiting;
	}
	public void setExtraHrReqRtcWaiting(BigDecimal extraHrReqRtcWaiting) {
		this.extraHrReqRtcWaiting = extraHrReqRtcWaiting;
	}
	public Double getExtraHrHoursRtcWaiting() {
		return extraHrHoursRtcWaiting;
	}
	public void setExtraHrHoursRtcWaiting(Double extraHrHoursRtcWaiting) {
		this.extraHrHoursRtcWaiting = extraHrHoursRtcWaiting;
	}
	public BigDecimal getVtoHrRequest() {
		return vtoHrRequest;
	}
	public void setVtoHrRequest(BigDecimal vtoHrRequest) {
		this.vtoHrRequest = vtoHrRequest;
	}
	public Double getVtoHrTotal() {
		return vtoHrTotal;
	}
	public void setVtoHrTotal(Double vtoHrTotal) {
		this.vtoHrTotal = vtoHrTotal;
	}
	public BigDecimal getVtoReqAutoApproved() {
		return vtoReqAutoApproved;
	}
	public void setVtoReqAutoApproved(BigDecimal vtoReqAutoApproved) {
		this.vtoReqAutoApproved = vtoReqAutoApproved;
	}
	public Double getVtoHourAutoApproved() {
		return vtoHourAutoApproved;
	}
	public void setVtoHourAutoApproved(Double vtoHourAutoApproved) {
		this.vtoHourAutoApproved = vtoHourAutoApproved;
	}
	public BigDecimal getVtoReqApproved() {
		return vtoReqApproved;
	}
	public void setVtoReqApproved(BigDecimal vtoReqApproved) {
		this.vtoReqApproved = vtoReqApproved;
	}
	public Double getVtoHoursApproved() {
		return vtoHoursApproved;
	}
	public void setVtoHoursApproved(Double vtoHoursApproved) {
		this.vtoHoursApproved = vtoHoursApproved;
	}
	public BigDecimal getVtoReqDeclined() {
		return vtoReqDeclined;
	}
	public void setVtoReqDeclined(BigDecimal vtoReqDeclined) {
		this.vtoReqDeclined = vtoReqDeclined;
	}
	public Double getVtoHoursDeclined() {
		return vtoHoursDeclined;
	}
	public void setVtoHoursDeclined(Double vtoHoursDeclined) {
		this.vtoHoursDeclined = vtoHoursDeclined;
	}
	public BigDecimal getVtoReqRtcWaiting() {
		return vtoReqRtcWaiting;
	}
	public void setVtoReqRtcWaiting(BigDecimal vtoReqRtcWaiting) {
		this.vtoReqRtcWaiting = vtoReqRtcWaiting;
	}
	public Double getVtoHoursRtcWaiting() {
		return vtoHoursRtcWaiting;
	}
	public void setVtoHoursRtcWaiting(Double vtoHoursRtcWaiting) {
		this.vtoHoursRtcWaiting = vtoHoursRtcWaiting;
	}
	public BigDecimal getTtlSwap() {
		return ttlSwap;
	}
	public void setTtlSwap(BigDecimal ttlSwap) {
		this.ttlSwap = ttlSwap;
	}
	public Double getTtlSwapHr() {
		return ttlSwapHr;
	}
	public void setTtlSwapHr(Double ttlSwapHr) {
		this.ttlSwapHr = ttlSwapHr;
	}
	public BigDecimal getTradeReq() {
		return tradeReq;
	}
	public void setTradeReq(BigDecimal tradeReq) {
		this.tradeReq = tradeReq;
	}
	public BigDecimal getTtlTradeAccepted() {
		return ttlTradeAccepted;
	}
	public void setTtlTradeAccepted(BigDecimal ttlTradeAccepted) {
		this.ttlTradeAccepted = ttlTradeAccepted;
	}
	public Double getTtlTradeHr() {
		return ttlTradeHr;
	}
	public void setTtlTradeHr(Double ttlTradeHr) {
		this.ttlTradeHr = ttlTradeHr;
	}
	public Double getExtraHrRulerCmdAgent() {
		return extraHrRulerCmdAgent;
	}
	public void setExtraHrRulerCmdAgent(Double extraHrRulerCmdAgent) {
		this.extraHrRulerCmdAgent = extraHrRulerCmdAgent;
	}
	public Double getExtraHrRtcApproved() {
		return extraHrRtcApproved;
	}
	public void setExtraHrRtcApproved(Double extraHrRtcApproved) {
		this.extraHrRtcApproved = extraHrRtcApproved;
	}
	public Double getExtraHrAgtAccepted() {
		return extraHrAgtAccepted;
	}
	public void setExtraHrAgtAccepted(Double extraHrAgtAccepted) {
		this.extraHrAgtAccepted = extraHrAgtAccepted;
	}
	public Double getExtraHrAgtDecliend() {
		return extraHrAgtDecliend;
	}
	public void setExtraHrAgtDecliend(Double extraHrAgtDecliend) {
		this.extraHrAgtDecliend = extraHrAgtDecliend;
	}
	public Double getExtraHrAgtNores() {
		return extraHrAgtNores;
	}
	public void setExtraHrAgtNores(Double extraHrAgtNores) {
		this.extraHrAgtNores = extraHrAgtNores;
	}
	public Double getVtoHourRulerCmdAgent() {
		return vtoHourRulerCmdAgent;
	}
	public void setVtoHourRulerCmdAgent(Double vtoHourRulerCmdAgent) {
		this.vtoHourRulerCmdAgent = vtoHourRulerCmdAgent;
	}
	public Double getVtoHourRtcApproved() {
		return vtoHourRtcApproved;
	}
	public void setVtoHourRtcApproved(Double vtoHourRtcApproved) {
		this.vtoHourRtcApproved = vtoHourRtcApproved;
	}
	public Double getVtoHourAgtAccepted() {
		return vtoHourAgtAccepted;
	}
	public void setVtoHourAgtAccepted(Double vtoHourAgtAccepted) {
		this.vtoHourAgtAccepted = vtoHourAgtAccepted;
	}
	public Double getVtoHourAgtDecliend() {
		return vtoHourAgtDecliend;
	}
	public void setVtoHourAgtDecliend(Double vtoHourAgtDecliend) {
		this.vtoHourAgtDecliend = vtoHourAgtDecliend;
	}
	public Double getVtoHourAgtNores() {
		return vtoHourAgtNores;
	}
	public void setVtoHourAgtNores(Double vtoHourAgtNores) {
		this.vtoHourAgtNores = vtoHourAgtNores;
	}
	public static Long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
