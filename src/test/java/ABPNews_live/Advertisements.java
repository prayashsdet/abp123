package ABPNews_live;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericUtility.BaseClass;
@Listeners(com.genericUtility.Listeners.class)
public class Advertisements extends BaseClass {
	@Test
	public void add1() throws Throwable  {
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
	driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	Thread.sleep(10000);
	
//	TouchAction action = new TouchAction(driver);
//	action
	
	//for (int i=0;i<4;i++) {
	driver.swipe(535, 1141, 556, 580, 3000);
	//}
	
	
	WebElement ad = driver.findElement(By.id("com.winit.starnews.hin:id/stickyAdsView"));
//	System.out.println(stickyads.getText());
	ad.click();
//	driver.findElement(By.xpath("//android.widget.TextView[@text='KANNADA']")).click();
//	driver.pressKeyCode(AndroidKeyCode.BACK);
//	
	
//	System.out.println(ad.getText());
//	Set<String> window = driver.getContextHandles();
//	for (String wd:window) {
//		System.out.println(wd);
//
//	}
//	driver.context("WEBVIEW_chrome");
//	driver.getTitle();
//	driver.context("WEBVIEW_com.winit.starnews.hin");
	//	driver.tap(1, stickyads, 100);

	
	
}
}
