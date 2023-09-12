package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;

public class AddressPage  extends SeWrappers
{
	@FindBy(name="firstName")
	WebElement Fname;

	@FindBy(name="lastName")
	WebElement Lname;

	@FindBy(name="street")
	WebElement Add;

	@FindBy(name="city")
	WebElement City;

	@FindBy(id="state")
	WebElement state;

	@FindBy(xpath ="//option[text()='CA']")
	WebElement options;

	@FindBy(name="zipcode")
	WebElement zipcode;
	
	@FindBy(xpath ="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//span[text()='Place Your Order']")
	WebElement order;
    
	
	public void SetFname(String firstname)
	{
		typeText(Fname,firstname );
	}

	public void SetLname(String lastname)
	{
		typeText(Lname,lastname );
	}
	public void SetStrt(String street)
	{
		typeText(Add, street);
	}

	public void SetCity(String cityname)
	{
		typeText(City, cityname);
	}
	public void ClickState()
	{
		state.click();
	}

	public void ClickOpt()
	{
		options.click();
	}

	public void SetZip(String zip)
	{
		typeText(zipcode, zip);
	}
	
	public void SetPassword(String pass)
	   {
		   typeText(password, pass);
	   }

   public void Clickorder()
   
   {
	   order.click();
   }
   
   
}
