package com.spicejet.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import com.spicejet.pages.FlightBook;
import com.spicejet.pages.LoginPage;
import com.spicejet.pages.SignUp;
import com.spicejet.pages.TabsValidation;

public class SpicejetWrappers extends SeWrappers {
	SeWrappers se = new SeWrappers();
	WebElement Search;
	WebElement destination;
	
	public void Signup(String fname, String lname, String phno, String mailid, String pass, String conpass) throws InterruptedException
	{
		SignUp sp = PageFactory.initElements(driver, SignUp.class);
		
		sp.ClickSignup();
		driver.switchTo().activeElement();
		
		sp.ClickTitle();
		Thread.sleep(1000);
		sp.Setfirstname(fname);
		Thread.sleep(1000);
		sp.Setlastname(lname);
		Thread.sleep(1000);
		sp.ClickCountry();
		Thread.sleep(1000);
		sp.ClickDob();
		driver.switchTo().activeElement();
		sp.Clickmonth();
		Thread.sleep(1000);
		sp.Clickyear();
		Thread.sleep(1000);
		sp.Clickdate();
		driver.switchTo().activeElement();
		sp.SetNo(phno);
		Thread.sleep(1000);
		sp.Setemail(mailid);
		Thread.sleep(1000);
		sp.Setpass(pass);
		Thread.sleep(1000);
		sp.SetCpass(conpass);
		Thread.sleep(1000);
		sp.ClickCheckbox();
		sp.ClickSubmit();
		
	}
	
	public void login(String num, String pass) throws InterruptedException
	{
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		
		lp.ClickLogintab();
		driver.switchTo().activeElement();
		Thread.sleep(1000);
		//lp.Clickmail();
		Thread.sleep(1000);
		lp.SetphNo(num);
		Thread.sleep(1000);
		lp.Setpass(pass);
		Thread.sleep(3000);
		lp.ClickLogin();
		//lp.Validate();
		lp.ClickClose();
		
		
	}
	
	public void Booking() throws InterruptedException
	{
		FlightBook fb = PageFactory.initElements(driver, FlightBook.class);
		
		/*fb.ClickFrom();
		Thread.sleep(3000);
		driver.switchTo().activeElement();
		fb.Clickplace();
		Thread.sleep(2000);*/
		fb.ClickTo();
        Thread.sleep(3000);
		fb.Clickcity();
		
		
		
		
		driver.switchTo().activeElement();
		fb.ClickDate();
		driver.switchTo().frame(Search);
		Thread.sleep(4000);
		
		fb.ClickSearch();
		driver.switchTo().activeElement();
		fb.Result();
		
		
	}
	
	public void Tabs() throws InterruptedException
	{
		TabsValidation tv= PageFactory.initElements(driver, TabsValidation.class);
		tv.FTab();
		Thread.sleep(1000);
		tv.ClickCTab();
		Thread.sleep(1000);
		tv.checkin();
		Thread.sleep(1000);
		tv.ClickSTab();
		Thread.sleep(1000);
		tv.Status();
		Thread.sleep(1000);
		tv.ClickBooking();
		Thread.sleep(1000);
		tv.BookInfo();
	}
}


	


