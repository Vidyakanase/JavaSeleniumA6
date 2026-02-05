package org.autimation.mouseEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformingClickAndHoldNRealeaseEvent {

	public static void main(String[] args) {
	
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Harsha%20G%20R/Downloads/DragDrop.html");

	}

}
