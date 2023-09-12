package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;

public class BrandPg extends SeWrappers{

@FindBy(xpath = "//img[@alt='United States']")
WebElement country;

@FindBy (xpath ="//button[text()='Menu']")
WebElement Menu; 

@FindBy (xpath ="//button[text()='Brands']")
WebElement Brand;

@FindBy(xpath ="//a[text()='Microsoft']")
WebElement BrandTit;
 
@FindBy(xpath ="//a[@href='/site/video-games/xbox-series-x-and-s/pcmcat1560455091535.c?id=pcmcat1560455091535']")
WebElement xbox;

@FindBy(xpath ="//a[@href='/site/xbox-series-x-and-s/xbox-series-x-and-s-consoles/pcmcat1586900952752.c?id=pcmcat1586900952752']")
WebElement xboxtype;

@FindBy (xpath ="//button[text()='Add to Cart']")
WebElement cart;

@FindBy(xpath ="//span[text()='Added to cart']")
WebElement Valadating;




public void clickCountry() 
{
	country.click();
}

public void ClickMenu()
{
	Menu.click();
}
public void ClickBrand()
{
	Brand.click();
}

public void ClickBrandTit()
{
	BrandTit.click();
}
public void ClickXbox()
{
	xbox.click();
}
public void ClickXboxType()
{
	xboxtype.click();
}
public void ClickCart()
{
	cart.click();
}

public void getText()
{
	String Printtxt = Valadating.getText();
	System.out.println("Xbox Series X 1TB Console - Black ---"+Printtxt);
}
}

