package com.autosite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	 
	public HomePage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		driver = driver2;
	}
	public void signIn(){
	    	WebElement signin= driver.findElement(By.xpath("//a[@ title='Log in to your customer account']"));
	    	signin.click();
			
		}
}
