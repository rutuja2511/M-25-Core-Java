package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FirstJunit5test {
/*
	@Test
	void test() {
		fail("Not yet implemented");
	}
*/
	@Test
	//it will perform the testing on the method
	void test1() {
		System.out.println("Hello Everyone");
	}

	@Test
	@Disabled
	void display() {
		fail("hi");
	}
}
