package com.Youshd.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Onboarding {
	
	WebDriver ldriver;
	public Onboarding(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}

	@FindBy(xpath="//button[@class='connect-social-btn']") WebElement $continue1;

	
	public void clickOnContinue() {

		$continue1.click();
		$continue1.click();
		$continue1.click();
		$continue1.click();
	}

	

}
