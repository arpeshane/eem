/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nice.eem.dao;

import com.nice.eem.entity.EemIndividualCustomer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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
   
}
