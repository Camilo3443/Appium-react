package br.com.estacio.utilities;

import org.junit.Rule;
import org.junit.rules.TestName;

import br.com.estacio.page.home.HomePage;
import br.com.estacio.page.login.LoginPage;
import br.com.estacio.page.termos_de_uso.TermosDeUsoPage;
import br.com.estacio.utilities.listener.TestListener;

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
