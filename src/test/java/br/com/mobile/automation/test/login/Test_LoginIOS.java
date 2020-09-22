package br.com.mobile.automation.test.login;

import br.com.mobile.automation.utilities.BaseConstants;
import br.com.mobile.automation.utilities.enums.OS;
import org.junit.Before;
import org.junit.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;

public class Test_LoginIOS extends Test_Login {

	@Before
	public void setUpPlatformAndPages() {
		BaseConstants.executionOS = OS.IOS;
		setUpPages();
	}

	@Test
	@Feature("IOS")
	@Story("Login")
	public void realizarLogin() {
		super.realizarLogin();
	}
}
