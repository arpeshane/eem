/**
 * 
 */
package com.nice.eem.excelutil;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFDataFormat;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nice.eem.constants.EemConstants;
import com.nice.eem.dto.ProgramWiseDataDto;
import com.nice.eem.dto.SiteWiseDataDto;
import com.nice.eem.dto.SummaryReportDto;
import com.nice.eem.service.ProgramWiseDataService;
import com.nice.eem.util.CommonUtil;
import com.nice.eem.util.ExcelUtil;

/**
 * @author ajit.p
 *
 */
@Component
public class ExcelSheetCreation {

	@Autowired
	ProgramWiseDataService programWiseDataService;

	/**
	 * @author ajit.p
	 * @param siteAgents
	 * @param workbook
	 * @param sheetNumber
	 */
	public void createSiteWiseSheet(List<SiteWiseDataDto> siteAgents, Workbook workbook, int sheetNumber) {

		// create excel xls sheet Site Wise Data
		Sheet siteSheet = workbook.getSheetAt(sheetNumber);
		siteSheet.setDefaultColumnWidth(30);
		int rowCountSite = 1;
		for (SiteWiseDataDto agent : siteAgents) {

			Row userRow = siteSheet.createRow(rowCountSite++);
			userRow.createCell(0).setCellValue(agent.getProgramName());

			Cell dateCell = userRow.createCell(1);
			dateCell.setCellValue(agent.getCtzDateTime());
			CellStyle cellStyle = workbook.createCellStyle();
			XSSFDataFormat hsfd = (XSSFDataFormat) workbook.createDataFormat();
			cellStyle.setDataFormat(hsfd.getFormat("dd/mm/yy hh:mm"));
			dateCell.setCellStyle(cellStyle);

			userRow.createCell(2).setCellValue(agent.getSsActiveAgents());
			userRow.createCell(3).setCellValue(agent.getTotalAgent());
			userRow.createCell(4).setCellValue(agent.getTotalAgentParticipating());
			userRow.createCell(5).setCellValue(agent.getExtraHrReqApproved());
			userRow.createCell(6).setCellValue(agent.getExtraHrReqDeclined());
			userRow.createCell(7).setCellValue(agent.getExtraHrReqAutoApproved());
			userRow.createCell(8).setCellValue(agent.getExtraHrHoursApproved());
			userRow.createCell(9).setCellValue(agent.getExtraHrHoursDeclined());
			userRow.createCell(10).setCellValue(agent.getExtraHrHourAutoApproved());
			userRow.createCell(11).setCellValue(agent.getExtraHrRulerCmdAgent());
			userRow.createCell(12).setCellValue(agent.getExtraHrRtcApproved());
			userRow.createCell(13).setCellValue(agent.getExtraHrAgtAccepted());
			userRow.createCell(14).setCellValue(agent.getExtraHrAgtDecliend());
			userRow.createCell(15).setCellValue(agent.getExtraHrAgtNores());
			userRow.createCell(16).setCellValue(agent.getVtoReqApproved());
			userRow.createCell(17).setCellValue(agent.getVtoReqDeclined());
			userRow.createCell(18).setCellValue(agent.getVtoReqAutoApproved());
			userRow.createCell(19).setCellValue(agent.getVtoHoursApproved());
			userRow.createCell(20).setCellValue(agent.getVtoHoursDeclined());
			userRow.createCell(21).setCellValue(agent.getVtoHourAutoApproved());
			userRow.createCell(22).setCellValue(agent.getVtoHourRulerCmdAgent());
			userRow.createCell(23).setCellValue(agent.getVtoHourRtcApproved());
			userRow.createCell(24).setCellValue(agent.getVtoHourAgtAccepted());
			userRow.createCell(25).setCellValue(agent.getVtoHourAgtDecliend());
			userRow.createCell(26).setCellValue(agent.getVtoHourAgtNores());
			userRow.createCell(27).setCellValue(agent.getTtlSwap());
			userRow.createCell(28).setCellValue(agent.getTtlSwapHr());
			userRow.createCell(29).setCellValue(agent.getTradeReq());
			userRow.createCell(30).setCellValue(agent.getTtlTradeAccepted());
			userRow.createCell(31).setCellValue(agent.getTtlTradeHr());
			userRow.createCell(32).setCellValue(agent.getScheduleHr());
			userRow.createCell(33).setCellValue(agent.getCurrentDayActiveAgent());
			userRow.createCell(34).setCellValue(agent.getExtraHrReqRtcWaiting());
			userRow.createCell(35).setCellValue(agent.getExtraHrHoursRtcWaiting());
			userRow.createCell(36).setCellValue(agent.getVtoReqRtcWaiting());
			userRow.createCell(37).setCellValue(agent.getVtoHoursRtcWaiting());
			userRow.createCell(38).setCellValue(agent.getSiteId());
			userRow.createCell(39).setCellValue(agent.getSiteName());
		}
	}

