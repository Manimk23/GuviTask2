package com.spicejet.tests;

import org.testng.annotations.Test;

import com.spicejet.utils.SeWrappers;
import com.spicejet.utils.SpicejetWrappers;

public class TabShiftTest extends SeWrappers{
	   SpicejetWrappers sj= new SpicejetWrappers();
		SeWrappers se= new SeWrappers(); 
		
		@Test
		public void TabSwitch()
		{
			try
			{
				 launchBrowser("https://www.spicejet.com/");
				 sj.Tabs();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}

}
