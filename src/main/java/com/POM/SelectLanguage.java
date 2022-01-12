package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SelectLanguage {
	AndroidDriver driver;
	@AndroidFindAll({
		@AndroidFindBy(xpath= "//android.widget.TextView[@text='(English)']"),
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='(Hindi)']"),
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='(Bengali)']"),
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='(Marathi)']"),
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='(Punjabi)']"),
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='(Gujarati)']"),
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='(Ganga)']"),
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='(Tamil)']"),
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='(Telugu)']")		
		})
		private MobileElement language;
	
	public void lang() {
		language.click();
		
	}
	
	public SelectLanguage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
}
