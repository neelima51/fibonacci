package com.generics;

public class Car implements Comparable<Car>{
	private String model;
	private int year;
	private String colour;
	public Car(String model1,int year1,String colour1)
	{
		this.model=model1;
		this.year=year1;
		this.colour=colour1;
		
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String toString() {
        return ("model:"+this.getModel() +
                    " year: "+ this. getYear() +
                    " colour: "+ this.getColour());
                   
	}
	public int compareTo(Car o) {
		int res=0;
		if(o.getYear()>year)
			res=1;
		if(o.getYear()<year)
			res=1;
		if(o.getYear()==year)
			res=0;
		return res;
		
		
        
    }
   
	

}
