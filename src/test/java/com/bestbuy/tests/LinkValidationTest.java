package com.bestbuy.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bestbuy.utils.SeWrappers;
import com.bestbuy.utils.bestbuyWrappers;

public class LinkValidationTest extends SeWrappers{
	   bestbuyWrappers bb= new bestbuyWrappers();
		SeWrappers se= new SeWrappers();
		
		@Test
		public void AccountCreate() 
		{
		try
		{
			launchBrowser("https://www.bestbuy.com/");
		    bb.Links();
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
}
}
