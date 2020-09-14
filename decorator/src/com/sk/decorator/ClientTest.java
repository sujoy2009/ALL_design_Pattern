package com.sk.decorator;

public class ClientTest {
	public static void main(String[] args) {
		//Assemble Basic Bike
		System.out.println("-----------Assemble Basic Bike-------------");
		Bike basicBike = new BasicBike();
		basicBike.assembleBike();
		
		//Decorate BasicBike with Luxury Feature
		System.out.println("-----------Decorate BasicBike with Luxury Feature------------");
		Bike luxuryBike = new LuxuryBike(new BasicBike());
		luxuryBike.assembleBike();
		
		/*Decorate BasicBike with Luxury
		and Sports Features*/
		System.out.println("------Decorate BasicBike with Luxury and Sports Features-----");
		Bike sportsLuxuryBike = new sportsbike(new LuxuryBike(new LuxuryBike(new BasicBike())));
		sportsLuxuryBike.assembleBike();
	}
 

}
