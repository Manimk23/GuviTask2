package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.SeWrappers;

public class FlightBook  extends SeWrappers{
	
	@FindBy(xpath ="//div[text()='round trip']")
	WebElement TwoWay;
	
	@FindBy(xpath ="//div[text()='From']") 
	WebElement From;
	
	@FindBy(xpath ="//div[text()='Kochi']")
	WebElement fplace;
	
	@FindBy(xpath ="//div[text()='To']")
	WebElement To;
	
	@FindBy(xpath ="//div[text()='Ajmer']")
	WebElement destination;
	
	@FindBy(xpath ="//div[text()='19']")
	WebElement dedate;
	
	@FindBy(xpath ="//div[text()='25']")
	WebElement Redate;
	
	@FindBy(xpath ="//div/div/div[text()='Search Flight']")
	WebElement Search;
	
	/*@FindBy(xpath ="//div[text()='Flight Details']")
	WebElement flightdet;
	
	@FindBy(xpath ="//div[text()='Q-400']")
	WebElement type;
	
	@FindBy(xpath="//div[text()='SG 3432']")
	WebElement FltName;*/
	
	@FindBy(xpath ="//div[text()='Unfortunately, there are no flights available.']")
	WebElement Result;
	
	public void ClickTwoway()
	{
		TwoWay.click();
	}
	
	public void ClickFrom()
	{
		From.click();
	}
	
	public void Clickplace()
	{
		fplace.click();
	}
	
	public void ClickTo()
	{
		To.click();
	}
	
	
	public void Clickcity()
	{
		destination.click();
	}
	
	
	public void ClickDate()
	{
		dedate.click();
	}
    
	
	public void clickReDate()
	{
		Redate.click();
	}
	
	public void ClickSearch()
	
	{
		Search.click();
	}
/*	
	public void Clickdet()
	{
		flightdet.click();
	}
	public void flightname()
	{
		String printFlight = FltName.getText();
		System.out.println("Available Flight is---"+printFlight);
	}*/
	
	public void Result()
	{
		String printFlight = Result.getText();
		System.out.println("Available Flight is---"+printFlight);
	}
}   

