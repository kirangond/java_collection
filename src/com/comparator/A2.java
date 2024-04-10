package com.comparator;

import java.util.Comparator;

public class A2 implements Comparator<Student>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a = new A2();
		int result = a.compare(new Student(100, "xyz"), new Student(200, "abc"));
		System.out.println(result);

	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
