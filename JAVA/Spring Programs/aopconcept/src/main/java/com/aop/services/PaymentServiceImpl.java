package com.aop.services;

public class PaymentServiceImpl implements PaymentService{

	public void makePayment(int amount) {
		// payment code
		
		System.out.println(amount+" Amout debited..");
		
		System.out.println(amount+" Amount credited..");
		
	}

}
