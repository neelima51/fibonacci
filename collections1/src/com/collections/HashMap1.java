package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap map = new HashMap<Object, Object>();
		
		Student s1 = new Student("neels", 1);
		Student s2 = new Student("bhu", 2);
		Student s3 = new Student("suji", 3);
		Student s4 = new Student("sow", 4);
		
		map.put(s1, 1);
		map.put(s2, 5);
		map.put(s3, 6);
		map.put(s4, 8);
		
		System.out.println(map);
	}

}
