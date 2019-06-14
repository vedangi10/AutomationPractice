package com.autosite.pages;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class autoSiteTest {
	WebDriver driver;	
	
	  @Test
	  public void f() {
		  
		  HomePage hp = new HomePage(driver);
		  hp.signIn();
		  
		  RegistrationPage r = new RegistrationPage(driver);
		 // r.createAccount();
		 // r.enterInfoRegiser();
		  
		 /* LogoutPage lg= new LogoutPage(driver);
		  lg.logout();
		  
		 LoginPage lp = new LoginPage(driver);
		  lp.login();
		  
	      DressesPage dp = new DressesPage(driver);
	      dp.selectDress();
	      
		  ShoppingCartPage sp = new ShoppingCartPage(driver);
		  sp.shoppingCart(); */
		
		  
	  }
	  
	  @Parameters("myBrowser")
	  @BeforeTest
	  public void beforeTest(String valueXyz) {
		 	  
		  LaunchBrowser lb = new LaunchBrowser();
		  WebDriver dri=lb.launchmethodBrowser(valueXyz);
		  driver=dri;
	  }
	/*
	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }*/

}
