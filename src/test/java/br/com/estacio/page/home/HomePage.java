package br.com.estacio.page.home;

import org.junit.Assert;

import br.com.estacio.constants.home.HomeConstants;
import br.com.estacio.utilities.screen_actions.ScreenActions;
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
