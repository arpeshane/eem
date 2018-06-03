/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nice.eem.dao;

import com.nice.eem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author pooja.v
 */
public interface UserDao extends JpaRepository<User, Integer>{

   @Query("SELECT u FROM User u WHERE u.email = :email AND u.pass = :pass")
	   public User findUser(@Param("email") String email, @Param("pass") String pass);
   
}
