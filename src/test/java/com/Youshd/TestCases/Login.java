package com.Youshd.TestCases;


import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import com.Youshd.PageObject.LogIn_SignUp;
import com.Youshd.PageObject.Onboarding;
import com.Youshd.PageObject.PhoneNumber;
import com.Youshd.PageObject.SocialAccountPage;
import com.Youshd.PageObject.VerificationCode;
import com.Youshd.Utilities.DataProviderClass;
import junit.framework.Assert;


public class Login extends BaseClass  {
	
	

	@Test(priority=1)
	public void clickOnLogIn_SignUp() {
		
		LogIn_SignUp lISU=new LogIn_SignUp(driver);
		lISU.clickOnLogInSignUp();
		String actualUrl=driver.getCurrentUrl();
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals("https://app-staging.youshd.com/login", actualUrl);
		assertion.assertAll();
		
	}
	
	@Test(priority=2,dataProvider="LoginData",dataProviderClass=DataProviderClass.class)
	public void enterPhoneNumber(String phoneNumber) {
		
		PhoneNumber pN=new PhoneNumber(driver);
        pN.clickOnDropDown();
        pN.clickOnContactField(phoneNumber);
        pN.clickOnContinue();
        String actualUrl=driver.getCurrentUrl();
        SoftAssert assertion=new SoftAssert();
        assertion.assertEquals("https://app-staging.youshd.com/verify-otp", actualUrl);
        assertion.assertAll();
        
	}
	
	@Test(priority=3)
	public void enterVerificationCode() {
		
		VerificationCode vC=new VerificationCode(driver);
		vC.enterVerificationCode();
		vC.clickOnContinue();
        String actualUrl=driver.getCurrentUrl();
        SoftAssert assertion=new SoftAssert();
        assertion.assertEquals("https://app-staging.youshd.com/onboarding", actualUrl);
		assertion.assertAll();
	}
	
	@Test(priority=4)
	public void clickContinue4Times() {
		
		Onboarding oB=new Onboarding(driver);
		oB.clickOnContinue();
		String actualUrl=driver.getCurrentUrl();
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals("https://app-staging.youshd.com/authorize-with-social", actualUrl);
		assertion.assertAll();
	}
	
	@Test(priority=5,dataProvider="instaLoginData",dataProviderClass=DataProviderClass.class)
	public void clickOnInstagram(String instaId,String pass) {
		
		SocialAccountPage sAP=new SocialAccountPage(driver);
		sAP.veryfySocialAccount(instaId,pass);
		String actualUrl=driver.getCurrentUrl();
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals("https://app-staging.youshd.com/authorize-with-social", actualUrl);
		assertion.assertAll();
	}
	
}
