package org.autimation.keyboardEvent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PassingDataInOrangeHRM2 {

	public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php"); 
		    WebElement userNameTextBox = driver.findElement(By.name("username"));
		    WebElement passwordTextBox  = driver.findElement(By.name("password"));
		  
		    Actions actions = new Actions(driver);
		    actions.sendKeys(userNameTextBox, "Admin").sendKeys(passwordTextBox, "admin123").keyDown(Keys.ENTER).perform();
		    
		   // actions.moveToElement(userNameTextBox).sendKeys("admin,").moveToElement(passwordTextBox)
		   // click().sendKeys("admin123" ).keyDown(Keys.ENTER).perform();
		} 
	}	  


