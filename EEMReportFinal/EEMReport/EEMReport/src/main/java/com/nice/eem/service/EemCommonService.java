package com.nice.eem.service;

import java.util.Date;
import java.util.List;

import com.nice.eem.dto.ProgramWiseDataDto;
import com.nice.eem.dto.SiteWiseDataDto;
import com.nice.eem.dto.SummaryReportDto;

public interface EemCommonService {

	/**
	 * This method will return the list of program wise data.
	 * 
	 * @return
	 */
	public List<ProgramWiseDataDto> getProgramWiseData(String customerName, Date ctzDate);

	/**
	 * This method will return the list of site wise data.
	 * 
	 * @return
	 */
	public List<SiteWiseDataDto> getSiteWiseData(String customerName, Date ctzDate);
	
	/**
	 * This method will return the list of summary report data.
	 * 
	 * @return
	 */
	public List<SummaryReportDto> getSummaryReportData(String customerName, Date ctzDate);
	
	/**
	 * This method is used to load all customers data to generate the summary report 
	 * @param ctzDate
	 * @return
	 */
	public List<List<SummaryReportDto>> getSummaryReportsForAllCustomers(Date ctzDate);
}
