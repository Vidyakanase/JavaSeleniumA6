package org.autimation.mouseEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingClickAction {


	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
		WebElement button = driver.findElement(By.xpath("//button[class='No thanks']"));
		
		button.click();//click();from webElement
		Actions action = new Actions(driver);
		
		 action. doubleClick(button).perform();
		 action.moveToElement(button).doubleClick().perform();
		  			

	}

}
