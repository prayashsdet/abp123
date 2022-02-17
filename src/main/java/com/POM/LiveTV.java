package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LiveTV {
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
	
	@AndroidFindBy(xpath= "//android.widget.Button[@text='Skip Ad']")
	private MobileElement skip;
	
	@AndroidFindBy(id= "com.winit.starnews.hin:id/liveTvIcon")
	private MobileElement liveicon;
	
	@AndroidFindBy(id="com.winit.starnews.hin:id/menu_livetv")
	private WebElement tv;
	
	@AndroidFindBy(id= "com.winit.starnews.hin:id/mute_btn")
	private MobileElement mute;
	
	@AndroidFindBy(id= "com.winit.starnews.hin:id/liveTvAudioPlayIcon")
	private MobileElement audioplay;
	
	@AndroidFindBy(id= "com.winit.starnews.hin:id/liveTVVideoPlayIcon")
	private MobileElement vedioplay;

	
	public void exoSub() {
		exosubtitles.click();
		System.out.println("clicked on screen succesfully");
		
	}
	
	public void qualityic() {
		qualityicon.click();
		System.out.println("clicked on quality icon successfully");
	}
	
	public void lowres() {
		low.click();
		System.out.println("clicked on auto resolution succesfully");
		
	}
	
	public void mediumres() {
		medium.click();
		System.out.println("clicked on low resolution succesfully");
		
	}
	
	public void highres() {
		high.click();
		System.out.println("clicked on medium resolution succesfully");
		
	}
	
	public void autores() {
		auto.click();
		System.out.println("clicked on high resolution succesfully");
		
	}
	
	public void skipAd() {
		skip.click();
		System.out.println("clicked on skipAd succesfully");
		
	}
	
	public void livetvicon() {
		liveicon.click();
	System.out.println("clicked live tv");
	}
	
	public void menuliveicon() {
		tv.click();
		System.out.println("clicked on live menu icon succesfully");
		
	}
	public void mutebtn() {
		mute.click();
		System.out.println("clicked on ,ute button succesfully");
		
	}
	
	public void audioPlayIcon() {
		audioplay.click();
		System.out.println("clicked on audioplayicon succesfully");
		
	}
	
	public void vedioplayicon() {
		vedioplay.click();
		System.out.println("clicked on video play icon successfully");
		
	}
	
	public LiveTV(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
}
