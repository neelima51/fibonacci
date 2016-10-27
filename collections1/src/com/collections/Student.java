package com.collections;

public class Student {
	
	private String name;
	private int number;
	
	

	public Student(String name2, int number2) {
		// TODO Auto-generated constructor stub
		
		this.name=name2;
		this.number=number2;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String toString() {
        return ("name:"+this.getName() +
                    " number: "+ this. getNumber() );
                   
	}
}
	
	
	
	
