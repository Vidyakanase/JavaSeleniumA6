package org.automation.Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToUnderstandHardAssert 
{
	@Test
	public void validLogin() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		String ecpectedWelcomepageTitle = "Demo Web Shop";
	    String expectedLoginPageTitle = "Demo Web Shop .Login";
	    Assert.assertEquals(driver.getTitle(),ecpectedWelcomepageTitle,"Welcomepage is not displed !");
	    
	    driver.findElement(By.linkText("Log in")).click();
	    Thread.sleep(500);
	    Assert.assertEquals(driver.getTitle(), expectedLoginPageTitle,"Login page is not displyed!");
	    
	    driver.findElement(By.id("Email")).sendKeys(" vidkanase1985@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.id("Password")).sendKeys("851985");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);
		driver.quit();
	    

	}

}
