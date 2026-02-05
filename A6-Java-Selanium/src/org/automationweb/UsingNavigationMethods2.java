package org.automationweb;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNavigationMethods2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.jawayezdimotorcycles.com/");
		Thread.sleep(3000);
		URL url = new URL("https://www.Suzukimotorcycles.co.in/product_hayabusa");
		driver.navigate().to(url);
		

	}

}
