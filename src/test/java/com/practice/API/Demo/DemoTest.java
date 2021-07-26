package com.practice.API.Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTest {
@BeforeTest
public void setup(){
	System.out.println("Inside Setup");
}
@Test
public void ku() {
	System.out.println("Inside Test");
}
@AfterTest
public void tearDown() {
	System.out.println("Inside Teardown");
}
}
