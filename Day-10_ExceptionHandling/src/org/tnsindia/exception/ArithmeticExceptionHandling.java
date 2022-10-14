package org.tnsindia.exception;

import java.util.Scanner;

public class ArithmeticExceptionHandling {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = s.nextInt();
		System.out.println("Enter the value of b:");
		int b = s.nextInt();
		//try block contain the exception code
		try
		{
		int res = a/b;
		System.out.println("The result is: "+res);
		}
		catch(Exception e) 
		{
			System.out.println(e);
			System.out.println("Arithmetic Exeption handled using catch block");
		}
		finally
		{
			
		}
		s.close();

	}

}
