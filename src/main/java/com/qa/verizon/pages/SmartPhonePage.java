package com.qa.verizon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.verizon.base.BasePage;
import com.qa.verizon.util.ElementUtil;

public class SmartPhonePage extends BasePage {

	WebDriver driver;
	
	ElementUtil elementUtil;
	
	//By smartPhone=By.id("thirdLevel00");
	By appleiPhone11Pro = By.xpath("//a[@aria-label='Apple iPhone 11 Pro']");
	
public  SmartPhonePage(WebDriver driver){
	this.driver = driver;
	elementUtil =new ElementUtil(driver);
}
public String getPageTitle(){
	return elementUtil.doGetPageTitle();
}
public PhonePage chossePhone(){
	//elementUtil.doClick(smartPhone);
	elementUtil.doClick(appleiPhone11Pro);
	return new PhonePage(driver);
}
}
