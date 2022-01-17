package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SelectLanguage {
		@AndroidFindBy(xpath= "//android.widget.TextView[@text='(English)']")
		private MobileElement english;
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='(Hindi)']")
		private MobileElement hindi;
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='(Bengali)']")
		private MobileElement bengali;
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='(Marathi)']")
		private MobileElement marathi;
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='(Punjabi)']")
		private MobileElement punjabi;
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='(Gujarati)']")
		private MobileElement gujarati;
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='(Ganga)']")
		private MobileElement ganga;
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='(Tamil)']")
		private MobileElement tamil;
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='(Telugu)']")
		private MobileElement telugu;
	
	public void englishlang() {
		english.click();	
	}
	
	public void hindilang() {
		hindi.click();	
	}
	
	public void bengalilang() {
		bengali.click();	
	}
	
	public void marathilang() {
		marathi.click();	
	}
	
	public void punjabilang() {
		punjabi.click();	
	}
	
	public void gujaratilang() {
		gujarati.click();	
	}
	
	public void gangalang() {
		ganga.click();	
	}
	
	public void tamillang() {
		tamil.click();	
	}
	
	public void telugulang() {
		telugu.click();	
	}
	
	public SelectLanguage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
}
