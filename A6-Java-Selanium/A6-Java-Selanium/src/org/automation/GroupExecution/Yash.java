package org.automation.GroupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Yash
{
  @Test(groups = {"Tollywood","PanIndia"})
  public void LaunchYash() 
  {
	Reporter.log("Lunched Yash page", false);
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://en.wikipedia.org/wiki/Yash_(actor)");
    
    }
}
