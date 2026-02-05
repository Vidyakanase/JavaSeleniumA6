package org.automation.ModulerFramework;

import java.time.Duration;

import org.automation.genericUtilities.Flib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
  public static WebDriver driver;
	
	@BeforeClass
	public void broweserSetUp() {
		String browserValue = Flib.getPropertyValue("Chrome");
		String Url = Flib.getPropertyValue("Url");
		
		if(browserValue.equalsIgnoreCase("FireFox"))
		{
			driver = new FirefoxDriver();
		}
		else {
			driver = new EdgeDriver();
		}
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("Url");
	}
    @BeforeMethod
      public void login() {
	    String email = Flib.getPropertyValue("email");
		String password = Flib.getPropertyValue("password");
		
		BasePage bp = new BasePage(driver);
		bp.getLoginLink().click();
		
		LoginPage lp=new LoginPage(driver);
		lp.getLoginEmailTB().sendKeys(email);
		lp.getPasswordTB().sendKeys(password);
		lp.getLoginButton().click();
		
  }
  @AfterMethod
  public void logout()
  {

		BasePage bp = new BasePage(driver);
		bp.getLoginLink().click();
		
	
	  
	}
  }




