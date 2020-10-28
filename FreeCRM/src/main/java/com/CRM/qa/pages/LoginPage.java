package com.CRM.qa.pages;

import com.CRM.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends TestBase{
	
	//Page Factory/OR
	@FindBy(linkText = "Log In")
	WebElement loginLink;
	@FindBy(name = "email")
	WebElement email;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(className = "ui fluid large blue submit button")
	WebElement loginBtn;
	@FindBy(linkText="Sign Up")
	WebElement signUpLink;
	
	
	
	//Constructor to initialize the elements using driver
	public LoginPage() {	
		PageFactory.initElements(driver, this);	
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();		
	}
	public HomePage login(String un, String pwd) {
		loginLink.click();
		email.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
}
