package ABPNews_live;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericUtility.BaseClass;
@Listeners(com.genericUtility.Listeners.class)
public class StoryCard1 extends BaseClass {
	@Test
	public void storycard1() throws Throwable  {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
	driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	WebElement ele = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"For You\"]/android.widget.LinearLayout/android.widget.TextView"));
	if (ele.isSelected()) {
		WebElement home = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Home\"]/android.widget.LinearLayout/android.widget.TextView"));
		Thread.sleep(10000);
	home.click();
	}
	Thread.sleep(6000);
	for (int i=0;i<2;i++) {
	driver.swipe(616, 1811, 600, 920,600);
	}
	driver.findElement(By.id("com.winit.starnews.hin:id/newsHeadingText")).click();
	Thread.sleep(3000);
	//driver.swipe(616, 1811, 600, 920,600);
	WebElement dateandtime = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.winit.starnews.hin:id/recentTimeText']"));
	System.out.println(dateandtime.getText());
	WebElement storycardtitle = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.winit.starnews.hin:id/newsTitleTextview']"));
	System.out.println(storycardtitle.getText());
	//System.out.println(dateandtime.getText());
	
}
}
