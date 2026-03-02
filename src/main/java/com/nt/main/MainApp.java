package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Sbeans.PaymentProcessor;
import com.nt.config.AppConfig;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		PaymentProcessor payment = ctx.getBean(PaymentProcessor.class);
		payment.processPayment(5000);
		
		
	
	}
	

}
