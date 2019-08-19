package br.com.estacio.test.login;

import org.junit.Before;
import org.junit.Test;

import br.com.estacio.utilities.BaseConstants;
import br.com.estacio.utilities.enums.OS;
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
