package br.com.mobile.automation.utilities;

import br.com.mobile.automation.page.login.LoginPage;
import br.com.mobile.automation.page.termos_de_uso.TermosDeUsoPage;
import br.com.mobile.automation.utilities.listener.TestListener;
import org.junit.Rule;
import org.junit.rules.TestName;

import br.com.mobile.automation.page.home.HomePage;

public class BaseTest {

	@Rule
	public TestName testName = new TestName();

	@Rule
	public TestListener listener = new TestListener();

	protected LoginPage loginPage;
	protected HomePage homePage;
	protected TermosDeUsoPage termosDeUso;

	public void setUpPages() {
		System.out.println("Iniciando os testes do método '" + testName.getMethodName() + "' na plataforma '"
				+ BaseConstants.executionOS.getValor() + "'!");

		loginPage = new LoginPage();
		homePage = new HomePage();
		termosDeUso = new TermosDeUsoPage();
	}

}
