package com.seleniumexpress.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("config loaded");
	/*	Airtel air = (Airtel)context.getBean("airtel");
		air.calling();
		air.data();
		Vodafone vod = (Vodafone)context.getBean("vodafone");
		vod.calling();
		vod.data(); */
		Sim sim = context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
	}

}
