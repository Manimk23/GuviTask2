package com.bestbuy.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.bestbuy.utils.SeWrappers;
import com.bestbuy.utils.bestbuyWrappers;

public class PaymentTest  extends SeWrappers{
	   bestbuyWrappers bb= new bestbuyWrappers();
		SeWrappers se= new SeWrappers(); 
		
		@Test
		public void PayInfo() throws InterruptedException

		{
			launchBrowser("https://www.bestbuy.com/");
			bb.BrandPage("maniblaze81@gmail.com", "(800) 555‑0175");
			bb.Paymentinfo("3566 0000 2000 0410", "02", "2026", "123");
			bb.Address("Manikandan", "mk", "1201 E 81ST ST ", "LOS ANGELES", "90001", "Mani231297@");
			
			
		}
}
