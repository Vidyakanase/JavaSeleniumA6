package org.automation.locatorStratagies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingPriceOfProdctOnamezon {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amezon.in/");
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("noise Earbuds");
	    driver.findElement(By.id("'nav-search-submit-button")).click();
	   // WebElement priceElement = (WebElement) driver.findElements(By.xpath(""))
	    
		
	}

}
