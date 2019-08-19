package br.com.estacio.page.termos_de_uso;

import org.junit.Assert;

import br.com.estacio.utilities.screen_actions.ScreenActions;
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
