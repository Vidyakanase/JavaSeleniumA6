package org.automation.testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametarization 
{
  @Parameters("bname")
  @Test
  public void launchAndNavigate(@Optional("Chrome")String browsername)
  {
	  WebDriver driver = null;
	  if(browsername.equalsIgnoreCase("chrome"))
			  {
		         driver = new ChromeDriver();
	         }
	  else if(browsername.equalsIgnoreCase("edge"))
	         {
		         driver = new ChromeDriver();
	         }
	  else if(browsername.equalsIgnoreCase("firefox"))
	        {
             driver = new FirefoxDriver();
	        }
      driver.manage().window().maximize();
      driver.get("https://demowebshop.tricentis.com/");
  }
}