package com.cineverse.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.ActivatedDevicePage;
import com.cineverse.qa.pages.HamburgerMenu;
import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.LiveTvPage;
import com.cineverse.qa.pages.MoviesPage;
import com.cineverse.qa.pages.OwnedORRentedPage;
import com.cineverse.qa.pages.ShowsPage;
import com.cineverse.qa.pages.SignUpPage;
import com.cineverse.qa.pages.WatchListPage;
import com.cineverse.qa.retry.Rerun_Failed_TestCase;
import com.cinverse.qa.util.Utility;

import junit.framework.Assert;

public class HamburgerMenuTest extends CineverseBase {
	
	HamburgerMenu menu;
	HomePage home;
	SignUpPage signup;
	MoviesPage movie;
	ShowsPage show;
	WatchListPage watch;
	OwnedORRentedPage rnt;
	ActivatedDevicePage act;
	LiveTvPage lv;
	Utility util;
	
	
	public HamburgerMenuTest()
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
		movie = new MoviesPage();
		show = new ShowsPage();
		watch = new WatchListPage();
		rnt = new OwnedORRentedPage();
		act = new ActivatedDevicePage();
		lv = new LiveTvPage();
		util = new Utility();
		home.CookiesClose();
		home.ValidateOnClickHamburgerMenu();
		//menu.ValidateOnClickLiveTv();
	}
	
	@Test(priority=1, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateBackButtonIsDisplayedTest()
	{
		boolean flag = menu.ValidateBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSignUpIsDisplayedTest()
	{
		boolean flag = menu.ValidateSignUpIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void validateLiveTvIsDisplayedTest()
	{
		boolean flqg = menu.validateLiveTvIsDisplayed();
		Assert.assertTrue(flqg);
	}
	
	@Test(priority=4, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateMoviesIsDisplayedTest()
	{
		boolean flag = menu.ValidateMoviesIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateShowsIsDisplayedTest()
	
	{
		boolean flag = menu.ValidateShowsIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=6, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateWatchListsIsDisplayedTest()
	{
		boolean flag = menu.ValidateWatchListsIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=7, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void validateOwnedORRentedIsDisplayedTest()
	{
		boolean flag = menu.validateOwnedORRentedIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=8, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateActivatedDeviceIsDisplayedTest()
	{
		boolean flag = menu.ValidateActivatedDeviceIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	// Click Events
	
	@Test(priority=9, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidteOnClickBackButtonTest()
	{
		home = menu.ValidteOnClickBackButton();
	}
	
	@Test(priority=10, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickLiveTvTest()
	{
		lv = menu.ValidateOnClickLiveTv();
	}
	
	@Test(priority=11, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickMoviesTest()
	{
		movie = menu.ValidateOnClickMovies();
	}
	
	@Test(priority=12, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickShowTest()
	{
		show = menu.ValidateOnClickShow();
	}
	
	@Test(priority=13, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickWatchListTest()
	{
		watch = menu.ValidateOnClickWatchList();
	}
	
	@Test(priority=14, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickOwnedORRentedTest()
	{
		rnt = menu.ValidateOnClickOwnedORRented();
	}
	
	@Test(priority=15, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickActivatedDeviceTest()
	{
		act = menu.ValidateOnClickActivatedDevice();
	}
	
	@Test(priority=16, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickSignUpTest()
	{
		signup = menu.ValidateOnClickSignUp();
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
