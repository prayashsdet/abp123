package ABPNews_live;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.genericUtility.BaseClass;
@Listeners(com.genericUtility.Listeners.class)
public class LanguageTest extends BaseClass {
	@Test
	public void demo() throws InterruptedException {
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement ele=driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']"));
	driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	String english=ele.getText();
	SoftAssert sa =new SoftAssert();
	sa.assertEquals("(English)", english);
		System.out.println(english);
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		//driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		Thread.sleep(5000);
		driver.findElementByAccessibilityId("Menu").click();
		driver.findElement(By.id("com.winit.starnews.hin:id/spinner_arrow_iv")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='(Hindi)']")).click();
//		driver.findElement(By.xpath("com.winit.starnews.hin:id/menu_menu")).click();
//		driver.findElement(By.xpath("com.winit.starnews.hin:id/spinner_arrow_iv")).click();
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView"));
//		driver.swipe(530, 1852, 501, 578, 2000);
		
		
		
	WebElement hnd = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"होम\"]/android.widget.LinearLayout/android.widget.TextView"));
	String  hindi=hnd.getText();
	
//	
//	FileInputStream fis=new FileInputStream("./home.xlsx");
//	Workbook wb = WorkbookFactory.create(fis);
//	String home=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	
//    SoftAssert sa3=new SoftAssert();
//	sa3.assertEquals(home, hindi);
//    System.out.println(home);
    
//  WebElement language = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.winit.starnews.hin:id/newsHeadingText' and @index='2']"));
//  String lg=language.getText();
//  String hn=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
//     SoftAssert as =new SoftAssert();
//     as.assertEquals(hn, lg);
//	System.out.println( lg);
//	
	
	
}
}
