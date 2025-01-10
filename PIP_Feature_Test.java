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
import com.cineverse.qa.pipmode.PIP_Feature;
import com.cineverse.qa.retry.Rerun_Failed_TestCase;

import junit.framework.Assert;

public class PIP_Feature_Test extends CineverseBase {
	
	PIP_Feature pip;
	HomePage home;
	MoviesPage movie;
	HamburgerMenu menu;
	
	public PIP_Feature_Test()
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
		pip = new PIP_Feature();
		movie = new MoviesPage();
		home.CookiesClose();
		home.ValidateOnClickHamburgerMenu();
		menu = new HamburgerMenu();
		menu.ValidateOnClickMovies();	
	}	

	@Test(priority=1, retryAnalyzer=Rerun_Failed_TestCase.class )
	public void ValidatePlayButtonIsDisplayedTest()
	{
		boolean flag = pip.ValidatePlayButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidatePIPFeatureTest() throws InterruptedException
	{
		pip.ValidatePIPFeature();
	}
	
	@Test(priority=3, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void Video_PIP_ModeTest() throws InterruptedException
	{
		 pip.Video_PIP_Mode();
		
	}
	
	@Test(priority=4, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickMaximizeButtonTest() throws InterruptedException
	{
		boolean flag = pip.ValidateOnClickMaximizeButton();
		Assert.assertTrue("App not resumed properly", flag);
	}
	
	@AfterMethod()
	public void teardown() throws IOException
	{
		driver.quit();
	}
}
