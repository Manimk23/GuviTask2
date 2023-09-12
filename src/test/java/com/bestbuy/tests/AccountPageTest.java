package com.bestbuy.tests;

import org.testng.annotations.Test;

import com.bestbuy.utils.SeWrappers;
import com.bestbuy.utils.bestbuyWrappers;

public class AccountPageTest  extends SeWrappers{
   bestbuyWrappers bb= new bestbuyWrappers();
	SeWrappers se= new SeWrappers();
	@Test
	public void AccountCreate() 
	{
	try
	{
		launchBrowser("https://www.bestbuy.com/");
		bb.Homepage("Manikandan", "S", "maniblaze81@gmail.com", "Mani231297@", "Mani231297@", "7708627600");
	}
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
	

}
}
