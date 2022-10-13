package com.cg.array;

import java.util.Scanner;

public class DemoOnArrayUserInput {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of the array");
		int size = s.nextInt();
		// array declaration
		int arr[] = new int[size];
		System.out.println("Enter the value: ");
		//Enter the elements in the array
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+i+ " index");
			arr[i]=s.nextInt();
		}
		//to print the element in the array
		/*for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		
		//Enhanced for loop
		for(int i: arr)
		{
			System.out.println(i);
		}
		s.close();

	}

}
