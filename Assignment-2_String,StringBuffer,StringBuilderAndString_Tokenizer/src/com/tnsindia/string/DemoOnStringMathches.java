package com.tnsindia.string;

public class DemoOnStringMathches {

	public static void main(String[] args) 
	{
		// string storing in same memory
		String str ="Hello";
		String str1 ="Hello";
		System.out.println(str == str1);
		
		//string is same but we are allocating different memory by using new keyword
		
		String str2 = new String("Hello");
		String str3 = new String("Hello");
		
		System.out.println(str2 == str3);
		System.out.println(str2 .equals(str3));

	}

}
