/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nice.eem.service.impl;

import com.nice.eem.dao.LdapConfigurationDetailRepository;
import com.nice.eem.entity.LdapConfiguration;
import com.nice.eem.service.LdapconfigureService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author abhishek
 */
@Service

public class LdapconfigureServiceImpl implements LdapconfigureService {
     @Autowired
    LdapConfigurationDetailRepository ldapConfigurationDetailRepository;
     @Override
          public boolean saveLdapConfigration(LdapConfiguration ldapConfiguration){
            ldapConfigurationDetailRepository.save(ldapConfiguration);
            return true;
        }
     @Override
     public List<LdapConfiguration> getLdapConfigurationDetails(){
         return (List<LdapConfiguration>) ldapConfigurationDetailRepository.findAll();
     }
     
    @Override
     public LdapConfiguration getLdapConfigurationDetailsById(Integer id){
         //return ldapConfigurationDetailRepository.findById(id);
         return ldapConfigurationDetailRepository.findOne(id);
     }
 
     
     @Override
      public void updatedapConfigurationDetailsById(LdapConfiguration ldapConfiguration, @PathVariable int id){
          LdapConfiguration ldapConfiguration1;
          ldapConfiguration1=(LdapConfiguration)getLdapConfigurationDetailsById(id);
          ldapConfiguration1.setServerurl(ldapConfiguration.getServerurl());
          ldapConfiguration1.setBasedn(ldapConfiguration.getBasedn());
          ldapConfiguration1.setUsername(ldapConfiguration.getUsername());
          ldapConfiguration1.setPassword(ldapConfiguration.getPassword());
          ldapConfiguration1.setUserdnpattern(ldapConfiguration.getUserdnpattern());
          ldapConfigurationDetailRepository.save(ldapConfiguration1);
      }
      
       @Override
      public void deleteldapConfigurationDetails(@PathVariable int id){
          ldapConfigurationDetailRepository.delete(id);
      }
    
}
