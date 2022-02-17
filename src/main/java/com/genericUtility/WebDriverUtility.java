package com.genericUtility;

	import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
	import org.openqa.selenium.ScreenOrientation;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.POM.Scroll;
import com.google.common.io.Files;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

	public class WebDriverUtility {
		
		static AndroidDriver driver;
	public WebDriverUtility(AndroidDriver driver2) {
		this.driver=driver;
			// TODO Auto-generated constructor stub
		}
	public static void TapOnElement(WebElement element) 
	{
	//	((Object) driver).tap(1, element, 500);
		
		
	}
	public void scrollToElement(AndroidDriver driver ,java.lang.String string,java.lang.String string2) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+string+"(\""+string2+"\"))");//scroll to element
	}
		
public static void scrollDown(AndroidDriver driver) {
	Dimension Dimension = driver.manage().window().getSize();
	int scrollStart=(int) (Dimension.getHeight()*0.5);
	int scrollEnd =(int)(Dimension.getWidth()*0.2);
	TouchAction ta =new TouchAction(driver);
	ta.press(PointOption.point(0,scrollStart)).waitAction(WaitOptions.waitOptions(java.time.Duration.ofMillis(1000))).moveTo(PointOption.point(0, scrollEnd)).release().perform();
		      }











public static void scrollIntoView(String Text,AndroidDriver driver){
    //https://developer.android.com/reference/androidx/test/uiautomator/UiSelector


    String mySelector = "new UiSelector().text(\"" + Text + "\").instance(0)";
    String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(" + mySelector + ");";
    driver.findElementByAndroidUIAutomator(command);

    /*((AndroidDriver<MobileElement>) AppDriver.getDriver()).findElementByAndroidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + Text + "\").instance(0))").click();
            */
}

public static void scrollNClick(MobileElement ele ,AndroidDriver driver){
   int retry=0;

    while(retry<=20){
    	
    	   
    	    	try {
    	    		ele.click();
    	    		break;
    	    	}catch(Exception e) {
    	    		
    	    		scrollDown(driver);
    	    		retry++;
            
    			
                
    }
    	    	
    	    	
}
    	
    }
    	    
    	    
    	    
    	    
    

    public void WaitForMilliSeconds(int a) throws InterruptedException {
    	Thread.sleep(a);
    }
    public void waitForElementTobeClickeable(int a,AndroidDriver driver,MobileElement ele) {
    	WebDriverWait w =new WebDriverWait(driver,a);
    	w.until(ExpectedConditions.elementToBeClickable(ele));
    }
    	public void WaitUntilPageLoads(int a , AndroidDriver driver) {
    		driver.manage().timeouts().implicitlyWait( a, TimeUnit.SECONDS);
    	}
    		
    		public void waitForStalenessOfElement(int a,AndroidDriver driver,MobileElement ele) {
    	    	WebDriverWait w =new WebDriverWait(driver,a);
    	    	w.until(ExpectedConditions.stalenessOf(ele));
    	}
    		public static String getScreenshot(WebDriver driver,String screenshotName)
    		{
    			 
    			TakesScreenshot ts=(TakesScreenshot) driver;
    			
    			File src=ts.getScreenshotAs(OutputType.FILE);
    			
    			String path="./Screenshot/"+screenshotName+".PNG";
    			
    			File destination=new File(path);
    			
    			try 
    			{
    				FileUtils.copyFile(src, destination);
    			} catch (IOException e) 
    			{
    				System.out.println("Capture Failed "+e.getMessage());
    			}
    			
    			return path;
    		}
    		public void scrollcorona(AndroidDriver driver,String an, String av) throws Throwable {
    			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.widget.Spinner")).click();	
    			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))").click();
    			Thread.sleep(3000);
    			
    			WebElement active = driver.findElement(By.xpath("//android.view.View[@resource-id='totalCases']"));
//    			System.out.println("Active "+active.getText());

    			WebElement recovered = driver.findElement(By.xpath("//android.view.View[@resource-id='recovered']"));
//    			System.out.println("Recovered "+recovered.getText());
    		
    			WebElement deceased = driver.findElement(By.xpath("//android.view.View[@resource-id='death']"));
//    			System.out.println("Deceased "+deceased.getText());
    			
    			System.out.format("%35s, %15s,%15s,%15s\n",av,active.getText(),recovered.getText(),deceased.getText());
    		}
    		
    }

	
	


		
	