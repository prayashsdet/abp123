package com.genericUtility;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	
	public AndroidDriver driver;
	@BeforeMethod
	public void openApp() throws Throwable {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("appPackage", "com.winit.starnews.hin");
		dc.setCapability("appActivity", ".activities.Welcome");
		
		URL url=new URL(" http://localhost:4723/wd/hub");
		driver=new AndroidDriver(url, dc);
	}
	
	@AfterMethod
	
	public void closeApp() {
		driver.closeApp();
	}
}
