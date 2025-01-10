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
import com.cineverse.qa.pages.MoviesPromo;
import com.cineverse.qa.pages.SignUpPage;
import com.cinverse.qa.util.Utility;

import junit.framework.Assert;

public class MoviesPromoTest extends CineverseBase {
	
	MoviesPromo promo;
	HomePage home;
	HamburgerMenu menu;
	MoviesPage movie;
	SignUpPage signup;
	Utility util;
	
	public MoviesPromoTest()
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
		menu = new HamburgerMenu();
		promo = new MoviesPromo();
		movie = new MoviesPage();
		signup = new SignUpPage();
		util = new Utility();
		home.CookiesClose();
		home.ValidateOnClickHamburgerMenu();
		menu.ValidateOnClickMovies();
	}
	

	@Test(priority=1)
	public void ValidatePromoReleaseYearIsDisplayedTest()
	{
		boolean flag = promo.ValidatePromoReleaseYearIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void ValidatePromoGenreIsDisplayedTest()
	{
		boolean flag = promo.ValidatePromoGenreIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void ValidatePromoPlayButtonIsDisplaqyedTest()
	{
		boolean flag = promo.ValidatePromoPlayButtonIsDisplaqyed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=4)
	public void ValidatePromoInfoButtonIsDisplayedTest()
	{
		boolean flag = promo.ValidatePromoInfoButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void ValidateScrollingTest()
	{
		boolean flag = promo.ValidateScrolling();
		Assert.assertTrue(flag);
	}
	
	/*
	@Test(priority=4)
	public void ValidateText()
	{
		promo.ValidateText();
	}
	*/
	
	
	@Test(priority=4)
	public void ValidateBackButtonIsDisplayedTest()
	{
		boolean flag = promo.ValidateBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5)
	public void ValildateShareButtonIsDisplayedTest()
	{
		boolean flag = promo.ValildateShareButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=6)
	public void ValidateReleaseYeqrWithDurationIsDisplayedTest()
	{
		boolean flag = promo.ValidateReleaseYeqrWithDurationIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=7)
	public void ValidateGenreIsDisplayedTest()
	{
		boolean flag = promo.ValidateGenreIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=8)
	public void ValidateDirectedByTextIsDisplayedTest()
	{
		boolean flag = promo.ValidateDirectedByTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=9)
	public void ValidateDirectorNameIsDisplayedTest()
	{
		boolean flag = promo.ValidateDirectorNameIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=10)
	public void ValidateStarringTextIsDisplayedTest()
	{
		boolean flag = promo.ValidateStarringTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=11)
	public void ValidateStarringIsDisplayedTest()
	{
		boolean flag = promo.ValidateStarringIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=12)
	public void ValidatePlayButtonIsDisplayedTest()
	{
		boolean flag = promo.ValidatePlayButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=11)
	public void ValidateWatchListButtonIsDisplayedTest()
	{
		boolean flag = promo.ValidateWatchListButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=12)
    public void ValidateLikeButtonIsDisplayedTest()
    {
		boolean flag = promo.ValidateLikeButtonIsDisplayed();
		Assert.assertTrue(flag);
    }
	
	@Test(priority=13)
	public void ValidateDisLikeButtonIsDisplayedTest()
	{
		boolean flag = promo.ValidateDisLikeButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=14)
	public void ValidateMoreLikeThisTabIsDisplayedTest()
	{
		boolean flag = promo.ValidateMoreLikeThisTabIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=15)
     public void ValidateDetailsTabIsDisplayedTest()
     {
		boolean flag = promo.ValidateDetailsTabIsDisplayed();
		Assert.assertTrue(flag);
     }
	
	// Info Icon -> Click Events 
	
	@Test(priority=16)
	public void ValidateOnClicBackButtonTest()
	{
		movie = promo.ValidateOnClicBackButton();
	}
	
	// Info Icon -> Share Button
	
	@Test(priority=17)
	public void ValidateOnClickShareButtonTest()
	{
		boolean flag = promo.ValidateOnClickShareButton();
		Assert.assertTrue(flag);
	}
	
	// Info Icon -> watchlist  button  -> Failing
	@Test(priority=18)
	public void ValidateWatchListButtonTest()
	{
		boolean flag = promo.ValidateWatchListButton();
		Assert.assertTrue(flag);
	}
	
	// Info Icon -> Like Button
	
	@Test(priority=19)
	public void ValidateOnClickLikeButtonTest()
	{
		signup = promo.ValidateOnClickLikeButton();
	}
	// Info Icon -> Dislike Button
	
	@Test(priority=20)
	public void ValidateOnClickDislikeButtonTest()
	{
		signup = promo.ValidateOnClickDislikeButton();
	}
	
	
	// info Icon -> More Like This Tab
	
	@Test(priority=11)
	public void ValidteGenreRelatedShelfIsDisplayedTest()
	{
		boolean flag = promo.ValidteGenreRelatedShelfIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=12)
	public void ValidateSimilarTitleIsDisplayedTest()
	{
		boolean flag = promo.ValidateSimilarTitleIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	// Info Icon -> Details Tab
	
	@Test(priority=13)
	public void ValidateTitleIsDisplayedTest()
	{
		boolean flag = promo.ValidateTitleIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=14)
	public void ValidateDescriptionIsDisplayedTest()
	{
		boolean flag = promo.ValidateDescriptionIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=15)
	public void ValidateReleaseYearTextIsDisplayedTest()
	{
		boolean flag = promo.ValidateReleaseYearTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=16)
	public void ValidateReleaseYearIsDisplayedTest()
	{
		boolean flag = promo.ValidateReleaseYearIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=17)
	public void ValidateGenresTextIsDisplayedTest()
	{
		boolean flag = promo.ValidateGenresTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=18)
	public void ValidateGenresIsDisplayedTest()
	{
		boolean flag = promo.ValidateGenresIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=19)
	public void ValidateRatingTextIsDisplayedTest()
	{
		boolean flag = promo.ValidateRatingTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=20)
	public void ValidateRatingIsDisplayedTest()
	{
		boolean flag = promo.ValidateRatingIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=21)
	public void ValidateDirectedByIsDisplayedTest()
	{
		boolean flag = promo.ValidateDirectedByIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=22)
	public void ValidateDirectorIsDisplayedTest()
	{
		boolean flag = promo.ValidateDirectorIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=23)
	public void ValidateStarringTexIsDisplayedTest()
	{
		boolean flag = promo.ValidateStarringTexIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=24)
	public void ValidateStarringDisplayedTest()
	{
		boolean flag = promo.ValidateStarringDisplayed();
		Assert.assertTrue(flag);
	}
	
	// Promo Play Screen -> After Clicking Details Button
	
	@Test(priority=25)
	public void ValidateAppLogoIsDisplayedTest() throws InterruptedException
	{
		boolean flag = promo.ValidateAppLogoIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=26)
	public void ValidateCrossIconIsDisplayedTest() throws InterruptedException
	{
		boolean flag = promo.ValidateCrossIconIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=27)
	public void ValidateBrightnessSliderIsDisplayedTest() throws InterruptedException
	{
		boolean flag = promo.ValidateBrightnessSliderIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=28)
	public void ValidateBackWardButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = promo.ValidateBackWardButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=29)
	public void ValidateForWardButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = promo.ValidateForWardButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=30)
	public void ValidatePlayPauseButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = promo.ValidatePlayPauseButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=31)
	public void ValidateProgressBarIsDisplayedTest() throws InterruptedException
	{
		boolean flag = promo.ValidateProgressBarIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=32)
	public void ValidateSettingButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = promo.ValidateSettingButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=33)
	public void ValidateScreenCastingButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = promo.ValidateScreenCastingButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=34)
	public void ValidateAirPlayButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = promo.ValidateAirPlayButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	// Play Screen -> Click Events
	
	@Test(priority=35)
	public void ValidateOnClickCrossButtonTest() throws InterruptedException
	{
		boolean flag = promo.ValidateOnClickCrossButton();
		Assert.assertTrue(flag);
	}
	
	// Play Screen -> Click Events -> On Click Setting
	
	@Test(priority=36)
	public void ValidateOnClickSettingBackButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = promo.ValidateOnClickSettingBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=37)
	public void ValidateOnClickSettingSettingTextIsDisplayedTest() throws InterruptedException
	{
		boolean flag = promo.ValidateOnClickSettingSettingTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=38)
	public void ValidateOnClickSettingAudioLanguageIsDisplayedTest() throws InterruptedException
	{
		boolean flag = promo.ValidateOnClickSettingAudioLanguageIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=39)
	public void ValidateOnClickSettingUnknownTextIsDisplayedTest() throws InterruptedException
	{
		boolean flag = promo.ValidateOnClickSettingUnknownTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=40)
	public void ValidateOnClickSettingSubTitlesIsDisplayedTest() throws InterruptedException
	{
		boolean flag = promo.ValidateOnClickSettingSubTitlesIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=41)
	public void ValidateOnClickSettingOFFButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = promo.ValidateOnClickSettingOFFButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=42)
	public void ValidateOnClickSettingEnglishButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = promo.ValidateOnClickSettingEnglishButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=43)
	public void ValidateOnClickSettingBackButtonTest() throws InterruptedException
	{
		boolean flag = promo.ValidateOnClickSettingBackButton();
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
