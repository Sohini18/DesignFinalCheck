package com.designpattern.abstractfactory;

public class OrderFactory {
	
	public static Order getOrder(ChannelType channel, ProductType productType) {
		if (channel == ChannelType.ECOMMERCE) {
			return new ECommerceChannel().getOrder(productType);
		}
		return new TeleCommunicationChannel().getOrder(productType);
	}
}
