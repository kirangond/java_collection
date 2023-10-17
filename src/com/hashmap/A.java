package com.hashmap;

import java.util.HashMap;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> studentInfo = new HashMap<Integer, String>();
		studentInfo.put(100, "kiran");
		studentInfo.put(200, "pavan");
		studentInfo.put(300, "rahul");
		
		System.out.println("put(integer,string) method: "+studentInfo);
		
		
		System.out.println("to fetch the value based on key: "+ studentInfo.get(100));
		System.out.println("to fetch the all values from hashmap:" + studentInfo.values());
        System.out.println("to fetch the all keys from hashmap:"+studentInfo.keySet());
	}

}
