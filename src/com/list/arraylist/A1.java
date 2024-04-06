package com.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating an empty array list and using Generics we can store only homogenous data in it
		ArrayList<Integer> x = new ArrayList<Integer>();
		
		//adding integer value in it
		x.add(10); //auto Boxing - storing value in object
		
		x.add(20);
		
		x.add(new Integer(30)); 
		
		System.out.println("add() method: "+ x);
		
		x.add(1, 40);
		
		System.out.println("add(index, value) method: "+x);
		
		ArrayList<Integer> y = new ArrayList<Integer>();
		y.add(300);
		y.add(400);
		
		x.addAll(1, y);
		
		System.out.println("add(index, collection) method: "+ x);
		
		if(x.contains(300))
		{
			System.out.println("present: ");
		}
		else
		{
			System.out.println("not present: ");
		}
		
		//to get particular element based on index number
		System.out.println(x.get(1));
		
		//through iterator fetch the value from the array list
		Iterator iterator = x.iterator();
		while(iterator.hasNext())
		{
			System.out.println("value of x: " + iterator.next());
		}
		
		x.remove(5);
		System.out.println("remove(index) method: "+x);

	}

}
