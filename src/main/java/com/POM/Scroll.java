package com.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class Scroll {
static AndroidDriver driver;

public Scroll(AndroidDriver driver) {
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	
}
	
		// TODO Auto-generated method stub
public By by_names = By.id("com.winit.starnews.hin:id/headerTitletextView");
	}



