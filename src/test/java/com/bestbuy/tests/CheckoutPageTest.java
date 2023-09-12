package com.bestbuy.tests;

import org.testng.annotations.Test;

import com.bestbuy.utils.SeWrappers;
import com.bestbuy.utils.bestbuyWrappers;

public class CheckoutPageTest  extends SeWrappers{
	   bestbuyWrappers bb= new bestbuyWrappers();
		SeWrappers se= new SeWrappers();
		@Test
		public void Checkoutpg() throws InterruptedException
		{
			try
			{
			launchBrowser("https://www.bestbuy.com/");
			bb.BrandPage("maniblaze81@gmail.com", "Mani231297@");
			
		}
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		

}
}
