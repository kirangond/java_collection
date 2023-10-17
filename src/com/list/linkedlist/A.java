package com.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating a new linkedlist
	//	 LinkedList x = new LinkedList();
	//	 LinkedList<Integer> x = new LinkedList<Integer>();
		//works for all scenarios and below is auto upcasting
		List<Integer> x = new LinkedList<Integer>();
		 
		 x.add(10); //auto boxing - wrapping of values in object
		 
		 x.add(20);
		 
		 x.add(new Integer(30));
		 
		 System.out.println("add() method: " + x);
		 
		 x.add(2, 40);
		 
		 System.out.println("add(index, value) method: "+x);
		 
		 x.remove(3);
		 
		 System.out.println("remove(index) method: "+ x);
		 
		 LinkedList y = new LinkedList();
		 y.add(100);
		 y.add(200);
		 y.add(300);
		 System.out.println("add() method: " + y);
		 
		 x.addAll(1, y);
		 System.out.println("add(index, collection) method: "+ x);
		 
		 x.get(1);
		 
		 System.out.println("get() method: "+x);
		 
		 Iterator<Integer> iterator = x.iterator();
		 while(iterator.hasNext())
		 {
			 System.out.println("value of x: "+iterator.next());
		 }

	}

}
