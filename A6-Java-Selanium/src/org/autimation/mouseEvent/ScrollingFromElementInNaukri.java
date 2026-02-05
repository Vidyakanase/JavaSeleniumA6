package org.autimation.mouseEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingFromElementInNaukri {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://resume.naukri.com/");
		WebElement target = driver.findElement(By.xpath("//span[text()='RESUME WRITING']"));
		Actions actions = new Actions(driver);
		
		actions.scrollToElement(target).scrollByAmount(0,250 ).perform();
		target.click();

			

	}

	
		
		
	}


