package com.cg.fms;

public class Airport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight economyFlight = new Flight("1","Economy");
		Flight bussinessFlight = new Flight("2","Bussiness");
		
		Passenger john = new Passenger("John",true);
		Passenger mike = new Passenger("mike",false);
		
		bussinessFlight.addPassenger(john);
		bussinessFlight.removePassenger(john);
		bussinessFlight.addPassenger(mike);
		economyFlight.addPassenger(mike);
		
		System.out.println("Bussiness Flight passengers list: " +bussinessFlight.getPassengersList());
		for(Passenger passenger: bussinessFlight.getPassengersList()) {
			System.out.println(passenger.getName());
		}
		
		System.out.println("Economy Flight passenger list: "+economyFlight.getPassengersList());
		for(Passenger passenger: economyFlight.getPassengersList()) {
			System.out.println(passenger.getName());
		}
		

	}

}
