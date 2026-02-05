package org.autimation.HandelingIFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingOnFrameInDream11 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/fantasy-sports");
		//1. using frame(int index)
		//driver.switchTo().frame(0);
		
		//2.using frame(String nameOrId)
		//driver.switchTo().frame("send-sms-iframe");
		
		//3.using frame (webElement frameElement)
		WebElement frameElement =driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.id("regEmail")).sendKeys("9881220367");
		driver.findElement(By.linkText("GET APP LINK")).click();
		
		//4.defaultContent();
		//used to bring control back to main page or default content
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Industry Overview")).click();
		
	}

}
