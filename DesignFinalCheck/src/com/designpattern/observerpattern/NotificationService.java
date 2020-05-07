package com.designpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {

	List<INotificationObserver> observers = null;

	public NotificationService() {
		super();
		observers = new ArrayList<INotificationObserver>();
	}

	@Override
	public void addObserver(INotificationObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(INotificationObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (INotificationObserver observer : observers) {
			if (observer.getNoOfTickets() > 100) {
				observer.nofication();
			}
		}
	}

}
