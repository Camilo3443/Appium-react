package br.com.mobile.automation.page.home;

import br.com.mobile.automation.utilities.screen_actions.ScreenActions;
import org.junit.Assert;

import br.com.mobile.automation.constants.home.HomeConstants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomePage extends ScreenActions {

	@AndroidFindBy(xpath = "//*[@content-desc='']")
	@iOSXCUITFindBy(xpath = "//*[@name='']")
	private MobileElement HEADER;

	public HomePage() {
		initElements(this);
	}
	
	public HomePage validateHeader() {
		Assert.assertEquals(HomeConstants.TXT_HEADER, getText(HEADER));
		return this;
	}
}
