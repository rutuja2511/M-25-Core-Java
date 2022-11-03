package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Collection;

public class DemoOnCollectionInterface {

	public static void main(String[] args) {
		Collection<Object> obj = new ArrayList<>();
		
		//adding the values
		obj.add("Rutuja");
		obj.add('A');
		obj.add(79.78f);
		System.out.println("The elements in Collection are: " +obj );

	}

}
