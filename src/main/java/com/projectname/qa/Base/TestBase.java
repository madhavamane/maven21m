package com.projectname.qa.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBase {
 
	public static  WebDriver driver;
	
	
	public void InitializeBrowser(String browser) {
	  if(browser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\madha\\Desktop\\java\\chromedriver.exe");
	    driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Edge")){
			 System.setProperty("webdriver.edge.driver", "C:\\Users\\madha\\Desktop\\java\\edgedriver_win64\\msedgedriver.exe");
			 driver = new EdgeDriver();	
		}else {
			System.out.println("Wrong browser is selected");
		}
	   driver.get("https://www.facebook.com/");
	   driver.manage().deleteAllCookies();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	   
	}
}