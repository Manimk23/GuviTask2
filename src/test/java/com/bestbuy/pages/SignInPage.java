package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;

public class SignInPage extends SeWrappers 

{
	
	@FindBy(xpath = "//img[@alt='United States']")
	WebElement country;

	@FindBy(xpath = "//span[text()='Account']")
	WebElement Account;
	
	@FindBy(xpath = "//a[text()='Sign In']")
	WebElement signin;
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath ="//button[text()='Sign In']")
	WebElement login;
	
	public void clickflag() 
	{
		country.click();
	}
	
	public void clickAccount()
	{
		Account.click();
	}
	
	public void clickSignin() 
	{
		signin.click();
	}
	
	public void Setmail(String mailid)
	{
		typeText(email, mailid);
	}
	
	public void Setpass(String pswd)
	{
		typeText(password, pswd);
	}
	
	public void clicklogin()
	{
		login.click();
	}

	
}
