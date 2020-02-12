package br.com.rsinet.hub.Appium.stepDefinition;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub.Appium.PageFactory.PagePesquisa;
import br.com.rsinet.hub.Appium.PageFactory.PageTelaInicial;
import br.com.rsinet.hub.Appium.managers.DriverManager;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PesquisaScreenSteps {
	
	private PagePesquisa pesquisa;
	public AndroidDriver<MobileElement> driver;
	
	public PesquisaScreenSteps() throws MalformedURLException {
		driver = DriverManager.ConfiguraDriver(); // chama sua classe de driver
		pesquisa = PageFactory.initElements(driver, PagePesquisa.class);
	}

	@Quando("^clicar na lupa$")
	public void clicar_na_lupa() throws Throwable {
		pesquisa.ClicarNAlupa();
		
	}

	@Quando("^Digitar no campo de pesquisa$")
	public void digitar_no_campo_de_pesquisa() throws Throwable {
		pesquisa.EscreverNoCampoPesquisa("Tablets");
		pesquisa.ClicarNAlupa();
	}

	@Quando("^clicar nos produtos$")
	public void clicar_nos_produtos() throws Throwable {
		pesquisa.ClicarNoProduto();
	  
	}
	@Quando("^Digitar no campo de pesquisa um produto que nao existe$")
	public void digitar_no_campo_de_pesquisa_um_produto_que_nao_existe() throws Throwable {
		pesquisa.EscreverNoCampoPesquisa("Iphone");
		pesquisa.ClicarNAlupa();
	    

	
}

	@Entao("^entao escolher produto$")
	public void entao_escolher_produto() throws Throwable {
	 
	}

	@Entao("^entao produto nao  existe$")
	public void entao_produto_nao_existe() throws Throwable {

	}

}
