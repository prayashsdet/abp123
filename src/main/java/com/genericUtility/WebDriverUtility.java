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
		
	public  void swipe(AndroidDriver driver,int x,int y,int z,int w,int time) {
		driver.swipe(x, y, z, w, time);
	}
}
