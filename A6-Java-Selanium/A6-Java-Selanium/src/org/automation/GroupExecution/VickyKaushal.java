package org.automation.GroupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VickyKaushal
{
	@Test(groups = "Bollywood")
	  public void LaunchYash() 
	  {
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://en.wikipedia.org/wiki/Vicky_Kaushal");
	    
	    }
}
