package br.com.mobile.automation.page.termos_de_uso;

import br.com.mobile.automation.utilities.screen_actions.ScreenActions;
import org.junit.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class TermosDeUsoPage extends ScreenActions {

//	@WithTimeout(time=5, chronoUnit=ChronoUnit.SECONDS)
	@AndroidFindBy(xpath = "//android.widget.ImageView/following-sibling::*[2]")
	@iOSXCUITFindBy(accessibility = "Termos de uso Para acessar o app da Estácio você precisa aceitar os Termos de Uso.")
	private MobileElement TERMOS_DE_USO;

	public TermosDeUsoPage() {
		initElements(this);
	}

	public void validarTermoDeUso() {
		Assert.assertTrue(elementExists(TERMOS_DE_USO));
	}

}
