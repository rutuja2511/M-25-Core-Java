package com.tnsindia.looping;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
				
		do
		{
			System.out.println("Value of x: "+ x);
			x++;
					
		}
		while (x < 20);
		s.close();
	}

}
