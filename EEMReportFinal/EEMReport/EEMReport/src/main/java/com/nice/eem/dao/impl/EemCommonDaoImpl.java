package com.nice.eem.dao.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nice.eem.constants.EemConstants;
import com.nice.eem.dao.EemCommonDao;
import com.nice.eem.dto.ProgramWiseDataDto;
import com.nice.eem.dto.SiteWiseDataDto;
import com.nice.eem.dto.SummaryReportDto;
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
		String summaryReportQuery = eemProperties.getSummaryReportQuery();
		Query query = entityManager.createNativeQuery(eemProperties.setQueryValues(summaryReportQuery, customerName), EemConstants.SUMMARY_REPORT_MAPPING);
		query.setParameter("ctzDate", ctzDate);
		List<SummaryReportDto> summaryReportData = query.getResultList();
		return summaryReportData;

	}

}
