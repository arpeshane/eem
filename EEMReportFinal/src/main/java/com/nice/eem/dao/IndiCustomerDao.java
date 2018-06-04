/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nice.eem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nice.eem.entity.EemIndividualCustomer;

/**
 *
 * @author pooja.v
 */
public interface IndiCustomerDao extends JpaRepository<EemIndividualCustomer, Long>{
   @Override
   public EemIndividualCustomer save(EemIndividualCustomer cust);
   /**
    * @author AJIT
    * @param custName
    * @return
    */
   public EemIndividualCustomer findEemIndividualCustomerByCustName(String custName);
   
   @Query("select EemIndividualCustomer c from EemIndividualCustomer c where c.custStatus = 1")
   public List<EemIndividualCustomer> getActiveCustomerList();
   
   @Query("select c.weekStartDay from EemIndividualCustomer c where c.custName = :custName")
   public String getCustomerWiseWeekStartDay(@Param("custName") String custName);
}
