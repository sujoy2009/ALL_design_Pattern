package com.sk.decorator;

public class LuxuryBike extends decoratebike {
	public LuxuryBike(Bike bike) {
		super(bike);
	}
 
	@Override
	public void assembleBike() {
		super.assembleBike();
		System.out.println("Adding featues of Luxury Bike..");
	}
}
