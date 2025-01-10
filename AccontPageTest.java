package com.cineverse.qa.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.AccountPage;
import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.SignUpPage;
import com.cineverse.qa.pages.SubscriptionPage;
import com.cinverse.qa.util.Utility;

public class AccontPageTest extends CineverseBase {
	
	AccountPage account;
	HomePage home;
	SignUpPage signup;
	SubscriptionPage sbs;
	Utility util;
	
	
	public AccontPageTest()
	{
		super();
	}
    
	@BeforeMethod()
	//@Test()
	public void setup() throws MalformedURLException, InterruptedException
	{
		initialization();
		Thread.sleep(3000);
		account = new AccountPage();
		home = new HomePage();
		signup = new SignUpPage();
		sbs = new SubscriptionPage();
		util = new Utility();
		home.CookiesClose();
		home.ValidateOnClickAccount();
	}
	
	
	@Test(priority=1)
	public void ValidateBackButtonIsDisplayedTest()
	{
		boolean flag = account.ValidateBackButtonIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void ValidateUserImageIsDisplayedTest()
	{
		boolean flag = account.ValidateUserImageIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void ValidateSubscriptiomIsDisplayedTest()
	{
		boolean flag = account.ValidateSubscriptiomIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=4)
	public void ValidateNotificationIsDisplayedTest()
	{
		boolean flag = account.ValidateNotificationIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=5)
	public void ValidateSupportFaqIsDisplayedTest()
	{
		boolean flag = account.ValidateSupportFaqIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=6)
	public void ValidatePrivacyPolicyIsDisplayedTest()
	{
		boolean flag = account.ValidatePrivacyPolicyIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=7)
	public void ValidateTermsOfServiceIsDisplayedTest()
	{
		boolean flag = account.ValidateTermsOfServiceIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=8)
	public void ValidateAboutUsIsDisplayedTest()
	{
		boolean flag = account.ValidateAboutUsIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=9)
	public void ValidateSignUpButtonIsDisplayedTest()
	{
		boolean flag = account.ValidateSignUpButtonIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=10)
	public void ValidateAppVersionIsDisplayedTest()
	{
		boolean flag = account.ValidateAppVersionIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	// On Click Events
	
	@Test(priority=11)
	public void ValidateOnClickBackButtonTest()
	{
		home = account.ValidateOnClickBackButton();
	}
	
	  // Click -> Notification
	
	@Test(priority=12)
	public void ValidateNotificationBackButtonIsDisplayedTest()
	{
		boolean flag = account.ValidateNotificationBackButtonIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	 
	@Test(priority=13)
	public void ValidateNotificationHeadTextIsDisplayedTest()
	{
		boolean flag = account.ValidateNotificationHeadTextIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=14)
	public void ValidateNotificationSubHeadTextIsDisplayedTest()
	{
		boolean flag = account.ValidateNotificationSubHeadTextIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=15)
	public void ValidateEnableNotificationIsDisplayedTest()
	{
		boolean flag = account.ValidateEnableNotificationIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=16)
	public void ValidatePushNotificationIsDisplayedTest()
	{
		boolean flag = account.ValidatePushNotificationIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=17)
	public void ValidateOnClickNotificationBackButtonTest()
	{
		account = account.ValidateOnClickNotificationBackButton();
	}
	
	  // Click Support & FAQ -> Not Supported in stage build
	
	
	  
	  // Click Privacy Policy
	 
	@Test(priority=18)
	public void ValidatePrivacyBackButtonIsDisplayedTest()
	{
		boolean flag = account.ValidatePrivacyBackButtonIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=19)
	public void ValidatePrivacyHeadTextIsDisplayedTest()
	{
		boolean flag = account.ValidatePrivacyHeadTextIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	@Test(priority=20)
	public void ValidatePrivacyPolicyContentIsDisplayedTest()
	{
		boolean flag = account.ValidatePrivacyPolicyContentIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=21)
	public void ValidateOnClickPrivacyPolicyBackButtonTest()
	{
		account = account.ValidateOnClickPrivacyPolicyBackButton();
		
	}
	  // Click Terms Of Service
	  
	@Test(priority=22)
	public void ValidateTermsBackButtonIsDisplayedTest()
	{
		boolean flag = account.ValidateTermsBackButtonIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=23)
	public void ValidateTermsHeadTextIsDisplayedTest()
	{
		boolean flag = account.ValidateTermsHeadTextIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=24)
	public void ValidateTermsOfServiceContentIsDisplayedTest()
	{
		boolean flag = account.ValidateTermsOfServiceContentIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=25)
	public void ValidateOnClickTermsOfServiceBackButtonTest()
	{
		account = account.ValidateOnClickTermsOfServiceBackButton();
	}
	  // Click About Us
	
	@Test(priority=26)
	public void ValidateAboutUsBackButtonIsDisplayedTest()
	{
		boolean flag = account.ValidateAboutUsBackButtonIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=27)
	public void ValidateAboutUsHeadTextIsDisplayedTest()
	{
		boolean flag = account.ValidateAboutUsHeadTextIsDisplayed();
		AssertJUnit.assertTrue(flag);
	}
	
	@Test(priority=28)
	public void ValidateOnClickAboutUsBackButtonTest()
	{
		account = account.ValidateOnClickAboutUsBackButton();
		
	}
	
	// Sign Up Button
	
	@Test(priority=29)
	public void ValidateOnClickSignUpButtonTest()
	{
		signup = account.ValidateOnClickSignUpButton();
	}
	
	// SubsCription Page
	
	@Test(priority=30)
	public void ValidateOnClickSubscriptionTest()
	{
		sbs = account.ValidateOnClickSubscription();
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
