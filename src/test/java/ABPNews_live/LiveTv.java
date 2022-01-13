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
			driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
			WebElement ele = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"For You\"]/android.widget.LinearLayout/android.widget.TextView"));
			if (ele.isSelected()) {
				WebElement home = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Home\"]/android.widget.LinearLayout/android.widget.TextView"));
			home.click();
			}
			
			LiveTV lt = new LiveTV(driver);
			Thread.sleep(5000);
			driver.swipe(513, 585, 532, 1258, 500);
			
			lt.skipAd();
			Thread.sleep(25000);
			lt.exoSub();
			//wdu.TapOnElement(ele1);
			
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_MEDIA_PAUSE);
			Thread.sleep(5000);
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_MEDIA_PLAY);
			
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
