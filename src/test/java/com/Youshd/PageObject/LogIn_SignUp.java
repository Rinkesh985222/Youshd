package com.Youshd.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_SignUp {
	
	WebDriver ldriver;
	public LogIn_SignUp(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}

	@FindBy(xpath="//button[@class='btn-login btn-black']") WebElement LogInSignUp;

	
	public void clickOnLogInSignUp() {

		LogInSignUp.click();
	}

	

}
