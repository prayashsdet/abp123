package com.genericUtility;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ToastMsg {
	public static String toastmsgs(WebDriver driver) throws Throwable {
		String toastmsg = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		System.out.println(toastmsg);
		return toastmsg;
	}

}
