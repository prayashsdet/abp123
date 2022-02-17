//package ABPNews_live;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Test;
//
//import com.genericUtility.BaseClass;
//@Listeners(com.genericUtility.Listeners.class)
//public class WebStoriesViewAll extends BaseClass{
//	@Test
//	public void webstories() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException {
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//android.widget.TextView[@text='(English)']")).click();
////		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();		
//		Thread.sleep(3000);
//		
////	    WebElement ele = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"For You\"]/android.widget.LinearLayout/android.widget.TextView"));
////		if (ele.isSelected()) {
////	    WebElement home = driver.findElement(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Home\"]/android.widget.LinearLayout/android.widget.TextView"));
////		Thread.sleep(10000);
////		home.click();
////		}
//		Thread.sleep(6000);
//        for (int i=0;i<=7;i++) {
//		driver.swipe(517, 1737, 560, 563, 1600);	
//		}
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//android.widget.TextView[@text='WEB STORIES']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id=\"com.winit.starnews.hin:id/villAllCardView\"]")).click();
//        
//        List<WebElement> WebStories = driver.findElements(By.xpath("//android.widget.TextView[@resource-id=\"com.winit.starnews.hin:id/search_news_text\"]"));
//       
//       
//       ArrayList<String> al= new ArrayList<String>();
//       for (WebElement wb:WebStories) {
//    	  System.out.println(wb.getText());
//    	  al.add(wb.getText());
////       String name = wb.getText();
//       } 
//    	   
    	   FileInputStream file = new FileInputStream (new File("C:\\Users\\hp\\Desktop\\abpLive.xlsx"));
   			Workbook wb1 = WorkbookFactory.create(file);
   			
   			Sheet sheet = wb1.getSheet("Sheet2");
   			for(int i = 0; i<WebStories.size();i++) {
   				Row row = sheet.createRow(i);
   				row.createCell(0).setCellValue(al.get(i));
   				
   			}
   			FileOutputStream writeFile = new FileOutputStream(new File("C:\\Users\\hp\\Desktop\\abpLive.xlsx"));
	   		wb1.write(writeFile);
	   		writeFile.flush();
	   		wb1.close();
//   			
//       
//       
//        driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='com.winit.starnews.hin:id/search_news_text'])[1]")).click();
//       Thread.sleep(1000000);
//      driver.closeApp();
//	}
//}
