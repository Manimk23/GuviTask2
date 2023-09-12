package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;

public class Navigation extends SeWrappers {

	@FindBy(xpath = "//img[@alt='United States']")
	WebElement country;
   
	@FindBy(xpath ="//a[text()='Top Deals']")
	WebElement TopDeals;
	
	@FindBy( xpath ="//h2[text()='Great deals']")
	WebElement TDpage;
	
	@FindBy(xpath ="//a[text()='Deal of the Day']")
	WebElement Deals;
	
	@FindBy(xpath ="//p[text()='Great new deals. Every day.']")
	WebElement DealPg;
	
	@FindBy(xpath ="//a[text()='My Best Buy Memberships']")
	WebElement memberships;
	
	@FindBy(xpath ="//h1[text()='Meet the new My Best Buy Memberships™.']")
	WebElement membershipsPg;
	
	@FindBy(xpath ="//a[text()='Credit Cards']")
	WebElement Credit;
	
	@FindBy(xpath ="//h3[text()='10% back']")
	WebElement CreditPg;
	
	@FindBy(xpath ="//a[text()='Best Buy Outlet']")
	WebElement Outlet;
	
	@FindBy(xpath ="//h2[text()='Outlet deals available now.']")
	WebElement OutletPg;
	
	@FindBy(xpath ="//a[text()='Gift Cards']")
	WebElement GiftCard;
	
	@FindBy(xpath ="//h1[text()='Best Buy Gift Cards']")
	WebElement GiftCardPg;
	
	public void clickCountry() 
	{
		country.click();
	}
	
	public void clicktopdeals() 
	{
		TopDeals.click();
	}
		
	public void getTD() 
	{
		
		 String printtxt =TDpage.getText();
		 System.out.println(printtxt);
		
	}
	
	
	
	public void clickdeals() 
	{
		Deals.click();
	}
	
	public void getDpage()
	{
		String printDl= DealPg.getText();
		System.out.println(printDl);
		
	}
	
	
	public void clickmembership() 
	{
		memberships.click();
	}
	
	
	public void getMpage()
	{
		String printMemberpg= membershipsPg.getText();
		System.out.println(printMemberpg);
		
	}
	public void clickCredit() 
	{
		Credit.click();
	}
	
	public void getCrpage()
	{
		String printCreditpg= CreditPg.getText();
		System.out.println(printCreditpg);
		
	}
	
	public void clickoutlet() 
	{
		Outlet.click();
	}
	
	public void getOutletpage()
	{
		String printOutletpg= OutletPg.getText();
		System.out.println(printOutletpg);
		
	}
	
	public void clickgift() 
	{
		GiftCard.click();
	}
	
	public void getGiftpage()
	{
		String printGifttpg= GiftCardPg.getText();
		System.out.println(printGifttpg);
		
	}

	
	
	
	
}
