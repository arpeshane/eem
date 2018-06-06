/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nice.eem.service;
import com.nice.eem.entity.ReportSchedule;
import java.util.List;

/**
 *
 * @author abhishek
 */
public interface ReportScheduleConfService {
    public ReportSchedule createReportConfiguration(ReportSchedule reportSchedule);
    public List<ReportSchedule> showReportConfiguration();
    public ReportSchedule updateReportConfiguration(ReportSchedule reportSchedule);
}
