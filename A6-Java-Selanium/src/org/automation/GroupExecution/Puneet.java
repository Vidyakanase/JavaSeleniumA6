package org.automation.GroupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Puneet
{
	@Test(groups = "SandalWood")
	  public void LaunchPuneet() 
	  {
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://en.wikipedia.org/wiki/Puneeth_Rajkumar");
	    driver.quit();
	    }
}
