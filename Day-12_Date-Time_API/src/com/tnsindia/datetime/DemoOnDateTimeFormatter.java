package com.tnsindia.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DemoOnDateTimeFormatter {

	public static void main(String[] args) {
		String x = "2022-10-14 15:07";
		DateTimeFormatter df =DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime l = LocalDateTime.parse(x, df);
		System.out.println(l);

		
		LocalDateTime l1 = LocalDateTime.now();
		DateTimeFormatter df1 =DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		String a = l1.format(df1);
		System.out.println(l1);

	}

}
