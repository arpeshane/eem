/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nice.eem.dao;

import org.springframework.data.repository.CrudRepository;
import com.nice.eem.entity.ReportSchedule;

/**
 *
 * @author abhishek
 */
public interface ReportScheduleConfDetailRepository extends CrudRepository<ReportSchedule,Integer> {
    
}
