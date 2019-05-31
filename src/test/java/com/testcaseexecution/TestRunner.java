package com.testcaseexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.webpages.Comparetest;
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
  tcs.getscreens(driver);
  // cm.browserclose();
 // Webcls cls= PageFactory.initElements(driver,Webcls.class );
 //  cls.pagelogin();
  logger=report.createTest("login is completed successfully");
   tcs.getscreens(driver);
  // cls.flight_details();
  // cls.preferences();
 // cls.departflights();
  // cls.sign_offtab();
  // cls.register_details();
   Comparetest ct=PageFactory.initElements(driver, Comparetest.class);
   ct.destinationtest();
   ct.vacationtest();
   ct.registertest();
   ct.linktest();
   ct.dropdowntext();
}
	
}
