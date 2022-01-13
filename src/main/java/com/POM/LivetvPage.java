package com.POM;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LivetvPage {
	@AndroidFindBy(id= "com.winit.starnews.hin:id/exo_subtitles")
	private MobileElement exosubtitles;
	
	@AndroidFindBy(id= "com.winit.starnews.hin:id/stream_quality_icon")
	private MobileElement qualityicon;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='180p']")
	private MobileElement low;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='234p']")
	private MobileElement medium;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='720p']")
	private MobileElement high;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='Auto']")
	private MobileElement auto;
	
	public void exoSub() {
		exosubtitles.click();
		
	}
	
	public void qualityic() {
		qualityicon.click();
		
	}
	
	public void lowres() {
		low.click();
		
	}
	
	public void mediumres() {
		medium.click();
		
	}
	
	public void highres() {
		high.click();
		
	}
	
	public void autores() {
		auto.click();
		
	}
	
	public LivetvPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
}
