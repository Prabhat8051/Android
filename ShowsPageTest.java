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
import com.cineverse.qa.pages.ShowsPage;
import com.cineverse.qa.pages.SignUpPage;
import com.cineverse.qa.retry.Rerun_Failed_TestCase;
import com.cinverse.qa.util.Utility;

import junit.framework.Assert;

public class ShowsPageTest extends CineverseBase {
	
	ShowsPage show;
	HomePage home;
	HamburgerMenu menu;
	SignUpPage signup;
	Utility util;
	
	public ShowsPageTest()
	{
		super();
	}

	
	@BeforeMethod()
	//@Test()
	public void setup() throws MalformedURLException, InterruptedException
	{
		initialization();
		Thread.sleep(3000);
		show = new ShowsPage();
		home = new HomePage();
		menu = new HamburgerMenu();
		signup = new SignUpPage();
		util = new Utility();
		home.CookiesClose();
		home.ValidateOnClickHamburgerMenu();
		menu.ValidateOnClickShow();
	}
	
	@Test(priority=1, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateBackButtonIsDisplayedTest()
	{
		boolean flag = show.ValidateBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSearchButtonIsDisplayedTest()
	{
		boolean flag = show.ValidateSearchButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateShowsTextIsDisplayedTest()
	{
		boolean flag = show.ValidateShowsTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=4, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateAppLogoIsDisplayedTest()
	{
		boolean flag = show.ValidateAppLogoIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateFirstShelfIsDisplayedTest()
	{
		boolean flag = show.ValidateFirstShelfIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=6, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateFirstShelfAssetIsDisplayedTest()
	{
		boolean flag = show.ValidateFirstShelfAssetIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=7, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateScrollingTest()
	{
		boolean flag = show.ValidateScrolling();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=8, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSwipingTest()
	{
		boolean flag = show.ValidateSwiping();
		Assert.assertTrue(flag);
	}
	
	// Click Events
	
	@Test(priority=9, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickBackButtonTest()
	{
	  home =show.ValidateOnClickBackButton();
	}
	
	// Click Events -> First Asset Of First Shelf
	
	@Test(priority=10, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetBackButtonIsDisplayedTest()
	{
		boolean flag = show.ValidateOnClickAssetBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=11, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetShareButtonIsDisplayedTest()
	{
		boolean flag = show.ValidateOnClickAssetShareButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=12, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetThumbnailIsDisplayedTest()
	{
		boolean flag = show.ValidateOnClickAssetThumbnailIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=13, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetGenreIsDisplayedTest()
	{
		boolean flag = show.ValidateOnClickAssetGenreIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=14, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetDirectedByTextIsDisplayedTest()
	{
		boolean flag = show.ValidateOnClickAssetDirectedByTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=15, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetDirectorNameIsDisplayedTest()
	{
		boolean flag = show.ValidateOnClickAssetDirectorNameIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=16, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetStarringTextIsDisplayedTest()
	{
		boolean flag = show.ValidateOnClickAssetStarringTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=17, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetStarringIsDisplayedTest()
	{
		boolean flag = show.ValidateOnClickAssetStarringIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=18, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetPlayButtonIsDisplayedTest()
	{
		boolean flag = show.ValidateOnClickAssetPlayButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=19, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetWatchListButtonIsDisplayedTest()
	{
		boolean flag = show.ValidateOnClickAssetWatchListButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=20, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetLikeButtonIsDisplayedTest()
	{
		boolean flag = show.ValidateOnClickAssetLikeButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=21, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetDisLikeButtonIsDisplayedTest()
	{
		boolean flag = show.ValidateOnClickAssetDisLikeButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=22, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetEpisodesTabIsDisplayedTest()
	{
		boolean flag = show.ValidateOnClickAssetEpisodesTabIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=23, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetMoreLikeThisTabIsDisplayedTest()
	{
		boolean flag = show.ValidateOnClickAssetMoreLikeThisTabIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=24, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickAssetDetailsTabIsDisplayedTest()
	{
		boolean flag = show.ValidateOnClickAssetDetailsTabIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=25, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSeasonWithDropdownButtonIsDisplayedTest()
	{
		boolean flag = show.ValidateSeasonWithDropdownButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=26, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateAssetFirstEpisodeThumbnailIsDisplayedTest()
	{
		boolean flag = show.ValidateAssetFirstEpisodeThumbnailIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=27, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateAssetFirstEpisodeTitleIsDisplayedTest()
	{
		boolean flag = show.ValidateAssetFirstEpisodeTitleIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=28, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateAssetFirstEpisodeDurationIsDisplayedTest()
	{
		boolean flag = show.ValidateAssetFirstEpisodeDurationIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=29, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateAssetFirstEpisodeDescriptionIsDisplayedTest()
	{
		boolean flag = show.ValidateAssetFirstEpisodeDescriptionIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=30, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSwipingAssetEpisodesTest()
	{
		boolean flag = show.ValidateSwipingAssetEpisodes();
		Assert.assertTrue(flag);
	}
	
	// Click Events -> On Asset 1
	
	@Test(priority=31, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickShareButtonTest()
	{
		boolean flag = show.ValidateOnClickShareButton();
		Assert.assertTrue(flag);
	}
	
	// Click -> More Like This Tab
	
	@Test(priority=32, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateGenreRelatedMoreTabIsDisplayedTest()
	{
		boolean flag = show.ValidateGenreRelatedMoreTabIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=33, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateGenreRelatedAssetIsDisplayedTest()
	{
		boolean flag = show.ValidateGenreRelatedAssetIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=34, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnScrollingMoreLikeThisTabTest()
	{
		boolean flag = show.ValidateOnScrollingMoreLikeThisTab();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=35, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnSwipingMoreLikeThisTabTest()
	{
		boolean flag = show.ValidateOnSwipingMoreLikeThisTab();
		Assert.assertTrue(flag);
	}
	
	
	// click -> Details Tab
	
	@Test(priority=36, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateAssetTitleIsDisplayedTest()
	{
		boolean flag = show.ValidateAssetTitleIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=37, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateAssetDescriptionIsDisplayedTest()
	{
		boolean flag = show.ValidateAssetDescriptionIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=38, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateAssetReleaseYearTextIsDisplayedTest()
	{
		boolean flag = show.ValidateAssetReleaseYearTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=39, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateAssetReleaseYearIsDisplayedTest()
	{
		boolean flag = show.ValidateAssetReleaseYearIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=40, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateAssetGenresTextIsDisplayedTest()
	{
		boolean flag = show.ValidateAssetGenresTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=41, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateAssetGenresIsDisplayedTest()
	{
		boolean flag = show.ValidateAssetGenresIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=42, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateRatingTextIsDisplayedTest()
	{
		boolean flag = show.ValidateRatingTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=43, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateRatingIsDisplayedTest()
	{
		boolean flag = show.ValidateRatingIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=44, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateDirectedByTextIsDisplayedTest()
	{
		boolean flag = show.ValidateDirectedByTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=45, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateDirectorNameIsDisplayedTest()
	{
		boolean flag = show.ValidateDirectorNameIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=46, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateStarringTextIsDisplayedTest()
	{
		boolean flag = show.ValidateStarringTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=47, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateStarringIsDisplayedTest()
	{
		boolean flag = show.ValidateStarringIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	// Click -> Season number with dropdown
	
	@Test(priority=48, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickDropdownCloseButtonIsDisplayedTest()
	{
		boolean flag = show.ValidateOnClickDropdownCloseButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=49, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickDropdownSeason1IsDisplayedTest()
	{
		boolean flag = show.ValidateOnClickDropdownSeason1IsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=50, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickDropdownSeason2IsDisplayedTest()
	{
		boolean flag = show.ValidateOnClickDropdownSeason2IsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=51, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickDropdownSeason3IsDisplayedTest()
	{
		boolean flag = show.ValidateOnClickDropdownSeason3IsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=52, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickSeasonCloseButtonTest()
	{
		boolean flag = show.ValidateOnClickSeasonCloseButton();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=53, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnSelectingSeasonNumber()
	{
		String ssnum= show.ValidateOnSelectingSeasonNumber();
		Assert.assertEquals("Season 1", ssnum);
	}
	
	 // Play Event for Asset1 -> Main Play Screen
	
	@Test(priority=54, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnPlayAppPlayerLogoIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateOnPlayAppPlayerLogoIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=55, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnPlayAssetTitleIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateOnPlayAssetTitleIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=56, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnPlayAssetCloseButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateOnPlayAssetCloseButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=57, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnPlayAssetBrightnessSliderIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateOnPlayAssetBrightnessSliderIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=58, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnPlayAssetBackWardButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateOnPlayAssetBackWardButtonIsDisplayed();
	    Assert.assertTrue(flag);
	}
	
	@Test(priority=59, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidatePlayPauseButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidatePlayPauseButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=60, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateForWardButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateForWardButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=61, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateProgressBarIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateProgressBarIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=62, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateMoreEpisodeButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateMoreEpisodeButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=63, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateAirPlayButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateAirPlayButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=64, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateCastingButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateCastingButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=65, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSettingButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateSettingButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	 // Click Event On Play Screen for Asset1 -> Main Play Screen
	
	  // Click -> Close Button
	
	@Test(priority=66, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickCloseButtonTest() throws InterruptedException
	{
		boolean flag = show.ValidateOnClickCloseButton();
		Assert.assertTrue(flag);
	}
	
	// Click -> Setting Button
	
	@Test(priority=67, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickSettingBackButtonIsDisplayed() throws InterruptedException
	{
		boolean flag = show.ValidateOnClickSettingBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=68, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickSettingTextIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateOnClickSettingTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=69, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickSettingAudioLanguageIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateOnClickSettingAudioLanguageIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=70, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickSettingUnknownTextIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateOnClickSettingUnknownTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=71, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickSettingSubTitlesTextIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateOnClickSettingSubTitlesTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=72, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickSettingOFFButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateOnClickSettingOFFButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=73, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickSettingEnglishButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateOnClickSettingEnglishButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	// Play Screen -> On Click More Episode Button
	
	@Test(priority=74, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateMoreEpisodeBackButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateMoreEpisodeBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=75, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateMoreEpisodeSeasonNumberIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateMoreEpisodeSeasonNumberIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=76, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateMoreEpisodeSeasonDrodownButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateMoreEpisodeSeasonDrodownButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=77, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateMoreEpisodeFirstEpisodeTitleIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateMoreEpisodeFirstEpisodeTitleIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=78, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateMoreEpisodeFirstEpisodeDurationIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateMoreEpisodeFirstEpisodeDurationIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=79, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateMoreEpisodeFirstEpisodeDescriptionIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValidateMoreEpisodeFirstEpisodeDescriptionIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=80, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickMoreEpisodeBackButtonTest() throws InterruptedException
	{
		boolean flag = show.ValidateOnClickMoreEpisodeBackButton();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=81, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValildateMoreEpisodeCloseButtonIsDisplayedTest() throws InterruptedException
	{
		boolean flag = show.ValildateMoreEpisodeCloseButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=82, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickMoreEpisodeCloseButtonTest() throws InterruptedException
	{
		boolean flag = show.ValidateOnClickMoreEpisodeCloseButton();
		Assert.assertTrue(flag);
	}
	
	// Verifying Advertisement
	
	@Test(priority=83, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateAdvertisementIsDisplayedTest()
	{
		boolean flag = show.ValidateAdvertisementIsDisplayed();
		Assert.assertTrue(flag);
	}
	
/*	@Test(priority=84)
	public void ValidateOnClickAdvertisementLearnMoreButtonTest()
	{
		boolean flag = show.ValidateOnClickAdvertisementLearnMoreButton();
		Assert.assertTrue(flag);
	}
	*/
	// Click Events -> WatchList, Like , Dislike
	
	@Test(priority=84, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickWatchListButtonTest()
	{
		signup = show.ValidateOnClickWatchListButton();
		
	}
	
	@Test(priority=85, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickLikeButtonTest()
	{
		signup = show.ValidateOnClickLikeButton();
	}
	
	@Test(priority=86, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickDisLikeButtonTest()
	{
		signup = show.ValidateOnClickDisLikeButton();
	}
	
	@Test(priority=87, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickWatchListBackButtonTest()
	{
		boolean flag = show.ValidateOnClickWatchListBackButton();
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
