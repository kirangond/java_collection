package com.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> x = new LinkedList<Integer>();
		x.add(10);
		
		x.add(20);
		
		System.out.println("add() method: "+x);
		
		x.addFirst(5);
		
		System.out.println("addFirst() method: "+ x);
		
		x.addLast(30);
		
		System.out.println("addLast() method: "+ x);

	}

}
