package br.com.mobile.automation.test.login;

import br.com.mobile.automation.utilities.BaseConstants;
import br.com.mobile.automation.utilities.enums.OS;
import org.junit.Before;
import org.junit.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class Test_LoginAndroid extends Test_Login {

	@Before
	public void setUpPlatformAndPages() {
		BaseConstants.executionOS = OS.ANDROID;
		setUpPages();
	}

	@Test
	@Severity(SeverityLevel.MINOR)
	@Feature("Android")
	@Story("Login")
	public void realizarLogin() {
		super.realizarLogin();
	}
}
