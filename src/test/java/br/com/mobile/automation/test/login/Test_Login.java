package br.com.mobile.automation.test.login;

import br.com.mobile.automation.utilities.BaseTest;

public class Test_Login extends BaseTest {
	
	public void realizarLogin() {
		loginPage.writeCPF()
		.writeTelefone()
		.hideKeyboard()
		.clickLogin();
		
		termosDeUso.validarTermoDeUso();
	}
}
