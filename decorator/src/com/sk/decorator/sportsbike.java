package com.sk.decorator;

public class sportsbike extends decoratebike {
	public sportsbike(Bike bike) {
		super(bike);
	}
 
	@Override
	public void assembleBike() {
		super.assembleBike();
		System.out.println("Adding featues of Sports Bike..");
	}

}
