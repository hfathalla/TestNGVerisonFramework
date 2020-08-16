package com.qa.verizon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.verizon.base.BasePage;
import com.qa.verizon.util.AppConstants;
import com.qa.verizon.util.ElementUtil;

public class HomePage extends BasePage {
	
	
WebDriver driver;
ElementUtil elementUtil;

By phoneList = By.id("secondLevel0");
By smartphoneList = By.id("thirdLevel00");

public HomePage(WebDriver driver){
	this.driver =driver;
	elementUtil =new ElementUtil(driver);
}

public String getPageTitle(){
	return elementUtil.doGetPageTitle();
}
public SmartPhonePage clickOnSmartPhones(){
	elementUtil.getElement(phoneList);
	elementUtil.doClick(smartphoneList);
	return new SmartPhonePage(driver);
}

}
