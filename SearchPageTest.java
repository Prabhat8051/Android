package com.cineverse.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.SearchPage;
import com.cinverse.qa.util.Utility;



public class SearchPageTest extends CineverseBase {
	
	SearchPage sch;
	HomePage home;
	Utility util;
	
	public SearchPageTest()
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
		sch = new SearchPage();
		util = new Utility();
		home.CookiesClose();
		home.ValidateOnClickSearch();	
	}
	
	@Test(priority=1)
	public void ValidateSearchBackButtonIsDisplayedTest()
	{
		boolean flag = sch.ValidateSearchBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void ValidateSearchIconIsDisplayedTest()
	{
		boolean flag = sch.ValidateSearchIconIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void ValidateSearchInputBoxIsDisplayedTest()
	{
		boolean flag = sch.ValidateSearchInputBoxIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=4)
	public void ValidateFirstSuggestionItemIsDisplayedTest()
	{
		boolean flag = sch.ValidateFirstSuggestionItemIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5)
	public void ValidateSearchSuggestionPageScrollingTest()
	{
		boolean flag = sch.ValidateSearchSuggestionPageScrolling();
		Assert.assertTrue(flag);
	}
	
	// Validating Positive Search
	   // 1. Validating Genre
	
	@Test(priority=6)
	public void ValidateOnComedySearchTest() throws InterruptedException
	{
		boolean flag=sch.ValidateOnComedySearch();
		Assert.assertTrue(flag);
	
	}
	
	
	//_________________________________________________________//
	
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
