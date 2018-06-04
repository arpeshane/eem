package com.nice.eem.controller.rest;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nice.eem.dto.ProgramWiseDataDto;
import com.nice.eem.dto.SiteWiseDataDto;
import com.nice.eem.entity.EemIndividualCustomer;
import com.nice.eem.entity.LdapConfiguration;
import com.nice.eem.entity.UserLogin;
import com.nice.eem.service.IndividualCustService;
import com.nice.eem.service.LdapconfigureService;
import com.nice.eem.service.LoginService;
import com.nice.eem.service.ProgramWiseDataService;
import com.nice.eem.service.SiteWiseDataService;

/**
 * 
 * @author ajit.p
 *
 */

@RestController
@CrossOrigin(origins = "*")
@RequestMapping({ "/eem" })
public class CustomerDataRestController {

	@Autowired
	ProgramWiseDataService programWiseDataService;

	@Autowired
	SiteWiseDataService siteWiseDataService;

	@Autowired
	LoginService loginService;

	@Autowired
	IndividualCustService custService;

	@Autowired
	LdapconfigureService ldapconfigureService;

	/**
	 * @author ajit.p
	 * @return Programwise Data
	 */
	@RequestMapping(value = "/programwise", method = RequestMethod.GET)
	public List<ProgramWiseDataDto> viewHome() {
		return programWiseDataService.findAllProgramWiseData();
	}

	/**
	 * @author ajit.p
	 * @return Sitewise Data
	 */
	@RequestMapping(value = "/sitewise", method = RequestMethod.GET)
	public List<SiteWiseDataDto> viewHomeRest() {
		return siteWiseDataService.findAllSiteWiseData();
	}

	@RequestMapping(value = "/updatecust", method = RequestMethod.POST)
	public EemIndividualCustomer updateCustomer(@RequestBody EemIndividualCustomer cust) {
		return custService.update(cust);
	}

	@RequestMapping(value = "/addldapconfiguration", method = RequestMethod.POST)
	public ResponseEntity<Void> saveLdapConfigration(@RequestBody LdapConfiguration ldapConfiguration) {
		boolean flag = ldapconfigureService.saveLdapConfigration(ldapConfiguration);
		if (flag == false) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@RequestMapping(value = "/viewldapconfiguration", method = RequestMethod.GET)
	public ResponseEntity<List<LdapConfiguration>> getLdapConfigurationDetails() {
		List<LdapConfiguration> ldapConfigurationslist = ldapconfigureService.getLdapConfigurationDetails();
		return new ResponseEntity<List<LdapConfiguration>>(ldapConfigurationslist, HttpStatus.OK);
	}

	@RequestMapping(value = "/editldapconfiguration/{id}", method = RequestMethod.GET)
	public LdapConfiguration getLdapConfigurationDetailsById(@PathVariable Integer id) {
		return ldapconfigureService.getLdapConfigurationDetailsById(id);
	}

	@RequestMapping(value = "/updatecustomerbyid/{id}", method = RequestMethod.PUT)
	public ResponseEntity<LdapConfiguration> updatedapConfigurationDetailsById(
			@RequestBody LdapConfiguration ldapConfiguration, @PathVariable int id) {
		ldapconfigureService.updatedapConfigurationDetailsById(ldapConfiguration, id);
		return new ResponseEntity<LdapConfiguration>(ldapConfiguration, HttpStatus.OK);
	}

	@RequestMapping(value = "/deletecustomerbyid/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteLdapCpnfiguration(@PathVariable int id) {
		ldapconfigureService.deleteldapConfigurationDetails(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	/**
	 * Created By Pooja to save Customer
	 * 
	 * @param cust
	 * @return
	 */
	@RequestMapping(value = "/createcust", method = RequestMethod.POST)
	public EemIndividualCustomer create(@RequestBody EemIndividualCustomer cust) {
		return custService.createCustomer(cust);
	}

	/**
	 * Cretaed By Pooja
	 * 
	 * @return All customers list
	 */
	@RequestMapping(value = "/getcust", method = RequestMethod.GET)
	public List viewIndCust() {
		return custService.getCustomers();
	}


        /**
         * Created By Abhishek to ldap Login authentication
         * @param userLogin
         * @return 
         */
        
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestBody UserLogin userLogin) {
        return loginService.login(userLogin);
    }

	/**
	 * Created By pooja to update the customer
	 * 
	 * @param cust
	 * @return
	 */
	@RequestMapping(value = "/genreport/{custid}", method = RequestMethod.GET)
	public List getCustomerEmail(@PathVariable Long custid) {
		return custService.getCustomerEmail(custid);
	}

//	@RequestMapping(value = "/custname", method = RequestMethod.GET)
//	public List getCustomerName() {
//		return custService.getCustomerName();
//	}

	@RequestMapping(value = "/getmaillist/{custId}", method = RequestMethod.GET)
	public List sendMailsToList(@PathVariable Long custId) {
	
		List<Map<String, List<String>>> listCustomerMails = custService.getCustomerEmail(custId);
		for (Map<String, List<String>> mapMailAndAlertTo : listCustomerMails) {

			Set<Map.Entry<String, List<String>>> entrySet = mapMailAndAlertTo.entrySet();

			for (Map.Entry<String, List<String>> mapEntry : entrySet) {
				System.out.println("Key is : " + mapEntry.getKey());
				System.out.println("Value is : " + mapEntry.getValue());
	
			}
		}
		return listCustomerMails;
	}

}
