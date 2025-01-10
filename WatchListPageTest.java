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
import com.cineverse.qa.pages.SignUpPage;
import com.cineverse.qa.pages.WatchListPage;
import com.cinverse.qa.util.Utility;

import junit.framework.Assert;

public class WatchListPageTest extends CineverseBase {
	
	WatchListPage wtch;
	HomePage home;
	HamburgerMenu menu;
	SignUpPage signup;
	Utility util;
	
	public WatchListPageTest()
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
		wtch = new WatchListPage();
		util = new Utility();
		home.CookiesClose();
		home.ValidateOnClickHamburgerMenu();
		menu.ValidateOnClickWatchList();
	}
	
	@Test(priority=1)
	public void ValidateWatchListTextIsDisplayedTest()
	{
		boolean flag = wtch.ValidateWatchListTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void ValidateBackButtonIsDisplayedTest()
	{
		boolean flag = wtch.ValidateBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	// WatchList Tab
	
	@Test(priority=3)
	public void ValidateValidateWatchListTabIsDisplayedTest()
	{
		boolean flag = wtch.ValidateWatchListTabIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=4)
	public void ValidateWatchListHeadTextIsDisplayedTest()
	{
		boolean flag = wtch.ValidateWatchListHeadTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5)
	public void ValidateWatchListSubHeadTextIsDisplayedTest()
	{
		boolean flag = wtch.ValidateWatchListSubHeadTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=6)
	public void ValidateWatchListOkbuttonIsDisplayedTest()
	{
		boolean flag = wtch.ValidateWatchListOkbuttonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	// -> Click Events
	
	@Test(priority=7)
	public void ValidateOnClickWatchListOkButtonTest()
	{
		signup = wtch.ValidateOnClickWatchListOkButton();
	}
	
	// Continue Tab
	
	@Test(priority=8)
	public void ValidateContinueTabIsDisplayedTest()
	{
		boolean flag = wtch.ValidateContinueTabIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=9)
	public void ValidateContinueHeadTextIsDisplayedTest()
	{
		boolean flag = wtch.ValidateContinueHeadTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=10)
	public void validateContinueSubHeadTextIsDisplayedTest()
	{
		boolean flag = wtch.validateContinueSubHeadTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=11)
	public void ValidateContinueOkButtonIsDisplayedTest()
	{
		boolean flag = wtch.ValidateContinueOkButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	// -> Click Events
	
	@Test(priority=12)
	public void ValidateOnClickContinueOkButtonTest()
	{
		signup = wtch.ValidateOnClickContinueOkButton();
		Assert.assertTrue(false);
	}
	
	@Test(priority=13)
	public void ValidateOnClickBackButtonTest()
	{
		home = wtch.ValidateOnClickBackButton();
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
