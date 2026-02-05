package org.automation.locatorStratagies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssSelectorInAmezonWebPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Mobiles")).click();
		driver.findElement(By.cssSelector("img[alt='S24']")).click();

	}

}
