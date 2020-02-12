package br.com.rsinet.hub.Appium.stepDefinition;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub.Appium.PageFactory.PageCadastraCliente;
import br.com.rsinet.hub.Appium.managers.DriverManager;
import cucumber.api.PendingException;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;


public class CadastraScreenSteps {

	private PageCadastraCliente cadastro;

	public AndroidDriver<MobileElement> driver;

	private TouchAction action;

	public CadastraScreenSteps() throws MalformedURLException {
		driver = DriverManager.ConfiguraDriver(); // chama sua classe de driver
		cadastro = PageFactory.initElements(driver, PageCadastraCliente.class);
		action = new TouchAction((PerformsTouchActions) driver);

	}
	@Dado("^que clica no menu do app$")
	public void que_clica_no_menu_do_app() throws Throwable {
	 cadastro.clicarnoinicializador();
	}

	@Dado("^clicar no login do app$")
	public void clicar_no_login_do_app() throws Throwable {
	cadastro.clicarnologin();
	}

	@Dado("^criar uma nova conta no app$")
	public void criar_uma_nova_conta_no_app() throws Throwable {
		cadastro.clicarCriarConta();
	}

	@Quando("^digitar o nome do usuario$")
	public void digitar_o_nome_do_usuario() throws Throwable {
		cadastro.digitarNome("Juliana14");
	}

	@Quando("^digitar o email do usuario$")
	public void digitar_o_email_do_usuario() throws Throwable {
	cadastro.digitaEmail("juliana.silva@teste.com.br");	
	
	}

	@Quando("^digitar senha do usuario$")
	public void digitar_senha_do_usuario() throws Throwable {
	  cadastro.digitaSenha("1213Ju");
	}

	@Quando("^confirma senha do usuario$")
	public void confirma_senha_do_usuario() throws Throwable {
		cadastro.confirmarSenha("1213Ju");
	}

	@Quando("^digitar o primeiro nome do usuario$")
	public void digitar_o_primeiro_nome_do_usuario() throws Throwable {
		cadastro.primeiroNomePessoa("Arthur");
	}

	@Quando("^digitar o ultimo nome do usuario$")
	public void digitar_o_ultimo_nome_do_usuario() throws Throwable {
		cadastro.segundoNomePessoa("Silva");
	}

	@Quando("^digitar o telefone do usuario$")
	public void digitar_o_telefone_do_usuario() throws Throwable {
		cadastro.contato("987654321");
		action.press(PointOption.point(941, 1412)).moveTo(PointOption.point(925, 420)).release().perform();
	}

	@Quando("^escolher o pais do usuario$")
	public void escolher_o_pais_do_usuario() throws Throwable {
		cadastro.PaisOndeReside();
		cadastro.escolhePais();
		}

	@Quando("^digitar o estado do usuario$")
	public void digitar_o_estado_do_usuario() throws Throwable {
		cadastro.digitaEstado("SP");
	}

	@Quando("^digitar o endereco do usuario$")
	public void digitar_o_endereco_do_usuario() throws Throwable {
		cadastro.digitarEndereco("rua teste nova");
	}

	@Quando("^digitar o cep do usuario$")
	public void digitar_o_cep_do_usuario() throws Throwable {
		cadastro.digitarCodigo("7654321");
		action.press(PointOption.point(639, 1038)).moveTo(PointOption.point(605, 391)).release().perform();    
	}

	@Quando("^clicar em registrar$")
	public void clicar_em_registrar() throws Throwable {
		cadastro.Registrar();
	  
	}

	@Entao("^registrar cadastro do usuario com sucesso$")
	public void registrar_cadastro_do_usuario_com_sucesso() throws Throwable {
		Thread.sleep(5000);
		String voltoutelainicial = driver.findElementById("com.Advantage.aShopping:id/textViewAdvantage").getText();
		Assert.assertTrue(voltoutelainicial.contains("Advantage"));
		
	}

	@Quando("^digitar o nome$")
	public void digitar_o_nome() throws Throwable {
	    cadastro.digitarNome("Juliana");
	}

	@Quando("^digitar o email$")
	public void digitar_o_email() throws Throwable {
	 cadastro.digitaEmail("juliana.silva@teste.com.br");
	}

	@Quando("^digitar senha$")
	public void digitar_senha() throws Throwable {
		cadastro.digitaSenha("1213Ju");
	 
	}

	@Quando("^confirma senha$")
	public void confirma_senha() throws Throwable {
	   cadastro.confirmarSenha("1213Ju");
	}

	@Quando("^digitar o primeiro nome$")
	public void digitar_o_primeiro_nome() throws Throwable {
	cadastro.primeiroNomePessoa("Juliana");
	}

	@Quando("^digitar o ultimo nome$")
	public void digitar_o_ultimo_nome() throws Throwable {
	 cadastro.segundoNomePessoa("Silva");
	}

	@Quando("^digitar o telefone$")
	public void digitar_o_telefone() throws Throwable {
	   cadastro.contato("987654-321");
	   action.press(PointOption.point(941, 1412)).moveTo(PointOption.point(925, 420)).release().perform();
	}

	@Quando("^escolher o pais$")
	public void escolher_o_pais() throws Throwable {
	  cadastro.PaisOndeReside();
	  cadastro.escolhePais();
	}

	@Quando("^digitar o estado$")
	public void digitar_o_estado() throws Throwable {
	  cadastro.digitaEstado("SP");
	}

	@Quando("^digitar o endereco$")
	public void digitar_o_endereco() throws Throwable {
	cadastro.digitarEndereco("Rua teste nova");
	}

	@Quando("^digitar o cep$")
	public void digitar_o_cep() throws Throwable {
		cadastro.digitarCodigo("7654-321");
		action.press(PointOption.point(639, 1038)).moveTo(PointOption.point(605, 391)).release().perform();   
	}

	@Quando("^clicar em registrar o usuario$")
	public void clicar_em_registrar_o_usuario() throws Throwable {
	  cadastro.Registrar();
	}

	@Entao("^registrar nome sem sucesso$")
	public void registrar_nome_sem_sucesso() throws Throwable {
	String registerv = driver.findElementById("com.Advantage.aShopping:id/buttonRegister").getText();
	Assert.assertTrue(registerv.contains("REGISTER"));
	}


}