package com.tnsindia.string;

import java.util.Scanner;

public class StringLiteral {

	public static void main(String[] args) {
		//compile time input
		/*String str ="Rutuja Sawant";
		System.out.println(str);*/
		
		//runtimetime input
		
		Scanner s =new Scanner(System.in);
		String str1= s.nextLine();
		System.out.println(str1);
		s.close();
	}

}
