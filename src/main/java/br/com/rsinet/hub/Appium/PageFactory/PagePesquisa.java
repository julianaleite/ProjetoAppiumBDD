package br.com.rsinet.hub.Appium.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PagePesquisa {

	public WebElement elemento;
	public WebDriver driver;

	public void HomeScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewSearch")
	private WebElement clicarLupa;
	
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/editTextSearch")
	private WebElement escreverSearch;
	
	@FindBy(how = How.XPATH, using = "//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[2]")
	private WebElement clicarnoTablet;
	

public void ClicarNAlupa() {
	clicarLupa.click();
	
}
public void EscreverNoCampoPesquisa(String produto) {
	escreverSearch.sendKeys(produto);
}
public void ClicarNoProduto() {
	clicarnoTablet.click();
}
}
