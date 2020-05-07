package com.designpattern.abstractfactory;

public class FurnitureOrder extends Order {

	public FurnitureOrder(ChannelType channel, ProductType productType) {
		super(channel, productType);
	}

	@Override
	public void processOrder() {
		System.out.println("Processing order.......");
		System.out.println("[Product Type] : " + productType);
		System.out.println("[Channel Type] : " + channel);
	}

}
