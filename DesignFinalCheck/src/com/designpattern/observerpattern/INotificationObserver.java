package com.designpattern.observerpattern;

public abstract class INotificationObserver {

	protected INotificationService service;
	protected String name;
	protected int noOfTickets;

	public INotificationObserver(INotificationService service, String name, int noOfTickets) {
		super();
		this.service = service;
		this.name = name;
		this.noOfTickets = noOfTickets;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public abstract void nofication();

}