	/**
	 * @author ajit.p
	 * @param programWiseDataDto
	 *            generate program wise sheet
	 */
	public void createProgramWiseSheet(List<ProgramWiseDataDto> programAgents, Workbook workbook, int sheetNumber) {
		// create excel xls sheet Program Wise Data
		Sheet programSheet = workbook.getSheetAt(sheetNumber);
		programSheet.setDefaultColumnWidth(30);

		int rowCount = 1;
		for (ProgramWiseDataDto agent : programAgents) {

			Row userRow = programSheet.createRow(rowCount++);
			userRow.createCell(0).setCellValue(agent.getProgramname());

			Cell dateCell = userRow.createCell(1);
			dateCell.setCellValue(agent.getCtzdatetime());

			CellStyle cellStyle = workbook.createCellStyle();
			XSSFDataFormat hsfd = (XSSFDataFormat) workbook.createDataFormat();
			cellStyle.setDataFormat(hsfd.getFormat("dd/mm/yy hh:mm"));
			dateCell.setCellStyle(cellStyle);

			userRow.createCell(2).setCellValue(agent.getSsactiveagents());
			userRow.createCell(3).setCellValue(agent.getTotalagent());
			userRow.createCell(4).setCellValue(agent.getTotalagentparticipating());
			userRow.createCell(5).setCellValue(agent.getExtrahrreqapproved());
			userRow.createCell(6).setCellValue(agent.getExtrahrreqdeclined());
			userRow.createCell(7).setCellValue(agent.getExtrahrreqautoapproved());
			userRow.createCell(8).setCellValue(agent.getExtrahrhoursapproved());
			userRow.createCell(9).setCellValue(agent.getExtrahrhoursdeclined());
			userRow.createCell(10).setCellValue(agent.getExtrahrhourautoapproved());
			userRow.createCell(11).setCellValue(agent.getExtrahrrulercmdagent());
			userRow.createCell(12).setCellValue(agent.getExtrahrrtcapproved());
			userRow.createCell(13).setCellValue(agent.getExtrahragtaccepted());
			userRow.createCell(14).setCellValue(agent.getExtrahragtdecliend());
			userRow.createCell(15).setCellValue(agent.getExtrahragtnores());
			userRow.createCell(16).setCellValue(agent.getVtoreqapproved());
			userRow.createCell(17).setCellValue(agent.getVtoreqdeclined());
			userRow.createCell(18).setCellValue(agent.getVtoreqautoapproved());
			userRow.createCell(19).setCellValue(agent.getVtohoursapproved());
			userRow.createCell(20).setCellValue(agent.getVtohoursdeclined());
			userRow.createCell(21).setCellValue(agent.getVtohourautoapproved());
			userRow.createCell(22).setCellValue(agent.getVtohourrulercmdagent());
			userRow.createCell(23).setCellValue(agent.getVtohourrtcapproved());
			userRow.createCell(24).setCellValue(agent.getVtohouragtaccepted());
			userRow.createCell(25).setCellValue(agent.getVtohouragtdecliend());
			userRow.createCell(26).setCellValue(agent.getVtohouragtnores());
			userRow.createCell(27).setCellValue(agent.getTtlswap());
			userRow.createCell(28).setCellValue(agent.getTtlswaphr());
			userRow.createCell(29).setCellValue(agent.getTradereq());
			userRow.createCell(30).setCellValue(agent.getTtltrade_accepted());
			userRow.createCell(31).setCellValue(agent.getTtltradehr());
			userRow.createCell(32).setCellValue(agent.getSchedulehr());
			userRow.createCell(33).setCellValue(agent.getCurrentdayactivegent());
			userRow.createCell(34).setCellValue(agent.getExtrahrreqrtcwaiting());
			userRow.createCell(35).setCellValue(agent.getExtrahrhoursrtcwaiting());
			userRow.createCell(36).setCellValue(agent.getVtoreqrtcwaiting());
			userRow.createCell(37).setCellValue(agent.getVtohoursrtcwaiting());

		}
	}

