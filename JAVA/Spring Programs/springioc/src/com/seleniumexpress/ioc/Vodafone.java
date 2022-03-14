package com.seleniumexpress.ioc;

public class Vodafone implements Sim{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("calling using vodafone sim");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("data using vodafone sim");
	}

}
