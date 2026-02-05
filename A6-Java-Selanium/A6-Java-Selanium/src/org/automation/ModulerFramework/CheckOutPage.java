package org.automation.ModulerFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

	@FindBy (id="BillingNewAddress_CountryId") private WebElement billingAdressCountryDD;
	@FindBy(id="billing-address-select") private WebElement BillingAddressNewAddressDD;
	

	@FindBy(id = "BillingNewAddress_City") private WebElement cityTB;
	@FindBy(id="BillingNewAddress_Address1") private WebElement address1TB;
	@FindBy(id="BillingNewAddress_Address2") private WebElement address2TB;
    @FindBy(id="BillingNewAddress_ZipPostalCode") private WebElement pinCodeTB;
    @FindBy(id="BillingNewAddress_PhoneNumber") private WebElement phoneNumberTB;
    @FindBy(id="BillingNewAddress_FaxNumber") private WebElement faxNumberTB;
    @FindBy(xpath = "//input[@onclick='Billing.save()']") private WebElement billingAddressContinueButton;
    
    @FindBy(id = "shipping-address-select") private WebElement shippingAddressDD;
    
    @FindBy(xpath = "//input[@onclick='Shipping.save()']") private WebElement shippingAddressContinueButton;
    @FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")private WebElement shippingMethodContinueButton;
    @FindBy(xpath = "/input[@onclick='PaymentMethod.save()']")private WebElement paymentMethodContinueButton;
    @FindBy(xpath = "//input[@onclick='PaymentInfo.save()']") private WebElement paymentInfoContinueButton;
    @FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']") private WebElement confirmOrderContineuButton;
	private Object cofirmorderCountinueButton;
    
    public CheckOutPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }

	public WebElement getBillingAdressCountryDD() {
		return billingAdressCountryDD;
	}

	public WebElement getBillingAddressNewAddressDD() {
		return BillingAddressNewAddressDD;
	}

	public WebElement getCityTextBox() {
		return cityTB;
	}

	public WebElement getAddress1TB() {
		return address1TB;
	}

	public WebElement getAddress2TB() {
		return address2TB;
	}

	public WebElement getPincodeTB() {
		return pinCodeTB;
	}

	public WebElement getPhneNumberTB() {
		return phoneNumberTB;
	}

	public WebElement getFaxNumberTB() {
		return faxNumberTB;
	}

	public WebElement getBillingAddressContinueButton() {
		return billingAddressContinueButton;
	}

	public WebElement getShippingAddressDD() {
		return shippingAddressDD;
	}

	public WebElement getShippingAddressContinueButton() {
		return shippingAddressContinueButton;
	}

	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}

	public WebElement getPaymentMethodContinueButton() {
		return paymentMethodContinueButton;
	}

	public WebElement getPaymentInfoContinueButton() {
		return paymentInfoContinueButton;
	}

	public WebElement getConfirmOrderContineuButton() {
		return confirmOrderContineuButton;
	}
	
	//Operational Method/business logic
	public void buyProduct(String city,String address1,String pinCode,String phoneNo) throws InterruptedException 
	{
		SelectUtilitiy su=new SelectUtilitiy();
		try
		{
		 if(BillingAddressNewAddressDD.isDisplayed())	
		 {
			 su.selectByVisibleTextMethod(BillingAddressNewAddressDD,"new Address");
		 }
		}
		catch(Exception e)
		{
			su.selectByVisibleTextMethod(BillingAddressNewAddressDD, "India");
		}
		
	    su.selectByVisibleTextMethod(billingAdressCountryDD, "India");
	    cityTB.sendKeys(city);
	    address1TB.sendKeys(address1);
	    pinCodeTB.sendKeys(pinCode);
	    phoneNumberTB.sendKeys(phoneNo);
	    Thread.sleep(2000);
	    billingAddressContinueButton.click();
	    shippingMethodContinueButton.click();
	    shippingAddressContinueButton.click();
	    paymentMethodContinueButton.click();
	    paymentInfoContinueButton.click();
	    //cofirmOrderConfirmButton.click();
	    
	}
}
