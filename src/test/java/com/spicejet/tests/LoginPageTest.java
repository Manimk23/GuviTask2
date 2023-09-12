package com.spicejet.tests;

import org.testng.annotations.Test;

import com.spicejet.utils.SeWrappers;
import com.spicejet.utils.SpicejetWrappers;

public class LoginPageTest extends SeWrappers{
	   SpicejetWrappers sj= new SpicejetWrappers();
		SeWrappers se= new SeWrappers(); 
		
		@Test
		public void logintab() throws InterruptedException
		{
			try
			{
			launchBrowser("https://www.spicejet.com/");
			sj.login("7708627600", "Mani231297@");
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			
		}
		
		@Test
		public void Invalidlogin()
		{
			try
			{
			launchBrowser("https://www.spicejet.com/");
			sj.login("770862760", "Mani231297@");
			
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}

}
