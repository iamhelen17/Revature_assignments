package com.demo.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloJunit {

	@BeforeAll
	public static void helloBeforeAll() {
		System.out.println("Hello from helloBeforeAll()");
	}
	
	@BeforeEach
	public void helloBeforeEach() {
		System.out.println("Hello from helloBeforeEach(). This will be executed before any test case within this class");
	}
	
	@Test
	public void testHello1() {         //naming convention for writing the test cases- method should start with test
		System.out.println("Hello from testHello1()");
	}
	
	@Test
	public void testHello2() {         //naming convention for writing the test cases- method should start with test
		System.out.println("Hello from testHello2()");
	}
	
	@AfterEach
	public void helloAfterEach() {
		System.out.println("Hello from helloAfterEach(). This will be executed after evry test case within this class");
	}
	
	@AfterAll
	public static void helloAfterAll() {
		System.out.println("Hello from helloBeforeAll()");
	}
}
