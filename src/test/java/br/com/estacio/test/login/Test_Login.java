package br.com.estacio.test.login;

import br.com.estacio.utilities.BaseTest;

public class Test_Login extends BaseTest {
	
	public void realizarLogin() {
		loginPage.writeCPF()
		.writeTelefone()
		.hideKeyboard()
		.clickLogin();
		
		termosDeUso.validarTermoDeUso();
	}
}
