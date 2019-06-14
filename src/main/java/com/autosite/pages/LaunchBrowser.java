package com.autosite.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {
	WebDriver driver;

	public WebDriver launchmethodBrowser(String valueXyz){
		  String browser = valueXyz;

		  if (browser.equals("chrome")){
			  System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
				driver = new ChromeDriver();
		  }
		  else if (browser.equals("firefox")){
			  System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
				driver = new FirefoxDriver();
		  }
		  else if (browser.equals("ie")){
			  System.setProperty("webdriver.ie.driver", "Resource/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
		  }
		  else {
			  throw new RuntimeException("Browser not available");
		  }
			
					
	        driver.manage().window().maximize();
	        driver.get("http://automationpractice.com");
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        
	        return driver;
		}
}
