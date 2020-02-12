package br.com.rsinet.hub.Appium.stepDefinition;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub.Appium.PageFactory.PageTelaInicial;
import br.com.rsinet.hub.Appium.managers.DriverManager;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TelaInicialScreenSteps {

	private PageTelaInicial home;

	public AndroidDriver<MobileElement> driver;

	public TelaInicialScreenSteps() throws MalformedURLException {
		driver = DriverManager.ConfiguraDriver(); // chama sua classe de driver
		home = PageFactory.initElements(driver, PageTelaInicial.class);

	}

	@Quando("^clicar nos laptops$")
	public void clicar_nos_laptops() throws Throwable {
		home.ClicarLaptops();

	}

	@Quando("^clicar no laptops desejado$")
	public void clicar_no_laptops_desejado() throws Throwable {
		home.ProdutoEscolhido();

	}

	@Entao("^Produto Escolhido$")
	public void produto_Escolhido() throws Throwable {

	}

	@Quando("^clicar no botao quantidade$")
	public void clicar_no_botao_quantidade() throws Throwable {
		home.BotaoMaisProduto();

	}

	@Quando("^clicar no botao mais laptops$")
	public void clicar_no_botao_mais_laptops() throws Throwable {
		for (int i = 0; i < 20; i++) {
			home.ClicarMaisProdutos();
		}
	}

	@Quando("^clicar em aplicar$")
	public void clicar_em_aplicar() throws Throwable {
		home.Aplicar();

	}

	@Quando("^Adcionar ao carrinho$")
	public void adcionar_ao_carrinho() throws Throwable {
		home.Add();

	}

	@Quando("^efetuar login no cadastro$")
	public void efetuar_login_no_cadastro() throws Throwable {
		home.Name("juliana.teste@teste.com.br");
		home.Senha("1213Ju");
		home.Login();
	}

	@Entao("^clicar em login$")
	public void clicar_em_login() throws Throwable {

	}

}
