package org.tnsindia.packagexample;

import java.util.Scanner;

//import the package

import org.tnsindia.packagedemo.*;
//import org.tnsindia.packagedemo;

public class PackageClient {

	public static void main(String[] args)
	{
		/*we are accessing the method of PackageDemo class
		import the package of the specified class*/
		//object creation
		
		//user input
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = s.nextLine();
		
		PackageDemo d = new PackageDemo();
		d.str =str;
		d.display();
		s.close();
		

	}

}
