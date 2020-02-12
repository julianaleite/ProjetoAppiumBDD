package br.com.rsinet.hub.Appium.stepDefinition;


import java.io.File;
import java.net.MalformedURLException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.cucumber.listener.Reporter;

import br.com.rsinet.hub.Appium.managers.DriverManager;
import br.com.rsinet.hub.Appium.managers.Generator;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Hooks {

	
	 public AndroidDriver<MobileElement> driver;
	 public ExtentReports entent;
	 public ExtentTest logger;
	 public Reporter report;
	    
	    
	    public Hooks() {
	        this.driver = driver;
	        
	    }
	        @After(order =0)
	        public void finaliza() {

	        	DriverManager.fecharDriver();
	        }

	     

	        @After(order = 1)
	        public void finalizarreport(Scenario scenario) throws Exception, MalformedURLException {
	            
	            File screenshot = ((TakesScreenshot)DriverManager.ConfiguraDriver() ).getScreenshotAs(OutputType.FILE);
	            String caminho = System.getProperty("user.dir") + "/cucumber-reports/screenshots/" + scenario.getName() + "-"
	                    + Generator.dataHoraParaArquivo() + ".png";
	            try {
	                FileUtils.copyFile(screenshot, new File(caminho));
	                Reporter.addScreenCaptureFromPath(caminho.toString());
	            } catch (Exception e) {
	                System.out.println("Houveram problemas ao copiar o arquivo para a pasta" + e.getMessage());
	            }

	    }
	    

}
