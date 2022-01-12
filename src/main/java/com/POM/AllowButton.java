package com.POM;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AllowButton {
	@AndroidFindBy(id= "com.android.packageinstaller:id/permission_allow_button")
	private MobileElement allowbtn;
}
