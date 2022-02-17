package ABPNews_live;

import org.testng.annotations.Test;
import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.genericUtility.BaseClass;
import com.genericUtility.WebDriverUtility;


@Listeners(com.genericUtility.Listeners.class)
public class Advertisements2 extends BaseClass {
	@Test
	public void Advertisement() throws MalformedURLException, InterruptedException {
		
		
		WebDriverUtility wd =new WebDriverUtility(driver);
		wd.WaitUntilPageLoads(30, driver);
		HomePage hp =new HomePage(driver);
		hp.clickOnEnglish();
		wd.waitForElementTobeClickeable(70, driver, hp.advertisement);
		hp.clickonAdvertisements();
		driver.quit();
		
		
		
		
	}
}