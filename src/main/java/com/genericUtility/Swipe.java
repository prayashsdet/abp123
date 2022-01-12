package com.genericUtility;

import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Swipe {
	private static final String RIGHT = null;
	private static final String DOWN = null;
	private static final String UP = null;
	private static final String LEFT = null;

	public static void swipe(AndroidDriver driver, String direction, long duration) {
	    Dimension size = driver.manage().window().getSize();

	    int startX = 0;
	    int endX = 0;
	    int startY = 0;
	    int endY = 0;

	    switch (direction) {
	        case RIGHT:
	            startY = (int) (size.height / 2);
	            startX = (int) (size.width * 0.90);
	            endX = (int) (size.width * 0.05);
	            new TouchAction(driver)
	                    .press(startX, startY)
	                    .waitAction(Duration.ofMillis(duration))
	                    .moveTo(endX, startY)
	                    .release()
	                    .perform();
	            break;

	        case LEFT:
	            startY = (int) (size.height / 2);
	            startX = (int) (size.width * 0.05);
	            endX = (int) (size.width * 0.90);
	            new TouchAction(driver)
	                    .press(startX, startY)
	                    .waitAction(Duration.ofMillis(duration))
	                    .moveTo(endX, startY)
	                    .release()
	                    .perform();

	            break;

	        case UP:
	            endY = (int) (size.height * 0.70);
	            startY = (int) (size.height * 0.30);
	            startX = (size.width / 2);
	            new TouchAction(driver)
	                    .press(startX, startY)
	                    .waitAction(Duration.ofMillis(duration))
	                    .moveTo(startX, endY)
	                    .release()
	                    .perform();
	            break;


	        case DOWN:
	            startY = (int) (size.height * 0.70);
	            endY = (int) (size.height * 0.30);
	            startX = (size.width / 2);
	            new TouchAction(driver)
	                    .press(startX, startY)
	                    .waitAction(Duration.ofMillis(duration))
	                    .moveTo(startX, endY)
	                    .release()
	                    .perform();

	            break;

	    }
	}
}
