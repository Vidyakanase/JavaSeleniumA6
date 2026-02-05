package org.automation.ModulerFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	//Deceleration
    
	@FindBy(id = "Email")private WebElement emailTB;
    @FindBy(id = "Password")private WebElement PasswordTB;
    @FindBy(id = "RememberMe")private WebElement RememberMeCheckBoxT;
    @FindBy(linkText = "Forgot Password")private WebElement ForgotPasswordLink;
    @FindBy(xpath = "//input[@value='Log in']")private WebElement loginButton;
    
    //Initialization
    public LoginPage(WebDriver driver) 
    {
    	PageFactory.initElements( driver,this);
    }

	//Utilization
	public WebElement getLoginEmailTB() {
		return  getLoginEmailTB();
	}

	public WebElement getPasswordTB() {
		return PasswordTB;
	}

	public WebElement getRememberMeCheckBoxT() {
		return RememberMeCheckBoxT;
	}

	public WebElement getForgotPasswordLink() {
		return ForgotPasswordLink;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
    
}