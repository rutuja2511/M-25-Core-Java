package com.tnsindia.datetime;

import java.time.LocalDate;

public class DemoONLocalDate {

	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
		LocalDate obj = LocalDate.of(2022, 02, 20);
		System.out.println(obj);
	}

}
