package org.tnsindia.regrexdemo;

import java.util.Scanner;
import java.util.regex.Pattern;

//Demo on matches() method of pattern class
public class RegExPatternMethodDemo {

	public static void main(String[] args) {
		String pattern="Rutuja Sawant";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input for a matching: ");

		String input=s.nextLine();
		boolean result=Pattern.matches(pattern, input);
		System.out.println(result);

	}

}