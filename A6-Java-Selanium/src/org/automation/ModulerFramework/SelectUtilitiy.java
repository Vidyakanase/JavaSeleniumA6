package org.automation.ModulerFramework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtilitiy 
{
	//To Select an option its visible text
	public void selectByVisibleTextMethod(WebElement DropDownElement, String visibleText)
	{
	   Select sel= new Select(DropDownElement);
	   sel.deselectByVisibleText(visibleText);
	}
}	