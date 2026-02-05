package org.automation.ModulerFramework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RagisterPage
{
	@FindBy(id = "gender-male")private WebElement maleRadioButton;
	@FindBy(id = "gender-male")private WebElement femaleRadioButton;
	@FindBy(id = "First name:")private WebElement firstNameTB;
	@FindBy(id = "Email:")private WebElement emailTB;
	@FindBy(id = "Password")private WebElement passwordTB;
	@FindBy(id = "Confirm password")private WebElement confirmPasswordTB;
	@FindBy(id = "register-button")private WebElement ragistrationButton;

	//Initialization
	public RagisterPage(WebElement driver) 
	{
		PageFactory.initElements( driver,this);
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	public WebElement getEmailTB() {
		return emailTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getConfirmPasswordTB() {
		return confirmPasswordTB;
	}

	public WebElement getRagistrationButton() {
		return ragistrationButton;
	}
}
