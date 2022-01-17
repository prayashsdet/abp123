package ABPNews_live;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.POM.HomePage;
import com.genericUtility.BaseClass;
import com.genericUtility.WebDriverUtility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
@Listeners(com.genericUtility.Listeners.class)
public class TC_Home_001 extends BaseClass{
	@Test

	public void articles() throws Throwable {
		
		WebDriverUtility wb =new WebDriverUtility();
		HomePage hp =new HomePage();
	
		
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
//			driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
			 
				if (hp.getForYouSection().isSelected()) {
					
					hp.setHomeSection();
				}
				Thread.sleep(6000);
			
				wb.swipedown(driver);
				driver.swipe(508, 2078, 521, 1028,1600);
				
				hp.SelectEnglishLanguage();
				Thread.sleep(3000);
                hp.setFirstStoryCard();
				hp.setTimestamp();
				hp.setTitlestamp();
				Thread.sleep(6000);	
                scrollHomePage(driver,"text","Tags:");
              hp.setTags();
                for (int i=0;i<=6;i++) {
                	wb.swipeup(driver);
                }

            
            
              driver.pressKeyCode(AndroidKeyCode.BACK);
              Thread.sleep(3000);
              hp.setSecondStoryCard();
              hp.setTimestamp();
			hp.setTitlestamp();
              scrollHomePage(driver,"text","Tags:");
            hp.setTags();
              Thread.sleep(3000);
              for (int i=0;i<=6;i++) {
            	  wb.swipeup(driver);
              }

              driver.pressKeyCode(AndroidKeyCode.BACK);
              Thread.sleep(3000);
             hp.setThirdStoryCard();
             hp.setTimestamp();
             hp.setTitlestamp();
             
              
             Thread.sleep(6000);
             scrollHomePage(driver,"text","Tags:");
            hp.setTags();
             Thread.sleep(6000);
             for (int i=0;i<=6;i++) {
            	 wb.swipeup(driver);
       	     }

             driver.pressKeyCode(AndroidKeyCode.BACK);
             Thread.sleep(3000);	
	   

		driver.swipe(513, 1475, 516, 1034, 500);
		scrollHomePage(driver, "text", "TOP VIDEOS");
		scrollHomePage(driver, "text", "BLOG");
		hp.setViewAllBlog();
	        for (int i=0;i<=6;i++) {
	        	driver.swipe(508, 2078, 521, 1028,600);
	        }
	        for (int i=0;i<=6;i++) {
	        	wb.swipeup(driver);
	        }
	        driver.pressKeyCode(AndroidKeyCode.BACK);
		scrollHomePage(driver, "text", "WEB STORIES");
		hp.setViewAllWebStories();
		Thread.sleep(6000);
		 for (int i=0;i<=6;i++) {
			 driver.swipe(508, 2078, 521, 1028,600);
		 }
		 for (int i=0;i<=6;i++) {
			 wb.swipeup(driver);
		 }
		 driver.pressKeyCode(AndroidKeyCode.BACK);
		 
		Thread.sleep(3000);
		scrollHomePage(driver, "text", "TV SHOWS");	
		hp.setViewAllTVSHOWS();
		Thread.sleep(6000);
		 for (int i=0;i<=6;i++) {
			 wb.swipedown(driver);
		 }
		 for (int i=0;i<=6;i++) {
			 wb.swipeup(driver);
		 }
		 driver.pressKeyCode(AndroidKeyCode.BACK);
		 Thread.sleep(3000);
		 
		scrollHomePage(driver, "text", "PHOTO GALLERY");
		hp.setViewAllPHOTOGALLERY();
		Thread.sleep(6000);
		 for (int i=0;i<=6;i++) {
			 wb.swipedown(driver);
		 }
		 for (int i=0;i<=6;i++) {
			 wb.swipeup(driver);
		 }
		 driver.pressKeyCode(AndroidKeyCode.BACK);
		
		 
			scrollHomePage(driver, "text", "MOVIE REVIEWS");
			Thread.sleep(3000);
			
//			scrollHomePage(driver, "text", "ENTERTAINMENT");
//			driver.findElement(By.xpath("//android.widget.TextView[@text='ENTERTAINMENT']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
//			Thread.sleep(6000);
//			 for (int i=0;i<=6;i++) {
//				 wb.swipedown(driver);
//			 }
//			 for (int i=0;i<=6;i++) {
//				 wb.swipeup(driver);
//			 }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "SPORTS");
		hp.setViewAllSPORTS();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
				 wb.swipedown(driver);
			 }
			 for (int i=0;i<=6;i++) {
				 wb.swipeup(driver);
			 }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "WORLD");
			hp.setViewAllWORLD();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
				 wb.swipedown(driver);
			 }
			 for (int i=0;i<=6;i++) {
				 wb.swipeup(driver);
			 }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "BUSINESS");
			hp.setViewAllBUSINESS();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
				 wb.swipedown(driver);
			 }
			 for (int i=0;i<=6;i++) {
				 wb.swipeup(driver);
			 }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "AUTO");
			hp.setViewAllAUTO();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
				 wb.swipedown(driver);
			 }
			 for (int i=0;i<=6;i++) {
				 wb.swipeup(driver);
			 }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "LIFESTYLE");
			hp.setViewAllLIFESTYLE();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
				 wb.swipedown(driver);
			 }
			 for (int i=0;i<=6;i++) {
				 wb.swipeup(driver);
			 }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "HEALTH");

hp.setViewAllHEALTH();
			Thread.sleep(6000);
			 for (int i=0;i<=6;i++) {
				 wb.swipedown(driver);
			 }
			 for (int i=0;i<=6;i++) {
				 wb.swipeup(driver);
			 }
			 driver.pressKeyCode(AndroidKeyCode.BACK);
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "STORIES");
			 Thread.sleep(3000);
			scrollHomePage(driver, "text", "TRENDING TOPICS");
			
			Thread.sleep(3000);
				} 

	
		public void scrollHomePage(AndroidDriver driver,String an, String av) throws Throwable {	
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
			Thread.sleep(3000);
			System.out.println(av);
		}
}
	