	/**
	 * @author AJIT
	 * @param programAgents
	 * @param workbook
	 * @param sheetNumber
	 *            create sheet for Summary report.
	 */
	public void createSummaryReport(SummaryReportDto summaryReportDto, Workbook workbook, int sheetNumber) {
		Sheet summarySheet = workbook.getSheetAt(sheetNumber);
		XSSFFormulaEvaluator.evaluateAllFormulaCells(workbook);
		summarySheet.setDefaultColumnWidth(30);
		int column = EemConstants.DL;

		summarySheet.getRow(2).createCell(column).setCellValue(summaryReportDto.getTotalAgent());
		summarySheet.getRow(3).createCell(column).setCellValue(summaryReportDto.getTotalAgentParticipating());
		summarySheet.getRow(4).createCell(column).setCellValue(summaryReportDto.getCurrentDayActiveAgent());
		summarySheet.getRow(5).createCell(column).setCellValue(summaryReportDto.getSsActiveAgents());

		Cell percentCell = summarySheet.getRow(6).createCell(column);
		percentCell.setCellValue(summaryReportDto.getScheduleChangeToLoggedInAgents());
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setDataFormat(workbook.createDataFormat().getFormat("0.00%"));
		percentCell.setCellStyle(cellStyle);

		summarySheet.getRow(11).createCell(column).setCellValue(summaryReportDto.getScheduleHr());
		summarySheet.getRow(15).createCell(column).setCellValue(summaryReportDto.getExtraHrRequest());
		summarySheet.getRow(16).createCell(column).setCellValue(summaryReportDto.getExtraHrTotal());
		summarySheet.getRow(17).createCell(column).setCellValue(summaryReportDto.getExtraHrReqAutoApproved());
		summarySheet.getRow(18).createCell(column).setCellValue(summaryReportDto.getExtraHrHourAutoApproved());
		summarySheet.getRow(19).createCell(column).setCellValue(summaryReportDto.getExtraHrReqApproved());
		summarySheet.getRow(20).createCell(column).setCellValue(summaryReportDto.getExtraHrHoursApproved());
		summarySheet.getRow(21).createCell(column).setCellValue(summaryReportDto.getExtraHrReqDeclined());
		summarySheet.getRow(22).createCell(column).setCellValue(summaryReportDto.getExtraHrHoursDeclined());
		summarySheet.getRow(23).createCell(column).setCellValue(summaryReportDto.getExtraHrReqRtcWaiting());
		summarySheet.getRow(26).createCell(column).setCellValue(summaryReportDto.getVtoHrRequest());
		summarySheet.getRow(27).createCell(column).setCellValue(summaryReportDto.getVtoHrTotal());
		summarySheet.getRow(28).createCell(column).setCellValue(summaryReportDto.getVtoReqAutoApproved());
		summarySheet.getRow(29).createCell(column).setCellValue(summaryReportDto.getVtoHourAutoApproved());

		summarySheet.getRow(30).createCell(column).setCellValue(summaryReportDto.getVtoReqApproved());
		summarySheet.getRow(31).createCell(column).setCellValue(summaryReportDto.getVtoHoursApproved());
		summarySheet.getRow(32).createCell(column).setCellValue(summaryReportDto.getVtoReqDeclined());
		summarySheet.getRow(33).createCell(column).setCellValue(summaryReportDto.getVtoHoursDeclined());
		summarySheet.getRow(34).createCell(column).setCellValue(summaryReportDto.getVtoReqRtcWaiting());
		summarySheet.getRow(35).createCell(column).setCellValue(summaryReportDto.getVtoHoursRtcWaiting());

	}
/**
 * @author ajit.p
 * @param summaryReportDtos
 * @param workbook
 * @param sheetNumber
 */
	public void createSummaryReport(List<SummaryReportDto> summaryReportDtos, Workbook workbook, int sheetNumber) {
		Sheet summarySheet = workbook.getSheetAt(sheetNumber);
		XSSFFormulaEvaluator.evaluateAllFormulaCells(workbook);
		summarySheet.setDefaultColumnWidth(30);
		
		int column = EemConstants.DL;
		for (SummaryReportDto summaryReportDto : summaryReportDtos) {
			// creating header of date format
			summarySheet.getRow(0).getCell(column).setCellValue(CommonUtil.convertDateToReportDate(summaryReportDto.getCtzDateTime()));
			summarySheet.getRow(1).getCell(column).setCellValue(CommonUtil.convertDateToReportDay(summaryReportDto.getCtzDateTime()));

			// values for summary sheet.
			summarySheet.getRow(2).createCell(column).setCellValue(summaryReportDto.getTotalAgent());
			summarySheet.getRow(3).createCell(column).setCellValue(summaryReportDto.getTotalAgentParticipating());
			summarySheet.getRow(4).createCell(column).setCellValue(summaryReportDto.getCurrentDayActiveAgent());
			summarySheet.getRow(5).createCell(column).setCellValue(summaryReportDto.getSsActiveAgents());
			// cells to be filled by calculations 
			summarySheet.getRow(6).getCell(column).setCellValue(ExcelUtil.getSummaryReportDto(summaryReportDto).getScheduleChangeToLoggedInAgents());
			summarySheet.getRow(7).getCell(column).setCellValue(ExcelUtil.getSummaryReportDto(summaryReportDto).getScheduleModifyReqPerAgent());
			summarySheet.getRow(8).getCell(column).setCellValue(ExcelUtil.getSummaryReportDto(summaryReportDto).getScheduleModifyHoursPerAgents());
			// scheduled hours
			summarySheet.getRow(11).createCell(column).setCellValue(summaryReportDto.getScheduleHr());
			//Self service Extra Hours
			summarySheet.getRow(15).createCell(column).setCellValue(summaryReportDto.getExtraHrRequest());
			summarySheet.getRow(16).createCell(column).setCellValue(summaryReportDto.getExtraHrTotal());
			summarySheet.getRow(17).createCell(column).setCellValue(summaryReportDto.getExtraHrReqAutoApproved());
			summarySheet.getRow(18).createCell(column).setCellValue(summaryReportDto.getExtraHrHourAutoApproved());
			summarySheet.getRow(19).createCell(column).setCellValue(summaryReportDto.getExtraHrReqApproved());
			summarySheet.getRow(20).createCell(column).setCellValue(summaryReportDto.getExtraHrHoursApproved());
			summarySheet.getRow(21).createCell(column).setCellValue(summaryReportDto.getExtraHrReqDeclined());
			summarySheet.getRow(22).createCell(column).setCellValue(summaryReportDto.getExtraHrHoursDeclined());
			summarySheet.getRow(23).createCell(column).setCellValue(summaryReportDto.getExtraHrReqRtcWaiting());
			// Self service Time Off
			summarySheet.getRow(26).createCell(column).setCellValue(summaryReportDto.getVtoHrRequest());
			summarySheet.getRow(27).createCell(column).setCellValue(summaryReportDto.getVtoHrTotal());
			summarySheet.getRow(28).createCell(column).setCellValue(summaryReportDto.getVtoReqAutoApproved());
			summarySheet.getRow(29).createCell(column).setCellValue(summaryReportDto.getVtoHourAutoApproved());
			summarySheet.getRow(30).createCell(column).setCellValue(summaryReportDto.getVtoReqApproved());
			summarySheet.getRow(31).createCell(column).setCellValue(summaryReportDto.getVtoHoursApproved());
			summarySheet.getRow(32).createCell(column).setCellValue(summaryReportDto.getVtoReqDeclined());
			summarySheet.getRow(33).createCell(column).setCellValue(summaryReportDto.getVtoHoursDeclined());
			summarySheet.getRow(34).createCell(column).setCellValue(summaryReportDto.getVtoReqRtcWaiting());
			// Self service Swap And Trade
			summarySheet.getRow(37).createCell(column).setCellValue(summaryReportDto.getTtlSwap());
			summarySheet.getRow(38).createCell(column).setCellValue(summaryReportDto.getTtlSwapHr());
			summarySheet.getRow(39).createCell(column).setCellValue(summaryReportDto.getTradeReq());
			summarySheet.getRow(40).createCell(column).setCellValue(summaryReportDto.getTtlTradeAccepted());
			summarySheet.getRow(41).createCell(column).setCellValue(summaryReportDto.getTtlTradeHr());
			
			column++;
		}
	}
	

}
