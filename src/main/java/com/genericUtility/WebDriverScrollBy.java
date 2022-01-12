package com.genericUtility;

import io.appium.java_client.android.AndroidDriver;

public class WebDriverScrollBy {
	public static void scrollToElement(AndroidDriver driver, String an,String av) {
		driver.findElementsByAndroidUIAutomator("new UiScrollable (new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}

}
