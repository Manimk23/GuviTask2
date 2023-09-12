package com.bestbuy.utils;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.bestbuy.pages.Accountpage;
import com.bestbuy.pages.AddressPage;
import com.bestbuy.pages.BrandPg;
import com.bestbuy.pages.CateogryAddedPage;
import com.bestbuy.pages.CheckoutPage;
import com.bestbuy.pages.LinksValidation;
import com.bestbuy.pages.Navigation;
import com.bestbuy.pages.PaymentPage;
import com.bestbuy.pages.ProductAdded;
import com.bestbuy.pages.SignInPage;

public class bestbuyWrappers extends SeWrappers {
	SeWrappers se = new SeWrappers();
	WebElement TDpage, DealPg, membershipsPg, CreditPg, OutletPg, GiftCardPg;

	WebElement accessPg, TermsPg, PrivacyPg, TargetPg, SupplychainPg;

	public void Homepage(String fname, String lname, String mail, String pwd, String Repwd, String mobno) {
		try {

			Accountpage ap = PageFactory.initElements(driver, Accountpage.class);
			ap.clickCountry();
			driver.switchTo().activeElement();
			Thread.sleep(4000);
			ap.clickAccount();
			ap.switchWindows();
			ap.clickCrAcc();
			Thread.sleep(1000);
			ap.switchWindows();
			ap.SetFname(fname);
			Thread.sleep(1000);
			ap.SetLname(lname);
			Thread.sleep(1000);
			ap.SetEmail(mail);
			Thread.sleep(1000);
			ap.SetPasswd(Repwd);
			Thread.sleep(1000);
			ap.SetRePasswd(Repwd);
			Thread.sleep(1000);
			ap.SetMobNo(mobno);
			Thread.sleep(1000);
			ap.ClickSubmit();
			Thread.sleep(4000);
			ap.switchWindows();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void Loginpage(String mailid, String pswd) throws InterruptedException {
		{
			SignInPage sp = PageFactory.initElements(driver, SignInPage.class);

			sp.clickflag();
			driver.switchTo().activeElement();
			Thread.sleep(4000);
			sp.clickAccount();
			sp.switchWindows();
			sp.clickSignin();
			sp.switchWindows();
			sp.Setmail(mailid);
			sp.Setpass(pswd);
			sp.clicklogin();
			driver.switchTo().activeElement();
			//navigateforward();

			// sp.dismissAlert();

			Thread.sleep(5000);

		}
	}
	

	public void Navigation() throws InterruptedException {
		Navigation nv = PageFactory.initElements(driver, Navigation.class);

		nv.clicktopdeals();
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		nv.getTD();
		navigateBack();

		nv.clickdeals();
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		nv.getDpage();
		navigateBack();

		nv.clickmembership();
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		nv.getMpage();
		navigateBack();

		nv.clickCredit();
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		nv.getCrpage();
		navigateBack();

		nv.clickoutlet();
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		nv.getOutletpage();
		navigateBack();

		nv.clickgift();
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		nv.getGiftpage();
		navigateBack();
	}

	public void Links() throws InterruptedException {
		LinksValidation lv = PageFactory.initElements(driver, LinksValidation.class);
		navigateRefresh();
		lv.jsscrollDownBottom();
		lv.ClickAcess();
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		lv.getAccesspg();
		navigateBack();

		lv.jsscrollDownBottom();
		lv.ClickTerm();
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		lv.getTermpg();
		navigateBack();

		lv.jsscrollDownBottom();
		lv.Clickprivacy();
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		lv.getPrivacypg();
		navigateBack();

		lv.jsscrollDownBottom();
		lv.ClickTarget();
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		lv.getTargetpg();
		navigateBack();

		lv.jsscrollDownBottom();
		lv.ClickSupply();
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		lv.getSupplypg();
		navigateBack();
	}

	public void ProductPg(String prod) throws InterruptedException {

		ProductAdded pa = PageFactory.initElements(driver, ProductAdded.class);
		pa.clickCountry();
		driver.switchTo().activeElement();
		Thread.sleep(4000);
		pa.Setprod(prod);
		driver.switchTo().activeElement();
		// pa.Clicklap();
		// driver.switchTo().activeElement();
		pa.ClickCart();
		Thread.sleep(5000);

		driver.switchTo().activeElement();
		pa.getText();
	}

	public void Cateogrypg() throws InterruptedException {
		CateogryAddedPage cap = PageFactory.initElements(driver, CateogryAddedPage.class);
		cap.clickCountry();

		cap.ClickMenu();
		driver.switchTo().activeElement();
		cap.ClickDept();
		Thread.sleep(1000);
		cap.ClickKitch();
		Thread.sleep(1000);
		driver.switchTo().activeElement();
		cap.ClickFridge();
		Thread.sleep(2000);
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		cap.ClickModel();
		cap.ClickCart();
		Thread.sleep(5000);

		driver.switchTo().activeElement();
		cap.getText();

	}


	public void BrandPage(String mailid, String phno)
			throws InterruptedException

	{
		BrandPg bpg = PageFactory.initElements(driver, BrandPg.class);
		
		bpg.clickCountry();
		bpg.ClickMenu();
		driver.switchTo().activeElement();
		bpg.ClickBrand();
		Thread.sleep(1000);
		bpg.ClickBrandTit();
		Thread.sleep(1000);
		driver.switchTo().activeElement();
		bpg.ClickXbox();
		Thread.sleep(2000);
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		bpg.ClickXboxType();
		bpg.ClickCart();
		Thread.sleep(5000);
		driver.switchTo().activeElement();
		bpg.getText();
		
		
		CheckoutPage cpg = PageFactory.initElements(driver, CheckoutPage.class);
        cpg.ClickContinue();
		cpg.ClickCarticon();
		driver.switchTo().activeElement();
		cpg.ClickCheckout();
		Thread.sleep(3000);
		driver.switchTo().activeElement();
		cpg.ClickGuest();
		cpg.Setmail(mailid);
		Thread.sleep(1000);
		cpg.Setphone(phno);
		Thread.sleep(1000);
		driver.switchTo().activeElement();
	}
	
	
	public void Paymentinfo(String cardno, String month, String year, String cvv)
	{
		PaymentPage pp = PageFactory.initElements(driver,PaymentPage.class );
		
		pp.ClickPayment();
		driver.switchTo().activeElement();
		pp.Setcardno(cardno);
		pp.SetMonth(month);
		pp.SetYear(year);
		pp.SetCvv(cvv);
	}
		
		public void Address(String Fname, String Lname, String Add, String City, String zipcode, String pass) throws InterruptedException
		{
		AddressPage ap = PageFactory.initElements(driver, AddressPage.class);
		ap.SetFname(Fname);
		Thread.sleep(1000);
		ap.SetLname(Lname);
		Thread.sleep(1000);
		ap.SetStrt(Add);
		Thread.sleep(1000);
		ap.SetCity(City);
		Thread.sleep(1000);
		ap.ClickState();
		ap.ClickOpt();
		ap.SetZip(zipcode);
		ap.SetPassword(pass);
		ap.Clickorder();
		
	}
	
		
		
		
		
		

	}


