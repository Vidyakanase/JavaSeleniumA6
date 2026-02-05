package org.automation.DataProvider;

import java.io.FileInputStream;
import java.util.Set;

import org.bouncycastle.openssl.EncryptionException;

public class ToReadMultipuleDatasFromExcel {
	

	public static void main(String[] args) throws EncryptionException{
		
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
    	  for(String[]arr:creds)
    	  {
    		  for(String data:arr)
    		  {
    			  System.out.print(data+",");
    		  }
    		  System.out.println();
    	  }
      }
	}
}
