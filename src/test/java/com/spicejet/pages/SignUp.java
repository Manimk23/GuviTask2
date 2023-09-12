package com.spicejet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.spicejet.utils.SeWrappers;



public class SignUp  extends SeWrappers
{
@FindBy(xpath ="//div[text()='Signup']")
WebElement Signup;

@FindBy(xpath ="//option[text()='Mr']")
WebElement title;

@FindBy(id ="first_name")
WebElement Fname;

@FindBy(id="last_name")
WebElement Lname;

@FindBy(xpath ="//option[text()='India ']")
WebElement Country;

@FindBy(xpath ="//img[@src='https://spiceclub.spicejet.com/public/icon-date.png']")
WebElement DOB;

@FindBy(xpath ="//option[text()='December']")
WebElement month;

@FindBy(xpath ="//option[text()='1997']")
WebElement year;

@FindBy(xpath ="//div[text()='23']")
WebElement date;

@FindBy(xpath ="//input[@type='tel']")
WebElement phNo;

@FindBy(id="email_id")
WebElement mailid;

@FindBy(id="new-password")
WebElement pass;

@FindBy(id ="c-password")
WebElement conPass;

@FindBy(id="defaultCheck1")
WebElement checkbox;

@FindBy(xpath ="//button[text()='Submit']")
WebElement submit;

public void ClickSignup()
{
	Signup.click();
}

public void ClickTitle()
{
  title.click();
}

public void Setfirstname(String fname)
{
	typeText(Fname, fname);
}

public void Setlastname(String lname)
{
	typeText(Lname, lname);
}

public void ClickCountry()
{
	Country.click();
}

public void ClickDob()

{
	DOB.click();
}

public void Clickmonth()

{
	month.click();
}

public void Clickyear()
{
	year.click();
}

public void Clickdate()
{
	date.click();
}

public void SetNo(String num)
{
	typeText(phNo,num );
}

public void Setemail(String id)
{
	typeText(mailid, id);
}

public void Setpass(String pswd)

{
	typeText(pass, pswd);
}

public void SetCpass(String cpass)
{
	typeText(conPass, cpass);
}

public void ClickCheckbox()

{
	checkbox.click();
}

public void ClickSubmit()
{
	submit.click();
}
}
