package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;

public class LinksValidation extends SeWrappers 
{
	@FindBy(xpath = "//img[@alt='United States']")
	WebElement country;
	
	@FindBy(xpath ="//a[text()='Accessibility']")
	WebElement access;
	
	@FindBy (xpath ="//h1[text()='Accessibility']")
	WebElement accessPg;
	
	@FindBy(xpath ="//a[text()='Terms & Conditions']")
	WebElement Terms;
	
	@FindBy (xpath ="//h1[text()='Terms and Conditions']")
	WebElement TermsPg;
	
	@FindBy(xpath ="//a[text()='Privacy']")
	WebElement Privacy;
	
	@FindBy (xpath ="//h1[text()='Best Buy Privacy Hub']")
	WebElement PrivacyPg;
	
	@FindBy(xpath ="//a[text()='Targeted Advertising Opt Out']")
	WebElement Target;
	
	@FindBy (xpath ="//h1[text()='Advertising Opt-Outs']")
	WebElement TargetPg;
	
	@FindBy(xpath ="//a[text()='CA Supply Chain Transparency Act']")
	WebElement Supplychain;
	
	@FindBy (xpath ="//h1[text()='California Supply Chain Transparency Act']")
	WebElement SupplychainPg;
	
	
	public void clickCountry() 
	{
		country.click();
	}
	
	public void ClickAcess()
	{
		access.click();
	}
	
	public void getAccesspg()
	{
		String printAc = accessPg.getText();
		System.out.println(printAc);
	}
	
	public void ClickTerm() 
	{
		Terms.click();
	}
	
	public void getTermpg()
	{
		String printTr = TermsPg.getText();
		System.out.println(printTr);
	}
	
	public void Clickprivacy() 
	{
		Privacy.click();
	}
	
	public void getPrivacypg()
	{
		String printPr = PrivacyPg.getText();
		System.out.println(printPr);
	}
	public void ClickTarget() 
	{
		Target.click();
	}
	
	public void getTargetpg()
	{
		String printTrg = TargetPg.getText();
		System.out.println(printTrg);
	}
	public void ClickSupply() 
	{
		Supplychain.click();
	}
	
	public void getSupplypg()
	{
		String printSupply = SupplychainPg.getText();
		System.out.println(printSupply);
	}

	
}
