/**
 * 
 */
package com.nice.eem.dto;


/**
 * @author ajit.p
 *
 */
public class SummaryReportDto{

	private static final Long serialVersionUID = 1L;
	/* Summary */
	private Long totalAgent;
	private Long totalAgentParticipating;
	private Long currentDayActiveAgent;
	private Long ssActiveAgents;
	private Double scheduleChangeToLoggedInAgents;
	private Double scheduleModifyReqPerAgent;
	private Double scheduleModifyHoursPerAgents;
	private Double modHrForTotalAgtsFourWeeks;
	private Double totalModHrFourWeeks;
	private Double scheduleHr;
	/*Self Service*/
	// Extra Hours
	private Long extraHrRequest;
	private Double extraHrTotal;
	private Long extraHrReqAutoApproved;
	private Double extraHrHourAutoApproved;
	private Long extraHrReqApproved;
	private Double extraHrHoursApproved;
	private Long extraHrReqDeclined;
	private Double extraHrHoursDeclined;
	private Long extraHrReqRtcWaiting;
	private Double extraHrHoursRtcWaiting;
	// Time Off	
	private Long vtoHrRequest;
	private Double vtoHrTotal;
	private Long vtoReqAutoApproved;
	private Double vtoHourAutoApproved;
	private Long vtoReqApproved;
	private Double vtoHoursApproved;
	private Long vtoReqDeclined;
	private Double vtoHoursDeclined;
	private Long vtoReqRtcWaiting;
	private Double vtoHoursRtcWaiting;
	//Swap and Trade
	private Long ttlSwap;
	private Double ttlSwapHr;
	private Long tradeReq;
	private Long ttlTradeAccepted;
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
	
	

