package com.spicejet.tests;

import org.testng.annotations.Test;

import com.spicejet.utils.SeWrappers;
import com.spicejet.utils.SpicejetWrappers;

public class SignUppageTest extends SeWrappers{
	   SpicejetWrappers sj= new SpicejetWrappers();
		SeWrappers se= new SeWrappers();
		
		@Test
		public void Signup()
		{
			try
			{
				launchBrowser("https://www.spicejet.com/");
				sj.Signup("Manikandan", "mk", "7708637600", "maniblaze81@gmail.com", "Mani231297@", "Mani231297@");
				
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}

}

