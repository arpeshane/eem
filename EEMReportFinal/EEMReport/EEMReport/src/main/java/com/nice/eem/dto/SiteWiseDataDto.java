package com.nice.eem.dto;

import java.util.Date;
/**
 * 
 * @author ajit.p
 *
 */
public class SiteWiseDataDto extends BaseCustomerDto {

	private static final long serialVersionUID = 1L;
	
	private int ssActiveAgents;
	private int totalAgent;
	private int totalAgentParticipating;
	private int currentDayActiveAgent;
	private int extraHrReqApproved;
	private int extraHrReqDeclined;
	private int extraHrReqRtcWaiting;
	private int extraHrReqAutoApproved;
	private double extraHrHoursApproved;
	private double extraHrHoursDeclined;
	private double extraHrHoursRtcWaiting;
	private double extraHrHourAutoApproved;
	private double extraHrRulerCmdAgent;
	private double extraHrRtcApproved;
	private double extraHrAgtAccepted;
	private double extraHrAgtDecliend;
	private double extraHrAgtNores;
	private int vtoReqApproved;
	private int vtoReqDeclined;
	private int vtoReqRtcWaiting;
	private int vtoReqAutoApproved;
	private double vtoHoursApproved;
	private double vtoHoursDeclined;
	private double vtoHoursRtcWaiting;
	private double vtoHourAutoApproved;
	private double vtoHourRulerCmdAgent;
	private double vtoHourRtcApproved;
	private double vtoHourAgtAccepted;
	private double vtoHourAgtDecliend;
	private double vtoHourAgtNores;
	private int ttlSwap;
	private double ttlSwapHr;
	private int tradeReq;
	private int ttlTradeAccepted;
	private double ttlTradeHr;
	private double scheduleHr;
	private String programName;
	private Date ctzDateTime;
	private int siteId;
	private String siteName;
	
	
	public SiteWiseDataDto() {
		super();
	}
	public SiteWiseDataDto(int ssactiveagents, int totalagent,
			int totalagentparticipating, int currentdayactivegent,
			int extrahrreqdeclined, int extrahrreqapproved,
			int extrahrreqrtcwaiting, int extrahrreqautoapproved,
			double extrahrhoursapproved, double extrahrhoursdeclined,
			double extrahrhoursrtcwaiting, double extrahrhourautoapproved,
			double extrahrrulercmdagent, double extrahrrtcapproved,
			double extrahragtaccepted, double extrahragtdecliend,
			double extrahragtnores, int vtoreqapproved, int vtoreqdeclined,
			int vtoreqrtcwaiting, int vtoreqautoapproved,
			double vtohoursapproved, double vtohoursdeclined,
			double vtohoursrtcwaiting, double vtohourautoapproved,
			double vtohourrulercmdagent, double vtohourrtcapproved,
			double vtohouragtaccepted, double vtohouragtdecliend,
			double vtohouragtnores, int ttlswap, double ttlswaphr,
			int tradereq, int ttltrade_accepted, double ttltradehr,
			double schedulehr, String programname, Date ctzdatetime,
			int siteid, String sitename) {
		super();
		this.ssActiveAgents = ssactiveagents;
		this.totalAgent = totalagent;
		this.totalAgentParticipating = totalagentparticipating;
		this.currentDayActiveAgent = currentdayactivegent;
		this.extraHrReqDeclined = extrahrreqdeclined;
		this.extraHrReqApproved = extrahrreqapproved;
		this.extraHrReqRtcWaiting = extrahrreqrtcwaiting;
		this.extraHrReqAutoApproved = extrahrreqautoapproved;
		this.extraHrHoursApproved = extrahrhoursapproved;
		this.extraHrHoursDeclined = extrahrhoursdeclined;
		this.extraHrHoursRtcWaiting = extrahrhoursrtcwaiting;
		this.extraHrHourAutoApproved = extrahrhourautoapproved;
		this.extraHrRulerCmdAgent = extrahrrulercmdagent;
		this.extraHrRtcApproved = extrahrrtcapproved;
		this.extraHrAgtAccepted = extrahragtaccepted;
		this.extraHrAgtDecliend = extrahragtdecliend;
		this.extraHrAgtNores = extrahragtnores;
		this.vtoReqApproved = vtoreqapproved;
		this.vtoReqDeclined = vtoreqdeclined;
		this.vtoReqRtcWaiting = vtoreqrtcwaiting;
		this.vtoReqAutoApproved = vtoreqautoapproved;
		this.vtoHoursApproved = vtohoursapproved;
		this.vtoHoursDeclined = vtohoursdeclined;
		this.vtoHoursRtcWaiting = vtohoursrtcwaiting;
		this.vtoHourAutoApproved = vtohourautoapproved;
		this.vtoHourRulerCmdAgent = vtohourrulercmdagent;
		this.vtoHourRtcApproved = vtohourrtcapproved;
		this.vtoHourAgtAccepted = vtohouragtaccepted;
		this.vtoHourAgtDecliend = vtohouragtdecliend;
		this.vtoHourAgtNores = vtohouragtnores;
		this.ttlSwap = ttlswap;
		this.ttlSwapHr = ttlswaphr;
		this.tradeReq = tradereq;
		this.ttlTradeAccepted = ttltrade_accepted;
		this.ttlTradeHr = ttltradehr;
		this.scheduleHr = schedulehr;
		this.programName = programname;
		this.ctzDateTime = ctzdatetime;
		this.siteId = siteid;
		this.siteName = sitename;
	}
	public int getSsactiveagents() {
		return ssActiveAgents;
	}
	public void setSsactiveagents(int ssactiveagents) {
		this.ssActiveAgents = ssactiveagents;
	}
	public int getTotalagent() {
		return totalAgent;
	}
	public void setTotalagent(int totalagent) {
		this.totalAgent = totalagent;
	}
	public int getTotalagentparticipating() {
		return totalAgentParticipating;
	}
	public void setTotalagentparticipating(int totalagentparticipating) {
		this.totalAgentParticipating = totalagentparticipating;
	}
	public int getCurrentdayactivegent() {
		return currentDayActiveAgent;
	}
	public void setCurrentdayactivegent(int currentdayactivegent) {
		this.currentDayActiveAgent = currentdayactivegent;
	}
	public int getExtrahrreqdeclined() {
		return extraHrReqDeclined;
	}
	public void setExtrahrreqdeclined(int extrahrreqdeclined) {
		this.extraHrReqDeclined = extrahrreqdeclined;
	}
	public int getExtrahrreqapproved() {
		return extraHrReqApproved;
	}
	public void setExtrahrreqapproved(int extrahrreqapproved) {
		this.extraHrReqApproved = extrahrreqapproved;
	}
	public int getExtrahrreqrtcwaiting() {
		return extraHrReqRtcWaiting;
	}
	public void setExtrahrreqrtcwaiting(int extrahrreqrtcwaiting) {
		this.extraHrReqRtcWaiting = extrahrreqrtcwaiting;
	}
	public int getExtrahrreqautoapproved() {
		return extraHrReqAutoApproved;
	}
	public void setExtrahrreqautoapproved(int extrahrreqautoapproved) {
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
	public int getVtoreqapproved() {
		return vtoReqApproved;
	}
	public void setVtoreqapproved(int vtoreqapproved) {
		this.vtoReqApproved = vtoreqapproved;
	}
	public int getVtoreqdeclined() {
		return vtoReqDeclined;
	}
	public void setVtoreqdeclined(int vtoreqdeclined) {
		this.vtoReqDeclined = vtoreqdeclined;
	}
	public int getVtoreqrtcwaiting() {
		return vtoReqRtcWaiting;
	}
	public void setVtoreqrtcwaiting(int vtoreqrtcwaiting) {
		this.vtoReqRtcWaiting = vtoreqrtcwaiting;
	}
	public int getVtoreqautoapproved() {
		return vtoReqAutoApproved;
	}
	public void setVtoreqautoapproved(int vtoreqautoapproved) {
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
	public int getTtlswap() {
		return ttlSwap;
	}
	public void setTtlswap(int ttlswap) {
		this.ttlSwap = ttlswap;
	}
	public double getTtlswaphr() {
		return ttlSwapHr;
	}
	public void setTtlswaphr(double ttlswaphr) {
		this.ttlSwapHr = ttlswaphr;
	}
	public int getTradereq() {
		return tradeReq;
	}
	public void setTradereq(int tradereq) {
		this.tradeReq = tradereq;
	}
	public int getTtltrade_accepted() {
		return ttlTradeAccepted;
	}
	public void setTtltrade_accepted(int ttltrade_accepted) {
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
	public int getSiteid() {
		return siteId;
	}
	public void setSiteid(int siteid) {
		this.siteId = siteid;
	}
	public String getSitename() {
		return siteName;
	}
	public void setSitename(String sitename) {
		this.siteName = sitename;
	}
	
	
}
