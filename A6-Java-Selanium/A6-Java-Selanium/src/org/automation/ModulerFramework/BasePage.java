package org.automation.ModulerFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
   //Declaration
public class BasePage {
	@FindBy(linkText="Register")private WebElement registerLink;
    @FindBy(linkText="Log in" )private WebElement loginLink;
    @FindBy(xpath="//span[text()='ShoppingCart")private WebElement shoppingCartLink;
    @FindBy(xpath="//span[text()='Wishlist']")private WebElement WishlistLink;
    @FindBy(partialLinkText="BOOKES")private WebElement booksLink;
    @FindBy(partialLinkText="COMPUTERS")private WebElement computerLink;
    @FindBy(partialLinkText="ELECTRONICS")private WebElement electronicsLnk;
    @FindBy(linkText="Log Out")private WebElement logOutLink;
    
    //Initialization
    public BasePage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    //Utilization
   public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWislistLink() {
		return WishlistLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputerLink() {
		return computerLink;
	}

	public WebElement getElectronicsLnk() {
		return electronicsLnk;
	}

	public WebElement getLogOutLink() {
		return logOutLink;
	}
    
}
