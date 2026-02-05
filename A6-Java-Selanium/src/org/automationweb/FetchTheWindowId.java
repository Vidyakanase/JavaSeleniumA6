package org.automationweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTheWindowId {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		String WindowID =driver.getWindowHandle();
		System.out.println(WindowID);
		
	   
		

	}

}
