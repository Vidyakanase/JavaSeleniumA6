package org.automation.TestNGLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UnderstandingPriority {
	
	@Test(priority = 4)
	public void launchingKalkiFashion()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.kalkifashion.com/");
		
	} 
	
	@Test(priority = -1)
	public void launchingPurple()
	{
    	WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https:www.purple.com/");
	}
	@Test
	public void launchingFullyFilmy()

	{  WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://fullyfilmy.com/");
}}
