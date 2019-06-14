package com.autosite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {
	WebDriver driver;
	 public ShoppingCartPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		 driver = driver2;
	}
	public void shoppingCart(){
	    	
	    	WebElement summary_chkout_btn = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
	    	summary_chkout_btn.click();	
	    	
	    	WebElement address_chkout_btn = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
	    	address_chkout_btn.click();
	    	
	    	
	    	WebElement shipping_chkbox = driver.findElement(By.id("cgv"));
	    	shipping_chkbox.click();
	    	
	    	JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,3000)","");
	    	
	    	WebElement shipping_chkout_btn = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
	    	shipping_chkout_btn.click();
	    	
	    	WebElement paymentOption = driver.findElement(By.xpath("//a[@title= 'Pay by bank wire']"));
	    	paymentOption.click();
	    	
	    	
	}
}
