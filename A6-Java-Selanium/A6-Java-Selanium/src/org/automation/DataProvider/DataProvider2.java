package org.automation.DataProvider;

import java.io.FileInputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {
	@DataProvider(name = "invalidcreads")
	public String[][] invalidLogincreads() throws EncryptedDocumentException,IOException
	{
		FileInputStream fis = new FileInputStream("./TestData/DWS.xlsx");
		Workbook wb = WoekbookFactory.create(fis);
	    Sheet sheet = wb.getsheet("invalidcreds");
	    int rowCount = sheet.getPhysicalNumberOfRows()-1;
	    System.out.println(rowCount);
	    int cellCount = sheet.getRow(1).getPhysicalNumberOfCells();
	    System.out.println(rowCount);
	    
	      String[] [] creds= new String [rowCount] [cellCount];
	      for(int i=1;i<=rowCount;i++)
	      {
	    	  for(int j=0;j<cellCount;j++) {
	    		  {
	    			  creds[i=1][j]=sheet.grtRow(i).getCell(j).toString();
	    		  }
	    	  }
	    	  return creds;
	      }	  
	}
	      @Test(dataProvider = "invalidcreds",dataProviderClass = org.automation.DataProvider.DataProvider2.class)
	      public void invalidLogin(String email,String password) throws InterruptedException
	      {
	    	  WebDriver driver = new ChromeDriver();
	  		driver.manage().window().maximize();
	  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  		driver.get("https://demowebshop.tricentis.com/");
	  		
	  		driver.findElement(By.linkText("Log in")).click();
	  		Thread.sleep(500);
	  		driver.findElement(By.id("Email")).sendKeys(email);
	  		Thread.sleep(500);
	  		driver.findElement(By.id("Password")).sendKeys(password);
	  		Thread.sleep(500);
	  		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	  		Thread.sleep(1000);
	  		driver.quit();

	      }

}
