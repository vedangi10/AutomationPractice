package com.autosite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	 public LoginPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		 driver = driver2;
	}
	public void login(){

	    	WebElement uname= driver.findElement(By.id("email"));
	    	uname.sendKeys("Vedangi@gmail.com");
	    	
	    	WebElement pw= driver.findElement(By.id("passwd"));
	    	pw.sendKeys("pass1234");
	    	
	    	WebElement signin_btn= driver.findElement(By.id("SubmitLogin"));
	    	signin_btn.click();
		} 
}
