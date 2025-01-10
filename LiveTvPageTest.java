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
import com.cineverse.qa.pages.LiveTvPage;
import com.cineverse.qa.retry.Rerun_Failed_TestCase;
import com.cinverse.qa.util.Utility;

import junit.framework.Assert;

public class LiveTvPageTest extends CineverseBase {
	
	LiveTvPage live;
	Utility util;
	HomePage home = new HomePage();
	HamburgerMenu menu = new HamburgerMenu();
	
	
	public LiveTvPageTest()
	{
		super();
	}
	
	@BeforeMethod()
	public void setup() throws MalformedURLException, InterruptedException
	{
		initialization();
		//util.CookiesClose();
		Thread.sleep(3000);
		live = new LiveTvPage();
		home = new HomePage();
		menu = new HamburgerMenu();
		util = new Utility();
		/* For IOS Phone De-Comment this
		home.ValidateOnClickLiveTv();
		
		*/
		home.CookiesClose();
		home.ValidateOnClickHamburgerMenu();
		menu.ValidateOnClickLiveTv();
	}
	
	
	//Default Live Player Screen
	
	@Test(priority=1,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateBackButtonIsDisplayedTest()
	{
		boolean flag = live.ValidateBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateLivelogoIsDisplayedTest()
	{
		boolean flag = live.ValidateLivelogoIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateCaptionButtonIsDiplayedTest()
	{
		boolean flag = live.ValidateCaptionButtonIsDiplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=4,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidatePlayPauseButtonIsDisplayedTest()
	{
		boolean flag = live.ValidatePlayPauseButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateVolumeButtonIsDisplayedTest()
	{
		boolean flag = live.ValidateVolumeButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=6,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateMaximizeScreenIsDisplayedTest()
	{
		boolean flag = live.ValidateMaximizeScreenIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=7,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateNowPlayingTextIsDisplayedTest()
	{
		boolean flag = live.ValidateNowPlayingTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=8,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidatePreviousTimeSlotIsDisplayedTest()
	{
		boolean flag = live.ValidatePreviousTimeSlotIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=9,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateCurrentTimeSlotIsDisplayedTest()
	{
		boolean flag = live.ValidateCurrentTimeSlotIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	//Default Live Player Screen -> Click Events
	
	@Test(priority=10,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickBackButtonTest()
	{
		home = live.ValidateOnClickBackButton();
	}
	
	@Test(priority=11,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickMaximizeButtonTest()
	{
		boolean flag = live.ValidateOnClickMaximizeButton();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=12,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickMinimizeButtonTest()
	{
		boolean flag = live.ValidateOnClickMinimizeButton();
		Assert.assertTrue(flag);
	}
	
	// Live Channel
	
	@Test(priority=13,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateNowPlayingTextIsAvailableTest()
	{
		boolean flag = live.ValidateNowPlayingTextIsAvailable();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=14,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateTimeFrameIsDisplayedTest()
	{
		boolean flag = live.ValidateTimeFrameIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=15,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateChannelsFrameIsDisplayedTest()
	{
		boolean flag = live.ValidateChannelsFrameIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=16,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateChannelScheduledContentsFrameIsDisplayedTest()
	{
		boolean flag = live.ValidateChannelScheduledContentsFrameIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	// Live Channel -> Channel List -> Dynamic
	
	@Test(priority=17,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateFirstChannelIsDisplayedTest()
	{
		boolean flag = live.ValidateFirstChannelIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=18,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSecondChannelIsDisplayedTest()
	{
		boolean flag = live.ValidateSecondChannelIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=19,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateThirdChannelIsDisplayedTest()
	{
		boolean flag = live.ValidateThirdChannelIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=20,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateFourthChannelIsDisplayedTest()
	{
		boolean flag = live.ValidateFourthChannelIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=21,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateFifthChannelIsDisplayedTest()
	{
		boolean flag = live.ValidateFifthChannelIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=22,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSixthChannelIsDisplayedTest()
	{
		boolean flag = live.ValidateSixthChannelIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=23,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSeventhChannelIsDisplayedTest()
	{
		boolean flag = live.ValidateSeventhChannelIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=24,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateEighthChannelIsDisplayedTest()
	{
		boolean flag = live.ValidateEighthChannelIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	// Live Channel -> Channel -> Click Events
	
	@Test(priority=25,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickFirstChannelTest()
	{
		boolean flag = live.ValidateOnClickSecondChannel();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=26,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickThirdChannelTest()
	{
		boolean flag = live.ValidateOnClickThirdChannel();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=27,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickFourthChannelTest()
	{
		boolean flag = live.ValidateOnClickFourthChannel();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=28,retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickFifthChannelTest()
	{
		boolean flag = live.ValidateOnClickFifthChannel();
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
