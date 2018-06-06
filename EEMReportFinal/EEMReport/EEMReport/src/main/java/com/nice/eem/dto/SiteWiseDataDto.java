package com.nice.eem.dto;

import java.util.Date;
/**
 * 
 * @author ajit.p
 *
 */

public class SiteWiseDataDto {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private long ssActiveAgents;
	private long totalAgent;
	private long totalAgentParticipating;
	private long currentDayActiveAgent;
	private long extraHrReqApproved;
	private long extraHrReqDeclined;
	private long extraHrReqRtcWaiting;
	private long extraHrReqAutoApproved;
	private double extraHrHoursApproved;
	private double extraHrHoursDeclined;
	private double extraHrHoursRtcWaiting;
	private double extraHrHourAutoApproved;
	private double extraHrRulerCmdAgent;
	private double extraHrRtcApproved;
	private double extraHrAgtAccepted;
	private double extraHrAgtDecliend;
	private double extraHrAgtNores;
	private long vtoReqApproved;
	private long vtoReqDeclined;
	private long vtoReqRtcWaiting;
	private long vtoReqAutoApproved;
	private double vtoHoursApproved;
	private double vtoHoursDeclined;
	private double vtoHoursRtcWaiting;
	private double vtoHourAutoApproved;
	private double vtoHourRulerCmdAgent;
	private double vtoHourRtcApproved;
	private double vtoHourAgtAccepted;
	private double vtoHourAgtDecliend;
	private double vtoHourAgtNores;
	private long ttlSwap;
	private double ttlSwapHr;
	private long tradeReq;
	private long ttlTradeAccepted;
	private double ttlTradeHr;
	private double scheduleHr;
	private String programName;
	private Date ctzDateTime;
	private long siteId;
	private String siteName;
	
	
	public SiteWiseDataDto() {
		super();
	}
	
