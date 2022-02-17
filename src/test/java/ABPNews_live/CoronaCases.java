package ABPNews_live;
import org.testng.annotations.Test;
import java.util.Formatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.genericUtility.BaseClass;
import com.genericUtility.WebDriverUtility;
import com.google.protobuf.Duration;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


@Listeners(com.genericUtility.Listeners.class)

public class CoronaCases extends BaseClass {
	
	@Test
	public void coronavcases() throws Throwable {
		
	WebDriverUtility wd =new WebDriverUtility(driver);
	Formatter fmt = new Formatter();
	wd.WaitUntilPageLoads(30, driver);
	HomePage hp =new HomePage(driver);
   hp.clickOnEnglish();
   wd.WaitForMilliSeconds(3000);
	//scrollcorona(driver, "text", "Andaman and Nicobar Islands");
    System.out.format("%35s, %15s,%15s,%15s\n","states","active","recovered","deceased");
	wd.scrollcorona(driver, "text", "Andhra Pradesh");
	wd.scrollcorona(driver, "text", "Arunachal Pradesh");
	wd.scrollcorona(driver, "text", "Assam");
	wd.scrollcorona(driver, "text", "Bihar");
	wd.scrollcorona(driver, "text", "Chandigarh");
	wd.scrollcorona(driver, "text", "Chhattisgarh");
	wd.scrollcorona(driver, "text", "Dadra Nagar Haveli and Daman Diu");
	wd.scrollcorona(driver, "text", "Delhi");
	wd.scrollcorona(driver, "text", "Goa");
	wd.scrollcorona(driver, "text", "Gujarat");
	wd.scrollcorona(driver, "text", "Haryana");
	wd.scrollcorona(driver, "text", "Himachal Pradesh");
	wd.scrollcorona(driver, "text", "Jammu and Kashmir");
	wd.scrollcorona(driver, "text", "Jharkhand");
	wd.scrollcorona(driver, "text", "Karnataka");
	wd.scrollcorona(driver, "text", "Kerala");
	wd.scrollcorona(driver, "text", "Ladakh");
	wd.scrollcorona(driver, "text", "Lakshadweep");
	wd.scrollcorona(driver, "text", "Madhya Pradesh");
	wd.scrollcorona(driver, "text", "Maharashtra");
	wd.scrollcorona(driver, "text", "Manipur");
	wd.scrollcorona(driver, "text", "Meghalaya");
	wd.scrollcorona(driver, "text", "Mizoram");
	wd.scrollcorona(driver, "text", "Nagaland");
	wd.scrollcorona(driver, "text", "Odisha");
	wd.scrollcorona(driver, "text", "Puducherry");
	wd.scrollcorona(driver, "text", "Punjab");
	wd.scrollcorona(driver, "text", "Rajasthan");
	wd.scrollcorona(driver, "text", "Sikkim");
	wd.scrollcorona(driver, "text", "Tamil Nadu");
	wd.scrollcorona(driver, "text", "Telangana");
	wd.scrollcorona(driver, "text", "Tripura");
	wd.scrollcorona(driver, "text", "Uttar Pradesh");
	wd.scrollcorona(driver, "text", "Uttarakhand");
	wd.scrollcorona(driver, "text", "West Bengal");
	driver.quit();
	
	
	

		
	
}
	
	



	
	
	
	}


	

