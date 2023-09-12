package com.spicejet.tests;

import org.testng.annotations.Test;

import com.spicejet.utils.SeWrappers;
import com.spicejet.utils.SpicejetWrappers;

public class BookingPageTest extends SeWrappers{
	   SpicejetWrappers sj= new SpicejetWrappers();
		SeWrappers se= new SeWrappers(); 
		
		@Test
		 public void Booking()
		 
		 {
			 try
			 {
				 launchBrowser("https://www.spicejet.com/");
					sj.Booking();
					
			 }
			 catch(Exception ex)
			 {
				 ex.printStackTrace();
			 }
		 }

}
