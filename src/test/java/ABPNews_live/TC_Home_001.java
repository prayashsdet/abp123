package ABPNews_live;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericUtility.BaseClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
@Listeners(com.genericUtility.Listeners.class)
public class TC_Home_001 extends BaseClass{
	@Test		       
	public void scrolltoptobottom() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		WebElement ele = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"For You\"]/android.widget.LinearLayout/android.widget.TextView"));
		if (ele.isSelected()) {
			WebElement home = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Home\"]/android.widget.LinearLayout/android.widget.TextView"));
			home.click();
		}
		Thread.sleep(10000);
		driver.swipe(513, 1475, 516, 1034, 500);
		scrollHomePage(driver, "text", "TOP VIDEOS");
		scrollHomePage(driver, "text", "BLOG");
		 driver.findElement(By.xpath("//android.widget.TextView[@text='BLOG']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
	        driver.findElement(By.id("com.winit.starnews.hin:id/newsHeadingText")).getText();
	        for (int i=0;i<=6;i++) {
	        	driver.swipe(508, 2078, 521, 1028,600);
	        }
	        for (int i=0;i<=6;i++) {
	        	driver.swipe(489, 583, 489, 1926, 1000);
	        }
	        driver.pressKeyCode(AndroidKeyCode.BACK);
		scrollHomePage(driver, "text", "WEB STORIES");
		driver.findElement(By.xpath("//android.widget.TextView[@text='WEB STORIES']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
		Thread.sleep(6000);
		 for (int i=0;i<=6;i++) {
			 driver.swipe(508, 2078, 521, 1028,600);
		 }
		 for (int i=0;i<=6;i++) {
			 driver.swipe(489, 583, 489, 1926, 1000);
		 }
		 driver.pressKeyCode(AndroidKeyCode.BACK);
		 
		Thread.sleep(3000);
		scrollHomePage(driver, "text", "TV SHOWS");	
		driver.findElement(By.xpath("//android.widget.TextView[@text='TV SHOWS']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
		Thread.sleep(6000);
		 for (int i=0;i<=6;i++) {
			 driver.swipe(508, 2078, 521, 1028,600);
		 }
		 for (int i=0;i<=6;i++) {
			 driver.swipe(489, 583, 489, 1926, 1000);
		 }
		 driver.pressKeyCode(AndroidKeyCode.BACK);
		 Thread.sleep(3000);
		 
		scrollHomePage(driver, "text", "PHOTO GALLERY");
		driver.findElement(By.xpath("//android.widget.TextView[@text='PHOTO GALLERY']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
		Thread.sleep(6000);
		 for (int i=0;i<=6;i++) {
			 driver.swipe(508, 2078, 521, 1028,600);
		 }
		 for (int i=0;i<=6;i++) {
			 driver.swipe(489, 583, 489, 1926, 1000);
		 }
		 driver.pressKeyCode(AndroidKeyCode.BACK);
		
		 
			scrollHomePage(driver, "text", "MOVIE REVIEWS");
			scrollHomePage(driver, "text", "INDIA");
			driver.findElement(By.xpath("//android.widget.TextView[@text='INDIA']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
			   driver.swipe(508, 2078, 521, 1028,600);
			 }
			 for (int i=0;i<=6;i++) {
				 driver.swipe(489, 583, 489, 1926, 1000);
			 }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "ENTERTAINMENT");
			driver.findElement(By.xpath("//android.widget.TextView[@text='ENTERTAINMENT']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
				 driver.swipe(508, 2078, 521, 1028,600);
			 }
			 for (int i=0;i<=6;i++) {
				 driver.swipe(489, 583, 489, 1926, 1000);
			 }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "SPORTS");
			driver.findElement(By.xpath("//android.widget.TextView[@text='SPORTS']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
				 driver.swipe(508, 2078, 521, 1028,600);
			 }
			 for (int i=0;i<=6;i++) {
				 driver.swipe(489, 583, 489, 1926, 1000);
			 }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "WORLD");
			driver.findElement(By.xpath("//android.widget.TextView[@text='WORLD']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
				 driver.swipe(508, 2078, 521, 1028,600);
			 }
			 for (int i=0;i<=6;i++) {
				 driver.swipe(489, 583, 489, 1926, 1000);
			 }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "BUSINESS");
			driver.findElement(By.xpath("//android.widget.TextView[@text='BUSINESS']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
				 driver.swipe(508, 2078, 521, 1028,600);
			 }
			 for (int i=0;i<=6;i++) {
				 driver.swipe(489, 583, 489, 1926, 1000);
			 }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "AUTO");
			driver.findElement(By.xpath("//android.widget.TextView[@text='AUTO']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
				 driver.swipe(508, 2078, 521, 1028,600);
			 }
			 for (int i=0;i<=6;i++) {
				 driver.swipe(489, 583, 489, 1926, 1000);
			 }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "LIFESTYLE");
			driver.findElement(By.xpath("//android.widget.TextView[@text='LIFESTYLE']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
				 driver.swipe(508, 2078, 521, 1028,600);
			 }
			 for (int i=0;i<=6;i++) {
				 driver.swipe(489, 583, 489, 1926, 1000);
			 }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "HEALTH");
			driver.findElement(By.xpath("//android.widget.TextView[@text='HEALTH']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
				 driver.swipe(508, 2078, 521, 1028,600);
			 }
			 for (int i=0;i<=6;i++) {
				 driver.swipe(489, 583, 489, 1926, 1000);
			 }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "STORIES");
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "TRENDING TOPICS");
			
			Thread.sleep(3000);
				} 	
	
		public void scrollHomePage(AndroidDriver driver,String an, String av) throws Throwable {	
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
			Thread.sleep(3000);
			System.out.println(av);
		}
}
	
