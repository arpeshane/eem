package com.nice.eem.dao;

import java.util.Date;
import java.util.List;

import com.nice.eem.dto.ProgramWiseDataDto;
import com.nice.eem.dto.SiteWiseDataDto;
import com.nice.eem.dto.SummaryReportDto;

/**
 * 
 * @author AJIT
 *
 */

public interface EemCommonDao {
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
	 * This method will return the list of program wise data.
	 * 
	 * @return
	 */
	public List<SummaryReportDto> getSummaryReportData(String customerName, Date ctzDate);
	
	
	
}
