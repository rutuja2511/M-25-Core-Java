package org.tnsindia.junit5demo;

import org.junit.jupiter.api.RepeatedTest;

class RepeatedTestDemo {

	@RepeatedTest(5)
	void test() {
		System.out.println("Hello M25");
	}

}