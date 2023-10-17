package com.list.arraylist;

import java.util.ArrayList;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList x = new ArrayList();
		
		x.add(10); //Boxing
		
		//adding element in ArrayList method add();
		x.add(20);
		
		x.add(new Integer(30)); //by default it will convert into this type
		
		x.add(10.3);
		
		x.add(true);
		
		x.add("kiran");
		
		System.out.println(x);

	}

}
