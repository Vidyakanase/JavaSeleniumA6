package org.capturingScreenshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CapturingScreenshotOfWebElement {


	public static void main(String[] args, RemoteWebDriver product)throws IOException {
		
		LocalDateTime Idt = LocalDateTime.now();
		String TimeStamp = Idt.toString().replace(':','-');
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cricket bat for men");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[contains(text(),\" Willow Kooka_burra Cricket Bat with Extra\")]/../../../../.."));
		
		//step1:
		File src = product.getScreenshotAs(OutputType.FILE);
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	}

}
