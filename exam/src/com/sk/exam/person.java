package com.sk.exam;

public class person {
	private String name;
	private int age;
	private String adressString;
	public person(String name, int age, String adressString) {
		super();
		this.name = name;
		this.age = age;
		this.adressString = adressString;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdressString() {
		return adressString;
	}
	public void setAdressString(String adressString) {
		this.adressString = adressString;
	}

	public void printPERSON() {
		System.out.println("person [name=" + name+ ", age=" + age + ", adressString=" + adressString + "]"); 
		
	}
	
	
	
	

}
