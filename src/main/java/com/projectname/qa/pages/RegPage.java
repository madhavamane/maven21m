package com.projectname.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegPage {

	// Declaration ==> webelements
	@FindBy(xpath="//a[text()='Sign Up']") private WebElement signuplink;	
	@FindBy(xpath="//img[@alt='Facebook']") private WebElement reg_fblogo;
	@FindBy(xpath="//a[text()='Already have an account?']") private WebElement already_acc;		
	@FindBy(name="firstname") private WebElement firstname;
	@FindBy(name="lastname") private WebElement surname;	
	@FindBy(name="reg_email__") private WebElement mob_email;
	@FindBy(name="reg_passwd__") private WebElement password;
	@FindBy(name="birthday_day") private WebElement birthdate;	
	@FindBy(name="birthday_month") private WebElement birthmonth;	
	@FindBy(name="birthday_year") private WebElement birthyear;
	@FindBy(xpath="//input[@value='2']") private WebElement gender_male;	
	@FindBy(xpath="//input[@value='1']") private WebElement gender_female;	
	@FindBy(name="reg_email_confirmation__") private WebElement Reemail;
	@FindBy(name="websubmit") private WebElement submitbtn;
	
	// Initalization.
	public RegPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// Usage
	public void ClickFbSignUpLink() {
		signuplink.click();
	}
	public void VerifyRegPagefblogo() {
		Assert.assertTrue(reg_fblogo.isDisplayed(),"The facebook logo on registration page is not displayed");
	}
	public void VerifyRegAlreadyAccount() {
		Assert.assertTrue(already_acc.isDisplayed(),"The already having an account option on registration page is not displayed");
		Assert.assertEquals(already_acc.getText(),"Already have an account?");
	}
	public void SetfbRegPagefirstName() {
		firstname.sendKeys("abc");
	}
	public void SetfbRegPageSurName() {
		surname.sendKeys("def");
	}
	public void SetfbRegPageMobileEmail() {
		mob_email.sendKeys("abc@gmail.com");
	}
	public void SetfbRegPageReEmail() {
		Reemail.sendKeys("abc@gmail.com");
	}
	public void SetfbRegPagePassword() {
		password.sendKeys("abc@gmail.com");
	}
	public void SetfbRegPageBirthday() {
		Select bday=new Select(birthdate);
		Assert.assertTrue(birthdate.isDisplayed(),"Birthday drop down is not available on website");
		Assert.assertFalse(birthdate.isSelected(), "birthdate is select initially");
		bday.selectByVisibleText("14");
	}
	public void SetfbRegPageBirthMonth() {
		Select bmonth=new Select(birthmonth);
		Assert.assertTrue(birthmonth.isDisplayed(),"birthmonth drop down is not available on website");
		Assert.assertFalse(birthmonth.isSelected(), "birthmonth is select initially");
		bmonth.selectByVisibleText("May");
	}
	public void SetfbRegPageBirthYear() {
		Select byear=new Select(birthyear);
		Assert.assertTrue(birthyear.isDisplayed(),"birthmonth drop down is not available on website");
		Assert.assertFalse(birthyear.isSelected(),"birthmonth is select initially");
		byear.selectByVisibleText("1996");		
	}
	public void SetfbRegPageGender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			gender_male.click();
		}else if(gender.equalsIgnoreCase("female")) {
			gender_female.click();
		}else {
			System.out.println("Please select valid input");
		}
	}
	public void ClickfbRegPageSubmitBtn() {
		submitbtn.click();
	}	
}
