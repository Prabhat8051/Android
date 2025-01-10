package com.cineverse.qa.testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cineverse.qa.base.CineverseBase;
import com.cineverse.qa.pages.AccountPage;
import com.cineverse.qa.pages.HomePage;
import com.cineverse.qa.pages.RegisteredAccountPage;
import com.cineverse.qa.pages.SignInPage;
import com.cineverse.qa.pages.SignUpPage;
import com.cinverse.qa.util.Utility;

import junit.framework.Assert;

public class RegisteredAccountPageTest extends CineverseBase {
	
	RegisteredAccountPage regac;
	HomePage home;
	AccountPage account;
	SignUpPage signup;
	SignInPage signin;
	Utility util;
	
	
	public RegisteredAccountPageTest()
	{
		super();
	}

	@BeforeMethod()
	public void setup() throws MalformedURLException, InterruptedException
	{
		initialization();
		//options.autoDismissAlerts();
		Thread.sleep(3000);
		home = new HomePage();
		account = new AccountPage();
		signup = new SignUpPage();
		signin = new SignInPage();
		regac = new RegisteredAccountPage();
		util = new Utility();
		home.CookiesClose();
		home.ValidateOnClickAccount();
		account.ValidateOnClickSignUpButton();
		signup.ValidateOnClickSignInButton();
		//options.autoDismissAlerts();
		//options.autoDismissAlerts();
		signin.ValidateRegisterAccount();
		//options.autoDismissAlerts();
		
	}
	
	@Test(priority=1)
	public void ValidateBackButtonIsDisplayedTest()
	{
		boolean flag = regac.ValidateBackButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void ValidateEditProfileTextIsDisplayedTest()
	{
		boolean flag = regac.ValidateEditProfileTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void ValidateEditPencilIconIsDisplayedTest()
	{
		boolean flag = regac.ValidateEditPencilIconIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	
		// Edit Profile Section
	@Test(priority=4)
	public void ValidateEditProfileSectionIsDisplayedTest()
	{
		boolean flag = regac.ValidateEditProfileSectionIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=5)
	public void ValidateNameTextIsDisplayedTest()
	{
		boolean flag = regac.ValidateNameTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=6)
	public void ValidateNameInputBoxIsDisplayedTest()
	{
		boolean flag = regac.ValidateNameInputBoxIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=7)
	public void ValidateEmailTextIsDisplayedTest()
	{
		boolean flag = regac.ValidateEmailTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=8)
	public void ValidateEmailInputBoxIsDisplayedTest()
	{
		boolean flag = regac.ValidateEmailInputBoxIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=9)
	public void ValidateSaveButtonIsDisplayedTest()
	{
		boolean flag = regac.ValidateSaveButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=10)
	public void ValidateDeleteButtonIsDisplayedTest()
	{
		boolean flag = regac.ValidateDeleteButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=11)
	public void ValidateEditNameTest()
	{
		String nwname ="Prabhas";
		String name = regac.ValidateEditName();
		Assert.assertEquals(nwname, name);	
	}
	
	// Delete Account -> // Delete Account -> Only next Screen is validated
	
	@Test(priority=12)
	public void ValidateOnClickDeleteAccountButtonTest()
	{
		System.out.println("Validating only redirection");
		boolean flag = regac.ValidateOnClickDeleteAccountButton();
		Assert.assertTrue("Account is not deleted, validating only screen redirection", flag);
	}
	
	// Change Password Section
	
	@Test(priority=13)
	public void ValidateChangePasswordSectionIsDisplayedTest()
	{
		boolean flag = regac.ValidateChangePasswordSectionIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=14)
	public void ValidateCurrentPasswordTextIsDisplayedTest()
	{
		boolean flag = regac.ValidateCurrentPasswordTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=15)
	public void ValidateCurrentPasswordInputBoxIsDisplayedTest()
	{
		boolean flag = regac.ValidateCurrentPasswordInputBoxIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=16)
	public void ValidateNewPasswordTextIsDisplayedTest()
	{
		boolean flag = regac.ValidateNewPasswordTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=17)
	public void ValidateNewPasswordInputBoxIsDisplayedTest()
	{
		boolean flag = regac.ValidateNewPasswordInputBoxIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=18)
	public void ValidateConfirmPasswordTextIsDisplayedTest()
	{
		boolean flag = regac.ValidateConfirmPasswordTextIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=19)
	public void ValidateConfirmPasswordInputBoxIsDisplayedTest()
	{
		boolean flag = regac.ValidateConfirmPasswordInputBoxIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=20)
	public void ValidatePasswordViewIconIsDisplayedTest()
	{
		boolean flag = regac.ValidatePasswordViewIconIsDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=21)
	public void ValidateChangePasswordButtonIsDisplayedTest()
	{
		boolean flag = regac.ValidateChangePasswordButtonIsDisplayed();
		Assert.assertTrue(flag);
	}
	 
	// Password Validations 
	
    // Empty Password Validations

	@Test(priority=22)
	public void ValidateChangePasswordWithEmptyFieldsTest()
	{
		boolean flag = regac.ValidateChangePasswordWithEmptyFields();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=23)
	public void ValidateChangePasswordWithEmptyCurrentPasswordTest()
	{
		boolean flag = regac.ValidateChangePasswordWithEmptyCurrentPassword();
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
