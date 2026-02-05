package org.automation.GroupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlliArjun
{
	@Test(groups = {"Tollywood","PanIndia"})
	  public void LaunchAlluArjun() 
	  {
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://en.wikipedia.org/wiki/Allu_Arjun");
	    
	    }

}
