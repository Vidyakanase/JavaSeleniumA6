package org.automationWebdriverInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingTheAlignments {

	public static void main(String[] args) {
		
        WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextBox =driver.findElement(By.id("email"));
		WebElement passwordTextBox = driver.findElement(By.id("passContainer"));
		
		//Fetching the size and location of both the elements
		Dimension emailTBSize = emailTextBox.getSize();
		Dimension passwordTBSize = passwordTextBox.getSize();
		Point emailTBLoc =emailTextBox.getLocation();
		Point passWordTbSize = passwordTextBox.getLocation();
		
		//verifying the left alignment
		if(emailTBLoc.getX()==passwordTBLoc.getX())
			 System.out.println("left alignment is proper");
		else
			System.out.println("left alignment is improper");
			
		
		
	}

	}


