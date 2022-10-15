package com.tnsindia.datetime;

import java.time.OffsetDateTime;
import java.time.OffsetTime;


public class DemoOnOffSetTime {

	public static void main(String[] args) {
			OffsetDateTime d = OffsetDateTime.now();
			OffsetDateTime o = OffsetDateTime.MAX;
			OffsetTime  x = OffsetTime.now();
			System.out.println(x);
			System.out.println(o);
			System.out.println(d);
	}

}
