package com.example.MailTest.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.MailTest.Entity.User_test;
import com.example.MailTest.Service.Servieee;
import com.example.MailTest.Service_Impl.Service_IMPl;

@RestController
@RequestMapping("/mail")
public class Controller {
	
	
	
	@Autowired
	Servieee regService;
	
	@Autowired
	Service_IMPl service;
	
	@PutMapping("/forgotpassword")
	public ResponseEntity<String> forgotpassword(){
		List<String> emails = Arrays.asList("aungkhantm33@gmail.com", "thetzawhein9999@gmail.com","captainthura99@gmail.com","kohein10151099@gmail.com","dccreation392019@gmail.com");
		return new ResponseEntity<>(regService.forgotPassword(emails),HttpStatus.OK);
	}
	
	

}
