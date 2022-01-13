package ABPNews_live;
import java.util.Formatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericUtility.BaseClass;

import io.appium.java_client.android.AndroidDriver;

@Listeners(com.genericUtility.Listeners.class)

public class CoronaCases extends BaseClass {
	Formatter fmt = new Formatter();
	@Test
	public void coronavcases() throws Throwable {
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
	Thread.sleep(5000);
//	driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click();
//	driver.findElement(By.id("android:id/button2")).click();
	driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	WebElement ele = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"For You\"]/android.widget.LinearLayout/android.widget.TextView"));
	if (ele.isSelected()) {
		WebElement home = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Home\"]/android.widget.LinearLayout/android.widget.TextView"));
	home.click();
	}
	
	driver.swipe(542, 1750, 542, 786, 1500);
	
	
	///////////////////////////////////////////corona cases accorrding to state
	System.out.format("%35s %15s %15s %15s\n", "state", "Active", "Recovered","Deceased");
	scrollcorona(driver, "text", "India (All States)");
	scrollcorona(driver, "text", "Andaman and Nicobar Islands");
	scrollcorona(driver, "text", "Andhra Pradesh");
	scrollcorona(driver, "text", "Arunachal Pradesh");
	scrollcorona(driver, "text", "Assam");
	scrollcorona(driver, "text", "Bihar");
	scrollcorona(driver, "text", "Chandigarh");
	scrollcorona(driver, "text", "Chhattisgarh");
	scrollcorona(driver, "text", "Dadra Nagar Haveli and Daman Diu");
	scrollcorona(driver, "text", "Delhi");
	scrollcorona(driver, "text", "Goa");
	scrollcorona(driver, "text", "Gujarat");
	scrollcorona(driver, "text", "Haryana");
	scrollcorona(driver, "text", "Himachal Pradesh");
	scrollcorona(driver, "text", "Jammu and Kashmir");
	scrollcorona(driver, "text", "Jharkhand");
	scrollcorona(driver, "text", "Karnataka");
	scrollcorona(driver, "text", "Kerala");
	scrollcorona(driver, "text", "Ladakh");
	scrollcorona(driver, "text", "Lakshadweep");
	scrollcorona(driver, "text", "Madhya Pradesh");
	scrollcorona(driver, "text", "Maharashtra");
	scrollcorona(driver, "text", "Manipur");
	scrollcorona(driver, "text", "Meghalaya");
	scrollcorona(driver, "text", "Mizoram");
	scrollcorona(driver, "text", "Nagaland");
	scrollcorona(driver, "text", "Odisha");
	scrollcorona(driver, "text", "Puducherry");
	scrollcorona(driver, "text", "Punjab");
	scrollcorona(driver, "text", "Rajasthan");
	scrollcorona(driver, "text", "Sikkim");
	scrollcorona(driver, "text", "Tamil Nadu");
	scrollcorona(driver, "text", "Telangana");
	scrollcorona(driver, "text", "Tripura");
	scrollcorona(driver, "text", "Uttar Pradesh");
	scrollcorona(driver, "text", "Uttarakhand");
	scrollcorona(driver, "text", "West Bengal");		
	
}
	public void scrollcorona(AndroidDriver driver,String an, String av) throws Throwable {
		driver.findElement(By.xpath("//android.widget.Spinner[@package='com.winit.starnews.hin']")).click();	
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))").click();
		//System.out.print(av +" ");
		WebElement active = driver.findElement(By.xpath("//android.view.View[@resource-id='totalCases']"));
		//System.out.print("Active "+active.getText() +", ");

		WebElement recovered = driver.findElement(By.xpath("//android.view.View[@resource-id='recovered']"));
		//System.out.print("Recovered "+recovered.getText() +", ");
	
		WebElement deceased = driver.findElement(By.xpath("//android.view.View[@resource-id='death']"));
		//System.out.println("Deceased "+deceased.getText() +", ");
		
		System.out.format("%35s %15s %15s %15s\n", av, active.getText(), recovered.getText(), deceased.getText());  
	}
	
}
