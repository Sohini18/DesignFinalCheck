package com.designpattern.observerpattern;

public class Admin extends INotificationObserver {

	public Admin(INotificationService service, String name, int noOfTickets) {
		super(service, name, noOfTickets);
	}

	@Override
	public void nofication() {
		System.out.println("Hello " + name + " .");
		System.out.println("Your Event will start soon...");
	}

}
