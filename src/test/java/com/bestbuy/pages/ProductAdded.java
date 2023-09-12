package com.bestbuy.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;

public class ProductAdded  extends SeWrappers{

	@FindBy(xpath = "//img[@alt='United States']")
	WebElement country;
	
	@FindBy (xpath ="//input[@class='search-input']")
	WebElement Searchbox;
	
	@FindBy(xpath="//button[text()='Add to Cart']")
	WebElement Cart;
	
	@FindBy(xpath ="//span[text()='Added to cart']")
	WebElement validate;
	public void clickCountry() 
	{
		country.click();
	}
	
	public void Setprod(String prod)
	{
		typeText(Searchbox, prod);
		Searchbox.sendKeys(Keys.ENTER);
		

	}
	
	
    public void ClickCart()
    {
    	Cart.click();
    }
    
    public void getText()
    {
    	System.out.println(validate.getText());
    }
	
}
