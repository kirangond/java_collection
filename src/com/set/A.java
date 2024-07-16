package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

//hashset can't contain duplicate values in it
//to check working or not
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
//		hashSet.add(new Integer(40));
		//can consists of null value
		hashSet.add(null);
		//we can add duplicate but it will print only once
//		hashSet.add(10);
		
		System.out.println("add() method: "+hashSet);
		
		

	}

}
