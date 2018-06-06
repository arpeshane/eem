/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nice.eem.service;

import com.nice.eem.entity.EemIndividualCustomer;
import java.util.List;

/**
 *
 * @author pooja.v
 */
public interface IndividualCustService{
  
       public EemIndividualCustomer createCustomer(EemIndividualCustomer cust);
       public EemIndividualCustomer update(EemIndividualCustomer cust);
       public List getCustomers();
       public List getCustomerEmail(Long custid);
       public List getCustomerName();
       public String getCustomerStartDay(String custName);
       public List<EemIndividualCustomer> getActiveCustomers();
       /**
        * @author AJIT  
        * @param custName
        * @return
        */
       public EemIndividualCustomer findByCustName(String custName); 

}
