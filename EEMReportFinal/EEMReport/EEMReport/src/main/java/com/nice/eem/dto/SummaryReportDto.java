/**
 * 
 */
package com.nice.eem.dto;

/**
 * @author ajit.p
 *
 */
public class SummaryReportDto{

	private static final long serialVersionUID = 1L;
	/* Summary */
	private long totalAgent;
	private long totalAgentParticipating;
	private long currentDayActiveAgent;
	private long ssActiveAgents;
	private double scheduleChangeToLoggedInAgents;
	private double scheduleModifyReqPerAgent;
	private double scheduleModifyHoursPerAgents;
	private double modHrForTotalAgtsFourWeeks;
	private double totalModHrFourWeeks;
	private double scheduleHr;
	/*Self Service*/
	// Extra Hours
	private long extraHrRequest;
	private double extraHrTotal;
	private long extraHrReqAutoApproved;
	private double extraHrHourAutoApproved;
	private long extraHrReqApproved;
	private double extraHrHoursApproved;
	private long extraHrReqDeclined;
	private double extraHrHoursDeclined;
	private long extraHrReqRtcWaiting;
	private double extraHrHoursRtcWaiting;
	// Time Off	
	private long vtoHrRequest;
	private double vtoHrTotal;
	private long vtoReqAutoApproved;
	private double vtoHourAutoApproved;
	private long vtoReqApproved;
	private double vtoHoursApproved;
	private long vtoReqDeclined;
	private double vtoHoursDeclined;
	private long vtoReqRtcWaiting;
	private double vtoHoursRtcWaiting;
	//Swap and Trade
	private long ttlSwap;
	private double ttlSwapHr;
	private long tradeReq;
	private long ttlTradeAccepted;
	private double ttlTradeHr;
	
