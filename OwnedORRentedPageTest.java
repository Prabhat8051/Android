package com.cineverse.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.HamburgerMenu;
import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.OwnedORRentedPage;
import com.cineverse.qa.pages.SignUpPage;
import com.cinverse.qa.util.Utility;

import junit.framework.Assert;

public class OwnedORRentedPageTest extends CineverseBase {
	
	OwnedORRentedPage rnt;
	HomePage home;
	HamburgerMenu menu;
	SignUpPage signup;
	Utility util;
	
	public OwnedORRentedPageTest()
	{
		super();
	}

	@BeforeMethod()
	public void setup() throws MalformedURLException, InterruptedException
	{
		initialization();
		Thread.sleep(3000);
		home = new HomePage();
		menu = new HamburgerMenu();
		signup = new SignUpPage();
		rnt = new OwnedORRentedPage();
		util = new Utility();
		home.CookiesClose();
		home.ValidateOnClickHamburgerMenu();
		menu.ValidateOnClickOwnedORRented();
	}
	
	@Test(priority=1)
	public void ValidateRentedItemsTextIsDisplayedTest()
	{
		boolean flag = rnt.ValidateRentedItemsTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void ValidateBackButtonIsDisplayedTest()
	{
		boolean flag = rnt.ValidateBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void ValidateHeadTextIsDisplayedTest()
	{
		boolean flag = rnt.ValidateHeadTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=4)
	public void ValidateSubHeadTextIsDisplayedTest()
	{
		boolean flag = rnt.ValidateSubHeadTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5)
	public void ValidateOkButtonIsDisplayedTest()
	{
		boolean flag = rnt.ValidateOkButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	 // Click Events
	
	@Test(priority=6)
	public void ValidateOnClickBackButtonTest()
	{
		home = rnt.ValidateOnClickBackButton();
	}
	
	@Test(priority=7)
	public void ValidateOnClickOkButtonTest()
	{
		signup = rnt.ValidateOnClickOkButton();
	}
	
	
	@AfterMethod()
	public void teardown(ITestResult result) throws IOException
	{
		/*String Filename ="SignUp.png";
		if(ITestResult.FAILURE==result.getStatus())
		{
		util.getScreenshot();
		} */
		
		 if (result.getStatus() == ITestResult.FAILURE) {
	            util.getScreenshot(result.getMethod().getMethodName());
	        }
		
		driver.quit();
	}
	
}
