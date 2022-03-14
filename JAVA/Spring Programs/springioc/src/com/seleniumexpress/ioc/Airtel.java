package com.seleniumexpress.ioc;

public class Airtel implements Sim{
	
//	public Airtel() {
//		System.out.println("airtel constr called");
//	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling using airtel sim");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("data using airtel sim");
	}

}
