package com.webreusemethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.testcaseexecution.Basecls;

public class CommonMethods extends Basecls {
	/*
	 Date:22/05/2019
	 name:sivakumari;
	 Testdescription:This is for browser launching;
	 
	 */
	
	 public static WebDriver driver;
    public WebDriver GetBrowser(String Browser) {
	if(Browser.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver","E:\\srikanth\\Mercury\\BrowserDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://newtours.demoaut.com/mercuryregister.php");
		String url=eload.getstringdata("Sheet1", 1, 0);
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		System.out.println("Browser is launched");
	}

	else if(Browser.equals("FIREfox")) {
		System.setProperty("WebDriver.gecko.driver","E:\\srikanth\\Mercury\\BrowserDrivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		System.out.println("Browser is launched");
		
	}
	else if(Browser.equals("IE")) {
		System.setProperty("WebDriver.IE.driver","E:\\srikanth\\Mercury\\BrowserDrivers\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		System.out.println("Browser is launched");
		
	}
	return driver;
	
}
    public void browserclose() {
    	driver.quit();
    }
}
