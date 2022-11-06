package com.projectname.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Base.TestBase;
import com.projectname.qa.pages.RegPage;

public class Reg_Page_Test extends TestBase {

	// Browser setup ==> validations apply ==> browser close.

	 @BeforeClass
	 public void setup() {
		 InitializeBrowser("Chrome");
	 }
	 @AfterClass
	 public void teardown() {
		  TestBase.driver.close();
	 }
	 @Test
	 public void fbRegPage_Postive() {
		 RegPage p=new RegPage(TestBase.driver);
		 p.ClickFbSignUpLink();
		 p.VerifyRegPagefblogo();
		 p.VerifyRegAlreadyAccount();
		 p.SetfbRegPagefirstName();
		 p.SetfbRegPageSurName();
		 p.SetfbRegPageMobileEmail();
		 p.SetfbRegPageReEmail();
		 p.SetfbRegPagePassword();
		 p.SetfbRegPageBirthday();
		 p.SetfbRegPageBirthMonth();
		 p.SetfbRegPageBirthYear();
		 p.SetfbRegPageGender("male");
		 p.ClickfbRegPageSubmitBtn();
	 }	
}
