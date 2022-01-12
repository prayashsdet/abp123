package ABPNews_live;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericUtility.BaseClass;

import io.appium.java_client.android.AndroidDriver;
@Listeners(com.genericUtility.Listeners.class)
public class TC_Home_001 extends BaseClass{
	@Test
	public void AbpHindi() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		
		Thread.sleep(10000);
		driver.swipe(513, 1475, 516, 1034, 500);
		scrollHomePage(driver, "text", "TOP VIDEOS");
		scrollHomePage(driver, "text", "BLOG");
		scrollHomePage(driver, "text", "WEB STORIES");
		scrollHomePage(driver, "text", "TV SHOWS");
		scrollHomePage(driver, "text", "PHOTO GALLERY");
		scrollHomePage(driver, "text", "MOVIE REVIEWS");
		scrollHomePage(driver, "text", "INDIA");
		scrollHomePage(driver, "text", "ENTERTAINMENT");
		scrollHomePage(driver, "text", "SPORTS");
		scrollHomePage(driver, "text", "WORLD");
		scrollHomePage(driver, "text", "BUSINESS");
		scrollHomePage(driver, "text", "AUTO");
		scrollHomePage(driver, "text", "LIFESTYLE");
		scrollHomePage(driver, "text", "HEALTH");
		scrollHomePage(driver, "text", "STORIES");
		scrollHomePage(driver, "text", "TRENDING TOPICS");
		
	}	
	
	public void scrollHomePage(AndroidDriver driver,String an, String av) throws Throwable {	
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
		Thread.sleep(3000);
		System.out.println(av);
		
	}
}
