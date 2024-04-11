package com.generics;

//T might be anything and can be having any data type
public class A<T> {
	
	T val;
	
	A(T x)
	{
		this.val = x;
		System.out.println(x);
		
	}
	

}
