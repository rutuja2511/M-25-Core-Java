package com.tnsindia.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DemoOnZonedTime {

	public static void main(String[] args) {
		LocalTime d = LocalTime.now(ZoneId.of("Asia/Singapore"));
		System.out.println(d);
		for(String s: ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
		

	}

}
