package ABPNews_live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.genericUtility.BaseClass;
import com.genericUtility.WebDriverUtility;

public class Video  extends BaseClass{
@Test
public void video() throws InterruptedException {
	WebDriverWait wd =new WebDriverWait(driver,30);
	wd.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")))).click();;

	
	
	HomePage hp=new HomePage(driver);
	WebDriverUtility wu =new WebDriverUtility(driver);
	hp.setViewAlLLiveTv(driver);
	hp.Menu();
	hp.setDismissVideoButton();
	hp.setDropdownLanguage();
	hp.setSelectHindiLanguage();
	w.scrollToElement(driver,"text","लाइव टीवी");
	hp.setViewAllHindiLiveTv();
}
}
