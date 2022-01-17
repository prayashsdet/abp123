package com.genericUtility;

	import java.io.File;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.ScreenOrientation;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	import com.google.common.io.Files;

	import io.appium.java_client.android.AndroidDriver;

	public class WebDriverUtility {
		static AndroidDriver driver;
	public static void TapOnElement(WebElement element) 
	{
		driver.tap(1, element, 500);
		
		
	}
	public void scrollToElement(AndroidDriver driver ,java.lang.String string,java.lang.String string2) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+string+"(\""+string2+"\"))");//scroll to element
	}
		
	public  void swipedown(AndroidDriver driver) {
		driver.swipe(508, 2078, 521, 1028,600);
	}
	public  void swipeup(AndroidDriver driver) {
		driver.swipe(489, 583, 489, 1926, 1000);
	}
}
	
