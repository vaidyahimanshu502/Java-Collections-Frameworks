package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingArrayList {
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(2);
		list.add(30);
		list.add(20);
		list.add(19);
		list.add(33);
		list.add(17);
		list.add(18);
		System.out.println(list);
	//In Ascending Order
		Collections.sort(list);
		System.out.println(list);
	//In Descending Order
		Collections.reverse(list);
		System.out.println(list);
//Methods to sort Salary Wise		
		List<Employee> e= new ArrayList<>();
		e.add(new Employee(10, "Ramesh", 30, 500000));
		e.add(new Employee(20, "Rohan", 20, 250000));
		e.add(new Employee(30, "Raghav", 29, 300000));
		e.add(new Employee(40, "Rahul", 18, 650000));
		e.add(new Employee(50, "Rudra", 35, 375000));
		e.add(new Employee(60, "Rounak", 25, 900000));
		e.add(new Employee(70, "Ragini", 29, 220000));
		
		Collections.sort(e, new MySort());
		System.out.print(e +" ");
		System.out.println();
		
		// By Using lambda Expression
		Collections.sort(e, (o1, o2) -> (int)(o1.getAge()-o2.getSalary()));
		System.out.println(e);
		System.out.println();
		
		//Compare by theirs names
		Collections.sort(e, (o1, o2) -> (o1.getName().compareTo(o2.getName())));
		System.out.println(e);
	}

}

//To sort salary by we have to create a class which implements Comparator Interface
class MySort implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (o1.getSalary()-o2.getSalary());
 //to reverse just change o2.getSalary()-o1.getSalary()
	}
}
