package com.testcaseexecution;

import org.testng.annotations.BeforeSuite;

import com.webreusemethods.Exelload;
import com.webreusemethods.Takesscreens;

public class Basecls {
	public static Exelload eload; 
	public static Takesscreens tcs;
	@BeforeSuite
	public void intialexecution() {
		eload=new Exelload();
		tcs=new Takesscreens();
		System.out.println("exel is loaded");
	}


}
