package org.automation.configrationAnnotations;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class configrationAnnotations
{
	@Test
	public void testCase1() {
		Reporter.log("this is @testCase1",true);
	}
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("this is @BeforeMethod",true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("this is @beforeClass method");
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("this is @beforeTest method");
}
}