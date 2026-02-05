package org.automation.ModulerFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletePage 
    //Deceleration
	{
	@FindBy(xpath="strong[text()='Your order has been successfully processed']")
	private WebElement orderPlaceMsg;
	
	//Initialization
	public CompletePage(WebDriver driver)
	{

		PageFactory.initElements( driver,this);
	}

    //Utilization
	public WebElement getOrderPlaceMsg() {
		return orderPlaceMsg;
	}
	
	
}