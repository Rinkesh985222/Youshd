package com.Youshd.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PhoneNumber {

	WebDriver ldriver;
	public PhoneNumber(WebDriver rdriver) {

		ldriver=rdriver;

		PageFactory.initElements(rdriver, this);

	}
	
//	Readconfig readconfig=new Readconfig();
//	String phoneNumber=readconfig;

	
	@FindBy(name="phoneNo") WebElement phoneNo;
	@FindBy(xpath="//input[@class='search-box']") WebElement searchBox;
	@FindBy(xpath="//div[@class='flag us']") WebElement dropDown;
	@FindBy(xpath="//li[@class='country']") WebElement country;
	@FindBy(xpath="//button[@class='button-continue ']") WebElement $continue;
	
	
	
	
	public void clickOnDropDown() {
		dropDown.click();
		searchBox.sendKeys("india");
		country.click();

	}
	
	public void clickOnContactField(String phoneNumber) {
		phoneNo.sendKeys(phoneNumber);
		
	}
	
	public void clickOnContinue() {
		
		$continue.click();
		
	}
	
}
