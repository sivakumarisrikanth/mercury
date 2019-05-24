package com.webreusemethods;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Takesscreens {
	
	
	public void getscreens(WebDriver driver) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(screen,new File("E:\\srikanth\\Mercury\\Screenshots\\Mercury_"+gettimestamp()+".png"));
		} catch (IOException e) {
			System.out.println("screen is not captured"+e.getMessage());
		}
	}
	public static String gettimestamp() {
		DateFormat dateformat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date date=new Date();
		return dateformat.format(date);
		
	}

}
