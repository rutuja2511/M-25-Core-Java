package org.tnsindia.list;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("JAVA");
		list.add("J2EE");
		list.add("Python");
		list.add("JSp");
		list.add("Servlets");
		list.add("Struts");
		System.out.println(list);
		System.out.println(list.indexOf("Java"));
		System.out.println(list.lastIndexOf("JAVA"));
		

	}

}