	public Long getTotalAgent() {
		return totalAgent;
	}
	public void setTotalAgent(Long totalAgent) {
		this.totalAgent = totalAgent;
	}
	public Long getTotalAgentParticipating() {
		return totalAgentParticipating;
	}
	public void setTotalAgentParticipating(Long totalAgentParticipating) {
		this.totalAgentParticipating = totalAgentParticipating;
	}
	public Long getCurrentDayActiveAgent() {
		return currentDayActiveAgent;
	}
	public void setCurrentDayActiveAgent(Long currentDayActiveAgent) {
		this.currentDayActiveAgent = currentDayActiveAgent;
	}
	public Long getSsActiveAgents() {
		return ssActiveAgents;
	}
	public void setSsActiveAgents(Long ssActiveAgents) {
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
	public Long getExtraHrRequest() {
		return extraHrRequest;
	}
	public void setExtraHrRequest(Long extraHrRequest) {
		this.extraHrRequest = extraHrRequest;
	}
	public Double getExtraHrTotal() {
		return extraHrTotal;
	}
	public void setExtraHrTotal(Double extraHrTotal) {
		this.extraHrTotal = extraHrTotal;
	}
	public Long getExtraHrReqAutoApproved() {
		return extraHrReqAutoApproved;
	}
	public void setExtraHrReqAutoApproved(Long extraHrReqAutoApproved) {
		this.extraHrReqAutoApproved = extraHrReqAutoApproved;
	}
	public Double getExtraHrHourAutoApproved() {
		return extraHrHourAutoApproved;
	}
	public void setExtraHrHourAutoApproved(Double extraHrHourAutoApproved) {
		this.extraHrHourAutoApproved = extraHrHourAutoApproved;
	}
	public Long getExtraHrReqApproved() {
		return extraHrReqApproved;
	}
	public void setExtraHrReqApproved(Long extraHrReqApproved) {
		this.extraHrReqApproved = extraHrReqApproved;
	}
	public Double getExtraHrHoursApproved() {
		return extraHrHoursApproved;
	}
	public void setExtraHrHoursApproved(Double extraHrHoursApproved) {
		this.extraHrHoursApproved = extraHrHoursApproved;
	}
	public Long getExtraHrReqDeclined() {
		return extraHrReqDeclined;
	}
	public void setExtraHrReqDeclined(Long extraHrReqDeclined) {
		this.extraHrReqDeclined = extraHrReqDeclined;
	}
	public Double getExtraHrHoursDeclined() {
		return extraHrHoursDeclined;
	}
	public void setExtraHrHoursDeclined(Double extraHrHoursDeclined) {
		this.extraHrHoursDeclined = extraHrHoursDeclined;
	}
	public Long getExtraHrReqRtcWaiting() {
		return extraHrReqRtcWaiting;
	}
	public void setExtraHrReqRtcWaiting(Long extraHrReqRtcWaiting) {
		this.extraHrReqRtcWaiting = extraHrReqRtcWaiting;
	}
	public Double getExtraHrHoursRtcWaiting() {
		return extraHrHoursRtcWaiting;
	}
	public void setExtraHrHoursRtcWaiting(Double extraHrHoursRtcWaiting) {
		this.extraHrHoursRtcWaiting = extraHrHoursRtcWaiting;
	}
	public Long getVtoHrRequest() {
		return vtoHrRequest;
	}
	public void setVtoHrRequest(Long vtoHrRequest) {
		this.vtoHrRequest = vtoHrRequest;
	}
	public Double getVtoHrTotal() {
		return vtoHrTotal;
	}
	public void setVtoHrTotal(Double vtoHrTotal) {
		this.vtoHrTotal = vtoHrTotal;
	}
	public Long getVtoReqAutoApproved() {
		return vtoReqAutoApproved;
	}
	public void setVtoReqAutoApproved(Long vtoReqAutoApproved) {
		this.vtoReqAutoApproved = vtoReqAutoApproved;
	}
	public Double getVtoHourAutoApproved() {
		return vtoHourAutoApproved;
	}
	public void setVtoHourAutoApproved(Double vtoHourAutoApproved) {
		this.vtoHourAutoApproved = vtoHourAutoApproved;
	}
	public Long getVtoReqApproved() {
		return vtoReqApproved;
	}
	public void setVtoReqApproved(Long vtoReqApproved) {
		this.vtoReqApproved = vtoReqApproved;
	}
	public Double getVtoHoursApproved() {
		return vtoHoursApproved;
	}
	public void setVtoHoursApproved(Double vtoHoursApproved) {
		this.vtoHoursApproved = vtoHoursApproved;
	}
	public Long getVtoReqDeclined() {
		return vtoReqDeclined;
	}
	public void setVtoReqDeclined(Long vtoReqDeclined) {
		this.vtoReqDeclined = vtoReqDeclined;
	}
	public Double getVtoHoursDeclined() {
		return vtoHoursDeclined;
	}
	public void setVtoHoursDeclined(Double vtoHoursDeclined) {
		this.vtoHoursDeclined = vtoHoursDeclined;
	}
	public Long getVtoReqRtcWaiting() {
		return vtoReqRtcWaiting;
	}
	public void setVtoReqRtcWaiting(Long vtoReqRtcWaiting) {
		this.vtoReqRtcWaiting = vtoReqRtcWaiting;
	}
	public Double getVtoHoursRtcWaiting() {
		return vtoHoursRtcWaiting;
	}
	public void setVtoHoursRtcWaiting(Double vtoHoursRtcWaiting) {
		this.vtoHoursRtcWaiting = vtoHoursRtcWaiting;
	}
	public Long getTtlSwap() {
		return ttlSwap;
	}
	public void setTtlSwap(Long ttlSwap) {
		this.ttlSwap = ttlSwap;
	}
	public Double getTtlSwapHr() {
		return ttlSwapHr;
	}
	public void setTtlSwapHr(Double ttlSwapHr) {
		this.ttlSwapHr = ttlSwapHr;
	}
	public Long getTradeReq() {
		return tradeReq;
	}
	public void setTradeReq(Long tradeReq) {
		this.tradeReq = tradeReq;
	}
	public Long getTtlTradeAccepted() {
		return ttlTradeAccepted;
	}
	public void setTtlTradeAccepted(Long ttlTradeAccepted) {
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
