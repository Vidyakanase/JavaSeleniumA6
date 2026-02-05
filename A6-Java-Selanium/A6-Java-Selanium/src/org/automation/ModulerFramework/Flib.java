package org.automation.ModulerFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


/**
 * The Class Flip is mainly used to interact with the file and fetch the Test data 
 * needed for Automating Application
 * 
 *  @author Vidya pk
 *  
 */

public class Flib {
	/**
	 * This method accepts the key and it will  fetch the value of the respective key
	 * in the given properties file 
	 * @param key[String]
	 * @return value[String]
	 */
	 public static String getPropertyValue(String key)
	   {
		   
		   File file = new File(PROPERTIES_PATH);
		   FileInputStream fis = null;
		   try {
		       fis  = new  FileInputStream(file);
		       }
		   catch(FileNotFoundException e)
		       {
			   e.printStackTrace();
		        }
		   Properties prop = new Properties();
		    try {
		       prop.load(fis);
		        }
		    catch(IOException e)
		        {
	             e.printStackTrace();
	             }
		   String value = prop.getProperty(key);
		   return value;
		   
	   }
	 public static String getNumericCellValueMethod(String sheetName,int rowNo,int cellNo) throws FileNotFoundException
	 {
		 FileInputStream fis = new  FileInputStream(EXCEL_PATH);
		 Workbook wb = 	WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet(sheetName);
		 
		 Row row = sheet.getRow(rowNo);
		 Cell cell = row.getCell(cellNo);
		 double data = cell.getNumericCellValue();
		 
		 int data1 = (int)data;
		 String value = String.valueOf(data1);
		 return value;
	 }
	 public static int generateRandomNo() 
	 {
	    Random random = new Random();
		int rn = random.nextInt(1000,9999);
		return rn;
	}
}

