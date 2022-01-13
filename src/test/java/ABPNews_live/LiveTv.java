package ABPNews_live;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.POM.LiveTV;
import com.genericUtility.BaseClass;
import com.genericUtility.WebDriverUtility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
@Listeners(com.genericUtility.Listeners.class)
public class LiveTv extends BaseClass{
		@Test
		public void homelivetv() throws MalformedURLException, InterruptedException {
			
			
			WebDriverUtility wdu = new WebDriverUtility();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
			driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
			driver.findElement(By.id("android:id/button2")).click();
			
//			driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
			WebElement ele = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"For You\"]/android.widget.LinearLayout/android.widget.TextView"));
			if (ele.isSelected()) {
				WebElement home = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Home\"]/android.widget.LinearLayout/android.widget.TextView"));
			home.click();
			}
			Thread.sleep(5000);
			driver.swipe(513, 585, 532, 1258, 500);
			//driver.wait(25000);
			Thread.sleep(6000);
			
			driver.findElement(By.xpath("//android.widget.Button[@text='Skip Ad']")).click();
//			driver.findElement(By.id("com.winit.starnews.hin:id/exo_subtitles")).click();
			//wdu.TapOnElement(ele1);
			
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_MEDIA_PAUSE);
			Thread.sleep(5000);
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_MEDIA_PLAY);
			driver.findElement(By.id("com.winit.starnews.hin:id/mute_btn")).click();
			driver.findElement(By.id("com.winit.starnews.hin:id/mute_btn")).click();
			
			
//			Thread.sleep(5000);
			
//			driver.findElement(By.id("com.winit.starnews.hin:id/exo_subtitles")).click();
			LiveTV lt = new LiveTV(driver);
//			driver.findElement(By.id("com.winit.starnews.hin:id/stream_quality_icon")).click();
//			driver.findElement(By.xpath("//android.widget.TextView[@text='180p']")).click();

//			driver.findElement(By.id("com.winit.starnews.hin:id/stream_quality_icon")).click();
//			driver.findElement(By.xpath("//android.widget.TextView[@text='234p']")).click();
//			
//			driver.findElement(By.id("com.winit.starnews.hin:id/stream_quality_icon")).click();
//			driver.findElement(By.xpath("//android.widget.TextView[@text='720p']")).click();
//			
//			driver.findElement(By.id("com.winit.starnews.hin:id/stream_quality_icon")).click();
//			driver.findElement(By.xpath("//android.widget.TextView[@text='Auto']")).click();
			
			lt.qualityic();
			lt.lowres();
			
			Thread.sleep(5000);
			driver.findElement(By.id("com.winit.starnews.hin:id/exo_subtitles")).click();
			lt.qualityic();
			lt.mediumres();
			
			Thread.sleep(5000);
			driver.findElement(By.id("com.winit.starnews.hin:id/exo_subtitles")).click();
			lt.qualityic();
			lt.highres();
			
			Thread.sleep(5000);
			driver.findElement(By.id("com.winit.starnews.hin:id/exo_subtitles")).click();
			lt.qualityic();
			lt.autores();
			
			
			driver.findElement(By.id("com.winit.starnews.hin:id/mute_btn")).click();
			driver.findElement(By.id("com.winit.starnews.hin:id/mute_btn")).click();
			
			
		
		}
}










