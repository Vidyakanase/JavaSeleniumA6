package org.automation.ModulerFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandStaleElementReference
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();
		WebElement emailTextField = driver.findElement(By.id("Email"));
		emailTextField.sendKeys("vidkanase1985@gamil.com");
		
		Thread.sleep(5000);
		WebElement passwordTextField = driver.findElement(By.id("Password"));
		
		//To Refresh the WebPage
		driver.navigate().refresh();
		
		//Because old address is used,we get 'StaleElementReferencException'
		passwordTextField.sendKeys("851985");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
		loginButton.click();
		
	}

}