	public SiteWiseDataDto(long id,String programName, Date ctzDateTime,
			long ssActiveAgents, long totalAgent, long totalAgentParticipating,
			long extraHrReqApproved, long extraHrReqDeclined,
			long extraHrReqAutoApproved, double extraHrHoursApproved,
			double extraHrHoursDeclined, double extraHrHourAutoApproved,
			double extraHrRulerCmdAgent, double extraHrRtcApproved,
			double extraHrAgtAccepted, double extraHrAgtDecliend,
			double extraHrAgtNores, long vtoReqApproved, long vtoReqDeclined,
			long vtoReqAutoApproved, double vtoHoursApproved,
			double vtoHoursDeclined, double vtoHourAutoApproved,
			double vtoHourRulerCmdAgent, double vtoHourRtcApproved,
			double vtoHourAgtAccepted, double vtoHourAgtDecliend,
			double vtoHourAgtNores, long ttlSwap, double ttlSwapHr,
			long tradeReq, long ttlTradeAccepted, double ttlTradeHr,
			double scheduleHr, long currentDayActiveAgent,
			long extraHrReqRtcWaiting, double extraHrHoursRtcWaiting,
			long vtoReqRtcWaiting, double vtoHoursRtcWaiting, long siteId,String siteName ){
		
		this.id=id;
		this.programName = programName;
		this.ctzDateTime = ctzDateTime;
		this.ssActiveAgents = ssActiveAgents;
		this.totalAgent = totalAgent;
		this.totalAgentParticipating = totalAgentParticipating;
		this.extraHrReqApproved = extraHrReqApproved;
		this.extraHrReqDeclined=extraHrReqDeclined;
		this.extraHrReqAutoApproved = extraHrReqAutoApproved;
		this.extraHrHoursApproved = extraHrHoursApproved;
		this.extraHrHoursDeclined = extraHrHoursDeclined;
		this.extraHrHourAutoApproved = extraHrHourAutoApproved;
		this.extraHrRulerCmdAgent = extraHrRulerCmdAgent;
		this.extraHrRtcApproved = extraHrRtcApproved;
		this.extraHrAgtAccepted = extraHrAgtAccepted;
		this.extraHrAgtDecliend = extraHrAgtDecliend;
		this.extraHrAgtNores = extraHrAgtNores;
		this.vtoReqApproved = vtoReqApproved;
		this.vtoReqDeclined = vtoReqDeclined;
		this.vtoReqAutoApproved = vtoReqAutoApproved;
		this.vtoHoursApproved = vtoHoursApproved;
		this.vtoHoursDeclined = vtoHoursDeclined;
		this.vtoHourAutoApproved = vtoHourAutoApproved;
		this.vtoHourRulerCmdAgent = vtoHourRulerCmdAgent;
		this.vtoHourRtcApproved = vtoHourRtcApproved;
		this.vtoHourAgtAccepted = vtoHourAgtAccepted;
		this.vtoHourAgtDecliend = vtoHourAgtDecliend;
		this.vtoHourAgtNores = vtoHourAgtNores;
		this.ttlSwap = ttlSwap;
		this.ttlSwapHr = ttlSwapHr;
		this.tradeReq = tradeReq;
		this.ttlTradeAccepted = ttlTradeAccepted;
		this.ttlTradeHr = ttlTradeHr;
		this.scheduleHr = scheduleHr;
		this.currentDayActiveAgent = currentDayActiveAgent;
		this.extraHrReqRtcWaiting = extraHrReqRtcWaiting;
		this.extraHrHoursRtcWaiting = extraHrHoursRtcWaiting;
		this.vtoReqRtcWaiting = vtoReqRtcWaiting;
		this.vtoHoursRtcWaiting = vtoHoursRtcWaiting;
		this.siteId = siteId;
		this.siteName = siteName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSsActiveAgents() {
		return ssActiveAgents;
	}
	public void setSsActiveAgents(long ssActiveAgents) {
		this.ssActiveAgents = ssActiveAgents;
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
	public long getExtraHrReqApproved() {
		return extraHrReqApproved;
	}
	public void setExtraHrReqApproved(long extraHrReqApproved) {
		this.extraHrReqApproved = extraHrReqApproved;
	}
	public long getExtraHrReqDeclined() {
		return extraHrReqDeclined;
	}
	public void setExtraHrReqDeclined(long extraHrReqDeclined) {
		this.extraHrReqDeclined = extraHrReqDeclined;
	}
	public long getExtraHrReqRtcWaiting() {
		return extraHrReqRtcWaiting;
	}
	public void setExtraHrReqRtcWaiting(long extraHrReqRtcWaiting) {
		this.extraHrReqRtcWaiting = extraHrReqRtcWaiting;
	}
	public long getExtraHrReqAutoApproved() {
		return extraHrReqAutoApproved;
	}
	public void setExtraHrReqAutoApproved(long extraHrReqAutoApproved) {
		this.extraHrReqAutoApproved = extraHrReqAutoApproved;
	}
	public double getExtraHrHoursApproved() {
		return extraHrHoursApproved;
	}
	public void setExtraHrHoursApproved(double extraHrHoursApproved) {
		this.extraHrHoursApproved = extraHrHoursApproved;
	}
	public double getExtraHrHoursDeclined() {
		return extraHrHoursDeclined;
	}
	public void setExtraHrHoursDeclined(double extraHrHoursDeclined) {
		this.extraHrHoursDeclined = extraHrHoursDeclined;
	}
	public double getExtraHrHoursRtcWaiting() {
		return extraHrHoursRtcWaiting;
	}
	public void setExtraHrHoursRtcWaiting(double extraHrHoursRtcWaiting) {
		this.extraHrHoursRtcWaiting = extraHrHoursRtcWaiting;
	}
	public double getExtraHrHourAutoApproved() {
		return extraHrHourAutoApproved;
	}
	public void setExtraHrHourAutoApproved(double extraHrHourAutoApproved) {
		this.extraHrHourAutoApproved = extraHrHourAutoApproved;
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
	public long getVtoReqApproved() {
		return vtoReqApproved;
	}
	public void setVtoReqApproved(long vtoReqApproved) {
		this.vtoReqApproved = vtoReqApproved;
	}
	public long getVtoReqDeclined() {
		return vtoReqDeclined;
	}
	public void setVtoReqDeclined(long vtoReqDeclined) {
		this.vtoReqDeclined = vtoReqDeclined;
	}
	public long getVtoReqRtcWaiting() {
		return vtoReqRtcWaiting;
	}
	public void setVtoReqRtcWaiting(long vtoReqRtcWaiting) {
		this.vtoReqRtcWaiting = vtoReqRtcWaiting;
	}
	public long getVtoReqAutoApproved() {
		return vtoReqAutoApproved;
	}
	public void setVtoReqAutoApproved(long vtoReqAutoApproved) {
		this.vtoReqAutoApproved = vtoReqAutoApproved;
	}
	public double getVtoHoursApproved() {
		return vtoHoursApproved;
	}
	public void setVtoHoursApproved(double vtoHoursApproved) {
		this.vtoHoursApproved = vtoHoursApproved;
	}
	public double getVtoHoursDeclined() {
		return vtoHoursDeclined;
	}
	public void setVtoHoursDeclined(double vtoHoursDeclined) {
		this.vtoHoursDeclined = vtoHoursDeclined;
	}
	public double getVtoHoursRtcWaiting() {
		return vtoHoursRtcWaiting;
	}
	public void setVtoHoursRtcWaiting(double vtoHoursRtcWaiting) {
		this.vtoHoursRtcWaiting = vtoHoursRtcWaiting;
	}
	public double getVtoHourAutoApproved() {
		return vtoHourAutoApproved;
	}
	public void setVtoHourAutoApproved(double vtoHourAutoApproved) {
		this.vtoHourAutoApproved = vtoHourAutoApproved;
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
	public double getScheduleHr() {
		return scheduleHr;
	}
	public void setScheduleHr(double scheduleHr) {
		this.scheduleHr = scheduleHr;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public Date getCtzDateTime() {
		return ctzDateTime;
	}
	public void setCtzDateTime(Date ctzDateTime) {
		this.ctzDateTime = ctzDateTime;
	}
	public long getSiteId() {
		return siteId;
	}
	public void setSiteId(long siteId) {
		this.siteId = siteId;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
