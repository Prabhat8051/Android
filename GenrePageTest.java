package com.cineverse.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.GenrePage;
import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.MoviesPage;
import com.cineverse.qa.pages.ShowsPage;
import com.cinverse.qa.util.Utility;

import junit.framework.Assert;

public class GenrePageTest extends CineverseBase {

	GenrePage genres;
	HomePage home;
	Utility util;
	MoviesPage movie;
	ShowsPage show;
	
	public GenrePageTest()
	{
		super();
	}
	
	
	@BeforeMethod()
	//@Test()
	public void setup() throws MalformedURLException, InterruptedException
	{
		initialization();
		Thread.sleep(3000);
		genres = new GenrePage();
		home = new HomePage();
		util = new Utility();
		movie= new MoviesPage();
		show=new ShowsPage();
		home.CookiesClose();
		home.ValidateOnClickHamburgerMenu();	
	}
	
	@Test(priority=1)
	public void ValidateFirstGenreIsDisplayedTest()
	{
		boolean flag = genres.ValidateFirstGenreIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void ValidateSecondGenreIsDisplayedTest()
	{
		boolean flag = genres.ValidateSecondGenreIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void ValidateThirdGenreIsDisplayed()
	{
		boolean flag = genres.ValidateThirdGenreIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	// On Click Genre
	
	@Test(priority=4)
	public void ValidateBackButtonIsDisplayedTest()
	{
		boolean flag = genres.ValidateBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5)
	public void ValidateMoviesTabIsDisplayedTest()
	{
		boolean flag = genres.ValidateMoviesTabIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=6)
	public void ValidateShowsTabIsDisplayedTest()
	{
		boolean flag = genres.ValidateShowsTabIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=7)
	public void ValidateGenreAssetIsDisplayedTest()
	{
		boolean flag=genres.ValidateGenreAssetIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=8)
	public void ValidateOnScrollingTest()
	{
		boolean flag = genres.ValidateOnScrolling();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=9)
	public void ValidateOnClickBackButtonTest()
	{
		home = genres.ValidateOnClickBackButton();
	}
	
	@Test(priority=10)
	public void ValidateGenreDropdownButtonIsDisplayedTest()
	{
		boolean flag = genres.ValidateGenreDropdownButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=11)
	public void ValidateSelectedGenreIsDisplayedTest()
	{
		String gen=genres.ValidateSelectedGenreIsDisplayed();
		Assert.assertEquals("comedy", gen);
	}
	
	@Test(priority=12)
	public void ValidateCloseButtonIsDisplayedTest()
	{
		boolean flag=genres.ValidateCloseButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	// R & D For Highlighted Element
	/*
	@Test(priority=13)	
	public void ValidateFocusedGenreTest()
		{
			boolean flag = genres.ValidateFocusedGenre();
			Assert.assertTrue(flag);
		}
		
		///////////////////////////////////
	*/
	
	@Test(priority=13)
	public void ValidateOnClickCloseButtonTest()
	{
		boolean flag = genres.ValidateOnClickCloseButton();
		Assert.assertTrue(flag);
	}
	
	// Movies Tab
	
	@Test(priority=14)
	public void ValidateMovieAssetIsDisplayedTest()
	{
		boolean flag = genres.ValidateMovieAssetIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=15)
	public void ValidateOnClickMovieAssetTest()
	{
		movie=genres.ValidateOnClickMovieAsset();	
	}
	
	// Shows Tab
	
	@Test(priority=16)
	public void ValidateShowAssetIsDisplayedTest()
	{
		boolean flag = genres.ValidateShowAssetIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=17)
	public void ValidateOnScrollingShowTest()
	{
		boolean flag = genres.ValidateOnScrollingShow();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=18)
	public void ValidateOnClickShowAssetTest()
	{
		show=genres.ValidateOnClickShowAsset();
	}
	
	// ______________________________________________________//
	
	@AfterMethod()
	public void teardown(ITestResult result) throws IOException
	{
		 if (result.getStatus() == ITestResult.FAILURE) {
	            util.getScreenshot(result.getMethod().getMethodName());
	        }
		
		driver.quit();
	}
	
}
