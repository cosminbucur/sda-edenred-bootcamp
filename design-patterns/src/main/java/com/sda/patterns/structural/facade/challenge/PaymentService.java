package com.sda.patterns.structural.facade.challenge;

public class PaymentService {

	public boolean makePayment() {
		System.out.println("connect with payment gateway for payment");
		return true;
	}
}
