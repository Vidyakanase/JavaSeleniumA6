package org.automation.GroupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MaheshBabu
{
	@Test(groups = "TollyWood")
	  public void LaunchMahesBabu()
	  {
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://en.wikipedia.org/wiki/Mahesh_Babu");
	    
	    }

}
