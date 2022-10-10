package org.tnsindia.interfaceexample;

import java.util.Scanner;

//child class to implement the methods of interface
public class ShapeArea implements Area {


	@Override
	public void circle() {
		Scanner s= new Scanner(System.in); 
		System.out.println("Enter the radius of the circle");
		double r=s.nextDouble();
		System.out.println("The area of the Circle is: "+3.13*r*r);
		s.close();
	}

	@Override
	public void square() {
		Scanner s= new Scanner(System.in); 
		System.out.println("Enter the side of the Square");
		double side=s.nextDouble();
		System.out.println("The area of the Square is: " +side*side);
		s.close();
	}
	

}
