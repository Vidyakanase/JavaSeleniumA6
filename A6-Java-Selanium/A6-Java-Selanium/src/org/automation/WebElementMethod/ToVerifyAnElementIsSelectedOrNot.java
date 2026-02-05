package org.automation.WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyAnElementIsSelectedOrNot {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	    WebElement penCheckBox = driver.findElement(By.xpath("//input[@value='Pen'and @name]"));
	    WebElement BookCheckBox =driver.findElement(By.xpath("//input[@value='Book'"));
	    System.out.println(penCheckBox.isSelected()?
	         "pencheckbox is selected":"penCheckBox is not selected");
	    
	    System.out.println(BookCheckBox.isSelected()?
	           "BookCheckBox is selected":"BookCheckBox is not selected");		
	    		
	}

}
