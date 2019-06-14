package com.autosite.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DressesPage {
	WebDriver driver;
	 public DressesPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		 driver = driver2;
	}
	public void selectDress(){
	    	WebElement dresses= driver.findElement(By.xpath("(//a[@ title='Dresses'])[2]"));
	    	dresses.click();	
	    	
	    	
	    	/*
	    	List <WebElement> dress= driver.findElements(By.className("available-now"));
	    	for (int i=0; i<=dress.size();i++){
	    		dress.get(0).click();
	    		break;
	    	}*/
	    	
	    	WebElement dressimg = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[1]"));
	    	dressimg.click();
	    	
	    	WebElement addcartbutton = driver.findElement(By.xpath("//span[text()='Add to cart']"));
	    	addcartbutton.click();	
	    			
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			WebElement checkOut = driver.findElement(By.xpath("//span[contains (text(),'Proceed to checkout')]"));
			checkOut.click();    	
	    	
		}


}
