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
  driver= cm.GetBrowser("Chrome");
  tcs.getscreens(driver);
  // cm.browserclose();
  Webcls cls= PageFactory.initElements(driver,Webcls.class );
   cls.pagelogin();
   tcs.getscreens(driver);
}
	
}
