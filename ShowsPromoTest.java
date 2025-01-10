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
import com.cineverse.qa.pages.ShowsPromo;
import com.cinverse.qa.util.Utility;

import junit.framework.Assert;

public class ShowsPromoTest extends CineverseBase {
	
	ShowsPromo promo;
	HomePage home;
	HamburgerMenu menu;
	Utility util;
	
	public ShowsPromoTest()
	{
		super();
	}

	@BeforeMethod()
	//@Test()
	public void setup() throws MalformedURLException, InterruptedException
	{
		initialization();
		Thread.sleep(3000);
		promo = new ShowsPromo();
		home = new HomePage();
		menu = new HamburgerMenu();
		util = new Utility();
		home.CookiesClose();
		home.ValidateOnClickHamburgerMenu();
		menu.ValidateOnClickShow();
	}
	
	
	@Test(priority=1)
	public void ValidatePromoPlayButtonIsDisplayedTest()
	{
		boolean flag = promo.ValidatePromoPlayButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	// On Click Play Button
	
	@Test(priority=2)
	public void ValidateApplogoIsDisplayedTest()
	{
		boolean flag = promo.ValidateApplogoIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void ValidateCrossIconIsDisplayedTest()
	{
		boolean flag = promo.ValidateCrossIconIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=4)
	public void ValidateBackwardButtonIsDisplayedTest()
	{
		boolean flag = promo.ValidateBackwardButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5)
	public void ValidatePlayPauseButtonIsDisplayedTest()
	{
		boolean flag = promo.ValidatePlayPauseButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=6)
	public void ValidateForwardButtonIsDisplayedTest()
	{
		boolean flag = promo.ValidateForwardButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=7)
	public void ValidateProgressBarIsDisplayedTest()
	{
		boolean flag = promo.ValidateProgressBarIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=8)
	public void ValidateAirPlayButtonIsDisplayedTest()
	{
		boolean flag = promo.ValidateAirPlayButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=9)
	public void ValidateCastingButtonIsDisplayedTest()
	{
		boolean flag = promo.ValidateCastingButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=10)
	public void ValildateSettingtButtonIsDisplayedTest()
	{
		boolean flag = promo.ValildateSettingtButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	// Play Screen -> On Click Setting
	
	@Test(priority=11)
	public void ValidateSettingBackButtonIsDisplayedTest()
	{
		boolean flag = promo.ValidateSettingBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=12)
	public void ValidateSettingTextIsDisplayedTest()
	{
		boolean flag = promo.ValidateSettingTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=13)
	public void ValidateAudioLanguageIsDisplayedTest()
	{
		boolean flag = promo.ValidateAudioLanguageIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=14)
	public void ValidateUnknownTextIsDisplayedTest()
	{
		boolean flag = promo.ValidateUnknownTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=15)
	public void ValidateSubTitlesTextIsDisplayedTest()
	{
		boolean flag = promo.ValidateSubTitlesTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=16)
	public void ValidateOFFButtonIsDisplayedTest()
	{
		boolean flag = promo.ValidateOFFButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=17)
	public void ValidateEnglishCCButtonIsDisplayedTest()
	{
		boolean flag = promo.ValidateEnglishCCButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=18)
	public void ValidateOnClickSettingBackButtonTest()
	{
		boolean flag = promo.ValidateOnClickSettingBackButton();
		Assert.assertTrue(flag);
	}
	
	// On Click Cross Icon
	
	@Test(priority=19)
	public void ValidateOnClickCrossButtonTest()
	{
		boolean flag = promo.ValidateOnClickCrossButton();
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
