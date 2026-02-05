package org.autimation.mouseEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingDoubleClickAction {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		 driver.get("https://omayo.blogspot.com/");
		 WebElement button = (WebElement) driver.findElements(By.xpath("//button[contains(text() ,' Double click' )]"));
		 Actions action = new Actions(driver);
		 
		 action. doubleClick(button).perform();
		 action.moveToElement(button).doubleClick().perform();
		  

	}

}
