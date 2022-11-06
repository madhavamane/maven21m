package com.projectname.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Login_Page {

	@FindBy(xpath="//img[@alt='Facebook']") private WebElement Login_fblogo;
	@FindBy(xpath="//h2[starts-with(text(),'Facebook helps you')]") private WebElement Login_fbTagline;
	@FindBy(xpath="//input[@name='email']") private WebElement username;
	@FindBy(xpath="//input[@name='pass']") private WebElement password;
	@FindBy(xpath="//button[@value='1']") private WebElement Login_btn;
	@FindBy(xpath="//a[text()='Forgotten password?']") private WebElement forget_password;
	@FindBy(xpath="//a[text()='Create New Account']") private WebElement CreateNewAccount;
	@FindBys({@FindBy (xpath="//div[@id='pageFooterChildren']//li")}) private List<WebElement> footerlinks;
	
	// initialization
	public Login_Page(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	}
	// usage
	public void VerifyfbLogin_Pagelogo() {
		Assert.assertTrue(Login_fblogo.isDisplayed(),"The fb logo on login page is not displayed.");
		Reporter.log("VerifyfbLogin_Pagelogo",true);
	}
	public void VerifyLogin_PageTagline() {
		Assert.assertTrue(Login_fbTagline.isDisplayed(),"The fb tagline on login page is not displayed.");
		Assert.assertEquals(Login_fbTagline.getText(),"Facebook helps you connect and share with the people in your life.");
		Reporter.log("VerifyLogin_PageTagline",true);
	}
	public void VerifyLogin_PageForgetPassword() {
		Assert.assertTrue(forget_password.isDisplayed(),"The forgot password link on login page is not displayed.");
		Assert.assertEquals(forget_password.getText(), "Forgotten password?");
		Reporter.log("VerifyLogin_PageForgetPassword",true);
	}
	public void VerifyLogin_PageCreateNewAccount() {
		Assert.assertTrue(CreateNewAccount.isDisplayed(),"Create New Account button is not displayed");
		Assert.assertTrue(CreateNewAccount.isEnabled(),"Create New Account button is disabled");
		Assert.assertEquals(CreateNewAccount.getText(),"Create New Account");
		Reporter.log("VerifyLogin_PageCreateNewAccount",true);
	}
	public void SetLogin_PageUsername() {
		Assert.assertTrue(username.isDisplayed(),"Username field is not displayed");
		username.sendKeys("Test@gmail.com");
		Reporter.log("SetLogin_PageUsername",true);
	}
	public void SetLogin_PagePassword() {
		Assert.assertTrue(password.isDisplayed(),"Password field is not displayed");
		password.sendKeys("abc123");
		Reporter.log("SetLogin_PagePassword",true);
	}
	public void ClickLogin_PageLoginBtn() {
		Assert.assertTrue(Login_btn.isDisplayed(),"Login is not displayed");
		Assert.assertTrue(Login_btn.isEnabled(),"Login Button is not enabled");
		Login_btn.click();
		Reporter.log("ClickLogin_PageLoginBtn",true);
	}
	public void VerifyfbLoginPageFooterlinksize() {
		Assert.assertEquals(footerlinks.size(),31);
		Reporter.log("VerifyfbLoginPageFooterlinksize",true);
	}	
}
