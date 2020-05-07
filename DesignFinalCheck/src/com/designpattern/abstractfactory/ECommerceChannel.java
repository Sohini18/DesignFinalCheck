package com.designpattern.abstractfactory;

public class ECommerceChannel {

	public Order getOrder(ProductType productType) {
		if (productType == ProductType.ELECTRONIC) {
			return new ElectronicOrder(ChannelType.ECOMMERCE, productType);
		} else if (productType == ProductType.FURNITURE) {
			return new FurnitureOrder(ChannelType.ECOMMERCE, productType);
		}
		return new ToysOrder(ChannelType.ECOMMERCE, productType);
	}
}
