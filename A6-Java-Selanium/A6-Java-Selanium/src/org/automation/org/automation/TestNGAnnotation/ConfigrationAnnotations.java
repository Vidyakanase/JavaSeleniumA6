package org.automation.org.automation.TestNGAnnotation;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigrationAnnotations {
  @Test
  public void testCase1()
  {
	Reporter.log("This is @Test method1",true);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	Reporter.log("this is @BeforeMethod",true);
  }
  @BeforeClass
  public void beforeClass() 
  {
	 Reporter.log("this is @BeforeClass method",true);
  }
  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("this is @BeforeTest method",true);
  }
  @BeforeSuite
  public void beforeSuit()
  {
	  Reporter.log("this is @BeforeSuit method",true);
  }
  @AfterSuite
  public void afterSuit()
  {
	  Reporter.log("this is @AfterSuit method",true);
  }
  @Test
  public void tastCase2()
  {
	  Reporter.log("this is @Test method 2",true);
  }
  @AfterTest
  public void afterTest()
  {
	  Reporter.log("this ia @afterTest method",true);
  }
  @AfterClass
  public void afterClass()
  {
	  Reporter.log("this is @afterClass method",true);
  }
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("this is @afterMetod method",true);
  }
  @Test
  public void testCase3()
  {
	  Reporter.log("this is @TestMethod",true);
  }

  }
  