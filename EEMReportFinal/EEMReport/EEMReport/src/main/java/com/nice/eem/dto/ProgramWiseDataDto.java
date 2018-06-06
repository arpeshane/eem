/**
 * 
 */
package com.nice.eem.dto;

import java.util.Date;

/**
 * 
 * @author ajit.p
 *
 */
public class ProgramWiseDataDto{
	
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
	
	
	public ProgramWiseDataDto() {
		super();
	}


	public ProgramWiseDataDto(long id,String programName, Date ctzDateTime,
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
			long vtoReqRtcWaiting, double vtoHoursRtcWaiting){
		
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
	}
	

	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public long getSsactiveagents() {
		return ssActiveAgents;
	}

	public void setSsactiveagents(long ssactiveagents) {
		this.ssActiveAgents = ssactiveagents;
	}

	public long getTotalagent() {
		return totalAgent;
	}

	public void setTotalagent(long totalagent) {
		this.totalAgent = totalagent;
	}

	public long getTotalagentparticipating() {
		return totalAgentParticipating;
	}

	public void setTotalagentparticipating(long totalagentparticipating) {
		this.totalAgentParticipating = totalagentparticipating;
	}

	public long getCurrentdayactivegent() {
		return currentDayActiveAgent;
	}

	public void setCurrentdayactivegent(long currentdayactivegent) {
		this.currentDayActiveAgent = currentdayactivegent;
	}

	public long getExtrahrreqdeclined() {
		return extraHrReqDeclined;
	}

	public void setExtrahrreqdeclined(long extrahrreqdeclined) {
		this.extraHrReqDeclined = extrahrreqdeclined;
	}

	public long getExtrahrreqapproved() {
		return extraHrReqApproved;
	}

	public void setExtrahrreqapproved(long extrahrreqapproved) {
		this.extraHrReqApproved = extrahrreqapproved;
	}

	public long getExtrahrreqrtcwaiting() {
		return extraHrReqRtcWaiting;
	}

	public void setExtrahrreqrtcwaiting(long extrahrreqrtcwaiting) {
		this.extraHrReqRtcWaiting = extrahrreqrtcwaiting;
	}

	public long getExtrahrreqautoapproved() {
		return extraHrReqAutoApproved;
	}

	public void setExtrahrreqautoapproved(long extrahrreqautoapproved) {
		this.extraHrReqAutoApproved = extrahrreqautoapproved;
	}

	public double getExtrahrhoursapproved() {
		return extraHrHoursApproved;
	}

	public void setExtrahrhoursapproved(double extrahrhoursapproved) {
		this.extraHrHoursApproved = extrahrhoursapproved;
	}

	public double getExtrahrhoursdeclined() {
		return extraHrHoursDeclined;
	}

	public void setExtrahrhoursdeclined(double extrahrhoursdeclined) {
		this.extraHrHoursDeclined = extrahrhoursdeclined;
	}

	public double getExtrahrhoursrtcwaiting() {
		return extraHrHoursRtcWaiting;
	}

	public void setExtrahrhoursrtcwaiting(double extrahrhoursrtcwaiting) {
		this.extraHrHoursRtcWaiting = extrahrhoursrtcwaiting;
	}

	public double getExtrahrhourautoapproved() {
		return extraHrHourAutoApproved;
	}

	public void setExtrahrhourautoapproved(double extrahrhourautoapproved) {
		this.extraHrHourAutoApproved = extrahrhourautoapproved;
	}

	public double getExtrahrrulercmdagent() {
		return extraHrRulerCmdAgent;
	}

	public void setExtrahrrulercmdagent(double extrahrrulercmdagent) {
		this.extraHrRulerCmdAgent = extrahrrulercmdagent;
	}

	public double getExtrahrrtcapproved() {
		return extraHrRtcApproved;
	}

	public void setExtrahrrtcapproved(double extrahrrtcapproved) {
		this.extraHrRtcApproved = extrahrrtcapproved;
	}

	public double getExtrahragtaccepted() {
		return extraHrAgtAccepted;
	}

	public void setExtrahragtaccepted(double extrahragtaccepted) {
		this.extraHrAgtAccepted = extrahragtaccepted;
	}

	public double getExtrahragtdecliend() {
		return extraHrAgtDecliend;
	}

	public void setExtrahragtdecliend(double extrahragtdecliend) {
		this.extraHrAgtDecliend = extrahragtdecliend;
	}

	public double getExtrahragtnores() {
		return extraHrAgtNores;
	}

