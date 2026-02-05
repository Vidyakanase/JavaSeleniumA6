package org.automation.locatorStratagies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingaddToCartButtonInAmezon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amezon.in/");
		driver.findElement(By.xpath("//button[text() ='Continue shopping']")).click();
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone 16");
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    driver.findElement(By.xpath("//img[@alt=\"Apple iPhone 15 (128 GB) - Black\"]/../../../../../../../..//button[text()='Add to cart']")).click();
	    driver.findElement(By.id("#nav-cart-count")).click();

	}

}
