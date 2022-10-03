package com.tnsindia.operators;

public class UnaryOperator {

	public static void main(String[] args) {
	
		int a = 10 , b=5;
		int x =a++; //11
		int y =++b; //6
		int z=a+x; //11+10=21
		
		@SuppressWarnings("unused")
		int x1 = a--; //10
		int y1 = --b; //6
		int z1 = y1+a; //6+9=15
		
		System.out.println(z);
		System.out.println(z1);
	}

}
