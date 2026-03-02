package com.nt.Sbeans;

import org.springframework.stereotype.Component;

@Component("paytmService")
public class PaytmPaymentService implements PaymentService {

	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹"+amount+" using Paytm");

	}

}
