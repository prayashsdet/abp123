package com.POM;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	@AndroidFindBy(xpath= "//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Home\"]/android.widget.LinearLayout/android.widget.TextView")
	private MobileElement HomeSection;
	
	@AndroidFindBy(xpath= "(//android.widget.ImageView[@resource-id='com.winit.starnews.hin:id/newsImage']/ancestor::androidx.recyclerview.widget.RecyclerView[@resource-id='com.winit.starnews.hin:id/sectionRecycler']/descendant::android.widget.TextView[@resource-id='com.winit.starnews.hin:id/newsHeadingText'])[1]")
	public MobileElement FirstStoryCard;
	
	@AndroidFindBy(id= "(//android.widget.TextView[@resource-id='com.winit.starnews.hin:id/newsHeadingText'])[2]")
	private MobileElement SecondStoryCard;
	
	@AndroidFindBy(xpath= "(//android.widget.TextView[@resource-id='com.winit.starnews.hin:id/newsHeadingText'])[3]")
	private MobileElement ThirdStoryCard;
	
	
	
	@AndroidFindBy(xpath=" //android.widget.TextView[@resource-id='com.winit.starnews.hin:id/newsTitleTextview']")
			
	public MobileElement titlestamp;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@resource-id='com.winit.starnews.hin:id/recentTimeText']")
	public  MobileElement timestamp;
	
	@AndroidFindBy(xpath= "com.winit.starnews.hin:id/tag_layout_parent")
	private MobileElement tags;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='BLOG']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id='com.winit.starnews.hin:id/villAllCardView']")
	public MobileElement ViewAllBlog;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='WEB STORIES']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id='com.winit.starnews.hin:id/villAllCardView]'")
	private MobileElement ViewAllWebStories;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='TV SHOWS']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id='com.winit.starnews.hin:id/villAllCardView]'")
	private MobileElement ViewAllTVSHOWS;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='PHOTO GALLERY']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id='com.winit.starnews.hin:id/villAllCardView]'")
	private MobileElement ViewAllPHOTOGALLERY;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='MOVIE REVIEWS']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id='com.winit.starnews.hin:id/villAllCardView]'")
	private MobileElement ViewAllMOVIEREVIEWS;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='SPORTS']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id='com.winit.starnews.hin:id/villAllCardView]'")
	private MobileElement ViewAllSPORTS;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='WORLD']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id='com.winit.starnews.hin:id/villAllCardView]'")
	private MobileElement ViewAllWORLD;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='BUSINESS']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id='com.winit.starnews.hin:id/villAllCardView]'")
	private MobileElement ViewAllBUSINESS;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='AUTO']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id='com.winit.starnews.hin:id/villAllCardView]'")
	private MobileElement ViewAllAUTO;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='LIFESTYLE']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id='com.winit.starnews.hin:id/villAllCardView]'")
	private MobileElement ViewAllLIFESTYLE;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='HEALTH']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id='com.winit.starnews.hin:id/villAllCardView]'")
	private MobileElement ViewAllHEALTH;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='STORIES']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id='com.winit.starnews.hin:id/villAllCardView]'")
	private MobileElement ViewAllSTORIES;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='TRENDING TOPICS']/ancestor::android.widget.LinearLayout[@resource-id='com.winit.starnews.hin:id/linearLayout']/descendant::android.widget.FrameLayout[@resource-id='com.winit.starnews.hin:id/villAllCardView]'")
	private MobileElement ViewAllTRENDINGTOPICS;
	
	/*xpath for sticky ads*/
	@AndroidFindBy(id="com.winit.starnews.hin:id/stickyAdsView")
	public MobileElement StickyAds;
	
	/**
	 * this method is for clicking on sticky ads
	 * @param driver
	 */
	public void clickOnStickyAds() {
		StickyAds.click();
		System.out.println("clicked on stickyads succesfully");
		
	}
	
	
	
	/*xpath for english language*/
	@AndroidFindBy(xpath="//android.widget.TextView[@text='(English)']")
	public MobileElement English;
	/**
	 * this method is for clicking on english language
	 */
	public void clickOnEnglish() {
		English.click();
		System.out.println("clicked on english language sucesfully");
	}
	/*xpath for advertisement on home page*/
	@AndroidFindBy(xpath="//android.view.View[@text='Open']")
	public MobileElement advertisement;
	
	/**
	 * this method is for wait foe elemet to be load
	 */
	public void clickonAdvertisements() {
		advertisement.click();
		System.out.println("clicked on advertisements successfully");
	}
	/**
	 * this method is for clicking on storycard
	 */
	public void clickonstorycard() {
		FirstStoryCard.click();
	}
	
	
	
	public void setHomeSection() {
		HomeSection.click();
	}

	

	public void setSecondStoryCard() {
		SecondStoryCard.click();
	}

	public void setThirdStoryCard() {
		ThirdStoryCard.click();
	}
	
	public void printTitlestamp() {
	 System.out.println(titlestamp.getText());
	 
	}

	public void printTimestamp() {
		 System.out.println(timestamp.getText());
	}

	public void setTags() {
		tags.getText();
	}

	public void ClickOnViewAllFoBlog(AndroidDriver driver) {
		ViewAllBlog.click();
	}

	public void setViewAllWebStories() {
		ViewAllWebStories.click();
	}

	public void setViewAllTVSHOWS() {
		ViewAllTVSHOWS.click();
	}

	public void setViewAllPHOTOGALLERY() {
		ViewAllPHOTOGALLERY.click();
	}

	public void setViewAllMOVIEREVIEWS() {
		ViewAllMOVIEREVIEWS.click();
	}

	public void setViewAllSPORTS() {
		ViewAllSPORTS.click();
	}

	public void setViewAllWORLD() {
		ViewAllWORLD.click();
	}

	public void setViewAllBUSINESS() {
		ViewAllBUSINESS.click();
	}

	public void setViewAllLIFESTYLE() {
		ViewAllLIFESTYLE.click();
	}

	public void setViewAllHEALTH() {
		ViewAllHEALTH.click();
	}

	public void setViewAllSTORIES() {
		ViewAllSTORIES.click();
	}

	public void setViewAllTRENDINGTOPICS() {
		ViewAllTRENDINGTOPICS.click();
	}
	
	public void setViewAllAUTO() {
		ViewAllAUTO.click();
	}

	
	public HomePage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
}
