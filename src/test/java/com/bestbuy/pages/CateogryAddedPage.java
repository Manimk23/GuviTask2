package com.bestbuy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bestbuy.utils.SeWrappers;

public class CateogryAddedPage extends SeWrappers{

@FindBy(xpath = "//img[@alt='United States']")
WebElement country;

@FindBy (xpath ="//button[text()='Menu']")
WebElement Menu;

@FindBy(xpath ="//button[text()='Appliances']")
WebElement Department;

@FindBy(xpath ="//button[text()='Major Kitchen Appliances']")
WebElement kitchen;

@FindBy (xpath ="//a[text()='Refrigerators']")
WebElement Fridge;

@FindBy(xpath ="//a[@href='/site/refrigerators/french-door-refrigerators/abcat0901004.c?id=abcat0901004']")
WebElement Model;

@FindBy(xpath="//button[text()='Add to Cart']")
WebElement Cart;

@FindBy(xpath ="//span[text()='Added to cart']")
WebElement validate;
public void clickCountry() 
{
	country.click();
}

public void ClickMenu()
{
	Menu.click();
}
public void ClickDept()
{
	Department.click();
}

public void ClickKitch()
{
	kitchen.click();
}
public void ClickFridge()
{
	Fridge.click();
}
public void ClickModel()
{
	Model.click();
}
public void ClickCart()
{
	Cart.click();
}

public void getText()
{
	String Printtxt = validate.getText();
	System.out.println("Samsung - 27 cu. ft. Mega Capacity 3-Door French Door----"+Printtxt);
}
}
