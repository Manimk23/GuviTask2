package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;

public class PaymentPage extends SeWrappers{
	
	@FindBy(xpath ="//span[text()='Continue to Payment Information']")
	WebElement Payment;
	
	@FindBy(name="number")
	WebElement cardno;
	
	@FindBy(xpath ="//option[text()='02']")
	WebElement month;
	@FindBy(xpath ="//option[text()='2026']")
	WebElement year;
	
	@FindBy(name="cvv")
	WebElement cvv;
	
	public void ClickPayment()
	{
		Payment.click();
	}

	public void Setcardno(String no)
	{
		typeText(cardno, no);
	}

	public void SetMonth(String mnth)
	{
		typeText(month,mnth );
	}
    
	public void SetYear(String yr)
	{
		typeText(year, yr);
	}
    
	public void SetCvv(String code)
	{
		typeText(cvv, code);
	}
}
