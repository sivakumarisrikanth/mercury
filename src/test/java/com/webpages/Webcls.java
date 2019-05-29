package com.webpages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.testcaseexecution.Basecls;
import com.webreusemethods.Dropdownmethod;
import com.webreusemethods.Exelload;

public class Webcls extends Basecls{
	Dropdownmethod dropdown=new Dropdownmethod();
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
	@FindBy(xpath="//input[@value='oneway']")WebElement oneway;
	@FindBy(xpath="//select[@name='passCount']")WebElement passcount;
	@FindBy(xpath="//select[@name='fromPort']")WebElement fromport;
	@FindBy(xpath="//select[@name='fromMonth']")WebElement frommonth;
	@FindBy(xpath="//select[@name='toPort']")WebElement toport;
	@FindBy(xpath="//select[@name='fromDay']")WebElement from_day;
	@FindBy(xpath="//select[@name='toMonth']")WebElement tomonth;
	@FindBy(xpath="//select[@name='toDay']")WebElement today;
	

	public  void flight_details() {
		oneway.click();
		dropdown.selectvaluefromdropdown(passcount, 1);
		dropdown.selectvaluefromdropdown(fromport, 1);
		dropdown.selectvaluefromdropdown(frommonth, 5);
		dropdown.selectvaluefromdropdown(from_day, 28);
		dropdown.selectvaluefromdropdown(toport, 8);
		dropdown.selectvaluefromdropdown(tomonth, 6);
		dropdown.selectvaluefromdropdown(today, 28);
	}
	@FindBy(xpath="//input[@value='Business']")WebElement clickradio_bussiness;
	@FindBy(xpath="//select[@name='airline']")WebElement selectairline;
	@FindBy(xpath="//input[@name='findFlights']")WebElement clickcontinue;
	public void preferences(){
		clickradio_bussiness.click();
		dropdown.selectvaluefromdropdown(selectairline, 2);
		clickcontinue.click();
		
	}
	@FindBy(xpath="//table[@border=\"0\"]/tbody/tr[4]/td")List<WebElement> allelements;
	public void departflights() {
		int count=allelements.size();
		System.out.println(count);
		for(int i=0;i<count-1;i++) {
			String textofelements=allelements.get(i).getText();
			System.out.println(textofelements);
		}
		
		
		
	}

}
