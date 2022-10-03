package com.tnsindia.decisionmaking;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args)
	{
		//switch
				Scanner s = new Scanner(System.in);
				String game= s.next();
				switch(game)
				{
				case "Hockey" :
					System.out.println("Let's play Hockey");
					break;
				case "Cricket" :
					System.out.println("Let's play Cricket");
					break;
				case "Football" :
					System.out.println("Let's play Football");
					break;

		       default:
		    	   System.out.println("Invalid Input");
				   s.close();
				}

	}

}
