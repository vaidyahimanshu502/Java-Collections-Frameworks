package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AddListIntoList {
	public static void main(String[] args) {
		//creating object of ArrayList
		List<Integer> l1=new ArrayList<>();
		//Adding elements in ArrayList
		l1.add(2);
		l1.add(3);
		l1.add(5);
		l1.add(7);
		l1.add(11);
		//creating Another Object And add in All l1 elements
		List<Integer> all10Prime= new ArrayList<>(l1);
		//creating another Object of ArayList 
		List<Integer> l2= new ArrayList<>();
		//Adding elements in new ArrayList
		l2.add(13);
		l2.add(17);
		l2.add(19);
		l2.add(23);
		l2.add(29);
		//again adding all elements of new ArrayList into main ArrayList
		all10Prime.addAll(l2);
		System.out.println(all10Prime);
		System.out.println(all10Prime.get(5));
		System.out.println(all10Prime.isEmpty());
		System.out.println(all10Prime.size());
		
		all10Prime.set(5, null);
		System.out.println(all10Prime);
		
//	iteration over an arrayList
		for(int i=0;i<all10Prime.size();i++) {
			System.out.print(all10Prime.get(i)+" ");
		}
		System.out.println();
    //	By Enhance for loop
		for(Integer i:all10Prime) {
			System.out.print(i+" ");
		}
		System.out.println();
		
   //	By Stream + Lambda Expression
		all10Prime.stream().forEach(elem ->System.out.print(elem +" "));
		System.out.println();
  //	By just Lambda Expression
		all10Prime.forEach(elem -> System.out.print(elem +" "));	
		
	}

}
