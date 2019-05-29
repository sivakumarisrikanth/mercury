package com.webreusemethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdownmethod {
	public  void selectvaluefromdropdown(WebElement element,int index) {
	Select sel=new Select(element);
	sel.selectByIndex(index);
	}
	public void selectvaluefromdropdownbytext(Web)

}
