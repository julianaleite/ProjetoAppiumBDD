package br.com.rsinet.hub.Appium.runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature", glue = { "br.com.rsinet.hub.Appium.stepDefinition" }
, tags = {"@tag5, @tag6" },

		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:cucumber-reports/report.html" }, monochrome = true)

public class TestRunner {

	@AfterClass
	public static void writeExtentReport() {

		Reporter.loadXMLConfig(new File("config/extension-config.xml"));

		Reporter.setSystemInfo("User Name", System.getProperty("juliana.silva"));

		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));

	}
}
