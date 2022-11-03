package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;



//Example on List Interface using ArrayList
public class ArrayListDemo {

	
	public static void main(String[] args) {
		
		//creating a first list using arrayList
		List l = new ArrayList<>();
		l.add(11);
		l.add("Rutuja");
		l.add(45.90f);
		{
		
		System.out.println("The elements are: " +l);
		}
		System.out.println(" ");
		
		List<String> list=new ArrayList<String>();
		list.add("Anvi");
		list.add("Nirvi");
		list.add("Kavya");
		list.add("Shubham");
		list.add("Divya");
		//enhanced for loop is used to extract the elements of your ArrayList
		for(String itr:list)
		{
			System.out.println(itr);
			
		}
		System.out.println(" ");
		
		
		List<String> list1=new LinkedList<String>();
		list1.add("Nia");
		list1.add("Ashwini");
		list1.add("Rutu");
		list1.add("Jay");
		
		
		//using Iterator we can extract the elements of a list
		Iterator itr1=list1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println(" ");
		System.out.println("The elements in List are: "+list);
		System.out.println("The elements in List1 are: "+list);
		
		System.out.println(" ");
		//contains()method is used to check whether list conatins that element or not 
		System.out.println(list.contains("Nirvi"));
	
		System.out.println(" ");
		//size is used to print the length
		System.out.println("The size of List is = "+l.size());
		System.out.println("The size of List is = "+list.size());
		System.out.println("The size of List1 is = "+list1.size());
		
		//remove() is used to remove the specified index value
		System.out.println(list.remove(3));
		System.out.println("The elements are: "+list);
		System.out.println(" ");
		//adding the list elements to list1
		System.out.println("The elements are: "+list1);
		
		list.addAll(list1);
		System.out.println("The elements in List1 are: "+list);
				
		list.removeAll(list1);
		System.out.println("The elements in List1 are: "+list);	
		
		Collections.sort(list1);
		System.out.println("The elements in List1 are: "+list1);
		
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println("The elements in List1 are: "+list1);
			
	
	}

}
