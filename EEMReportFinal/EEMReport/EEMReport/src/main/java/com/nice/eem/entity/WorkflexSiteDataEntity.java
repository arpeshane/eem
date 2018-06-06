package com.nice.eem.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SqlResultSetMapping;

import com.nice.eem.constants.EemConstants;
import com.nice.eem.dto.SiteWiseDataDto;

@SqlResultSetMapping(name = EemConstants.SITE_DATA_MAPPING, classes = {
		@ConstructorResult(targetClass = SiteWiseDataDto.class, columns = {
				@ColumnResult(name = "id", type = Long.class),
				@ColumnResult(name = "programName", type = String.class),
				@ColumnResult(name = "ctzDateTime", type = Date.class),
				@ColumnResult(name = "ssActiveAgents", type = Long.class),
				@ColumnResult(name = "totalAgent", type = Long.class),
				@ColumnResult(name = "totalAgentParticipating", type = Long.class),
				@ColumnResult(name = "extraHrReqApproved", type = Long.class),
				@ColumnResult(name = "extraHrReqDeclined", type = Long.class),
				@ColumnResult(name = "extraHrReqAutoApproved", type = Long.class),
				@ColumnResult(name = "extraHrHoursApproved", type = Double.class),
				@ColumnResult(name = "extraHrHoursDeclined", type = Double.class),
				@ColumnResult(name = "extraHrHourAutoApproved", type = Double.class),
				@ColumnResult(name = "extraHrRulerCmdAgent", type = Double.class),
				@ColumnResult(name = "extraHrRtcApproved", type = Double.class),
				@ColumnResult(name = "extraHrAgtAccepted", type = Double.class),
				@ColumnResult(name = "extraHrAgtDecliend", type = Double.class),
				@ColumnResult(name = "extraHrAgtNores", type = Double.class),
				@ColumnResult(name = "vtoReqApproved", type = Long.class),
				@ColumnResult(name = "vtoReqDeclined", type = Long.class),
				@ColumnResult(name = "vtoReqAutoApproved", type = Long.class),
				@ColumnResult(name = "vtoHoursApproved", type = Double.class),
				@ColumnResult(name = "vtoHoursDeclined", type = Double.class),
				@ColumnResult(name = "vtoHourAutoApproved", type = Double.class),
				@ColumnResult(name = "vtoHourRulerCmdAgent", type = Double.class),
				@ColumnResult(name = "vtoHourRtcApproved", type = Double.class),
				@ColumnResult(name = "vtoHourAgtAccepted", type = Double.class),
				@ColumnResult(name = "vtoHourAgtDecliend", type = Double.class),
				@ColumnResult(name = "vtoHourAgtNores", type = Double.class),
				@ColumnResult(name = "ttlSwap", type = Long.class),
				@ColumnResult(name = "ttlSwapHr", type = Double.class),
				@ColumnResult(name = "tradeReq", type = Long.class),
				@ColumnResult(name = "ttlTradeAccepted", type = Long.class),
				@ColumnResult(name = "ttlTradeHr", type = Double.class),
				@ColumnResult(name = "scheduleHr", type = Double.class),
				@ColumnResult(name = "currentDayActiveAgent", type = Long.class),
				@ColumnResult(name = "extraHrReqRtcWaiting", type = Long.class),
				@ColumnResult(name = "extraHrHoursRtcWaiting", type = Double.class),
				@ColumnResult(name = "vtoReqRtcWaiting", type = Long.class),
				@ColumnResult(name = "vtoHoursRtcWaiting", type = Double.class),
				@ColumnResult(name = "siteId", type = Long.class),
				@ColumnResult(name = "siteName", type = String.class),
		}) 
		
})
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class WorkflexSiteDataEntity {
	@Id
	@Column(name = "id")
	private long id;
	@Column(name = "SSactiveagents")
	private long ssActiveAgents;
	@Column(name = "ssactivelastthirtydays")
	private long ssActiveLastThirtyDays;
	@Column(name = "ssactivelastsevendays")
	private long ssActiveLastSevenDays;
	@Column(name = "totalagent")
	private long totalAgent;
	@Column(name = "totalagentparticipating")
	private long totalAgentParticipating;
	@Column(name = "mtdactiveagent")
	private long mtdActiveAgent;
	@Column(name = "wtdactiveagent")
	private long wtdActiveAgent;
	@Column(name = "currentdayactivegent")
	private long currentDayActiveAgent;
	@Column(name = "activelastthirtydays")
	private long activeLastThirtyDays;
	@Column(name = "activelastsevendays")
	private long activeLastSevenDays;
	@Column(name = "extrahrreqapproved")
	private long extraHrReqApproved;
	@Column(name = "extrahrreqdeclined")
	private long extraHrReqDeclined;
	@Column(name = "extrahrreqrtcwaiting")
	private long extraHrReqRtcWaiting;
	@Column(name = "extrahrreqautoapproved")
	private long extraHrReqAutoApproved;

	@Column(name = "extrahrhoursapproved")
	private double extraHrHoursApproved;
	@Column(name = "extrahrhoursdeclined")
	private double extraHrHoursDeclined;
	@Column(name = "extrahrhoursrtcwaiting")
	private double extraHrHoursRtcWaiting;
	@Column(name = "extrahrhourautoapproved")
	private double extraHrHourAutoApproved;
	@Column(name = "extrahrrulercmdagent")
	private double extraHrRulerCmdAgent;
	@Column(name = "extrahrrtcapproved")
	private double extraHrRtcApproved;
	@Column(name = "extrahragtaccepted")
	private double extraHrAgtAccepted;
	@Column(name = "extrahragtdecliend")
	private double extraHrAgtDecliend;
	@Column(name = "extrahragtnores")
	private double extraHrAgtNores;
	@Column(name = "vtoreqapproved")
	private long vtoReqApproved;
	@Column(name = "vtoreqdeclined")
	private long vtoReqDeclined;
	@Column(name = "vtoreqrtcwaiting")
	private long vtoReqRtcWaiting;
	@Column(name = "vtoreqautoapproved")
	private long vtoReqAutoApproved;
	@Column(name = "vtohoursapproved")
	private double vtoHoursApproved;
	@Column(name = "vtohoursdeclined")
	private double vtoHoursDeclined;
	@Column(name = "vtohoursrtcwaiting")
	private double vtoHoursRtcWaiting;

	@Column(name = "vtohourautoapproved")
	private double vtoHourAutoApproved;
	@Column(name = "vtohourrulercmdagent")
	private double vtoHourRulerCmdAgent;
	@Column(name = "vtohourrtcapproved")
	private double vtoHourRtcApproved;
	@Column(name = "vtohouragtaccepted")
	private double vtoHourAgtAccepted;
	@Column(name = "vtohouragtdecliend")
	private double vtoHourAgtDecliend;
	@Column(name = "vtohouragtnores")
	private double vtoHourAgtNores;
	@Column(name = "ptoreqapproved")
	private long ptoReqApproved;
	@Column(name = "ptoreqdeclined")
	private long ptoReqDeclined;
	@Column(name = "ptoreqautoapproved")
	private long ptoReqAutoApproved;
	@Column(name = "ptohoursapproved")
	private double ptoHoursApproved;
	@Column(name = "ptohourautoapproved")
	private double ptoHourAutoApproved;
	@Column(name = "ptohoursdeclined")
	private double ptoHoursDeclined;
	@Column(name = "ttlswap")
	private long ttlSwap;
	@Column(name = "ttlswaphr")
	private double ttlSwapHr;
	@Column(name = "tradereq")
	private long tradeReq;
	@Column(name = "ttltrade_accepted")
	private long ttlTradeAccepted;

	@Column(name = "ttltradehr")
	private double ttlTradeHr;
	@Column(name = "schedulehr")
	private double scheduleHr;
	@Column(name = "ahtalert")
	private long ahtAlert;
	@Column(name = "aux1")
	private Date aux1;
	@Column(name = "aux2")
	private Date aux2;
	@Column(name = "aux3")
	private Date aux3;
	@Column(name = "aux4")
	private Date aux4;
	@Column(name = "aux5")
	private Date aux5;
	@Column(name = "aux6")
	private Date aux6;
	@Column(name = "aux7")
	private Date aux7;
	@Column(name = "aux8")
	private Date aux8;
	@Column(name = "aux9")
	private Date aux9;

	@Column(name = "programid")
	private long programId;
	@Column(name = "programname")
	private String programName;
	@Column(name = "reportdate")
	private Date reportDate;
	@Column(name = "ctzdatetime")
	private Date ctzDateTime;
	@Column(name = "timezone")
	private String timeZone;
	
	@Column(name = "siteid")
	private int siteId;
	@Column(name = "sitename")
	private String siteName;
	
	
	public WorkflexSiteDataEntity() {
		super();
	}


	public WorkflexSiteDataEntity(long id, long ssActiveAgents, long ssActiveLastThirtyDays, long ssActiveLastSevenDays,
			long totalAgent, long totalAgentParticipating, long mtdActiveAgent, long wtdActiveAgent,
			long currentDayActiveAgent, long activeLastThirtyDays, long activeLastSevenDays, long extraHrReqApproved,
			long extraHrReqDeclined, long extraHrReqRtcWaiting, long extraHrReqAutoApproved,
			double extraHrHoursApproved, double extraHrHoursDeclined, double extraHrHoursRtcWaiting,
			double extraHrHourAutoApproved, double extraHrRulerCmdAgent, double extraHrRtcApproved,
			double extraHrAgtAccepted, double extraHrAgtDecliend, double extraHrAgtNores, long vtoReqApproved,
			long vtoReqDeclined, long vtoReqRtcWaiting, long vtoReqAutoApproved, double vtoHoursApproved,
			double vtoHoursDeclined, double vtoHoursRtcWaiting, double vtoHourAutoApproved, double vtoHourRulerCmdAgent,
			double vtoHourRtcApproved, double vtoHourAgtAccepted, double vtoHourAgtDecliend, double vtoHourAgtNores,
			long ptoReqApproved, long ptoReqDeclined, long ptoReqAutoApproved, double ptoHoursApproved,
			double ptoHourAutoApproved, double ptoHoursDeclined, long ttlSwap, double ttlSwapHr, long tradeReq,
			long ttlTradeAccepted, double ttlTradeHr, double scheduleHr, long ahtAlert, Date aux1, Date aux2, Date aux3,
			Date aux4, Date aux5, Date aux6, Date aux7, Date aux8, Date aux9, long programId, String programName,
			Date reportDate, Date ctzDateTime, String timeZone, int siteId, String siteName) {
		super();
		this.id = id;
		this.ssActiveAgents = ssActiveAgents;
		this.ssActiveLastThirtyDays = ssActiveLastThirtyDays;
		this.ssActiveLastSevenDays = ssActiveLastSevenDays;
		this.totalAgent = totalAgent;
		this.totalAgentParticipating = totalAgentParticipating;
		this.mtdActiveAgent = mtdActiveAgent;
		this.wtdActiveAgent = wtdActiveAgent;
		this.currentDayActiveAgent = currentDayActiveAgent;
		this.activeLastThirtyDays = activeLastThirtyDays;
		this.activeLastSevenDays = activeLastSevenDays;
		this.extraHrReqApproved = extraHrReqApproved;
		this.extraHrReqDeclined = extraHrReqDeclined;
		this.extraHrReqRtcWaiting = extraHrReqRtcWaiting;
		this.extraHrReqAutoApproved = extraHrReqAutoApproved;
		this.extraHrHoursApproved = extraHrHoursApproved;
		this.extraHrHoursDeclined = extraHrHoursDeclined;
		this.extraHrHoursRtcWaiting = extraHrHoursRtcWaiting;
		this.extraHrHourAutoApproved = extraHrHourAutoApproved;
		this.extraHrRulerCmdAgent = extraHrRulerCmdAgent;
		this.extraHrRtcApproved = extraHrRtcApproved;
		this.extraHrAgtAccepted = extraHrAgtAccepted;
		this.extraHrAgtDecliend = extraHrAgtDecliend;
		this.extraHrAgtNores = extraHrAgtNores;
		this.vtoReqApproved = vtoReqApproved;
		this.vtoReqDeclined = vtoReqDeclined;
		this.vtoReqRtcWaiting = vtoReqRtcWaiting;
		this.vtoReqAutoApproved = vtoReqAutoApproved;
		this.vtoHoursApproved = vtoHoursApproved;
		this.vtoHoursDeclined = vtoHoursDeclined;
		this.vtoHoursRtcWaiting = vtoHoursRtcWaiting;
		this.vtoHourAutoApproved = vtoHourAutoApproved;
		this.vtoHourRulerCmdAgent = vtoHourRulerCmdAgent;
		this.vtoHourRtcApproved = vtoHourRtcApproved;
		this.vtoHourAgtAccepted = vtoHourAgtAccepted;
		this.vtoHourAgtDecliend = vtoHourAgtDecliend;
		this.vtoHourAgtNores = vtoHourAgtNores;
		this.ptoReqApproved = ptoReqApproved;
		this.ptoReqDeclined = ptoReqDeclined;
		this.ptoReqAutoApproved = ptoReqAutoApproved;
		this.ptoHoursApproved = ptoHoursApproved;
		this.ptoHourAutoApproved = ptoHourAutoApproved;
		this.ptoHoursDeclined = ptoHoursDeclined;
		this.ttlSwap = ttlSwap;
		this.ttlSwapHr = ttlSwapHr;
		this.tradeReq = tradeReq;
		this.ttlTradeAccepted = ttlTradeAccepted;
		this.ttlTradeHr = ttlTradeHr;
		this.scheduleHr = scheduleHr;
		this.ahtAlert = ahtAlert;
		this.aux1 = aux1;
		this.aux2 = aux2;
		this.aux3 = aux3;
		this.aux4 = aux4;
		this.aux5 = aux5;
		this.aux6 = aux6;
		this.aux7 = aux7;
		this.aux8 = aux8;
		this.aux9 = aux9;
		this.programId = programId;
		this.programName = programName;
		this.reportDate = reportDate;
		this.ctzDateTime = ctzDateTime;
		this.timeZone = timeZone;
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


	public long getSsActiveLastThirtyDays() {
		return ssActiveLastThirtyDays;
	}


	public void setSsActiveLastThirtyDays(long ssActiveLastThirtyDays) {
		this.ssActiveLastThirtyDays = ssActiveLastThirtyDays;
	}


	public long getSsActiveLastSevenDays() {
		return ssActiveLastSevenDays;
	}


	public void setSsActiveLastSevenDays(long ssActiveLastSevenDays) {
		this.ssActiveLastSevenDays = ssActiveLastSevenDays;
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


	public long getMtdActiveAgent() {
		return mtdActiveAgent;
	}


	public void setMtdActiveAgent(long mtdActiveAgent) {
		this.mtdActiveAgent = mtdActiveAgent;
	}


	public long getWtdActiveAgent() {
		return wtdActiveAgent;
	}


	public void setWtdActiveAgent(long wtdActiveAgent) {
		this.wtdActiveAgent = wtdActiveAgent;
	}


	public long getCurrentDayActiveAgent() {
		return currentDayActiveAgent;
	}


	public void setCurrentDayActiveAgent(long currentDayActiveAgent) {
		this.currentDayActiveAgent = currentDayActiveAgent;
	}


	public long getActiveLastThirtyDays() {
		return activeLastThirtyDays;
	}


	public void setActiveLastThirtyDays(long activeLastThirtyDays) {
		this.activeLastThirtyDays = activeLastThirtyDays;
	}


	public long getActiveLastSevenDays() {
		return activeLastSevenDays;
	}


	public void setActiveLastSevenDays(long activeLastSevenDays) {
		this.activeLastSevenDays = activeLastSevenDays;
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


	public long getPtoReqApproved() {
		return ptoReqApproved;
	}


	public void setPtoReqApproved(long ptoReqApproved) {
		this.ptoReqApproved = ptoReqApproved;
	}


	public long getPtoReqDeclined() {
		return ptoReqDeclined;
	}


	public void setPtoReqDeclined(long ptoReqDeclined) {
		this.ptoReqDeclined = ptoReqDeclined;
	}


	public long getPtoReqAutoApproved() {
		return ptoReqAutoApproved;
	}


	public void setPtoReqAutoApproved(long ptoReqAutoApproved) {
		this.ptoReqAutoApproved = ptoReqAutoApproved;
	}


	public double getPtoHoursApproved() {
		return ptoHoursApproved;
	}


	public void setPtoHoursApproved(double ptoHoursApproved) {
		this.ptoHoursApproved = ptoHoursApproved;
	}


	public double getPtoHourAutoApproved() {
		return ptoHourAutoApproved;
	}


	public void setPtoHourAutoApproved(double ptoHourAutoApproved) {
		this.ptoHourAutoApproved = ptoHourAutoApproved;
	}


	public double getPtoHoursDeclined() {
		return ptoHoursDeclined;
	}


	public void setPtoHoursDeclined(double ptoHoursDeclined) {
		this.ptoHoursDeclined = ptoHoursDeclined;
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


	public long getAhtAlert() {
		return ahtAlert;
	}


	public void setAhtAlert(long ahtAlert) {
		this.ahtAlert = ahtAlert;
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


	public long getProgramId() {
		return programId;
	}


	public void setProgramId(long programId) {
		this.programId = programId;
	}


	public String getProgramName() {
		return programName;
	}


	public void setProgramName(String programName) {
		this.programName = programName;
	}


	public Date getReportDate() {
		return reportDate;
	}


	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}


	public Date getCtzDateTime() {
		return ctzDateTime;
	}


	public void setCtzDateTime(Date ctzDateTime) {
		this.ctzDateTime = ctzDateTime;
	}


	public String getTimeZone() {
		return timeZone;
	}


	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}


	public int getSiteId() {
		return siteId;
	}


	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}


	public String getSiteName() {
		return siteName;
	}


	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}


	@Override
	public String toString() {
		return "WorkflexSiteDataEntity [id=" + id + ", ssActiveAgents=" + ssActiveAgents + ", ssActiveLastThirtyDays="
				+ ssActiveLastThirtyDays + ", ssActiveLastSevenDays=" + ssActiveLastSevenDays + ", totalAgent="
				+ totalAgent + ", totalAgentParticipating=" + totalAgentParticipating + ", mtdActiveAgent="
				+ mtdActiveAgent + ", wtdActiveAgent=" + wtdActiveAgent + ", currentDayActiveAgent="
				+ currentDayActiveAgent + ", activeLastThirtyDays=" + activeLastThirtyDays + ", activeLastSevenDays="
				+ activeLastSevenDays + ", extraHrReqApproved=" + extraHrReqApproved + ", extraHrReqDeclined="
				+ extraHrReqDeclined + ", extraHrReqRtcWaiting=" + extraHrReqRtcWaiting + ", extraHrReqAutoApproved="
				+ extraHrReqAutoApproved + ", extraHrHoursApproved=" + extraHrHoursApproved + ", extraHrHoursDeclined="
				+ extraHrHoursDeclined + ", extraHrHoursRtcWaiting=" + extraHrHoursRtcWaiting
				+ ", extraHrHourAutoApproved=" + extraHrHourAutoApproved + ", extraHrRulerCmdAgent="
				+ extraHrRulerCmdAgent + ", extraHrRtcApproved=" + extraHrRtcApproved + ", extraHrAgtAccepted="
				+ extraHrAgtAccepted + ", extraHrAgtDecliend=" + extraHrAgtDecliend + ", extraHrAgtNores="
				+ extraHrAgtNores + ", vtoReqApproved=" + vtoReqApproved + ", vtoReqDeclined=" + vtoReqDeclined
				+ ", vtoReqRtcWaiting=" + vtoReqRtcWaiting + ", vtoReqAutoApproved=" + vtoReqAutoApproved
				+ ", vtoHoursApproved=" + vtoHoursApproved + ", vtoHoursDeclined=" + vtoHoursDeclined
				+ ", vtoHoursRtcWaiting=" + vtoHoursRtcWaiting + ", vtoHourAutoApproved=" + vtoHourAutoApproved
				+ ", vtoHourRulerCmdAgent=" + vtoHourRulerCmdAgent + ", vtoHourRtcApproved=" + vtoHourRtcApproved
				+ ", vtoHourAgtAccepted=" + vtoHourAgtAccepted + ", vtoHourAgtDecliend=" + vtoHourAgtDecliend
				+ ", vtoHourAgtNores=" + vtoHourAgtNores + ", ptoReqApproved=" + ptoReqApproved + ", ptoReqDeclined="
				+ ptoReqDeclined + ", ptoReqAutoApproved=" + ptoReqAutoApproved + ", ptoHoursApproved="
				+ ptoHoursApproved + ", ptoHourAutoApproved=" + ptoHourAutoApproved + ", ptoHoursDeclined="
				+ ptoHoursDeclined + ", ttlSwap=" + ttlSwap + ", ttlSwapHr=" + ttlSwapHr + ", tradeReq=" + tradeReq
				+ ", ttlTradeAccepted=" + ttlTradeAccepted + ", ttlTradeHr=" + ttlTradeHr + ", scheduleHr=" + scheduleHr
				+ ", ahtAlert=" + ahtAlert + ", aux1=" + aux1 + ", aux2=" + aux2 + ", aux3=" + aux3 + ", aux4=" + aux4
				+ ", aux5=" + aux5 + ", aux6=" + aux6 + ", aux7=" + aux7 + ", aux8=" + aux8 + ", aux9=" + aux9
				+ ", programId=" + programId + ", programName=" + programName + ", reportDate=" + reportDate
				+ ", ctzDateTime=" + ctzDateTime + ", timeZone=" + timeZone + ", siteId=" + siteId + ", siteName="
				+ siteName + "]";
	}
	
	
	
}

