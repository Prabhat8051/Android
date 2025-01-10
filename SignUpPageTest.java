package com.cineverse.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.AccountPage;
import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.SignInPage;
import com.cineverse.qa.pages.SignUpPage;
import com.cinverse.qa.util.Utility;

import junit.framework.Assert;

public class SignUpPageTest extends CineverseBase{
	
	SignUpPage signup;
	HomePage home;
	AccountPage account;
	SignInPage signin;
	Utility util;
	
	public SignUpPageTest()
	{
		super();
	}
	
	@BeforeMethod()
	public void setup() throws MalformedURLException, InterruptedException
	{
		initialization();
		Thread.sleep(3000);
		signup = new SignUpPage();
		home = new HomePage();
		account = new AccountPage();
		signin = new SignInPage();
		util = new Utility();
		home.CookiesClose();
		home.ValidateOnClickAccount();
		account.ValidateOnClickSignUpButton();
	}
	
	@Test(priority=1)
	public void ValidateBackButtonIsDisplayedTest()
	{
		boolean flag = signup.ValidateBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void ValidateCineverseLogoIsDisplayedTest()
	{
		boolean flag = signup.ValidateCineverseLogoIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void ValidatelogoTextIsDisplayedTest()
	{
		boolean flag = signup.ValidatelogoTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=4)
	public void ValidateSignUpTextIsDisplayedTest()
	{
		boolean flag = signup.ValidateSignUpTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5)
	public void ValidateNameInputBoxIsDisplayedTest()
	{
		boolean flag = signup.ValidateNameInputBoxIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=6)
	public void ValidateEmailInputBoxIsDisplayedTest()
	{
		boolean flag = signup.ValidateEmailInputBoxIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=7)
	public void ValidatePasswordInputBoxIsDisplayedTest()
	{
		boolean flag = signup.ValidatePasswordInputBoxIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=8)
	public void ValidatePasswordViewIconIsDisplayedTest()
	{
		boolean flag = signup.ValidatePasswordViewIconIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=9)
	public void ValidateAcknowledgedMessageIsDisplayedTest()
	{
		boolean flag = signup.ValidateAcknowledgedMessageIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=10)
	public void ValidateAcknowledgeRadioButtonIsDisplayedTest()
	{
		boolean flag = signup.ValidateAcknowledgeRadioButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=11)
	public void ValidateSignupButtonIsDisplayedTest()
	{
		boolean flag = signup.ValidateSignupButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=12)
	public void ValidateSignInButtonIsDisplayedTest()
	{
		boolean flag = signup.ValidateSignInButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=13)
	public void ValidateByClickingConsentMessageIsDisplayedTest()
	{
		boolean flag = signup.ValidateByClickingConsentMessageIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	 // Click Events
	
	@Test(priority=14)
	public void ValidateOnClickBackButtonTest()
	{
		account = signup.ValidateOnClickBackButton();
	}
	
	@Test(priority=15)
	public void ValidateOnClickSignInButtonTest()
	{
		signin = signup.ValidateOnClickSignInButton();
	}
	
	//Radio Button Validation
	
	@Test(priority=16)
	public void ValidateDontMissTextIsDisplayedTest()
	{
		boolean flag = signup.ValidateDontMissTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=17)
	public void ValidateImInButtonIsDisplayedTest()
	{
		boolean flag = signup.ValidateImInButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=18)
	public void ValidateNoThanksButtonIsDisplayedTest()
	{
		boolean flag = signup.ValidateNoThanksButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=19)
	public void ValidateOnClickImInButtonTest()
	{
		boolean flag = signup.ValidateOnClickImInButton();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=20)
	public void ValidateOnClickNoThanksButtonTest()
	{
		boolean flag = signup.ValidateOnClickNoThanksButton();
		Assert.assertTrue(flag);
	}
	
	// Signup Validations -> Empty Details
	
	@Test(priority=21)
	public void ValidateSignUpWithEmptyDetailsTest()
	{
		boolean flag = signup.ValidateSignUpWithEmptyDetails();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=22)
	public void ValidateSignUpWithEmptyNameTest()
	{
	 boolean flag = signup.ValidateSignUpWithEmptyName();
	 Assert.assertTrue(flag);
	}
	
	@Test(priority=23)
	public void ValidateSignUpWithEmptyEmailTest()
	{
		boolean flag = signup.ValidateSignUpWithEmptyEmail();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=24)
	public void ValidateSignUpWithEmptyPasswordTest()
	{
		boolean flag = signup.ValidateSignUpWithEmptyPassword();
		Assert.assertTrue(flag);
	}
	
	//Signup Validations -> Invalid Email
	
	@Test(priority=25)
	public void ValidateSignUpWithInvalidEmailTest()
	{
		boolean flag = signup.ValidateSignUpWithInvalidEmail();
		Assert.assertTrue(flag);
	}
	
	//Signup Validations -> Invalid Password
	
	@Test(priority=26)
	public void ValidateSignUpWithInvalidPasswordTest()
	{
		boolean flag = signup.ValidateSignUpWithInvalidPassword();
		Assert.assertTrue(flag);
	}
	
	// Already Registered
	
	@Test(priority=27)
	public void ValidateAlreadyRegisteredMessageIsDisplayedTest()
	{
		boolean flag = signup.ValidateAlreadyRegisteredMessageIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=28)
	public void ValidateOnClickAlreadyRegisteredOkButtonTest()
	{
		signup = signup.ValidateOnClickAlreadyRegisteredOkButton();
	}
	
	 // Fresh User Sign Up
	
	@Test(priority=29)
	public void  ValidateSignUpWithValidCredentialsTest()
	{
		boolean flag = signup.ValidateSignUpWithValidCredentials();
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
