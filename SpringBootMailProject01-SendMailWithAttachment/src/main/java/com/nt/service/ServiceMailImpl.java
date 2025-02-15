package com.nt.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;
@Service
public class ServiceMailImpl implements IServiceMgmt  {
	
	
	@Autowired
	private JavaMailSender sender;
	
	@Value("${spring.mail.username}")
	private String Fromemail;

	@Override
	public String pricesSendJavaMailWithAttachment(String[] items, Double[] prices, String[] emails) throws Exception {
		
		Double billAmt=0.0;
		
		for(Double p:prices) {
			billAmt+=p;
		}
		
		String msg=Arrays.toString(items)+" items are bought with prices:: "+Arrays.toString(prices)+"with billAmt::"+billAmt;
		
		String	mailsendstatus=sendMail(msg,emails);
		
		
		return msg+"mail send status:: "+mailsendstatus;
	}

	private String sendMail(String msg, String[] emails) throws Exception {
		MimeMessage message= sender.createMimeMessage(); //create empty message
		MimeMessageHelper helper= new MimeMessageHelper(message,true); // true: for attachment
		helper.setCc(emails);
		helper.setFrom(Fromemail);
		helper.setSubject("Open to know it");
		helper.setText(msg);
		helper.addAttachment("Pic1Amazon.jpg", new ClassPathResource("Pic1Amazon.jpg"));
		helper.setSentDate(new Date());
		sender.send(message);
		return "mail sent";
	}

	

}
