package org.automation.locatorStratagies;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLocateTheLoginButtonUsingClassName {


	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	     driver.findElements(By.linkText("log in")).click();
		driver.findElement(By.id("Email")).sendKeys("vidyakanase@1985");
		driver.findElement(By.id("Password")).sendKeys("kanase@1985");
		driver.findElement(By.className("login-Button")).clear();
	}

}
