package br.com.estacio.page.login;

import br.com.estacio.constants.login.LoginConstants;
import br.com.estacio.utilities.BaseConstants;
import br.com.estacio.utilities.screen_actions.ScreenActions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LoginPage extends ScreenActions {

	@AndroidFindBy(xpath = "//*[contains(@text,'CPF')]/preceding-sibling::*")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=' ']/preceding-sibling::*[contains(@name,'CPF')]")
	private MobileElement FLD_CPF;

	@AndroidFindBy(xpath = "//*[contains(@text,'Telefone')]/preceding-sibling::*")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=' ']/preceding-sibling::*[contains(@name,'Telefone')]")
	private MobileElement FLD_TELEFONE;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='É simples estar conectado.']")
	private MobileElement FLD_TITLE;

	@AndroidFindBy(xpath = "//*[@text='Cadastrar']")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Login_btncadastrar']")
	private MobileElement BTN_LOGIN;

	public LoginPage() {
		initElements(this);
	}

	public LoginPage writeCPF() {
		FLD_CPF.sendKeys(LoginConstants.CPF);
		return this;
	}

	public LoginPage writeTelefone() {
		FLD_TELEFONE.sendKeys(LoginConstants.TELEFONE);
		return this;
	}
	
	public LoginPage hideKeyboard() {
		switch (BaseConstants.executionOS) {
			case IOS:
				FLD_TITLE.click();
				break;
			case ANDROID:
				break;
		}
		return this;
	}

	public LoginPage clickLogin() {
		BTN_LOGIN.click();
		return this;
	}

}
