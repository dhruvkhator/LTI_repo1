package com.lti.MavenDemo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestDemo {

	@Test
	
	void strCheck() {
		String s1 = "demo";
		System.out.println("This is the test case for string check");
		assertEquals("demo", s1);
		//assertEquals("Demo1", s1);
	}
	
}
