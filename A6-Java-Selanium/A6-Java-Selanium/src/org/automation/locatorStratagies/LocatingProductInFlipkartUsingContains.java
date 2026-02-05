package org.automation.locatorStratagies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingProductInFlipkartUsingContains {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Motorola Edge 60 pro");
	    driver.findElements(By.xpath("//button[contains(@title,'Search')]"))).click();
	    driver.findElement(By.xpath("//div[contains(text(),'60 pro (Pantons Sparkling Grape, 256 GB)')]")).click();

	}

}
