package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.SeWrappers;

public class LoginPage  extends SeWrappers{
	
	@FindBy(xpath ="//div[text()='Login']")
	WebElement logintab;
	
	//@FindBy(xpath ="//div[text()='Email']")
	//WebElement mail;
	
	@FindBy(xpath ="//input[@type='number']")
	WebElement phNo;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pass;
	
	@FindBy(xpath="//div[@data-testid='login-cta']")
	WebElement login;
	
	@FindBy(xpath ="//div[@class='css-1dbjc4n r-1loqt21 r-1otgn73']")
	WebElement close;
	
	@FindBy(xpath ="//div[text()='Please enter a valid mobile number']")
	WebElement ValidNo;
	
	
	
	public void ClickLogintab()
	{
		logintab.click();
	}
	
	/*public void Clickmail()
	{
		mail.click();
	}*/
	
	public void SetphNo(String num)
	{
		typeText(phNo, num);
	}
	
	public void Setpass(String pwd)
	{
		typeText(pass, pwd);
	}
	
	public void ClickLogin()
	{
		login.click();
	}
	
	public void ClickClose()
	{
		close.click();
	}
	
   public void Validate()
   {
	   String PrintT= ValidNo.getText();
	   
	   System.out.println(PrintT);
   }
}
