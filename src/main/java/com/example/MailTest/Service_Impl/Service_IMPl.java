package com.example.MailTest.Service_Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.example.MailTest.Entity.User_test;
import com.example.MailTest.Repo.User_Repo;
import com.example.MailTest.Service.Servieee;
import com.example.MailTest.Util.EmailUtil;

import jakarta.mail.MessagingException;

@Configuration
public class Service_IMPl implements Servieee{
	
	@Autowired
	EmailUtil emailUtil;
	
	@Autowired
	User_Repo repo;

	@Override
	public String forgotPassword(List<String> emails) {
        for (String email : emails) {
            try {
                emailUtil.sendSetPasswordEmail(email);
            } catch (MessagingException e) {
               
                throw new RuntimeException("Unable to send set password email to " + email + ", please try again");
            }
        }
        return "Please check your email to set a new password to your account";
    }


	

	
}
