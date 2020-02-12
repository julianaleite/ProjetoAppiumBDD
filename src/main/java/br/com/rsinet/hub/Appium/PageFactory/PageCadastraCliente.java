package br.com.rsinet.hub.Appium.PageFactory;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub.Appium.managers.DriverManager;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.touch.offset.PointOption;

// alterar todas as clases para screen
public class PageCadastraCliente {

	private WebElement element;
	private WebDriver driver;
	private WebDriverWait wait;
	private TouchAction action;

	public void PageCadastraCliente(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		action = new TouchAction((PerformsTouchActions) driver);
		wait = new WebDriverWait(driver, 5);
	}

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private WebElement clicarmenu;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/linearLayoutLogin")
	private WebElement clicarlogin;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewDontHaveAnAccount")
	private WebElement cliarCriarConta;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement escreverNome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement escreverEmail;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText\r\n")
	private WebElement escreverSenha;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText\r\n")
	private WebElement escreverConfirmasenha;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText\r\n")
	private WebElement escreverPrimeiroNome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText\r\n")
	private WebElement escreverSegundoNome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement escreverTelefone;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout\r\n")

	private WebElement escreverCountry;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement escreverEstado;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText\r\n")
	private WebElement escreverCidade;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText\r\n")
	private WebElement escreverEndereco;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText\r\n")
	private WebElement escreverCodigo;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonRegister")
	private WebElement registrarNome;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")
	private WebElement paisAlbania;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewCountriesTitle")
	private WebElement ccountry;

	public void clicarnoinicializador() {
		clicarmenu.click();
	}

	public void clicarnologin() {
		clicarlogin.click();
	}

	public void clicarCriarConta() {
		cliarCriarConta.click();
	}

	public void digitarNome(String nome) {
		escreverNome.sendKeys(nome);
	}

	public void digitaEmail(String email) {
		escreverEmail.sendKeys(email);
	}

	public void digitaSenha(String senha) {
		escreverSenha.sendKeys(senha);
	}

	public void confirmarSenha(String confirmasenha) {
		escreverConfirmasenha.sendKeys(confirmasenha);
	}

	public void primeiroNomePessoa(String primeironome) {
		escreverPrimeiroNome.sendKeys(primeironome);
	}

	public void segundoNomePessoa(String segundonome) {
		escreverSegundoNome.sendKeys(segundonome);
	}

	public void contato(String telefone) {
		escreverTelefone.sendKeys(telefone);

	}

	public void escolhePais() {

		paisAlbania.click();
		// ((FindsByAndroidUIAutomator<WebElement>)
		// driver).findElementByAndroidUIAutomator(
		// "new UiScrollable(new
		// UiSelector().scrollable(true).instance(0)).scrollIntoView(new
		// UiSelector().textContains(\""
		// + "Brazil" + "\").instance(0))")
		// .click();
	}

	public void PaisOndeReside() throws InterruptedException {
	//	Thread.sleep(5000);
//	wait.until(ExpectedConditions.elementToBeClickable(escreverCountry));
		ccountry.click();
	}

	public void digitaEstado(String estado) {
		escreverEstado.sendKeys(estado);

	}

	public void digitarCidade(String cidade) {
		escreverCidade.sendKeys(cidade);
	}

	public void digitarEndereco(String endereco) {
		escreverEndereco.sendKeys(endereco);
	

	}

	public void digitarCodigo(String codigo) {
		escreverCodigo.sendKeys(codigo);

	}

	public void Registrar() {
		registrarNome.click();
	}
	public void rolartela1() throws MalformedURLException {
        (new TouchAction(DriverManager.ConfiguraDriver())).press(PointOption.point(487, 1752))
                .moveTo(PointOption.point(504, 1025)).release().perform();

 

    }

}