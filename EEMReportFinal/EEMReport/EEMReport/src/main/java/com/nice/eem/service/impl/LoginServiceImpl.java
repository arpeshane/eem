/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nice.eem.service.impl;

import com.nice.eem.entity.UserLogin;
import org.springframework.stereotype.Service;
import com.nice.eem.service.LoginService;
import java.util.Hashtable;
import javax.naming.AuthenticationException;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author abhishek
 */
@Service
public class LoginServiceImpl implements LoginService{
     @Value("${ldap.urls}")
	private String ldapUrls;
	
	
	@Value("${ldap.base.dn}")
	private String ldapBaseDn;
	
	@Value("${ldap.user.dn.pattern}")
	private String ldapUserDnPattern;
  

    
    @Override
    public String login(UserLogin user) {
        String result="{\"error\":\"faild\"}";
        DirContext authContext =null;
        String ldapSecurityPrincipal=ldapUserDnPattern+"="+user.getUsername()+","+ldapBaseDn;
        String ldapPrincipalPassword=user.getPassword();
        Hashtable authEnv = new Hashtable(11);
        authEnv.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        authEnv.put(Context.PROVIDER_URL, ldapUrls);
        authEnv.put(Context.SECURITY_AUTHENTICATION, "simple");
        authEnv.put(Context.SECURITY_PRINCIPAL, ldapSecurityPrincipal);
        authEnv.put(Context.SECURITY_CREDENTIALS, ldapPrincipalPassword);
        try {
            authContext = new InitialDirContext(authEnv);
            if (authContext != null) {
                result = "{\"success\":\"loginsuccess\"}";
                System.out.println("=========Authentication successfully===========");
            } else {
                System.out.println("Authentication failed!");
            }
        } catch (AuthenticationException authEx) {
            System.out.println("Authentication failed! "+authEx);
            authEx.printStackTrace();
            
        } catch (NamingException namEx) {
            System.out.println("NamingException found on ldap! "+namEx);
            namEx.printStackTrace();
        } catch (Exception Ex) {
            System.out.println("Exception Occured "+Ex);
            Ex.printStackTrace();
        } finally {
            try {
                if (authContext != null) {
                    authContext.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
  }
}
