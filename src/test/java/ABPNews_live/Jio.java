package ABPNews_live;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Jio {
	@Test
	public void launchapp() throws MalformedURLException, InterruptedException{
		DesiredCapabilities dc = new DesiredCapabilities();
		//common DC for android or IOS
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("autoGrantPermissions", true);
		//common DC for android or IOS
		
				dc.setCapability("deviceName", "Galaxy s10+");
				dc.setCapability("platformVersion", "12");
				
		//DC for android
		dc.setCapability("appPackage", "com.jio.jioplay.tv");
		dc.setCapability("appActivity","com.jio.media.tv.ui.permission_onboarding.PermissionActivity");
		
		
		//Android server port no
		URL url = new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.id("com.jio.jioplay.tv:id/btn_next")).click();
//		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		driver.findElement(By.id("com.jio.jioplay.tv:id/et_number")).sendKeys("7008405914");
		driver.findElement(By.id("com.jio.jioplay.tv:id/btn_getOTP")).click();
		driver.findElement(By.id("com.google.android.gms:id/positive_button")).click();
		
		
		
	}
	}

