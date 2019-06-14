package com.autosite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {
	WebDriver driver;
	public LogoutPage(WebDriver driver2) {
			// TODO Auto-generated constructor stub
		driver = driver2;
		}
	public void logout(){
	    	
	    	WebElement logout= driver.findElement(By.xpath("//a[@ title='Log me out']"));
	    	logout.click();	
	    	
		}
}
