package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;

public class Accountpage extends SeWrappers {

	@FindBy(xpath = "//img[@alt='United States']")
	WebElement country;

	@FindBy(xpath = "//span[text()='Account']")
	WebElement Account;

	@FindBy(xpath = "//a[text()='Create Account']")
	WebElement signup;

	@FindBy(name = "firstName")
	WebElement firstName;

	@FindBy(name = "lastName")
	WebElement lastName;

	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "fld-p1")
	WebElement pass;

	@FindBy(name = "reenterPassword")
	WebElement RePass;

	@FindBy(name = "phone")
	WebElement phone;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath ="//strong[text()='An account with this email already exists.']")
	WebElement text;
	
	public void clickCountry() 
	{
		country.click();
	}

	public void clickAccount() {
		Account.click();

	}

	public void clickCrAcc() {
		signup.click();
	}

	public void SetFname(String fname) {
		typeText(firstName, fname);

	}

	public void SetLname(String lname) {
		typeText(lastName, lname);
	}

	public void SetEmail(String mail) {
		typeText(email, mail);
	}

	public void SetPasswd(String pwd) {
		typeText(pass, pwd);
	}

	public void SetRePasswd(String Repwd) {
		typeText(RePass, Repwd);
	}

	public void SetMobNo(String mobno) {
		typeText(phone, mobno);
	}

	public void ClickSubmit() {
		submit.click();
	}
	
	
}
