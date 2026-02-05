package org.automation.WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSendkeysToPerformLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Log in")).click();
		 WebElement emailTextbox = driver.switchTo().activeElement();
		 Thread.sleep(200);
		 emailTextbox.sendKeys("vidkanase@1985gmail.com",Keys.TAB,"Admin02" ,Keys.ENTER);
		
	}

}
