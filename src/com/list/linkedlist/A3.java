package com.list.linkedlist;


import java.util.LinkedList;

public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee kiran = new Employee("kiran", "mehtre", 26);
		
		Employee pavan = new Employee("pavan", "mehtre", 29);
		
		LinkedList<Employee> empDetails= new LinkedList<Employee>();
		empDetails.add(kiran);
		empDetails.add(pavan);
		
		System.out.println(empDetails);
		
		for(Employee employee : empDetails)
		{
			System.out.println(employee.getFirstName());
			System.out.println(employee.getLastName());
			System.out.println(employee.getAge());
		}
		
		
	}

}
