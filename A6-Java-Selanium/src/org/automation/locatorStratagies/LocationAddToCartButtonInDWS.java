package org.automation.locatorStratagies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationAddToCartButtonInDWS {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("APPRAL & SHOES")).click();
		driver.findElement(By.xpath("//a[text()='Blue Jeans']/../..//input[@value = 'Add to cart']")).click();
		Thread.sleep(5000);
         driver.findElements(By.xpath("//span[text() ='Shoppinf cart']"));
	}
}