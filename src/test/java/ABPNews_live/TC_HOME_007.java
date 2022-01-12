package ABPNews_live;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericUtility.BaseClass;
@Listeners(com.genericUtility.Listeners.class)
public class TC_HOME_007 extends BaseClass{
	@Test
	public void demo() throws MalformedURLException, InterruptedException {
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
	driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	Thread.sleep(3000);
	driver.swipe(546, 809, 550, 1495, 100);//swipe up  from ad thread.sleep
	Thread.sleep(3000);
	for(int i=0;i<8;i++) {
	driver.swipe(973, 899, 119, 887, 500);//home tab to opinions tab
	}//
	
	Thread.sleep(3000);
	for(int i=0;i<=5;i++) {
	driver.swipe(123, 838, 949, 809, 500);//opinions tab to india tab

	}
	}
}
