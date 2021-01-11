package com.app.service.impl.test;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.app.service.CalculatorService;
import com.app.service.impl.MathApplication;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {
	
   //@InjectMocks annotation is used to create and inject the mock object
   @InjectMocks 
   MathApplication mathApplication = new MathApplication();

   //@Mock annotation is used to create the mock object to be injected
   @Mock
   CalculatorService calcService;

   @Test
   public void testAdd(){
      //add the behavior of calc service to add two numbers
      when(calcService.add(10.0,20.0)).thenReturn(30.00);
		
      //test the add functionality
      Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
   }
   
   @Test
   public void testSubstract() {
	   when(calcService.subtract(59.5, 9)).thenReturn(50.5);
	   
	   Assert.assertEquals(mathApplication.subtract(59.5, 9),50.5,0);
   }
   
   @Test
   public void testMultiply() {
	   when(calcService.multiply(20, 10)).thenReturn(200.00);
	   
	   Assert.assertEquals(mathApplication.multiply(20.0, 10.0),200.0,0);
   }
   
   @Test
   public void testDivide() {
	   when(calcService.divide(330, 10)).thenReturn(33.00);
	   
	   Assert.assertEquals(mathApplication.divide(330.0, 10.0),33.0,0);
   }
}