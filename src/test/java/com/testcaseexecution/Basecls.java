package com.testcaseexecution;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.webreusemethods.Dropdownmethod;
import com.webreusemethods.Exelload;
import com.webreusemethods.Takesscreens;

public class Basecls {
	public static Exelload eload; 
	public static Takesscreens tcs;
	public static ExtentTest logger;
	public static ExtentReports report;
	public static Dropdownmethod dropdown;
	@BeforeSuite
	public void intialexecution() {
		eload=new Exelload();
		tcs=new Takesscreens();
		 dropdown=new Dropdownmethod();
		System.out.println("exel is loaded");
		ExtentHtmlReporter extent=new ExtentHtmlReporter("E:\\srikanth\\Mercury\\ExtentReports\\MERCURYHTMLREPORTS"+Takesscreens.gettimestamp()+".html");
		 report=new ExtentReports();
		report.attachReporter(extent);
	}

   @AfterMethod
   public  void screenshotattach(ITestResult result) throws IOException {
	   Reporter.log("Attach testcases screenshots to htmlreport");
	   if(result.getStatus()==ITestResult.SUCCESS) {
		   logger.pass("success",MediaEntityBuilder.createScreenCaptureFromPath(Takesscreens.gettimestamp()).build());
		   Reporter.log("all the pass screenshots are attached");
	   }
	   else if(result.getStatus()==ITestResult.FAILURE) {
		   logger.fail("Failure",MediaEntityBuilder.createScreenCaptureFromPath(Takesscreens.gettimestamp()).build());
		   Reporter.log("all the pass screenshots are attached");
	   }
	   else
	   {
		   System.out.println("screens are not loaded");
	   }
	   report.flush();
	   Reporter.log("html reports is done");
	   
}
}