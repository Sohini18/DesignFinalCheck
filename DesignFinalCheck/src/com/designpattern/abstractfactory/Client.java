package com.designpattern.abstractfactory;

public class Client {

	public static void main(String[] args) {

		// Orders from E-Commerce Website
		Order order1 = OrderFactory.getOrder(ChannelType.ECOMMERCE, ProductType.ELECTRONIC);
		Order order2 = OrderFactory.getOrder(ChannelType.ECOMMERCE, ProductType.FURNITURE);
		Order order3 = OrderFactory.getOrder(ChannelType.ECOMMERCE, ProductType.TOYS);

		// Orders from Tele Caller Agents Application
		Order order4 = OrderFactory.getOrder(ChannelType.TELECOMM, ProductType.ELECTRONIC);
		Order order5 = OrderFactory.getOrder(ChannelType.TELECOMM, ProductType.FURNITURE);
		Order order6 = OrderFactory.getOrder(ChannelType.TELECOMM, ProductType.TOYS);

		// Processing Orders
		order1.processOrder();
		order2.processOrder();
		order3.processOrder();

		System.out.println();

		order4.processOrder();
		order5.processOrder();
		order6.processOrder();
	}

}
