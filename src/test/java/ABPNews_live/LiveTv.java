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
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
@Listeners(com.genericUtility.Listeners.class)
public class LiveTv extends BaseClass{
		@Test
		public void homelivetv() throws MalformedURLException, InterruptedException {
		
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
			LiveTV lt = new LiveTV(driver);
			Thread.sleep(10000);
//			driver.findElement(By.id("com.winit.starnews.hin:id/exo_subtitles")).click();
//			
//			lt.skipAd();
			
			lt.exoSub();		
			driver.pressKey(new KeyEvent(AndroidKey.MEDIA_PAUSE));
			Thread.sleep(5000);
			driver.pressKey(new KeyEvent(AndroidKey.MEDIA_PLAY));
			lt.exoSub();
			lt.qualityic();
			lt.lowres();
			Thread.sleep(5000);
			lt.exoSub();
			lt.qualityic();
			lt.mediumres();
			Thread.sleep(5000);
			lt.exoSub();
			lt.qualityic();
			lt.highres();
			Thread.sleep(5000);
			lt.exoSub();
			lt.qualityic();
			lt.autores();
			
			lt.mutebtn();
			lt.mutebtn();
			
		
		}
}










