package com.testcaseexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.webpages.Webcls;
import com.webreusemethods.CommonMethods;

public class TestRunner extends Basecls {
	 WebDriver driver;
	CommonMethods cm=new CommonMethods();
	@Test
	public void baseexecution() {
		logger=report.createTest("mercury login");
		logger.info("mercury login with valid creditionls");
  driver= cm.GetBrowser("Chrome");
 // tcs.getscreens(driver);
  // cm.browserclose();
  Webcls cls= PageFactory.initElements(driver,Webcls.class );
   cls.pagelogin();
   logger=report.createTest("login is completed successfully");
   //tcs.getscreens(driver);
}
	
}
