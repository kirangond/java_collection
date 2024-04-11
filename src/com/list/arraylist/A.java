package com.list.arraylist;

import java.util.ArrayList;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList x = new ArrayList();
		
		x.add(10); //Boxing (internally it will convert into x.add(new Integer(10)));
		
		//adding element in ArrayList method add();
		x.add(20);
		
		x.add(new Integer(30)); //by default it will convert into this type
		
		//we can store heterogenous elements in it
		x.add(10.3);
		
		x.add(true);
		
		x.add("kiran");
//		x.clear();  //delete all elements from arraylist
		
		System.out.println(x);

	}

}
