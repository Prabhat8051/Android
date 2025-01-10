package com.cineverse.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.AccountPage;
import com.cineverse.qa.pages.ForgotPasswordPage;
import com.cineverse.qa.pages.HamburgerMenu;
import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.SignInPage;
import com.cineverse.qa.pages.SignUpPage;
import com.cineverse.qa.retry.Rerun_Failed_TestCase;
import com.cinverse.qa.util.Utility;

import junit.framework.Assert;

public class SignInPageTest extends CineverseBase{
	
	SignInPage signin;
	HomePage home;
	AccountPage account;
	SignUpPage signup;
	ForgotPasswordPage fpwd;
	HamburgerMenu menu;
	Utility util;
	
	public SignInPageTest()
	{
		super();
	}
	
	@BeforeMethod()
	public void setup() throws MalformedURLException, InterruptedException
	{
		initialization();
		Thread.sleep(3000);
		home = new HomePage();
		account = new AccountPage();
		signup = new SignUpPage();
		signin = new SignInPage();
		fpwd = new ForgotPasswordPage();
		menu = new HamburgerMenu();
		util = new Utility();
		home.CookiesClose();
		home.ValidateOnClickAccount();
		account.ValidateOnClickSignUpButton();
		signup.ValidateOnClickSignInButton();
	}
	
	@Test(priority=1, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateBackButtonIsDisplayedTest()
	{
		boolean flag = signin.ValidateBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateCinverseLogoIsDisplayedTest()
	{
		boolean flag = signin.ValidateCinverseLogoIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateLogoTextIsDisplayedTest()
	{
		boolean flag = signin.ValidateLogoTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=4, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSignInTextIsDisplayedTest()
	{
		boolean flag = signin.ValidateSignInTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateEmailInputBoxIsDisplayedTest()
	{
		boolean flag = signin.ValidateEmailInputBoxIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=6, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidatePasswordInputBoxIsDisplayedTest()
	{
		boolean flag = signin.ValidatePasswordInputBoxIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=7, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidatePasswordViewIconIsDisplayedTest()
	{
		boolean flag = signin.ValidatePasswordViewIconIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=8, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSignInButtonIsDisplayedTest()
	{
		boolean flag = signin.ValidateSignInButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=9, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSignUpButtonIsDisplayedTest()
	{
		boolean flag = signin.ValidateSignUpButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=10, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateForgotPasswordButtonIsDisplayedTest()
	{
		boolean flag = signin.ValidateForgotPasswordButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	// Click Events
	
	@Test(priority=11, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickBackButtonTest()
	{
		account = signin.ValidateOnClickBackButton();
	}
	
	@Test(priority=12, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickSignUpButtonTest()
	{
		signup = signin.ValidateOnClickSignUpButton();
	}
	
	@Test(priority=13, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickForgotPasswordButtonTest()
	{
		fpwd = signin.ValidateOnClickForgotPasswordButton();
	}
	
	// Data Validations
	
		// Empty Credentials
	
	@Test(priority=14, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSignInWithEmptyCredentialsTest()
	{
		boolean flag = signin.ValidateSignInWithEmptyCredentials();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=15, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSignInWithEmptyEmailTest()
	{
		boolean flag = signin.ValidateSignInWithEmptyEmail();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=16, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSignInWithEmptyPassword()
	{
		boolean flag = signin.ValidateSignInWithEmptyPassword();
		Assert.assertTrue(flag);
	}
	
	// Invalid/ Incorrect Credentials
	
	@Test(priority=17, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSignInWithInCorrectEmailTest()
	{
		boolean flag = signin.ValidateSignInWithInCorrectEmail();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=18, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSignInWithInCorrectPasswordTest()
	{
		boolean flag = signin.ValidateSignInWithInCorrectPassword();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=19, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateOnClickFailureOkButtonTest()
	{
		signin = signin.ValidateOnClickFailureOkButton();
	}
	
	// Sign In With Valid Credentials
	
	@Test(priority=20, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateSignInWithValidCredentialsTest()
	{
		boolean flag = signin.ValidateSignInWithValidCredentials();
		Assert.assertTrue(flag);
	}
	
	// Hamburger Menu After Login 
	@Test(priority=21, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateHamburgerMenuAfterLogInTest() throws InterruptedException
	{
		menu = signin.ValidateHamburgerMenuAfterLogIn();
	}
	
	@Test(priority=22, retryAnalyzer=Rerun_Failed_TestCase.class)
	public void ValidateRegisterAccountTest() throws InterruptedException
	{
		signin.ValidateRegisterAccount();
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
