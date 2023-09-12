package com.bestbuy.tests;

import org.testng.annotations.Test;

import com.bestbuy.utils.SeWrappers;
import com.bestbuy.utils.bestbuyWrappers;

public class CateogrypgTest  extends SeWrappers{
	   bestbuyWrappers bb= new bestbuyWrappers();
		SeWrappers se= new SeWrappers();
		
		@Test
		public void ShopByDept() 
		{
		try
		{
			launchBrowser("https://www.bestbuy.com/");
			bb.Cateogrypg();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		}
		@Test
		public void ShopByBrand()
		{
			try
			{
				launchBrowser("https://www.bestbuy.com/");
				
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
				
		}
}

