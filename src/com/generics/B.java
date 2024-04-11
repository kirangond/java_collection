package com.generics;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		//what ever A<> copied into the T
		A<String> a1 = new A<String>("abc");
		
		A<Integer> a2 = new A<Integer>(100);
		
		A<Character> a3 = new A<Character>('a');
	}

}
