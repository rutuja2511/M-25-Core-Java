package com.tnsindia.string;

import java.util.Scanner;

public class DemoOnUpperCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		s.close();

	}

}
