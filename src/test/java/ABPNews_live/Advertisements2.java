package ABPNews_live;

import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericUtility.BaseClass;

import io.appium.java_client.android.AndroidKeyCode;
@Listeners(com.genericUtility.Listeners.class)
public class Advertisements2 extends BaseClass {
	@Test
	public void add2() throws MalformedURLException, InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.winit.starnews.hin:id/linearLayout")));
		driver.findElement(By.id("com.winit.starnews.hin:id/linearLayout")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='KANNADA']"))).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='KANNADA']")).click();
		
		
		
		
		
		driver.pressKeyCode(AndroidKeyCode.BACK);
		
		
	}
}
