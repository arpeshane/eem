package com.nice.eem.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nice.eem.dao.EemCommonDao;
import com.nice.eem.dto.ProgramWiseDataDto;
import com.nice.eem.dto.SiteWiseDataDto;
import com.nice.eem.dto.SummaryReportDto;
import com.nice.eem.service.EemCommonService;
import com.nice.eem.util.EemProperties;

@Service
public class EemCommonServiceImpl implements EemCommonService {

	@Autowired
	private EemProperties eemProperties;

	@Autowired
	private EemCommonDao eemCommonDao;

	@Override
	public List<ProgramWiseDataDto> getProgramWiseData(String customerName, Date ctzDate) {

		List<ProgramWiseDataDto> programWiseData = eemCommonDao.getProgramWiseData(customerName, ctzDate);
		return programWiseData;
	}

	@Override
	public List<SiteWiseDataDto> getSiteWiseData(String customerName, Date ctzDate) {

		List<SiteWiseDataDto> siteWiseData = eemCommonDao.getSiteWiseData(customerName, ctzDate);

		return siteWiseData;
	}

	@Override
	public List<SummaryReportDto> getSummaryReportData(String customerName, Date ctzDate) {

		List<SummaryReportDto> summaryReportData = eemCommonDao.getSummaryReportData(customerName, ctzDate);
		return summaryReportData;
	}

	/**
	 * 
	 * @param ctzDate
	 * @return
	 */
	public List<List<SummaryReportDto>> getSummaryReportsForAllCustomers(Date ctzDate) {
		List<List<SummaryReportDto>> allSummaryReports = new ArrayList<List<SummaryReportDto>>();
		List<String> customerNames = eemProperties.getCustomerNames();
		for (String customerName : customerNames) {
			List<SummaryReportDto> summaryReportData = getSummaryReportData(customerName, ctzDate);
			allSummaryReports.add(summaryReportData);
		}
		return allSummaryReports;
	}

}
