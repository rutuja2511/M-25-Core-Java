package com.tnsindia.datetime;

import java.time.Clock;

public class DemoOnClock {

	public static void main(String[] args) 
	{
		Clock c = Clock.systemUTC();
		Clock a = Clock.systemDefaultZone();
		System.out.println(a);
		System.out.println(c);
		

	}

}
