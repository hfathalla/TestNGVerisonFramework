package com.qa.verizon.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.verizon.base.BasePage;
import com.qa.verizon.pages.HomePage;
import com.qa.verizon.pages.PhonePage;
import com.qa.verizon.pages.SmartPhonePage;
import com.qa.verizon.util.AppConstants;

public class SmartPhonePageTest {
WebDriver driver;
BasePage basePage;
Properties prop;
HomePage homePage;
SmartPhonePage smartPhonePage;

@BeforeMethod
public void setUp(){
	basePage = new BasePage();
	prop = basePage.int_properties();
	String browserName= prop.getProperty("browser");
	driver = basePage.init_driver(browserName);
	driver.get(prop.getProperty("url"));
	
	homePage=new HomePage(driver);
smartPhonePage=homePage.clickOnSmartPhones();

}
@Test(priority = 1)
public void verifyPageTitleTest() throws InterruptedException{
Thread.sleep(5000);
String title =smartPhonePage.getPageTitle();
System.out.println("smatphone page  title is "+ title);
Assert.assertEquals(title, "Smartphones - Buy The Newest Cell Phones | Verizon Wireless");

}

@Test(priority= 2)
public void VerfiyPhone(){
	smartPhonePage.chossePhone();
	
}
@AfterMethod
public void tearDown(){
	driver.quit();

}





}