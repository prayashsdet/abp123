package com.POM;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage {
	@AndroidFindBy(xpath= "//android.widget.FrameLayout[@bounds='[30,222][1050,982]']")
	private MobileElement homeCard1;
	
	@AndroidFindBy(id= "//android.widget.FrameLayout[@bounds='[30,1006][525,1697]']")
	private MobileElement homeCard2;
	
	@AndroidFindBy(id= "//android.widget.FrameLayout[@bounds='[555,1006][1050,1697]']")
	private MobileElement homeCard3;
	
	@AndroidFindBy(id= "//android.widget.FrameLayout[@bounds='[30,222][1050,874]']")
	private MobileElement homeCard4;
	
	@AndroidFindBy(id= "//android.widget.FrameLayout[@bounds='[30,1684][1050,1764]']")
	private MobileElement homeCard5;
	
	@AndroidFindBy(xpath= "//android.widget.LinearLayout[@resource-id=\"com.winit.starnews.hin:id/linearLayout\"]/descendant::android.widget.TextView[@text='View All']")
	private MobileElement viewAllBlog;
	
	@AndroidFindBy(xpath= "//android.widget.LinearLayout[@resource-id=\"com.winit.starnews.hin:id/showVHContainer\"]/descendant::android.widget.TextView[@text='View All']")
	private MobileElement unCut;
	
	@AndroidFindBy(id= "//android.widget.FrameLayout[@bounds='[30,1684][1050,1764]']")
	private MobileElement homeCard8;
}
