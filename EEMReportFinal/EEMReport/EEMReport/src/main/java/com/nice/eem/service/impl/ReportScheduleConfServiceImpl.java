/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nice.eem.service.impl;


import com.nice.eem.dao.ReportScheduleConfDetailRepository;
import com.nice.eem.entity.ReportSchedule;
import org.springframework.stereotype.Service;
import com.nice.eem.service.ReportScheduleConfService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author abhishek
 */
@Service
public class ReportScheduleConfServiceImpl implements ReportScheduleConfService{
    
    @Autowired
    ReportScheduleConfDetailRepository scheduleConfDetailRepository;

    @Override
    public ReportSchedule createReportConfiguration(ReportSchedule reportSchedule) {
        return scheduleConfDetailRepository.save(reportSchedule);
    }
    
   @Override
     public List<ReportSchedule> showReportConfiguration(){
         return (List<ReportSchedule>) scheduleConfDetailRepository.findAll();
     }
     
    @Override
     public ReportSchedule updateReportConfiguration(ReportSchedule reportSchedule){
         ReportSchedule reportScheduledata=scheduleConfDetailRepository.findOne(reportSchedule.getTask_id());
         reportScheduledata.setCustomer_id(reportSchedule.getCustomer_id());
         reportScheduledata.setTask_name(reportSchedule.getTask_name());
         reportScheduledata.setScheduled_time(reportSchedule.getScheduled_time());
         reportScheduledata.setReport_type(reportSchedule.getReport_type());
          return scheduleConfDetailRepository.save(reportScheduledata);
     }
    
}
