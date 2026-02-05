package org.automationweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNavigationMethods {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.get("https://www.Zeptonow.com/");
		Thread.sleep(2000);
		//to navigateback to flipkart
		driver.navigate().back();
		Thread.sleep(2000);
		//to navigate forward to zepto
		driver.navigate().forward();
		Thread.sleep(2000);
		//to reload or refresh zepto
		driver.navigate().refresh();
		

	}

}
