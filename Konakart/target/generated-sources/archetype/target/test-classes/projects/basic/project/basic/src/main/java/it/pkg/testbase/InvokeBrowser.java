package it.pkg.testbase;

import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import it.pkg.constants.ConstantPaths;
import it.pkg.reports.LogReports;
import it.pkg.utils.ReadPropertiesFile;
import it.pkg.utils.ValidateTestResult;

@Test(priority = 1)
public class InvokeBrowser {
	public static LogReports log = new LogReports();
	public static WebDriver driver;
	Properties config = new Properties();
	protected ReadPropertiesFile read = new ReadPropertiesFile();
	protected String Xpath;
	protected ValidateTestResult validate = new ValidateTestResult();

//To invoke the chrome browser by  URL

	public void setup() throws IOException {

		System.setProperty("webdriver.chrome.driver", ConstantPaths.CHROME_FILE);
		driver = new ChromeDriver();
		log.info("Browser invoked...");
		driver.get(read.readPropertiesFile("url"));
		log.info("Application opened...");
		driver.manage().window().maximize();
	}

}