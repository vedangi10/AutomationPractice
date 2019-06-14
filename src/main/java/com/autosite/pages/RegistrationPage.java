package com.autosite.pages;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
	WebDriver driver;

	public RegistrationPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		driver = driver2;
	}

	public void createAccount(){
		//String temp="vedangi";
		//for{
    	WebElement email= driver.findElement(By.id("email_create"));
    	//temp= temp +"a"";
    	email.sendKeys("vedangiKulkarni1123456@gmail.com");
		//}
    	WebElement createAccountBtn= driver.findElement(By.name("SubmitCreate"));
    	createAccountBtn.click();
    	
	}
    
    public void enterInfoRegiser(){
    	List<WebElement> gender = driver.findElements(By.name("id_gender"));
    	
    	for(WebElement radio : gender)
		{	
			System.out.println(radio.getAttribute("value"));
									
			if (radio.getAttribute("value").equals("2"))
			{			
				driver.findElement(By.id("id_gender2")).click();
				break;
			}
			else 
			{			
				driver.findElement(By.id("id_gender1")).click();
				break;
			}			
		}
    	
    	WebElement fname= driver.findElement(By.id("customer_firstname"));
    	fname.sendKeys("Vedangi");
    	
    	WebElement lname= driver.findElement(By.id("customer_lastname"));
    	lname.sendKeys("Kulkarni");
    	
    	WebElement password= driver.findElement(By.id("passwd"));
    	password.sendKeys("pass1234");
    	
    	Map<String, List<String>> map= new LinkedHashMap<>();
    	
    	WebElement dob_day= driver.findElement(By.id("days"));
    	List<WebElement> daylist= dob_day.findElements(By.tagName("option"));
    	List<String> daylist1= new LinkedList<>();
    
    	for(WebElement w: daylist){
    		String a= w.getText();
    		daylist1.add(a);
    	}
    	map.put("Day", daylist1);
    	System.out.println(map.get("Day"));
    	
    	 Select s= new Select(dob_day);
    	s.selectByValue("10");
    	
    	
    	WebElement dob_month= driver.findElement(By.id("months"));
    	List<WebElement> monthlist= dob_month.findElements(By.tagName("option"));
    	List<String> monthlist1= new LinkedList<>();
    	
    	for(WebElement w: monthlist){
    		String a= w.getText();
    		monthlist1.add(a);
    	}
    	map.put("Month", monthlist1);
    	System.out.println(map.get("Month"));
    	
    	 s=new Select(dob_month);
    	s.selectByValue("11");
    	
    	WebElement dob_year= driver.findElement(By.id("years"));
    	List<WebElement> yearlist= dob_year.findElements(By.tagName("option"));
    	List<String> yearlist1= new LinkedList<>();
    	
    	for(WebElement w: yearlist){
    		String a= w.getText();
    		yearlist1.add(a);
    	}
    	map.put("Year", yearlist1);
    	System.out.println(map.get("Year"));
    	 s=new Select(dob_year);
    	s.selectByValue("1987");
    	
    	WebElement com= driver.findElement(By.id("company"));
    	com.sendKeys("NIC");
    	
    	WebElement address= driver.findElement(By.id("address1"));
    	address.sendKeys("Streat 12");
    	
    	WebElement city= driver.findElement(By.id("city"));
    	city.sendKeys("Sector 9");
    	
    	WebElement state= driver.findElement(By.id("id_state"));
   	    Select s3=new Select(state);
   	    s3.selectByVisibleText("California");

   	    WebElement zipcode= driver.findElement(By.id("postcode"));
   	    zipcode.sendKeys("12345");
    	
   	    WebElement mobileno= driver.findElement(By.id("phone_mobile"));
   	    mobileno.sendKeys("8888888888");
   	    
   	    WebElement alter_add= driver.findElement(By.id("alias"));
   	    alter_add.sendKeys("Karve Nagar, Pune");

   	    WebElement Reg_btn= driver.findElement(By.id("submitAccount"));
   	    Reg_btn.click();
    	
		
	}
}
