package com.tnsindia.datetime;

import java.time.Instant;

public class DemoOnInstant {

	public static void main(String[] args) {
		Instant i = Instant.now();
		System.out.println(i);
		Instant i1 = Instant.EPOCH;
		System.out.println(i1);
		Instant i2= Instant.EPOCH.now();
		System.out.println(i2);
		Instant i3 = Instant.EPOCH.MIN;
		System.out.println(i3);
		Instant i4 = Instant.EPOCH.MAX;
		System.out.println(i4);


	}

}
