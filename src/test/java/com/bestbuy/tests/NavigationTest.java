package com.bestbuy.tests;

import org.testng.annotations.Test;

import com.bestbuy.utils.SeWrappers;
import com.bestbuy.utils.bestbuyWrappers;

public class NavigationTest extends SeWrappers{
	   bestbuyWrappers bb= new bestbuyWrappers();
		SeWrappers se= new SeWrappers(); 
		
		@Test
		public void navigate() 
		{
		try
		{
			launchBrowser("https://www.bestbuy.com/");
			bb.Navigation();
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

}
}
