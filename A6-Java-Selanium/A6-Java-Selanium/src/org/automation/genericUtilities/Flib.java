package org.automation.genericUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import static org.automation.genericUtilities.FrameWorkConstants.*;
/**
 * The Class Flip is mainly used to interact with the file and fetch the Test data 
 * needed for Automating Application
 * 
 *  @author Vidya pk
 *  
 */

public class Flib
{
	

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
}

