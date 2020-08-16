package com.qa.verizon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.verizon.base.BasePage;
import com.qa.verizon.util.ElementUtil;

public class PhonePage  extends BasePage{

WebDriver driver;
ElementUtil elementUtil;
 
By color = By.id("#d0c2ae");
By size = By.id("512GB");
By price = By.id("pricingOption1");
By continueBtn = By.id("ATC-Btn");
By zipCode =By.id("zipcode");
By confirmBtn =By.className("defaultPrimaryCTA ");
By newCustomer = By.className("margin30");
By cartSign = By.xpath("//a[@class='cart-icon ']");


public PhonePage(WebDriver driver){
	this.driver=driver;
	elementUtil =  new ElementUtil(driver);
}
public String getPageTitle(){
	return elementUtil.doGetPageTitle();
}


public void selectPhone(){
elementUtil.getElement(color);
elementUtil.getElement(size);
elementUtil.getElement(price);
elementUtil.doClick(continueBtn);
elementUtil.doSendKeys(zipCode," 07601");
elementUtil.doClick(confirmBtn);
elementUtil.doClick(newCustomer);
elementUtil.doClick(cartSign);
	
	
	
	
}
}