	public void setExtrahragtnores(double extrahragtnores) {
		this.extraHrAgtNores = extrahragtnores;
	}

	public long getVtoreqapproved() {
		return vtoReqApproved;
	}

	public void setVtoreqapproved(long vtoreqapproved) {
		this.vtoReqApproved = vtoreqapproved;
	}

	public long getVtoreqdeclined() {
		return vtoReqDeclined;
	}

	public void setVtoreqdeclined(long vtoreqdeclined) {
		this.vtoReqDeclined = vtoreqdeclined;
	}

	public long getVtoreqrtcwaiting() {
		return vtoReqRtcWaiting;
	}

	public void setVtoreqrtcwaiting(long vtoreqrtcwaiting) {
		this.vtoReqRtcWaiting = vtoreqrtcwaiting;
	}

	public long getVtoreqautoapproved() {
		return vtoReqAutoApproved;
	}

	public void setVtoreqautoapproved(long vtoreqautoapproved) {
		this.vtoReqAutoApproved = vtoreqautoapproved;
	}

	public double getVtohoursapproved() {
		return vtoHoursApproved;
	}

	public void setVtohoursapproved(double vtohoursapproved) {
		this.vtoHoursApproved = vtohoursapproved;
	}

	public double getVtohoursdeclined() {
		return vtoHoursDeclined;
	}

	public void setVtohoursdeclined(double vtohoursdeclined) {
		this.vtoHoursDeclined = vtohoursdeclined;
	}

	public double getVtohoursrtcwaiting() {
		return vtoHoursRtcWaiting;
	}

	public void setVtohoursrtcwaiting(double vtohoursrtcwaiting) {
		this.vtoHoursRtcWaiting = vtohoursrtcwaiting;
	}

	public double getVtohourautoapproved() {
		return vtoHourAutoApproved;
	}

	public void setVtohourautoapproved(double vtohourautoapproved) {
		this.vtoHourAutoApproved = vtohourautoapproved;
	}

	public double getVtohourrulercmdagent() {
		return vtoHourRulerCmdAgent;
	}

	public void setVtohourrulercmdagent(double vtohourrulercmdagent) {
		this.vtoHourRulerCmdAgent = vtohourrulercmdagent;
	}

	public double getVtohourrtcapproved() {
		return vtoHourRtcApproved;
	}

	public void setVtohourrtcapproved(double vtohourrtcapproved) {
		this.vtoHourRtcApproved = vtohourrtcapproved;
	}

	public double getVtohouragtaccepted() {
		return vtoHourAgtAccepted;
	}

	public void setVtohouragtaccepted(double vtohouragtaccepted) {
		this.vtoHourAgtAccepted = vtohouragtaccepted;
	}

	public double getVtohouragtdecliend() {
		return vtoHourAgtDecliend;
	}

	public void setVtohouragtdecliend(double vtohouragtdecliend) {
		this.vtoHourAgtDecliend = vtohouragtdecliend;
	}

	public double getVtohouragtnores() {
		return vtoHourAgtNores;
	}

	public void setVtohouragtnores(double vtohouragtnores) {
		this.vtoHourAgtNores = vtohouragtnores;
	}

	public long getTtlswap() {
		return ttlSwap;
	}

	public void setTtlswap(long ttlswap) {
		this.ttlSwap = ttlswap;
	}

	public double getTtlswaphr() {
		return ttlSwapHr;
	}

	public void setTtlswaphr(double ttlswaphr) {
		this.ttlSwapHr = ttlswaphr;
	}

	public long getTradereq() {
		return tradeReq;
	}

	public void setTradereq(long tradereq) {
		this.tradeReq = tradereq;
	}

	public long getTtltrade_accepted() {
		return ttlTradeAccepted;
	}

	public void setTtltrade_accepted(long ttltrade_accepted) {
		this.ttlTradeAccepted = ttltrade_accepted;
	}

	public double getTtltradehr() {
		return ttlTradeHr;
	}

	public void setTtltradehr(double ttltradehr) {
		this.ttlTradeHr = ttltradehr;
	}

	public double getSchedulehr() {
		return scheduleHr;
	}

	public void setSchedulehr(double schedulehr) {
		this.scheduleHr = schedulehr;
	}

	public String getProgramname() {
		return programName;
	}

	public void setProgramname(String programname) {
		this.programName = programname;
	}

	public Date getCtzdatetime() {
		return ctzDateTime;
	}

	public void setCtzdatetime(Date ctzdatetime) {
		this.ctzDateTime = ctzdatetime;
	}
	
	
}
