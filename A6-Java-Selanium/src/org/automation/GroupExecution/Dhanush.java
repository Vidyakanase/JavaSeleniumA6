package org.automation.GroupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dhanush 
{
   @Test(groups={"Tamil","Hollywood"})
   public void launchingDhanush()
   {
	   Reporter.log("Launched Dhanush");
	   WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://en.wikipedia.org/wiki/Dhanush");

   }
}
