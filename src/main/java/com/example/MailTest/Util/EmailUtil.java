package com.example.MailTest.Util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;




@Component
public class EmailUtil {
	
	@Autowired
	 JavaMailSender javaMailSender;
	
	public void setMailSender(JavaMailSender mailSender) {  
      this.javaMailSender = mailSender;  
  }  
	
	
	public void sendSetPasswordEmail(String email)throws MessagingException{
//		MimeMessage mimeMessage=javaMailSender.createMimeMessage();
//		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
//		
		SimpleMailMessage msg=new SimpleMailMessage();
		msg.setTo(email);
		msg.setSubject("Set Password");
		msg.setText("""
				
				HEllO This is AKM Mail Test
				
				""".formatted(email) );
		
		javaMailSender.send(msg);

		
	}

}

