package ABPNews_live;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;

import com.POM.LiveTV;
import com.genericUtility.BaseClass;

import io.appium.java_client.android.AndroidKeyCode;

public class LiveTvBottomBar extends BaseClass {
	public void homelivetv() throws MalformedURLException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		WebElement ele = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"For You\"]/android.widget.LinearLayout/android.widget.TextView"));
		if (ele.isSelected()) {
			WebElement home = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Home\"]/android.widget.LinearLayout/android.widget.TextView"));
		home.click();
		}
		Thread.sleep(5000);
		
		
		LiveTV lt = new LiveTV(driver);
		lt.menuliveicon();
		
		Thread.sleep(10000);
		lt.skipAd();
		
		lt.exoSub();		
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
		
		//full screen
		driver.rotate(ScreenOrientation.LANDSCAPE);
		Thread.sleep(6000);
		driver.rotate(ScreenOrientation.PORTRAIT);
		
		Thread.sleep(6000);
		lt.audioPlayIcon();
		Thread.sleep(6000);
		lt.audioPlayIcon();
		
		
	
	}
}
