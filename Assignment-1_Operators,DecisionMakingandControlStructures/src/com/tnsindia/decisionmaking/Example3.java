package com.tnsindia.decisionmaking;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		int	weight = s.nextInt();
		if(age>=35)
		{
			if(weight>=40)
			{
				if(weight<=110)
				{
				 System.out.println("Eligible to bunjee jumping");
				}
				else
				{
					System.out.println("Extra ropes will be added");
				}
			}
			else
			{
				System.out.println(" Not Eligible to bunjee jumping");
			}
		}
		else
		{
			System.out.println(" Not Eligible to bunjee jumping");
		}
		s.close();

	}

}
