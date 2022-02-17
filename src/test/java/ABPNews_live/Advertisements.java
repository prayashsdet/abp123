package ABPNews_live;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.genericUtility.BaseClass;
import com.genericUtility.WebDriverUtility;
@Listeners(com.genericUtility.Listeners.class)
public class Advertisements extends BaseClass {
	@Test
	public void StickyAds() throws Throwable  {
	WebDriverUtility wd =new WebDriverUtility(driver);
	HomePage hp =new HomePage(driver);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	hp.clickOnEnglish();
	wd.WaitForMilliSeconds(10000);
	wd.scrollDown(driver);
	hp.clickOnStickyAds();
	driver.quit();
	

	
}
}