	/*Rule Recommendation*/
	//Extra Hours
	private double extraHrRulerCmdAgent;
	private double extraHrRtcApproved;
	private double extraHrAgtAccepted;
	private double extraHrAgtDecliend;
	private double extraHrAgtNores;
	// Time Off
	private double vtoHourRulerCmdAgent;
	private double vtoHourRtcApproved;
	private double vtoHourAgtAccepted;
	private double vtoHourAgtDecliend;
	private double vtoHourAgtNores;
	public SummaryReportDto() {
		super();
	}
	public SummaryReportDto(long totalAgent, long totalAgentParticipating, long currentDayActiveAgent, long ssActiveAgents,
			double scheduleHr, long extraHrReqAutoApproved, double extraHrHourAutoApproved, long extraHrReqApproved,
			double extraHrHoursApproved, long extraHrReqDeclined, double extraHrHoursDeclined, long extraHrReqRtcWaiting,
			double extraHrHoursRtcWaiting, long vtoReqAutoApproved, double vtoHourAutoApproved, long vtoReqApproved,
			double vtoHoursApproved, long vtoReqDeclined, double vtoHoursDeclined, long vtoReqRtcWaiting,
			double vtoHoursRtcWaiting, long ttlSwap, double ttlSwapHr, long tradeReq, long ttlTradeAccepted,
			double ttlTradeHr, double extraHrRulerCmdAgent, double extraHrRtcApproved, double extraHrAgtAccepted,
			double extraHrAgtDecliend, double extraHrAgtNores, double vtoHourRulerCmdAgent, double vtoHourRtcApproved,
			double vtoHourAgtAccepted, double vtoHourAgtDecliend, double vtoHourAgtNores) {
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
	public long getTotalAgent() {
		return totalAgent;
	}
	public void setTotalAgent(long totalAgent) {
		this.totalAgent = totalAgent;
	}
	public long getTotalAgentParticipating() {
		return totalAgentParticipating;
	}
	public void setTotalAgentParticipating(long totalAgentParticipating) {
		this.totalAgentParticipating = totalAgentParticipating;
	}
	public long getCurrentDayActiveAgent() {
		return currentDayActiveAgent;
	}
	public void setCurrentDayActiveAgent(long currentDayActiveAgent) {
		this.currentDayActiveAgent = currentDayActiveAgent;
	}
	public long getSsActiveAgents() {
		return ssActiveAgents;
	}
	public void setSsActiveAgents(long ssActiveAgents) {
		this.ssActiveAgents = ssActiveAgents;
	}
	public double getScheduleChangeToLoggedInAgents() {
		return scheduleChangeToLoggedInAgents;
	}
	public void setScheduleChangeToLoggedInAgents(double scheduleChangeToLoggedInAgents) {
		this.scheduleChangeToLoggedInAgents = scheduleChangeToLoggedInAgents;
	}
	public double getScheduleModifyReqPerAgent() {
		return scheduleModifyReqPerAgent;
	}
	public void setScheduleModifyReqPerAgent(double scheduleModifyReqPerAgent) {
		this.scheduleModifyReqPerAgent = scheduleModifyReqPerAgent;
	}
	public double getScheduleModifyHoursPerAgents() {
		return scheduleModifyHoursPerAgents;
	}
	public void setScheduleModifyHoursPerAgents(double scheduleModifyHoursPerAgents) {
		this.scheduleModifyHoursPerAgents = scheduleModifyHoursPerAgents;
	}
	public double getModHrForTotalAgtsFourWeeks() {
		return modHrForTotalAgtsFourWeeks;
	}
	public void setModHrForTotalAgtsFourWeeks(double modHrForTotalAgtsFourWeeks) {
		this.modHrForTotalAgtsFourWeeks = modHrForTotalAgtsFourWeeks;
	}
	public double getTotalModHrFourWeeks() {
		return totalModHrFourWeeks;
	}
	public void setTotalModHrFourWeeks(double totalModHrFourWeeks) {
		this.totalModHrFourWeeks = totalModHrFourWeeks;
	}
	public double getScheduleHr() {
		return scheduleHr;
	}
	public void setScheduleHr(double scheduleHr) {
		this.scheduleHr = scheduleHr;
	}
	public long getExtraHrRequest() {
		return extraHrRequest;
	}
	public void setExtraHrRequest(long extraHrRequest) {
		this.extraHrRequest = extraHrRequest;
	}
	public double getExtraHrTotal() {
		return extraHrTotal;
	}
	public void setExtraHrTotal(double extraHrTotal) {
		this.extraHrTotal = extraHrTotal;
	}
	public long getExtraHrReqAutoApproved() {
		return extraHrReqAutoApproved;
	}
	public void setExtraHrReqAutoApproved(long extraHrReqAutoApproved) {
		this.extraHrReqAutoApproved = extraHrReqAutoApproved;
	}
	public double getExtraHrHourAutoApproved() {
		return extraHrHourAutoApproved;
	}
	public void setExtraHrHourAutoApproved(double extraHrHourAutoApproved) {
		this.extraHrHourAutoApproved = extraHrHourAutoApproved;
	}
	public long getExtraHrReqApproved() {
		return extraHrReqApproved;
	}
	public void setExtraHrReqApproved(long extraHrReqApproved) {
		this.extraHrReqApproved = extraHrReqApproved;
	}
	public double getExtraHrHoursApproved() {
		return extraHrHoursApproved;
	}
	public void setExtraHrHoursApproved(double extraHrHoursApproved) {
		this.extraHrHoursApproved = extraHrHoursApproved;
	}
	public long getExtraHrReqDeclined() {
		return extraHrReqDeclined;
	}
	public void setExtraHrReqDeclined(long extraHrReqDeclined) {
		this.extraHrReqDeclined = extraHrReqDeclined;
	}
	public double getExtraHrHoursDeclined() {
		return extraHrHoursDeclined;
	}
	public void setExtraHrHoursDeclined(double extraHrHoursDeclined) {
		this.extraHrHoursDeclined = extraHrHoursDeclined;
	}
	public long getExtraHrReqRtcWaiting() {
		return extraHrReqRtcWaiting;
	}
	public void setExtraHrReqRtcWaiting(long extraHrReqRtcWaiting) {
		this.extraHrReqRtcWaiting = extraHrReqRtcWaiting;
	}
	public double getExtraHrHoursRtcWaiting() {
		return extraHrHoursRtcWaiting;
	}
	public void setExtraHrHoursRtcWaiting(double extraHrHoursRtcWaiting) {
		this.extraHrHoursRtcWaiting = extraHrHoursRtcWaiting;
	}
	public long getVtoHrRequest() {
		return vtoHrRequest;
	}
	public void setVtoHrRequest(long vtoHrRequest) {
		this.vtoHrRequest = vtoHrRequest;
	}
	public double getVtoHrTotal() {
		return vtoHrTotal;
	}
	public void setVtoHrTotal(double vtoHrTotal) {
		this.vtoHrTotal = vtoHrTotal;
	}
	public long getVtoReqAutoApproved() {
		return vtoReqAutoApproved;
	}
	public void setVtoReqAutoApproved(long vtoReqAutoApproved) {
		this.vtoReqAutoApproved = vtoReqAutoApproved;
	}
	public double getVtoHourAutoApproved() {
		return vtoHourAutoApproved;
	}
	public void setVtoHourAutoApproved(double vtoHourAutoApproved) {
		this.vtoHourAutoApproved = vtoHourAutoApproved;
	}
	public long getVtoReqApproved() {
		return vtoReqApproved;
	}
	public void setVtoReqApproved(long vtoReqApproved) {
		this.vtoReqApproved = vtoReqApproved;
	}
	public double getVtoHoursApproved() {
		return vtoHoursApproved;
	}
	public void setVtoHoursApproved(double vtoHoursApproved) {
		this.vtoHoursApproved = vtoHoursApproved;
	}
	public long getVtoReqDeclined() {
		return vtoReqDeclined;
	}
	public void setVtoReqDeclined(long vtoReqDeclined) {
		this.vtoReqDeclined = vtoReqDeclined;
	}
	public double getVtoHoursDeclined() {
		return vtoHoursDeclined;
	}
	public void setVtoHoursDeclined(double vtoHoursDeclined) {
		this.vtoHoursDeclined = vtoHoursDeclined;
	}
	public long getVtoReqRtcWaiting() {
		return vtoReqRtcWaiting;
	}
	public void setVtoReqRtcWaiting(long vtoReqRtcWaiting) {
		this.vtoReqRtcWaiting = vtoReqRtcWaiting;
	}
	public double getVtoHoursRtcWaiting() {
		return vtoHoursRtcWaiting;
	}
	public void setVtoHoursRtcWaiting(double vtoHoursRtcWaiting) {
		this.vtoHoursRtcWaiting = vtoHoursRtcWaiting;
	}
	public long getTtlSwap() {
		return ttlSwap;
	}
	public void setTtlSwap(long ttlSwap) {
		this.ttlSwap = ttlSwap;
	}
	public double getTtlSwapHr() {
		return ttlSwapHr;
	}
	public void setTtlSwapHr(double ttlSwapHr) {
		this.ttlSwapHr = ttlSwapHr;
	}
	public long getTradeReq() {
		return tradeReq;
	}
	public void setTradeReq(long tradeReq) {
		this.tradeReq = tradeReq;
	}
	public long getTtlTradeAccepted() {
		return ttlTradeAccepted;
	}
	public void setTtlTradeAccepted(long ttlTradeAccepted) {
		this.ttlTradeAccepted = ttlTradeAccepted;
	}
	public double getTtlTradeHr() {
		return ttlTradeHr;
	}
	public void setTtlTradeHr(double ttlTradeHr) {
		this.ttlTradeHr = ttlTradeHr;
	}
	public double getExtraHrRulerCmdAgent() {
		return extraHrRulerCmdAgent;
	}
	public void setExtraHrRulerCmdAgent(double extraHrRulerCmdAgent) {
		this.extraHrRulerCmdAgent = extraHrRulerCmdAgent;
	}
	public double getExtraHrRtcApproved() {
		return extraHrRtcApproved;
	}
	public void setExtraHrRtcApproved(double extraHrRtcApproved) {
		this.extraHrRtcApproved = extraHrRtcApproved;
	}
	public double getExtraHrAgtAccepted() {
		return extraHrAgtAccepted;
	}
	public void setExtraHrAgtAccepted(double extraHrAgtAccepted) {
		this.extraHrAgtAccepted = extraHrAgtAccepted;
	}
	public double getExtraHrAgtDecliend() {
		return extraHrAgtDecliend;
	}
	public void setExtraHrAgtDecliend(double extraHrAgtDecliend) {
		this.extraHrAgtDecliend = extraHrAgtDecliend;
	}
	public double getExtraHrAgtNores() {
		return extraHrAgtNores;
	}
	public void setExtraHrAgtNores(double extraHrAgtNores) {
		this.extraHrAgtNores = extraHrAgtNores;
	}
	public double getVtoHourRulerCmdAgent() {
		return vtoHourRulerCmdAgent;
	}
	public void setVtoHourRulerCmdAgent(double vtoHourRulerCmdAgent) {
		this.vtoHourRulerCmdAgent = vtoHourRulerCmdAgent;
	}
	public double getVtoHourRtcApproved() {
		return vtoHourRtcApproved;
	}
	public void setVtoHourRtcApproved(double vtoHourRtcApproved) {
		this.vtoHourRtcApproved = vtoHourRtcApproved;
	}
	public double getVtoHourAgtAccepted() {
		return vtoHourAgtAccepted;
	}
	public void setVtoHourAgtAccepted(double vtoHourAgtAccepted) {
		this.vtoHourAgtAccepted = vtoHourAgtAccepted;
	}
	public double getVtoHourAgtDecliend() {
		return vtoHourAgtDecliend;
	}
	public void setVtoHourAgtDecliend(double vtoHourAgtDecliend) {
		this.vtoHourAgtDecliend = vtoHourAgtDecliend;
	}
	public double getVtoHourAgtNores() {
		return vtoHourAgtNores;
	}
	public void setVtoHourAgtNores(double vtoHourAgtNores) {
		this.vtoHourAgtNores = vtoHourAgtNores;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
