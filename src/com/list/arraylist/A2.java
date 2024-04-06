package com.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> x = new ArrayList<Integer>();
		//adding into array list
		x.add(10);
		x.add(20);
		x.add(30);
		
		//fetch values from arraylist using iterator 
		
		Iterator y = x.iterator();
		
		while(y.hasNext())
		{
			System.out.println("elements from arraylist: " + y.next());
		}
	}

}
