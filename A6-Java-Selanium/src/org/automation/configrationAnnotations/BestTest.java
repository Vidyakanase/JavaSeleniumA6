package org.automation.configrationAnnotations;

import java.time.Duration;

import org.automation.genericUtilities.Flib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BestTest
{
	public static WebDriver driver;
	
	@BeforeClass
	public void broeserSetUp() {
		String browserValue = Flib.getPropertyValue("Chrome");
		String Url = Flib.getPropertyValue("Url");
		
		if(browserValue.equalsIgnoreCase("FireFox"))
		{
			driver = new FirefoxDriver();
		}
		else {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("Url");
	}
  @BeforeMethod
      public void login() {
	  String email = Flib.getPropertyValue("email");
		String Url = Flib.getPropertyValue("password");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email:")).sendKeys("");
		driver.findElement(By.id("Password:")).sendKeys("password");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
  }
  @AfterMethod
  public void logout() {
	  driver.findElement(By.linkText("Log out")).click();
  }
  @AfterClass
  public void browserTearDown() {
	  driver.quit();
	  
	}
  }

