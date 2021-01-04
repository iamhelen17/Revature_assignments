package com.demo.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.demo.service.MyServices;

public class MyServicesTest {

	private static MyServices services;
	
	@BeforeAll
	public static void setupMyServices( ) {
		services = new MyServices();  //instance of that class has been created
	}
	
	@Test
	public void testSayHelloByName( ) {
		String output = "Hello Vinay";    //expected output
		assertEquals(output, services.sayHello("Vinay"));   //checking if the expected is matching with the actual or not
	}
	
	@Test
	public void testSayHelloForNull( ) {     //when an input hasn't been entered, there wouldn't be an output
		assertNull(services.sayHello(null));  //tests whether an output is null or not
	}
}
