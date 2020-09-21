package com.sk.exam;



public class Employee extends person {
	private String depertment;
	private String designation;
	public Employee(String name, int age, String adressString,String depertment,String designation ) {
		super(name, age, adressString);
		this.depertment=depertment;
		this.designation=designation;
		// TODO Auto-generated constructor stub
	}
	public String getDepertment() {
		return depertment;
	}
	public void setDepertment(String depertment) {
		this.depertment = depertment;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void printEmployee() {
		printPERSON();
		System.out.println("depertemnt "+ depertment+" DESIGnation "+ designation); 
		
	}
	

}
