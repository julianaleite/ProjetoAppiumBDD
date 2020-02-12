package br.com.rsinet.hub.Appium.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageTelaInicial {

	public WebElement elemento;
	public WebDriver driver;

	public void HomeScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView\r\n")
	private WebElement clicarProduto;

	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Laptops\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]\r\n")
	private WebElement escolhendoproduto;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]\r\n")
	private WebElement botaoquantidade;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView[2]\r\n")
	private WebElement clicarmaisquantidade;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewApply")
	private WebElement botaoaplicar;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonProductAddToCart")
	private WebElement addcarrinho;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText\r\n")
	private WebElement username;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText\r\n")
	private WebElement senhadigite;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.Button")
	private WebElement loginclick;

	public void ClicarLaptops() {

		clicarProduto.click();
	}

	public void ProdutoEscolhido() {
		// WebDriverWait wait2 = new WebDriverWait(driver, 10);
		// wait2.until(ExpectedConditions.elementToBeClickable(escolhendoproduto));
		escolhendoproduto.click();

	}

	public void BotaoMaisProduto() {
		botaoquantidade.click();
	}

	public void ClicarMaisProdutos() {
		clicarmaisquantidade.click();

	}

	public void Aplicar() {
		botaoaplicar.click();
	}

	public void Add() {
		addcarrinho.click();

	}

	public void Name(String nome) {
		username.sendKeys(nome);
	}

	public void Senha(String senha) {
		senhadigite.sendKeys(senha);
	}

	public void Login() {

		loginclick.click();
	}
}
