package com.genericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;
public class TakeScreenshot {
	public TakeScreenshot(WebDriver driver){
		this.statDriver=statDriver;
	}
	public static WebDriver statDriver;
		public String takeScreenshot(WebDriver driver, String screenshotName) throws Throwable {
			String screenshotPath = "./screenshot/"+screenshotName+".PNG";
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(screenshotPath);
			Files.copy(src, dest);
			return screenshotPath;
		}
}
