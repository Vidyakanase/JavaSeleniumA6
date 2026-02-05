package org.autimation.basics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class LaunchingAllBrowsers {

	public static void main(String[] args) {
		WebDriver driver;
		Scanner Scanner = new Scanner(System.in);
		System.out.println("enter the browser name that you want to launch :");
		String browserName=Scanner.next();
		if(browserName.equalsIgnoreCase("Chrome")){
			new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("Edge"));{
			new EdgeDriver();
		} {
			System.err.println("Invalid Browser");
		}
				
	}

}
