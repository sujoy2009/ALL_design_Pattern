package com.sk.exam;

public class FullTimeEmployee extends Employee {
	private double basic;
	private double allowence;
	public FullTimeEmployee(String name, int age, String adressString, String depertment, String designation,Double basic,Double allowence) {
		super(name, age, adressString, depertment, designation);
		this.basic=basic;
		this.allowence=allowence;
		
		// TODO Auto-generated constructor stub
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getAllowence() {
		return allowence;
	}
	public void setAllowence(double allowence) {
		this.allowence = allowence;
	}
	public Double salary() {
		 double salary=basic+basic*(allowence/100);
		 return salary();
	
	}
	@Override
	public String toString() {
		return "FullTimeEmployee [basic=" + basic + ", allowence=" + allowence + "]";
	}
	
	

}
