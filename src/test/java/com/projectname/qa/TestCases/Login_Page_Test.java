package com.projectname.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Base.TestBase;
import com.projectname.qa.pages.Login_Page;

public class Login_Page_Test extends TestBase{

	
     @BeforeClass
     public void setup() {
    	 InitializeBrowser("Chrome");
	 }
	 @AfterClass
	 public void teardown() {
		  TestBase.driver.close();
	 }
	 @Test
		public void FacebookLoginPageTest() {
		 Login_Page l=new Login_Page(TestBase.driver);
		 l.VerifyfbLogin_Pagelogo();
		 l.VerifyLogin_PageTagline();
		 l.VerifyLogin_PageForgetPassword();
		 l.VerifyLogin_PageCreateNewAccount();
		 l.VerifyfbLoginPageFooterlinksize();
		 l.SetLogin_PageUsername();
		 l.SetLogin_PagePassword();
		 l.ClickLogin_PageLoginBtn();
		 
	 }	
}
