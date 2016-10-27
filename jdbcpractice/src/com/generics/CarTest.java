package com.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Car> carlist=new ArrayList<Car>();
     Car car1=new Car("BMW",2010,"BLACK");
     Car car2=new Car("FORD",2006,"RED");
     Car car3=new Car("MARUTHI",1992,"WHITE");
     Car car4=new Car("AUDI",2006,"YELLOW");
     carlist.add(car1);
     carlist.add(car2);
     carlist.add(car3);
     carlist.add(car4);
     System.out.println(carlist);
     Collections.sort(carlist);
     System.out.println(carlist);
     Collections.sort(carlist, new CarCompare());
     System.out.println(carlist);
     
	} 
     
	}
	
	 class CarCompare implements Comparator<Car> {

	   // @Override
	    public int compare(Car a, Car b) {
	        if (a.getYear()<b.getYear())
	            return 1;
	        else if (a.getYear()>b.getYear())
	            return -1;
	        return 0;
	    }
	    
	} 


