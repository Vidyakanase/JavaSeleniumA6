package org.automation.ModulerFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage 
{
	//Deceleration
	@FindBy(partialLinkText = "Cell phones")private WebElement cellPhoneLink;
	@FindBy(partialLinkText = "Camera,photo")private WebElement cameraPhotosLink;
	
	//Initialization
	public  ElectronicsPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
    
	//Utilization
	public WebElement getCellPhoneLink() {
		return cellPhoneLink;
	}

	public WebElement getCameraPhotosLink() {
		return cameraPhotosLink;
	}
	


}