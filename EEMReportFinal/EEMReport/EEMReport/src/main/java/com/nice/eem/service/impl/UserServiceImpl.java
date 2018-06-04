/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nice.eem.service.impl;


import com.nice.eem.entity.User;
import com.nice.eem.dao.UserDao;
import com.nice.eem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author pooja.v
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(User user) {
           if(userDao.findUser(user.getEmail(), user.getPass())!=null)
            return userDao.findUser(user.getEmail(), user.getPass());
            else
                return null;
   }

}
