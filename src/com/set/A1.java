package com.set;

import java.util.LinkedHashSet;

//LinkedHashSet
public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//maintain insertion order and contain unique elements
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		linkedHashSet.add(new Integer(40));
		linkedHashSet.add(null);
		linkedHashSet.add(40);
		
		System.out.println("add() method: "+linkedHashSet);

	}

}
