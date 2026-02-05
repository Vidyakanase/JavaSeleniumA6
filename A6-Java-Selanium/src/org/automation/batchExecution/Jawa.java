package org.automation.batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.automation.WebElementMethod.*;
public class Jawa 
{
 @Test
 public void Launching42Boober()
 {
    WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.jawayezdimotorcycles.com/products/jawa-42-bobber");
	Reporter.log("Launched 42 bobber",true);
	}
 @Test
 public void LaunchingPeark()
 {
	    WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://www.jawayezdimotorcycles.com/products/jawa-42-peark");
		Reporter.log("Launched Peark",true);
 }
 
}
