package ABPNews_live;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.genericUtility.BaseClass;
import com.genericUtility.WebDriverUtility;
@Listeners(com.genericUtility.Listeners.class)
public class StoryCard1 extends BaseClass {
	@Test
	public void storycard1() throws Throwable  {

	
	HomePage hp=new HomePage(driver);
	WebDriverUtility wd = new WebDriverUtility(driver);
	wd.WaitUntilPageLoads(30, driver);
	hp.clickOnEnglish();
	wd.WaitForMilliSeconds(7000);
	wd.scrollNClick(hp.FirstStoryCard, driver);
	wd.WaitForMilliSeconds(6000);
	hp.printTimestamp();
	hp.printTitlestamp();
	wd.WaitForMilliSeconds(3000);
	driver.closeApp();
	
}
}
