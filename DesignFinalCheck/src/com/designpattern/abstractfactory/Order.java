package com.designpattern.abstractfactory;

public abstract class Order {

	protected ChannelType channel;
	protected ProductType productType;

	public Order(ChannelType channel, ProductType productType) {
		super();
		this.channel = channel;
		this.productType = productType;
	}

	public abstract void processOrder();
}
