package com.nice.eem.dao.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nice.eem.dao.EemCommonDao;
import com.nice.eem.dto.ProgramWiseDataDto;
import com.nice.eem.dto.SiteWiseDataDto;
import com.nice.eem.dto.SummaryReportDto;
import com.nice.eem.util.CommonUtil;
import com.nice.eem.util.EemProperties;

@Repository
public class EemCommonDaoImpl implements EemCommonDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private EemProperties eemProperties;

	@Override
	public List<ProgramWiseDataDto> getProgramWiseData(String customerName, Date ctzDate) {
		TypedQuery<ProgramWiseDataDto> query = entityManager.createQuery(eemProperties.getProgramDataQuery(), ProgramWiseDataDto.class);
		query.setParameter("entityName", customerName);
		query.setParameter("ctzDate", ctzDate);
		return query.getResultList();
	}

	@Override
	public List<SiteWiseDataDto> getSiteWiseData(String customerName, Date ctzDate) {
		TypedQuery<SiteWiseDataDto> query = entityManager.createQuery(eemProperties.getSiteDataQuery(), SiteWiseDataDto.class);
		query.setParameter(1, customerName);

		return query.getResultList();
	}

	@Override
	public List<SummaryReportDto> getSummaryReportData(String customerName, Date ctzDate) {
		String summaryReport = eemProperties.getSummaryReportQuery();
		Query query = entityManager
				.createNativeQuery("SELECT SUM(p.totalagent) AS totalAgent, SUM(p.totalagentparticipating) AS totalAgentParticipating, SUM(p.currentdayactivegent) AS currentDayActiveAgent, SUM(p.ssactiveagents) AS ssActiveAgents, SUM(p.schedulehr) AS scheduleHr, SUM(p.extrahrreqautoapproved) AS extraHrReqAutoApproved, SUM(p.extrahrhourautoapproved) AS extraHrHourAutoApproved, SUM(p.extrahrreqapproved) AS extraHrReqApproved, SUM(p.extrahrhoursapproved) AS extraHrHoursApproved, SUM(p.extrahrreqdeclined) AS extraHrReqDeclined, SUM(p.extrahrhoursdeclined) AS extraHrHoursDeclined, SUM(p.extrahrreqrtcwaiting) AS extraHrReqRtcWaiting, SUM(p.extrahrhoursrtcwaiting) AS extraHrHoursRtcWaiting, SUM(p.vtoreqautoapproved) AS vtoReqAutoApproved, SUM(p.vtohourautoapproved) AS vtoHourAutoApproved, SUM(p.vtoreqapproved) AS vtoReqApproved, SUM(p.vtohoursapproved) AS vtoHoursApproved, SUM(p.vtoreqdeclined) AS vtoReqDeclined, SUM(p.vtohoursdeclined) AS vtoHoursDeclined, SUM(p.vtoreqrtcwaiting) AS vtoReqRtcWaiting, SUM(p.vtohoursrtcwaiting) AS vtoHoursRtcWaiting, SUM(p.ttlswap) AS ttlSwap, SUM(p.ttlswaphr) AS ttlSwapHr, SUM(p.tradereq) AS tradeReq, SUM(p.ttltrade_accepted) AS ttlTradeAccepted, SUM(p.ttltradehr) AS ttlTradeHr, SUM(p.extrahrrulercmdagent) AS extraHrRulerCmdAgent, SUM(p.extrahrrtcapproved) AS extraHrRtcApproved, SUM(p.extrahragtaccepted) AS extraHrAgtAccepted, SUM(p.extrahragtdecliend) AS extraHrAgtDecliend, SUM(p.extrahragtnores) AS extraHrAgtNores, SUM(p.vtohourrulercmdagent) AS vtoHourRulerCmdAgent, SUM(p.vtohourrtcapproved) AS vtoHourRtcApproved, SUM(p.vtohouragtaccepted) AS vtoHourAgtAccepted, SUM(p.vtohouragtdecliend) AS vtoHourAgtDecliend, SUM(p.vtohouragtnores) AS vtoHourAgtNores FROM workflexdatastatus_amexcard p WHERE (p.ctzdatetime)>=:ctzDate",Tuple.class);
		query.setParameter("ctzDate", ctzDate);
		List<Tuple> results= query.getResultList();
		List<SummaryReportDto> resultList = CommonUtil.map(results);
		
		return resultList;

	}

}
