/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nice.eem.service;

import com.nice.eem.entity.LdapConfiguration;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author abhishek
 */
public interface LdapconfigureService {
    public boolean saveLdapConfigration(@RequestBody LdapConfiguration ldapConfiguration);

    public List<LdapConfiguration> getLdapConfigurationDetails();

    public LdapConfiguration getLdapConfigurationDetailsById(Integer id);

    public void updatedapConfigurationDetailsById(@RequestBody LdapConfiguration ldapConfiguration, @PathVariable int id);

    public void deleteldapConfigurationDetails(@PathVariable int id);
}
