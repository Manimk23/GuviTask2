package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.SeWrappers;

public class TabsValidation extends SeWrappers  
{
@FindBy(xpath="//div[text()='Welcome aboard']")
WebElement Flight;

@FindBy(xpath ="//div[text()='check-in']")
WebElement checkin;

@FindBy(xpath ="//div[text()='Web check-in is available for all flights departing from India']")
WebElement checkinfo;

@FindBy(xpath ="//div[text()='flight status']")
WebElement status;  

@FindBy(xpath ="//div[text()='Get up-to-date flight status.']")
WebElement Statusinfo;

@FindBy(xpath ="//div[text()='manage booking']")
WebElement booking;

@FindBy(xpath ="//div[text()='View, Modify or Cancel your bookings']")
WebElement bookinginfo;

public void FTab()
{
	String PrintF= Flight.getText();
	System.out.println(PrintF);
}

public void ClickCTab()
{
	checkin.click();
}

public void checkin()
{
	String PrintC =checkinfo.getText();
	System.out.println(PrintC);
}
public void ClickSTab()
{
	status.click();
}
 public void Status()
 {
	 String PrintS =Statusinfo.getText();
		System.out.println(PrintS);
 }
 
 public void ClickBooking()
 {
	 booking.click();
 }
 
 public void BookInfo()
 {
	 String PrintB =bookinginfo.getText();
		System.out.println(PrintB);
 }
}
