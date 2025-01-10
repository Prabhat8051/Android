package com.cineverse.qa.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.ITestResult;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.AccountPage;
import com.cineverse.qa.pages.HamburgerMenu;
import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.LiveTvPage;
import com.cineverse.qa.pages.SearchPage;
import com.cinverse.qa.util.Utility;

import junit.framework.Assert;

public class HomePageTest extends CineverseBase {
	
	HomePage home;
	LiveTvPage live;
	SearchPage search;
	AccountPage account;
	HamburgerMenu menu;
	Utility util;
	
	
	public HomePageTest()
	{
		super();
	}

	
	@BeforeMethod()
	public void setup() throws MalformedURLException
	{
		initialization();
		home = new HomePage();
		live = new LiveTvPage();
		search = new SearchPage();
		account = new AccountPage();
		menu = new HamburgerMenu();
		util = new Utility();
	}
	
	@Test(priority=1)
	public void ValidateInfoButtonIsDisplayedTest()
	{
		boolean flag = home.ValidateInfoButtonIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void ValidatePromoPlayButtonIsDisplayedTest()
	{
		boolean flag = home.ValidatePromoPlayButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void ValidatePromoWatchListButtonIsDIsplayedTest()
	{
		boolean flag = home.ValidatePromoWatchListButtonIsDIsplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=4)
	public void ValidateAccountButtonIsDisplayedTest()
	{
		boolean flag = home.ValidateAccountButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5)
	public void ValidateSearchButtonIsDisplayedTest()
	{
		boolean flag = home.ValidateSearchButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=6)
	public void ValidateLiveTvButtonIsDisplayedTest()
	{
		boolean flag = home.ValidateLiveTvButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=7)
	public void ValidateHamburgerMenuIsDisplayedTest()
	{
		boolean flag = home.ValidateHamburgerMenuIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	// Click Events
	
	@Test(priority=7)
	public void ValidateOnClickLiveTvTest()
	{
		live=home.ValidateOnClickLiveTv();
	}
	
	@Test(priority=8)
	public void ValidateOnClickSearchTest() throws InterruptedException
	{
		search=home.ValidateOnClickSearch();
	}
	
	@Test(priority=9)
	public void ValidateOnClickAccountTest()
	{
		account=home.ValidateOnClickAccount();
	}
	
	@Test(priority=10)
	public void ValidateOnClickHamburgerMenuTest()
	{
		menu = home.ValidateOnClickHamburgerMenu();
	}
	
	
	// Hamburger -> After Login with credentials 1
	
	@Test(priority=11)
	public void ValidateMenulogin1Test()
	{
		menu = home.ValidateMenulogin1();
	}
	
	@Test(priority=12)
	public void CookiesCloseTest()
	{
		home.CookiesClose();
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
	            //util.getScreenshot(result.getMethod().);
	        }
		
		driver.quit();
	}
	
	
	
}
