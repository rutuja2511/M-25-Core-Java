package com.tnsindia.string;

import java.util.Scanner;

// wajp to check whether the input string matches with the word "Dhoni"
public class ExampleOnStringMatches {

	public static void main(String[] args) {
		String str = "Dhoni";
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		if (str.equals(str1))
		{
			System.out.println("Matching");
			
		}
		else
		{
			System.out.println("Not-Matching");
		}
		s.close();
		

	}

}
