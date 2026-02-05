package org.automation.ModulerFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonePage 

{
	//Deceleration
	@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@value='Add to cart']")
	private WebElement cellPhoneAddTocartButton;
	@FindBy(xpath = "//p[contains(text(),'The product')]")private WebElement productAddToCartMsg;
	
	public  CellPhonePage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	

	 //Initialization
     public WebElement getCellPhoneAddTocartButton() {
		return cellPhoneAddTocartButton;
	}

	public WebElement getProductAddToCartMsg() {
		return productAddToCartMsg;
		
	}
}
 