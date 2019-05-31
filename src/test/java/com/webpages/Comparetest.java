package com.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.webreusemethods.Dropdownmethod;

public class Comparetest extends Dropdownmethod {
	Dropdownmethod dropdown=new Dropdownmethod();
	@FindBy(xpath="//a[contains(text(),'Home')]")WebElement home;
	@FindBy(xpath="//a[contains(text(),'your destination')]")WebElement destination;
	//@FindBy(xpath="//font[contains(@face,'Arial, Helvetica, sans-serif, Verdana')]")WebElement destination1;
	
	
	
	
	public void destinationtest() {
		
		home.click();
		//destination.click();
		String test=destination.getText();
		//String title=destination1.getText();
		System.out.println(test);
		//System.out.println(title);
		Assert.assertEquals(test, "your destination");
		System.out.println("test is matched");
	/*	if(test=="your destination") {
			System.out.println("test is matched");
		}
		else
		{
			System.out.println("test is not matched");
		}*/
	}
	@FindBy(xpath="//a[contains(text(),'featured vacation destinations')]")WebElement vacation;
	public void vacationtest() {
		String title=vacation.getText();
		System.out.println(title);
		Assert.assertEquals(title, "featured vacation destinations");
		System.out.println("title is matched");
	}
	
	@FindBy(xpath="//a[contains(text(),'featured vacation destinations')]/following::a")WebElement register;
	public void registertest() {
		String test1=register.getText();
		System.out.println(test1);
		Assert.assertEquals(test1, "Register here");
		System.out.println("test1 is matched");
	}
	@FindBy(xpath="//a[contains(text(),'featured vacation destinations')]/following::a[2]")WebElement link;
	public void linktest() {
	String test2=link.getText();
	System.out.println(test2);
	Assert.assertEquals(test2, "Business Travel @ About.com");
	System.out.println("test2 is matched");
	
	}
	@FindBy(xpath="//a[text()='REGISTER']")WebElement clickregister;
	@FindBy(xpath="//select[@name='country']")WebElement dropdown1;
	public void dropdowntext() {
		clickregister.click();
		Select sel=new Select(dropdown1);
		
       java.util.List<WebElement> options = sel.getOptions(); 
        for(WebElement item:options) 
        { 
        
             System.out.println("Dropdown values are "+ item.getText());           
           }
		sel.getOptions();
	}
}
