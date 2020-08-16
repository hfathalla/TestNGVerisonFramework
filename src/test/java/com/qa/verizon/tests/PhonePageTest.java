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

public class PhonePageTest {
WebDriver driver;
BasePage basePage;
Properties prop;
HomePage homePage;
SmartPhonePage smartPhonePage;
PhonePage phonePage;


@BeforeTest
public void setUp(){
	basePage = new BasePage();
	prop = basePage.int_properties();
	String browserName= prop.getProperty("browser");
	driver = basePage.init_driver(browserName);
	driver.get(prop.getProperty("url"));
	homePage=new HomePage(driver);
smartPhonePage =homePage.clickOnSmartPhones();
phonePage =smartPhonePage.chossePhone();
}

@Test(priority = 1)
public void verifyPageTitleTest() throws InterruptedException{
Thread.sleep(5000);
String title = phonePage.getPageTitle();
System.out.println("phone page title is "+ title);
Assert.assertEquals(title, AppConstants.IPHONE_PAGE_TITLE);

}
@Test(priority=2)
public void verfiyselectPhone(){
	phonePage.selectPhone();
}
@AfterTest
public void tearDown(){
	driver.quit();
}
}