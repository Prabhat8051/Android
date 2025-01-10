package com.cineverse.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.HamburgerMenu;
import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.SignInPage;
import com.cineverse.qa.pages.SignUpPage;
import com.cineverse.qa.pages.WatchListPage_Registered;
import com.cineverse.qa.retry.Rerun_Failed_TestCase;
import com.cinverse.qa.util.Utility;

import junit.framework.Assert;

public class WatchListPage_RegisteredTest extends CineverseBase {
	
	WatchListPage_Registered wtch;
	HomePage home;
	HamburgerMenu menu;
	SignUpPage signup;
	SignInPage signin;
	Utility util;
	
	
	public WatchListPage_RegisteredTest()
	{
		super();
	}
	
	@BeforeMethod()
	//@Test()
	public void setup() throws MalformedURLException, InterruptedException
	{
		initialization();
		Thread.sleep(3000);
		home = new HomePage();
		signup = new SignUpPage();
		signin = new SignInPage();
		menu = new HamburgerMenu();
		wtch = new WatchListPage_Registered();
		util = new Utility();
		home.CookiesClose();
		home.ValidateOnClickHamburgerMenu();
		menu.ValidateOnClickSignUp();
		signup.ValidateOnClickSignInButton();
		//signin.ValidateSignInWithValidCredentials1();
		
		signin.ValidateHamburgerMenuAfterLogIn();
		menu.ValidateOnClickWatchList();
	}
	
	@Test(priority=1, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateBackButtonIsDisplayedTest()
	{
		boolean flag = wtch.ValidateBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateWatchListTextIsDisplayedTest()
	{
		boolean flag = wtch.ValidateWatchListTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateWatchListTabIsDisplayedTest()
	{
		boolean flag = wtch.ValidateWatchListTabIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=4, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateContinueTabIsDisplayedTest()
	{
		boolean flag = wtch.ValidateContinueTabIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	// Back Button Click Events
	
	@Test(priority=5, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickBackButtonTest()
	{
		home = wtch.ValidateOnClickBackButton();
	}
	
	// WatchList Tab
	
	@Test(priority=6, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateWatchListTabItemTest()
	{
		boolean flag = wtch.ValidateWatchListTabItem();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=7, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateWatchListRemoveButtonTest()
	{
		boolean flag = wtch.ValidateWatchListRemoveButton();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=8, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateAddToWatchListTest()
	{
		boolean flag = wtch.ValidateAddToWatchList();
		Assert.assertTrue(flag);
	}
	
	// Continue Tab
	
	@Test(priority=9, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateContinueTabItemTest()
	{
		boolean flag = wtch.ValidateContinueTabItem();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=10, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateProgressBarIsDisplayedTest()
	{
		boolean flag = wtch.ValidateProgressBarIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=11, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateRemainingTimeIsDisplayedTest()
	{
		boolean flag = wtch.ValidateRemainingTimeIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	// Continue Tab -> Click Events
	
	@Test(priority=12, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateContinueProgressBarIsDisplayedTest()
	{
		boolean flag = wtch.ValidateContinueProgressBarIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=13, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateContinueRemainingTimeIsDisplayedTest()
	{
		boolean flag = wtch.ValidateContinueRemainingTimeIsDisplayed();
		Assert.assertTrue(flag);
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
