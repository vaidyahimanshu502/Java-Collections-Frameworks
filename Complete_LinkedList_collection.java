package com.collections.java.linkedList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
		public static void main(String[] args) {
	//Creating the object of LinkedList
			LinkedList<String> fruits= new LinkedList<>();
			
	//Adding Elements In LinkedList
			fruits.add("Banana");
			fruits.add("Guava");
			fruits.add("Grapes");
			fruits.add("Orange");
			fruits.add("Mango");
			fruits.add("Mango");
			fruits.add("Mango");
			
			System.out.println(fruits);
			
			//Add element at Specified position
			fruits.add(2, "Watermealon");
			System.out.println(fruits);
			
			//add element at start index
			fruits.addFirst("Orange");
			System.out.println(fruits);
			
			//Add at last index
			fruits.addLast("Apple");
			System.out.println(fruits);
			
	//Accessing elements from LinkedList
			
			//Getting 1st element from LinkedList
			String firstElement=fruits.getFirst();
			System.out.println(firstElement);
			
			//Getting Last element from LinkedList
			String lastElement=fruits.getLast();
			System.out.println(lastElement);
			
			//Getting element at specific position
			String element=fruits.get(3);
			System.out.println(element);
			
	//Iterating over LinkedList
			
			//By for loop
			for(int i=0;i<fruits.size();i++) {
				System.out.print(fruits.get(i)+" ");
			}
			System.out.println();
			
			//By enhance for loop
			for(String fruit:fruits) {
				System.out.print(fruit+ " ");
			}
			System.out.println();
			
			//By forEach() method
			fruits.stream().forEach(faal -> System.out.println(faal));
			System.out.println();
			
	//Methods to remove elements from LinkedList
			
			//Remove First Element
			String firstRemovedElement=fruits.removeFirst();
			System.out.print(firstRemovedElement +" ");
			System.out.println();
			
			//Remove Last Element
			String removeLastElement= fruits.removeLast();
			System.out.println(removeLastElement);
			
			//Remove at Specified position
			fruits.remove("Grapes");
			System.out.print(fruits + " ");
			System.out.println();
			
			//Remove all elements
            //fruits.clear();
           //System.out.println(fruits);
			
//	Iterating and searching elements in LinkedList
			
			//contains() method
		    boolean b= fruits.contains("Banana");
		    System.out.println(b);
		    
		    //hoe to find index of 1st occurence of an ekement
		    int index = fruits.indexOf("Watermealon");
		    System.out.println(index);
		    
		    //To know the last index of an elements
		    int i=fruits.lastIndexOf("Mango");
		    System.out.println(i);
		    
		    //Iteration by using Iterator
		    Iterator<String> it = fruits.iterator();
		    while(it.hasNext()) {
		    	String str= it.next();
		    	System.out.print(str + " ");
		    }
              System.out.println();
              
		    //Iteration By using forEach method
		    fruits.forEach(e -> System.out.print(e + " "));
		    System.out.println();
		    
		    //Iteration by using Enhance for loop
		    for (String s:fruits) {
		    	System.out.print(s +" ");
		    }
		}
	}
