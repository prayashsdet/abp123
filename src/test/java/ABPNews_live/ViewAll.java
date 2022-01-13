package ABPNews_live;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericUtility.BaseClass;
@Listeners(com.genericUtility.Listeners.class)
public class ViewAll extends BaseClass {
	@Test
	public void viewall() throws MalformedURLException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		//WebElement ele = driver.findElement(By.id("com.winit.starnews.hin:id/switch_foryou"));
		
		Thread.sleep(3000);
		
	WebElement ele = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"For You\"]/android.widget.LinearLayout/android.widget.TextView"));
		if (ele.isSelected()) {
			WebElement home = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Home\"]/android.widget.LinearLayout/android.widget.TextView"));
			Thread.sleep(10000);
		home.click();
		
			
//	
//		if (driver.findElement(By.id("com.winit.starnews.hin:id/switch_foryou")).isDisplayed()) {
//			driver.findElement(By.id("com.winit.starnews.hin:id/switch_foryou")).click();
//			WebElement home = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Home\"]/android.widget.LinearLayout/android.widget.TextView"));
//			home.click();
			
		}
		
		Thread.sleep(6000);
		
		
		
//		String scrollElement = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"BLOG\").instance(0))";
//		driver.findElementByAndroidUIAutomator(scrollElement);
//		driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/viewAllLinearLayout' and @index ='0']")).click();
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tripura\"))");
for (int i=0;i<=6;i++) {
		driver.swipe(517, 1737, 560, 563, 1600);
//		}

		
		}
Thread.sleep(3000);
driver.findElement(By.id("com.winit.starnews.hin:id/viewAllLinearLayout")).click();;
WebElement title = driver.findElement(By.id("com.winit.starnews.hin:id/newsHeadingText"));
title.getText();
title.click();


      String text = driver.findElement(By.id("com.winit.starnews.hin:id/newsTitleTextview")).getText();
      
      if(title.equals(text)) {
    	  System.out.println("header is equal to title");
    	  
      }
      else {
    	  System.out.println("not equal");
      }
      WebElement dateandtime = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.winit.starnews.hin:id/recentTimeText']"));
  	System.out.println(dateandtime.getText());
  	WebElement storycardtitle = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.winit.starnews.hin:id/newsTitleTextview']"));
  	System.out.println(storycardtitle.getText());;
        
driver.closeApp();
	}
}
