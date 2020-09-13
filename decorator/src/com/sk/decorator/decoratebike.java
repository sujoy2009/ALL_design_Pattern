package com.sk.decorator;

public class decoratebike implements Bike{
	//below line for has a relation
	private Bike bike;
	public decoratebike(Bike bike) {
		super();
		this.bike = bike;
	}
 
	@Override
	public void assembleBike() {
		bike.assembleBike();
	}
}
