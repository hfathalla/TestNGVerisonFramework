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
import com.qa.verizon.util.AppConstants;

public class HomePageTest {

WebDriver driver;
BasePage basePage;
Properties prop;
HomePage homePage;

@BeforeTest
public void setUp(){
	basePage = new BasePage();
	prop = basePage.int_properties();
	String browserName= prop.getProperty("browser");
	driver = basePage.init_driver(browserName);
	driver.get(prop.getProperty("url"));
	homePage=new HomePage(driver);
	
}
@Test(priority = 1)
public void verifyPageTitleTest() throws InterruptedException{
Thread.sleep(5000);
String title = homePage.getPageTitle();
System.out.println("home page title is "+ title);
Assert.assertEquals(title, "Verizon Wireless, Smartphone Deals & Plans | First to 5G");

}
@Test(priority =2)
public void verifySmartphoneTest(){
	
homePage.clickOnSmartPhones();

}




@AfterTest
public void tearDown(){
	driver.quit();
}

}
