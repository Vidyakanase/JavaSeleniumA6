package org.automation.ModulerFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	@FindBy(xpath = "//a[text()='Smartphone']/../..//input[@name='removefromcart']")
	private WebElement smartPhoneCartItem;
	
	@FindBy(name="upadtecart")private WebElement upadteCartButton;
	@FindBy(name="continueshopping")private WebElement ContinueShoppingButton;
	@FindBy(id="termofService")private WebElement termsOfServiceCheckbox;
	@FindBy(id="checkout")private WebElement CheckOutButton;
	
	//initialization
	public ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this );
	}
   //utilization
	public WebElement getSmartPhoneCartItem() {
		return smartPhoneCartItem;
	}

	public WebElement getUpadteCartButton() {
		return upadteCartButton;
	}

	public WebElement getContinueShoppingButton() {
		return ContinueShoppingButton;
	}

	public WebElement getTermsOfServiceCheckbox() {
		return termsOfServiceCheckbox;
	}

	public WebElement getCheckOutButton() {
		return CheckOutButton;
	}
	public void removeSmartPhoneMethod() {
		
		
	}
	
	

}
