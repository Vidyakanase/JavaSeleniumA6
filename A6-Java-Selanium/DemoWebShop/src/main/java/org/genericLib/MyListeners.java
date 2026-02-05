package org.genericLib;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import zmq.ZError.IOException;

public class MyListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("[Testcase"+result.getName()+"has started]");
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("[TestCase"+result.getName()+"has successfully executed]");
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("[TestCase"+result.getName()+"has failed]");
		String Ldt = LocalDateTime.now().toString();
		String dateTime = Ldt.replaceAll(":","-");
		
	    TakesScreenshot ts = (TakesScreenshot) ;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./ErrorShots/"+result.getName()+dateTime+".png");
	 try {
		 FileHandler.copy(src, dest);
	 }
	  catch(IOException e) {
		  e.printStackTrace();
	  }
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("[TestCase"+result.getName()+"has skiped]",true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("[TestCase"+result.getName()+"has with some success percentage]",true);
		
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
