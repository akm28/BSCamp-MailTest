package com.example.MailTest.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.MailTest.Entity.User_test;

@Service
public interface Servieee {
	
	public String forgotPassword(List<String> email);
}
