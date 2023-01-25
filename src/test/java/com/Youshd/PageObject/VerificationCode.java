package com.Youshd.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerificationCode {
	
	WebDriver ldriver;
	public VerificationCode(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//input[@aria-label='Please enter verification code. Digit 1']") WebElement digit1;
	@FindBy(xpath="//input[@aria-label='Digit 2']") WebElement digit2;
	@FindBy(xpath="//input[@aria-label='Digit 3']") WebElement digit3;
	@FindBy(xpath="//input[@aria-label='Digit 4']") WebElement digit4;
	@FindBy(xpath="//input[@aria-label='Digit 5']") WebElement digit5;
	@FindBy(xpath="//input[@aria-label='Digit 6']") WebElement digit6;
	@FindBy(xpath="//button[@class='button-continue ']") WebElement $continue;
	
	public void enterVerificationCode() {
		
	digit1.sendKeys("1");
	digit2.sendKeys("2");
	digit3.sendKeys("3");
	digit4.sendKeys("4");
	digit5.sendKeys("5");
	digit6.sendKeys("6");
	}
	
	public void clickOnContinue() {
		
		$continue.click();
		
		}

}
