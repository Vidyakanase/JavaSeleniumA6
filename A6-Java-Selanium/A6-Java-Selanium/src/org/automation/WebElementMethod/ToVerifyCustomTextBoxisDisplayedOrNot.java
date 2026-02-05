package org.automation.WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyCustomTextBoxisDisplayedOrNot {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		WebElement coustomGenderTextBox = driver.findElement(By.id("custom_gender"));
		
		if(!coustomGenderTextBox.isDisplayed())
		{
			driver.findElement(By.xpath("//label[text()='Custom']/input")).click();
			
		}
		coustomGenderTextBox.sendKeys("LGBTQ+");
		
	}

}
