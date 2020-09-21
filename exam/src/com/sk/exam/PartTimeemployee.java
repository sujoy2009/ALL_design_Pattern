package com.sk.exam;

public class PartTimeemployee  extends Employee{
	private Double hours;
	private Double rate;
	public PartTimeemployee(String name, int age, String adressString, String depertment, String designation,Double hours,Double rate) {
		super(name, age, adressString, depertment, designation);
		this.hours=hours;
		this.rate=rate;
		// TODO Auto-generated constructor stub
	}
	public Double getHours() {
		return hours;
	}
	public void setHours(Double hours) {
		this.hours = hours;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Double salary() {
		 double salary=rate*hours;
		 return salary();
	
	}
	@Override
	public String toString() {
		return "PartTimeemployee [hours=" + hours + ", rate=" + rate + "]";
	}
	

}
