package ABPNews_live;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.genericUtility.BaseClass;
import com.genericUtility.WebDriverUtility;

public class ViewAll extends BaseClass {
	@Test
	public void demo() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverUtility wd =new WebDriverUtility(driver);	driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
		wd.WaitForMilliSeconds(6000);
	    HomePage hp =new HomePage(driver);
	    wd.scrollNClick(hp.ViewAllBlog, driver);
	}
}
