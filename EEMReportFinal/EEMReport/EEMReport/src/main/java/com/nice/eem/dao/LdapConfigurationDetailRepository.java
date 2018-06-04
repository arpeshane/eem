/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nice.eem.dao;

import com.nice.eem.entity.LdapConfiguration;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author abhishek
 */
public interface LdapConfigurationDetailRepository extends CrudRepository<LdapConfiguration, Integer> {
    
}
