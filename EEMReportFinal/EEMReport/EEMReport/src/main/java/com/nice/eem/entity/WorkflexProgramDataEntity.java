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
import com.nice.eem.dto.ProgramWiseDataDto;

/**
 * 
 * @author ajit.p
 *
 */
@SqlResultSetMapping(name = EemConstants.PROGRAM_DATA_MAPPING, classes = {
		@ConstructorResult(targetClass = ProgramWiseDataDto.class, columns = {
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

				
		}) 
		
})
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class WorkflexProgramDataEntity {

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

	
	
	public WorkflexProgramDataEntity() {
		super();
	}

	public WorkflexProgramDataEntity(long id, long ssActiveAgents, long ssActiveLastThirtyDays, long ssActiveLastSevenDays,
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
			Date reportDate, Date ctzDateTime, String timeZone) {
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

	public long getSsactivelastthirtydays() {
		return ssActiveLastThirtyDays;
	}

	public void setSsactivelastthirtydays(long ssactivelastthirtydays) {
		this.ssActiveLastThirtyDays = ssactivelastthirtydays;
	}

	public long getSsactivelastsevendays() {
		return ssActiveLastSevenDays;
	}

	public void setSsactivelastsevendays(long ssactivelastsevendays) {
		this.ssActiveLastSevenDays = ssactivelastsevendays;
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

	public long getMtdactiveagent() {
		return mtdActiveAgent;
	}

	public void setMtdactiveagent(long mtdactiveagent) {
		this.mtdActiveAgent = mtdactiveagent;
	}

	public long getWtdactiveagent() {
		return wtdActiveAgent;
	}

	public void setWtdactiveagent(long wtdactiveagent) {
		this.wtdActiveAgent = wtdactiveagent;
	}

	public long getCurrentdayactivegent() {
		return currentDayActiveAgent;
	}

	public void setCurrentdayactivegent(long currentdayactivegent) {
		this.currentDayActiveAgent = currentdayactivegent;
	}

	public long getActivelastthirtydays() {
		return activeLastThirtyDays;
	}

	public void setActivelastthirtydays(long activelastthirtydays) {
		this.activeLastThirtyDays = activelastthirtydays;
	}

	public long getActivelastsevendays() {
		return activeLastSevenDays;
	}

	public void setActivelastsevendays(long activelastsevendays) {
		this.activeLastSevenDays = activelastsevendays;
	}

	public long getExtrahrreqapproved() {
		return extraHrReqApproved;
	}

	public void setExtrahrreqapproved(long extrahrreqapproved) {
		this.extraHrReqApproved = extrahrreqapproved;
	}

	public long getExtrahrreqdeclined() {
		return extraHrReqDeclined;
	}

	public void setExtrahrreqdeclined(long extrahrreqdeclined) {
		this.extraHrReqDeclined = extrahrreqdeclined;
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

	public long getPtoreqapproved() {
		return ptoReqApproved;
	}

	public void setPtoreqapproved(long ptoreqapproved) {
		this.ptoReqApproved = ptoreqapproved;
	}

	public long getPtoreqdeclined() {
		return ptoReqDeclined;
	}

	public void setPtoreqdeclined(long ptoreqdeclined) {
		this.ptoReqDeclined = ptoreqdeclined;
	}

	public long getPtoreqautoapproved() {
		return ptoReqAutoApproved;
	}

	public void setPtoreqautoapproved(long ptoreqautoapproved) {
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

	public long getAhtalert() {
		return ahtAlert;
	}

	public void setAhtalert(long ahtalert) {
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

	public long getProgramid() {
		return programId;
	}

	public void setProgramid(long programid) {
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

	@Override
	public String toString() {
		return "CommonDataEntity [id=" + id + ", ssactiveagents=" + ssActiveAgents + ", ssactivelastthirtydays="
				+ ssActiveLastThirtyDays + ", ssactivelastsevendays=" + ssActiveLastSevenDays + ", totalagent="
				+ totalAgent + ", totalagentparticipating=" + totalAgentParticipating + ", mtdactiveagent="
				+ mtdActiveAgent + ", wtdactiveagent=" + wtdActiveAgent + ", currentdayactivegent="
				+ currentDayActiveAgent + ", activelastthirtydays=" + activeLastThirtyDays + ", activelastsevendays="
				+ activeLastSevenDays + ", extrahrreqapproved=" + extraHrReqApproved + ", extrahrreqdeclined="
				+ extraHrReqDeclined + ", extrahrreqrtcwaiting=" + extraHrReqRtcWaiting + ", extrahrreqautoapproved="
				+ extraHrReqAutoApproved + ", extrahrhoursapproved=" + extraHrHoursApproved + ", extrahrhoursdeclined="
				+ extraHrHoursDeclined + ", extrahrhoursrtcwaiting=" + extraHrHoursRtcWaiting
				+ ", extrahrhourautoapproved=" + extraHrHourAutoApproved + ", extrahrrulercmdagent="
				+ extraHrRulerCmdAgent + ", extrahrrtcapproved=" + extraHrRtcApproved + ", extrahragtaccepted="
				+ extraHrAgtAccepted + ", extrahragtdecliend=" + extraHrAgtDecliend + ", extrahragtnores="
				+ extraHrAgtNores + ", vtoreqapproved=" + vtoReqApproved + ", vtoreqdeclined=" + vtoReqDeclined
				+ ", vtoreqrtcwaiting=" + vtoReqRtcWaiting + ", vtoreqautoapproved=" + vtoReqAutoApproved
				+ ", vtohoursapproved=" + vtoHoursApproved + ", vtohoursdeclined=" + vtoHoursDeclined
				+ ", vtohoursrtcwaiting=" + vtoHoursRtcWaiting + ", vtohourautoapproved=" + vtoHourAutoApproved
				+ ", vtohourrulercmdagent=" + vtoHourRulerCmdAgent + ", vtohourrtcapproved=" + vtoHourRtcApproved
				+ ", vtohouragtaccepted=" + vtoHourAgtAccepted + ", vtohouragtdecliend=" + vtoHourAgtDecliend
				+ ", vtohouragtnores=" + vtoHourAgtNores + ", ptoreqapproved=" + ptoReqApproved + ", ptoreqdeclined="
				+ ptoReqDeclined + ", ptoreqautoapproved=" + ptoReqAutoApproved + ", ptohoursapproved="
				+ ptoHoursApproved + ", ptohourautoapproved=" + ptoHourAutoApproved + ", ptohoursdeclined="
				+ ptoHoursDeclined + ", ttlswap=" + ttlSwap + ", ttlswaphr=" + ttlSwapHr + ", tradereq=" + tradeReq
				+ ", ttltrade_accepted=" + ttlTradeAccepted + ", ttltradehr=" + ttlTradeHr + ", schedulehr="
				+ scheduleHr + ", ahtalert=" + ahtAlert + ", aux1=" + aux1 + ", aux2=" + aux2 + ", aux3=" + aux3
				+ ", aux4=" + aux4 + ", aux5=" + aux5 + ", aux6=" + aux6 + ", aux7=" + aux7 + ", aux8=" + aux8
				+ ", aux9=" + aux9 + ", programid=" + programId + ", programname=" + programName + ", reportdate="
				+ reportDate + ", ctzdatetime=" + ctzDateTime + ", timezone=" + timeZone + "]";
	}

}
