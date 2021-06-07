package com.example.demo.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilter {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1,"AAA",3789);
		Employee emp2 = new Employee(1,"BBB",5988);
		Employee emp3 = new Employee(1,"CCC",6000);
		Employee emp4 = new Employee(1,"DDD",4009);
		Employee emp5 = new Employee(1,"EEE",9789);
		
		List<Employee> empList =new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		for(Employee e : empList)
			System.out.println(e.getId()+"   " +e.getName()+"  "+e.getSalary());
		
		List<Employee> newEmpList =empList.stream().filter(e -> e.getSalary()>5000).collect(Collectors.toList());

		System.out.println("\nFiltered List:");
		for(Employee e : newEmpList)
			System.out.println(e.getId()+"   " +e.getName()+"  "+e.getSalary());
	}
}
	
