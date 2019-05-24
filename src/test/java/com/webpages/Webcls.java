package com.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testcaseexecution.Basecls;
import com.webreusemethods.Exelload;

public class Webcls extends Basecls{
	Exelload eload=new Exelload();
	//pageloginobjects
	@FindBy(xpath="//a[contains(text(),'SIGN-ON')]")WebElement signontab;
	@FindBy(xpath="//input[contains(@name,'userName')]")WebElement username;
	@FindBy(xpath="//input[contains(@name,'password')]")WebElement password;
	@FindBy(xpath="//input[contains(@name,'login')]")WebElement submit_btn;
	
	public void pagelogin() {
		//String APPURL=load.getstringdata("Sheet1", 1, 0);
		String USERNAME=eload.getstringdata("Sheet1", 1, 1);
		String PASSWORD=eload.getstringdata("Sheet1", 1, 2);
		signontab.click();
		
		username.sendKeys(USERNAME);
		password.sendKeys(PASSWORD);
		submit_btn.click();
	}

}
