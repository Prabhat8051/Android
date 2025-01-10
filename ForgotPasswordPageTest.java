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
import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.SignInPage;
import com.cineverse.qa.pages.SignUpPage;
import com.cinverse.qa.util.Utility;

import junit.framework.Assert;

public class ForgotPasswordPageTest extends CineverseBase{
	
	ForgotPasswordPage fpwd;
	HomePage home;
	AccountPage account;
	SignUpPage signup;
	SignInPage signin;
	Utility util;
	
	public ForgotPasswordPageTest()
	{
		super();
	}

	
	@BeforeMethod()
	public void setup() throws MalformedURLException, InterruptedException
	{
		initialization();
		Thread.sleep(3000);
		fpwd = new ForgotPasswordPage();
		home = new HomePage();
		account = new AccountPage();
		signup = new SignUpPage();
		signin = new SignInPage();
		util = new Utility();
		home.CookiesClose();
		home.ValidateOnClickAccount();
		account.ValidateOnClickSignUpButton();
		signup.ValidateOnClickSignInButton();
		signin.ValidateOnClickForgotPasswordButton();
	}
	
	@Test(priority=1)
	public void ValidateBackButtonIsDisplayedTest()
	{
		boolean flag = fpwd.ValidateBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void ValidateCineverseLogoIsDisplayedTest()
	{
		boolean flag = fpwd.ValidateCineverseLogoIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void ValidateLogoTextIsDisplayedTest()
	{
		boolean flag = fpwd.ValidateLogoTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=4)
	public void ValidateForgotPasswordTextIsDisplayedTest()
	{
		boolean flag = fpwd.ValidateForgotPasswordTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5)
	public void ValidateEmailInputBoxIsDisplayedTest()
	{
		boolean flag = fpwd.ValidateEmailInputBoxIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=6)
	public void ValidateResetPasswordButtonIsDisplayedTest()
	{
		boolean flag = fpwd.ValidateResetPasswordButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	// Data Validations
	
	// Empty Data
	
	@Test(priority=7)
	public void ValidateResetPasswordWithEmptyEmailTest()
	{
		boolean flag = fpwd.ValidateResetPasswordWithEmptyEmail();
		Assert.assertTrue(flag);
	}
	
	// Invalid Email
	@Test(priority=8)
	public void ValidateResetPasswordWithInvalidEmailTest()
	{
		boolean flag = fpwd.ValidateResetPasswordWithInvalidEmail();
		Assert.assertTrue(flag);
	}
	
	// InCorrect Email
	
	@Test(priority=9)
	public void ValidateResetPasswordWithIncorrectEmailTest()
	{
		boolean flag = fpwd.ValidateResetPasswordWithIncorrectEmail();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=10)
	public void ValidateOnClickIncorrectOkButtonTest()
	{
		signin = fpwd.ValidateOnClickIncorrectOkButton();
	}
	
	// Correct Email
	
	@Test(priority=11)
	public void ValidateResetPasswordWithCorrectEmailTest()
	{
		boolean flag = fpwd.ValidateResetPasswordWithCorrectEmail();
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
