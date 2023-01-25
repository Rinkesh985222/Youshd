package com.Youshd.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SocialAccountPage {
	
	WebDriver ldriver;
	public SocialAccountPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="(//div[@class='social-bx cursor'])[1]") WebElement instagram;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/button[2]") WebElement $continue2;
	@FindBy(name="password") WebElement password;
	@FindBy(name="username") WebElement username;
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[3]") WebElement login;
	@FindBy(xpath="(//button[@type='button'])[2]") WebElement notNow;
    @FindBy(xpath="//button[normalize-space()='Allow']") WebElement allow;
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]") WebElement skipForNow;
    

	public void veryfySocialAccount(String instaId,String pass) {
		
		instagram.click();
		$continue2.click();
		username.sendKeys(instaId);
		password.sendKeys(pass);
		
		login.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notNow.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		allow.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		skipForNow.click();
	}

}
