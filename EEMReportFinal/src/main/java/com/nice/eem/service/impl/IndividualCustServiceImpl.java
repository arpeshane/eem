/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nice.eem.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nice.eem.dao.IndiCustomerDao;
import com.nice.eem.entity.EemIndividualCustomer;
import com.nice.eem.service.IndividualCustService;
import com.nice.eem.util.PropertyLoader;

/**
 *
 * @author pooja.v
 */
@Service
public class IndividualCustServiceImpl implements IndividualCustService {
	@Autowired
	private IndiCustomerDao indCustDao;

	@Override
	public EemIndividualCustomer update(EemIndividualCustomer cust) {
		EemIndividualCustomer customer = indCustDao.getOne(cust.getCustomerId());
		customer.setCustName(cust.getCustName());
		customer.setCustMailId(cust.getCustMailId());
		customer.setWeekStartDay(cust.getWeekStartDay());
		customer.setWeekEndDay(cust.getWeekEndDay());
		customer.setCustStatus(cust.getCustStatus());
		customer.setEmailReportTo(cust.getEmailReportTo());
		customer.setEmailAlertsTo(cust.getEmailAlertsTo());
		customer.setCreatedDate(new Date());
		customer.setCustDeactivationDate(new Date());
		customer.setDailyScheduledTime(new Date());
		return indCustDao.save(customer);

	}

	@Override
	public EemIndividualCustomer createCustomer(EemIndividualCustomer cust) {
		cust.setCreatedDate(new Date());
		cust.setCustDeactivationDate(new Date());
		cust.setDailyScheduledTime(new Date());
		return indCustDao.save(cust);
	}

	@Override
	public List getCustomers() {
		return indCustDao.findAll();
	}

	@Override
	public List<Map<String, String[]>> getCustomerEmail(Long custid) {

		EemIndividualCustomer customer = indCustDao.getOne(custid);
		List<Map<String, String[]>> emailList = new ArrayList<Map<String, String[]>>();
		Map<String, String[]> emailMap = new HashMap<String, String[]>();
		try {
			if (customer != null) {
				// Get customers email for sending reports
				String emails = customer.getEmailReportTo();
				// Get customers email for sending alerts or logs
				String alerts = customer.getEmailAlertsTo();

				emailMap.put("reportmail", emails.split(","));
				emailMap.put("alertmail", alerts.split(","));
			}
			emailList.add(emailMap);
			return emailList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List getCustomerName() {
		Properties pts = PropertyLoader.loadProperties("eem.properties");
		List<String> customerList = new ArrayList<String>();
		try {
			String custname = pts.getProperty("customer");
			if (custname != null) {
				customerList.addAll(Arrays.asList(custname.split(",")));

			}
			return customerList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public EemIndividualCustomer findByCustName(String custName) {

		EemIndividualCustomer eemIndividualCustomer = indCustDao.findEemIndividualCustomerByCustName(custName);
		
		return eemIndividualCustomer;
	}

}
