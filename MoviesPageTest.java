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
import com.cineverse.qa.pages.MoviesPage;
import com.cineverse.qa.pages.SignUpPage;
import com.cineverse.qa.retry.Rerun_Failed_TestCase;
import com.cinverse.qa.util.Utility;

import junit.framework.Assert;

public class MoviesPageTest extends CineverseBase {
	
	MoviesPage movie;
	HomePage home;
	HamburgerMenu menu;
	SignUpPage signup;
	Utility util;
	
	@BeforeMethod()
	//@Test()
	public void setup() throws MalformedURLException, InterruptedException
	{
		initialization();
		Thread.sleep(3000);
		movie = new MoviesPage();
		home = new HomePage();
		menu = new HamburgerMenu();
		signup = new SignUpPage();
		util = new Utility();
		home.CookiesClose();
		home.ValidateOnClickHamburgerMenu();
		menu.ValidateOnClickMovies();
	}
	
	@Test(priority=1, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateMoviesTextIsDisplayedTest()
	{
		boolean flag = movie.ValidateMoviesTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateBackButtonIsDisplayedTest()
	{
		boolean flag = movie.ValidateBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=3, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateScrollingTest()
	{
		boolean flag = movie.ValidateScrolling();
		Assert.assertTrue(flag);
	}
	
	// Shelf 1
	
	@Test(priority=4, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateShelf1IsDIsplayedTest()
	{
		boolean flag = movie.ValidateShelf1IsDIsplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateShelf1SwipingTest()
	{
		boolean flag = movie.ValidateShelf1Swiping();
		Assert.assertTrue(flag);
	}
	
	// Shelf 1 -> Asset 1
	
	@Test(priority=6, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetBackButtonIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickAssetBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=7, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetShareButtonIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickAssetShareButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=8, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetNameIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickAssetNameIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=9, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetReleaseYearIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickAssetReleaseYearIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=10, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetGenreIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickAssetGenreIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=11, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetDirectedByTextIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickAssetDirectedByTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=12, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetDirectorIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickAssetDirectorIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=13, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetStarringTextIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickAssetStarringTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=14, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetStarringIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickAssetStarringIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=15, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetPlayButtonIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickAssetPlayButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=16, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetWatchListButtonIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickAssetWatchListButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=17, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetLikeButtonIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickAssetLikeButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=18, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetDisLikeButtonIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickAssetDisLikeButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=19, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetMoreLikeThisTabIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickAssetMoreLikeThisTabIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=20, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetDetailsTabIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickAssetDetailsTabIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	// More Like This Tab
	
	@Test(priority=21, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateGenreRelatedTabIsDisplayedTest()
	{
		boolean flag = movie.ValidateGenreRelatedTabIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=22, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateGenreRelatedAssetIsDisplayedTest()
	{
		boolean flag = movie.ValidateGenreRelatedAssetIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=23, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSimilarTitleTabIsDisplayedTest()
	{
		boolean flag = movie.ValidateSimilarTitleTabIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=24, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSimilarTitleAssetIsDisplayedTest()
	{
		boolean flag = movie.ValidateSimilarTitleAssetIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	// Details
	
	@Test(priority=25, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickDetailsMovieNameIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickDetailsMovieNameIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=26, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickDetailsMovieDescriptionIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickDetailsMovieDescriptionIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=27, retryAnalyzer=Rerun_Failed_TestCase.class)
     public void ValidateOnClickDetailsMovieReleaseYearTextIsDisplayedTest()
     {
		boolean flag = movie.ValidateOnClickDetailsMovieReleaseYearTextIsDisplayed();
		Assert.assertTrue(flag);
     }
	
	@Test(priority=28, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickDetailsMovieReleaseYearIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickDetailsMovieReleaseYearIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=29, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickDetailsMovieGenresTextIsDisplpayedTest()
	{
		boolean flag = movie.ValidateOnClickDetailsMovieGenresTextIsDisplpayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=30, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickDetailsMovieGenreIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickDetailsMovieGenreIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=31, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickDetailsMovieRatingTextIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickDetailsMovieRatingTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=32, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickDetailsMovieRatingIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickDetailsMovieRatingIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=33, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickDetailsMovieDirectedByTextIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickDetailsMovieDirectedByTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=34, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValildateOnClickDetailsMovieDirectorIsDisplayedTest()
	{
		boolean flag = movie.ValildateOnClickDetailsMovieDirectorIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=35, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickDetailsMovieStarringTextIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickDetailsMovieStarringTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=36, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickDetailsMovieStarringIsDisplayedTest()
	{
		boolean flag = movie.ValidateOnClickDetailsMovieStarringIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	    
	 // Click Events
	
		// Back Button
	@Test(priority=37, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickBackButtonTest()
	{
		boolean flag = movie.ValidateOnClickBackButton();
		Assert.assertTrue(flag);
	}
	
		// Share Button
	@Test(priority=38, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickShareButtonTest()
	{
		boolean flag = movie.ValidateOnClickShareButton();
		Assert.assertTrue(flag);
	}
	
	 // Like, DisLike and WatchList Button
	@Test(priority=39, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickWatchListButtonTest()
	{
		signup = movie.ValidateOnClickWatchListButton();
	}
	
	@Test(priority=40, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickLikeButtonTest()
	{
		signup = movie.ValidateOnClickLikeButton();
	}
	
	@Test(priority=41, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickDisLikeButtonTest()
	{
		signup = movie.ValidateOnClickDisLikeButton();
	}
	
	// On Click Play button
	
    // Advertizement screen
	
	@Test(priority=42, retryAnalyzer=Rerun_Failed_TestCase.class)
	 public void ValidateAdvertizementIsPlayedTest()
	 {
		boolean flag = movie.ValidateAdvertizementIsPlayed();
		Assert.assertTrue(flag);
	 }
	
	@Test(priority=43, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickLearnMoreButtonTest()
	{
		boolean flag = movie.ValidateOnClickLearnMoreButton();
		Assert.assertTrue(flag);
	}
	
	 // Main Play Screen
	
	@Test(priority=44, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateCrossButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = movie.ValidateCrossButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=45, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateAppLogoIsDisplayedTest() throws InterruptedException
	{
		boolean flag = movie.ValidateAppLogoIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=46, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateBrightnessSliderIsDisplayedTest() throws InterruptedException
	{
		boolean flag = movie.ValidateBrightnessSliderIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=47, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateBackWardButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = movie.ValidateBackWardButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=48, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidatePlayPauseButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = movie.ValidatePlayPauseButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=49, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateForWardButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = movie.ValidateForWardButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=50, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateProgressBarIsDisplayedTest() throws InterruptedException
	{
		boolean flag = movie.ValidateProgressBarIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=51, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateAirPlayButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = movie.ValidateAirPlayButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=52, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateCastingButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = movie.ValidateCastingButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=53, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSettingButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = movie.ValidateSettingButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	// Play Screen -> On Click Setting
	
	@Test(priority=54, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickSettingBackButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = movie.ValidateOnClickSettingBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=55, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickSettingSettingTextIsDisplayedTest() throws InterruptedException
	{
		boolean flag = movie.ValidateOnClickSettingSettingTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=56, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickSettingAudioLanguageIsDisplayedTest() throws InterruptedException
	{
		boolean flag = movie.ValidateOnClickSettingAudioLanguageIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=57, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickSettingUnknownTextIsDisplayedTest() throws InterruptedException
	{
		boolean flag = movie.ValidateOnClickSettingUnknownTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=58, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickSettingSubTitlesIsDisplayedTest() throws InterruptedException
	{
		boolean flag = movie.ValidateOnClickSettingSubTitlesIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=59, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickSettingOFFButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = movie.ValidateOnClickSettingOFFButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=60, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickSettingEnglishButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = movie.ValidateOnClickSettingEnglishButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=61, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickSettingBackButtonTest() throws InterruptedException
	{
		boolean flag = movie.ValidateOnClickSettingBackButton();
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
