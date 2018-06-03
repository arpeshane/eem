package com.nice.eem.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author ajit.p
 *
 */
public class BaseCustomerDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;
	private int ssActiveAgents;
	private int ssActiveLastThirtyDays;
	private int ssActiveLastSevenDays;
	private int totalAgent;
	private int totalAgentParticipating;
	private int mtdActiveAgent;
	private int wtdActiveAgent;
	private int currentDayActiveAgent;
	private int activeLastThirtyDays;
	private int activeLastSevenDays;
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
	private int ptoReqApproved;
	private int ptoReqDeclined;
	private int ptoReqAutoApproved;
	private double ptoHoursApproved;
	private double ptoHourAutoApproved;
	private double ptoHoursDeclined;
	private int ttlSwap;
	private double ttlSwapHr;
	private int tradeReq;
	private int ttlTradeAccepted;
	private double ttlTradeHr;
	private double scheduleHr;
	private int ahtAlert;
	private Date aux1;
	private Date aux2;
	private Date aux3;
	private Date aux4;
	private Date aux5;
	private Date aux6;
	private Date aux7;
	private Date aux8;
	private Date aux9;
	private int programId;
	private String programName;
	private Date reportDate;
	private Date ctzDateTime;
	private String timeZone;
	// related to programwise
	private double loginHoursActual;
	private int abandonedCalls;
	private int answeredCalls;
	private double acw;
	private double talkTime;
	private double ahtActual;
	private double occupancy;
	private double serviceLevel;
	private int successRecordsInWfm;
	private int failedRecordsInWfm;
	// related to sitewise
	private int siteId;
	private String siteName;

	public BaseCustomerDto() {
		// TODO Auto-generated constructor stub
	}

	public BaseCustomerDto(String programname, Date ctzdatetime,
			int ssactiveagents, int totalagent, int totalagentparticipating,
			int extrahrreqapproved, int extrahrreqdeclined,
			int extrahrreqautoapproved, double extrahrhoursapproved,
			double extrahrhoursdeclined, double extrahrhourautoapproved,
			double extrahrrulercmdagent, double extrahrrtcapproved,
			double extrahragtaccepted, double extrahragtdecliend,
			double extrahragtnores, int vtoreqapproved, int vtoreqdeclined,
			int vtoreqautoapproved, double vtohoursapproved,
			double vtohoursdeclined, double vtohourautoapproved,
			double vtohourrulercmdagent, double vtohourrtcapproved,
			double vtohouragtaccepted, double vtohouragtdecliend,
			double vtohouragtnores, int ttlswap, double ttlswaphr,
			int tradereq, int ttltrade_accepted, double ttltradehr,
			double schedulehr, int currentdayactivegent,
			int extrahrreqrtcwaiting, double extrahrhoursrtcwaiting,
			int vtoreqrtcwaiting, double vtohoursrtcwaiting) {

		super();
		this.programName = programname;
		this.ctzDateTime = ctzdatetime;
		this.ssActiveAgents = ssactiveagents;
		this.totalAgent = totalagent;
		this.totalAgentParticipating = totalagentparticipating;
		this.extraHrReqApproved = extrahrreqapproved;
		this.extraHrReqDeclined=extrahrreqdeclined;
		this.extraHrReqAutoApproved = extrahrreqautoapproved;
		this.extraHrHoursApproved = extrahrhoursapproved;
		this.extraHrHoursDeclined = extrahrhoursdeclined;
		this.extraHrHourAutoApproved = extrahrhourautoapproved;
		this.extraHrRulerCmdAgent = extrahrrulercmdagent;
		this.extraHrRtcApproved = extrahrrtcapproved;
		this.extraHrAgtAccepted = extrahragtaccepted;
		this.extraHrAgtDecliend = extrahragtdecliend;
		this.extraHrAgtNores = extrahragtnores;
		this.vtoReqApproved = vtoreqapproved;
		this.vtoReqDeclined = vtoreqdeclined;
		this.vtoReqAutoApproved = vtoreqautoapproved;
		this.vtoHoursApproved = vtohoursapproved;
		this.vtoHoursDeclined = vtohoursdeclined;
		this.vtoHourAutoApproved = vtohourautoapproved;
		this.vtoHourRulerCmdAgent = vtohourrulercmdagent;
		this.vtoHourRtcApproved = vtohourrtcapproved;
		this.vtoHourAgtAccepted = vtohouragtaccepted;
		this.vtoHourAgtDecliend = vtohouragtdecliend;
		this.ttlSwap = ttlswap;
		this.ttlSwapHr = ttlswaphr;
		this.tradeReq = tradereq;
		this.ttlTradeAccepted = ttltrade_accepted;
		this.ttlTradeHr = ttltradehr;
		this.scheduleHr = schedulehr;
		this.currentDayActiveAgent = currentdayactivegent;
		this.extraHrReqRtcWaiting = extrahrreqrtcwaiting;
		this.extraHrHoursRtcWaiting = extrahrhoursrtcwaiting;
		this.vtoReqRtcWaiting = vtoreqrtcwaiting;
		this.vtoHoursRtcWaiting = vtohoursrtcwaiting;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getSsactiveagents() {
		return ssActiveAgents;
	}

	public void setSsactiveagents(int ssactiveagents) {
		this.ssActiveAgents = ssactiveagents;
	}

	public int getSsactivelastthirtydays() {
		return ssActiveLastThirtyDays;
	}

	public void setSsactivelastthirtydays(int ssactivelastthirtydays) {
		this.ssActiveLastThirtyDays = ssactivelastthirtydays;
	}

	public int getSsactivelastsevendays() {
		return ssActiveLastSevenDays;
	}

	public void setSsactivelastsevendays(int ssactivelastsevendays) {
		this.ssActiveLastSevenDays = ssactivelastsevendays;
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

	public int getMtdactiveagent() {
		return mtdActiveAgent;
	}

	public void setMtdactiveagent(int mtdactiveagent) {
		this.mtdActiveAgent = mtdactiveagent;
	}

	public int getWtdactiveagent() {
		return wtdActiveAgent;
	}

	public void setWtdactiveagent(int wtdactiveagent) {
		this.wtdActiveAgent = wtdactiveagent;
	}

	public int getCurrentdayactivegent() {
		return currentDayActiveAgent;
	}

	public void setCurrentdayactivegent(int currentdayactivegent) {
		this.currentDayActiveAgent = currentdayactivegent;
	}

	public int getActivelastthirtydays() {
		return activeLastThirtyDays;
	}

	public void setActivelastthirtydays(int activelastthirtydays) {
		this.activeLastThirtyDays = activelastthirtydays;
	}

	public int getActivelastsevendays() {
		return activeLastSevenDays;
	}

	public void setActivelastsevendays(int activelastsevendays) {
		this.activeLastSevenDays = activelastsevendays;
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

	public int getPtoreqapproved() {
		return ptoReqApproved;
	}

	public void setPtoreqapproved(int ptoreqapproved) {
		this.ptoReqApproved = ptoreqapproved;
	}

	public int getPtoreqdeclined() {
		return ptoReqDeclined;
	}

	public void setPtoreqdeclined(int ptoreqdeclined) {
		this.ptoReqDeclined = ptoreqdeclined;
	}

	public int getPtoreqautoapproved() {
		return ptoReqAutoApproved;
	}

	public void setPtoreqautoapproved(int ptoreqautoapproved) {
		this.ptoReqAutoApproved = ptoreqautoapproved;
	}

	public double getPtohoursapproved() {
		return ptoHoursApproved;
	}

	public void setPtohoursapproved(double ptohoursapproved) {
		this.ptoHoursApproved = ptohoursapproved;
	}

	public double getPtohourautoapproved() {
		return ptoHourAutoApproved;
	}

	public void setPtohourautoapproved(double ptohourautoapproved) {
		this.ptoHourAutoApproved = ptohourautoapproved;
	}

	public double getPtohoursdeclined() {
		return ptoHoursDeclined;
	}

	public void setPtohoursdeclined(double ptohoursdeclined) {
		this.ptoHoursDeclined = ptohoursdeclined;
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

	public int getAhtalert() {
		return ahtAlert;
	}

	public void setAhtalert(int ahtalert) {
		this.ahtAlert = ahtalert;
	}

	public Date getAux1() {
		return aux1;
	}

	public void setAux1(Date aux1) {
		this.aux1 = aux1;
	}

	public Date getAux2() {
		return aux2;
	}

	public void setAux2(Date aux2) {
		this.aux2 = aux2;
	}

	public Date getAux3() {
		return aux3;
	}

	public void setAux3(Date aux3) {
		this.aux3 = aux3;
	}

	public Date getAux4() {
		return aux4;
	}

	public void setAux4(Date aux4) {
		this.aux4 = aux4;
	}

	public Date getAux5() {
		return aux5;
	}

	public void setAux5(Date aux5) {
		this.aux5 = aux5;
	}

	public Date getAux6() {
		return aux6;
	}

	public void setAux6(Date aux6) {
		this.aux6 = aux6;
	}

	public Date getAux7() {
		return aux7;
	}

	public void setAux7(Date aux7) {
		this.aux7 = aux7;
	}

	public Date getAux8() {
		return aux8;
	}

	public void setAux8(Date aux8) {
		this.aux8 = aux8;
	}

	public Date getAux9() {
		return aux9;
	}

	public void setAux9(Date aux9) {
		this.aux9 = aux9;
	}

	public int getProgramid() {
		return programId;
	}

	public void setProgramid(int programid) {
		this.programId = programid;
	}

	public String getProgramname() {
		return programName;
	}

	public void setProgramname(String programname) {
		this.programName = programname;
	}

	public Date getReportdate() {
		return reportDate;
	}

	public void setReportdate(Date reportdate) {
		this.reportDate = reportdate;
	}

	public Date getCtzdatetime() {
		return ctzDateTime;
	}

	public void setCtzdatetime(Date ctzdatetime) {
		this.ctzDateTime = ctzdatetime;
	}

	public String getTimezone() {
		return timeZone;
	}

	public void setTimezone(String timezone) {
		this.timeZone = timezone;
	}

	public double getLoginhoursactual() {
		return loginHoursActual;
	}

	public void setLoginhoursactual(double loginhoursactual) {
		this.loginHoursActual = loginhoursactual;
	}

	public int getAbandonedcalls() {
		return abandonedCalls;
	}

	public void setAbandonedcalls(int abandonedcalls) {
		this.abandonedCalls = abandonedcalls;
	}

	public int getAnsweredcalls() {
		return answeredCalls;
	}

	public void setAnsweredcalls(int answeredcalls) {
		this.answeredCalls = answeredcalls;
	}

	public double getAcw() {
		return acw;
	}

	public void setAcw(double acw) {
		this.acw = acw;
	}

	public double getTalktime() {
		return talkTime;
	}

	public void setTalktime(double talktime) {
		this.talkTime = talktime;
	}

	public double getAhtactual() {
		return ahtActual;
	}

	public void setAhtactual(double ahtactual) {
		this.ahtActual = ahtactual;
	}

	public double getOccupancy() {
		return occupancy;
	}

	public void setOccupancy(double occupancy) {
		this.occupancy = occupancy;
	}

	public double getServicelevel() {
		return serviceLevel;
	}

	public void setServicelevel(double servicelevel) {
		this.serviceLevel = servicelevel;
	}

	public int getSuccessrecordsinwfm() {
		return successRecordsInWfm;
	}

	public void setSuccessrecordsinwfm(int successrecordsinwfm) {
		this.successRecordsInWfm = successrecordsinwfm;
	}

	public int getFailedrecordsinwfm() {
		return failedRecordsInWfm;
	}

	public void setFailedrecordsinwfm(int failedrecordsinwfm) {
		this.failedRecordsInWfm = failedrecordsinwfm;
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

	public int getExtrahrreqdeclined() {
		return extraHrReqDeclined;
	}

	public void setExtrahrreqdeclined(int extrahrreqdeclined) {
		this.extraHrReqDeclined = extrahrreqdeclined;
	}

}
