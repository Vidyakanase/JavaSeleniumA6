package org.automation.ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KLRahul 
{
	 @Test
	   public void LaunchWiki()
	   {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://en.wikipedia.org/wiki/KL_Rahul");
		}

}
