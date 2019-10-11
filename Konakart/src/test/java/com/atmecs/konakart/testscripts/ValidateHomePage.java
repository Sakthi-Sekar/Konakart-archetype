package com.atmecs.konakart.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.konakart.testbase.InvokeBrowser;
import com.atmecs.konakart.utils.PageActions;
import com.atmecs.konakart.utils.ValidateTestResult;

import junit.framework.Assert;

public class ValidateHomePage extends InvokeBrowser {
	@Test(priority = 2)
	public void validationLogo() {
		Xpath = read.readPropertiesFile("loc.validate.logo.xpath");
		boolean logoPresent = driver.findElement(By.xpath(Xpath)).isDisplayed();
		log.info("Image is present");

	}

	@Test(priority = 3)
	public void validateTitleOfBrowswer() {
		String title = driver.getTitle();
		ValidateTestResult.validateData(title, "Konakart", "No match");
		log.info("Title matches");
	}

	@Test(priority = 4)
	public void validateDropDown() {
		Xpath = read.readPropertiesFile("loc.validate.dropdown.xpath");
		String dropdown = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(dropdown, "textvalue", "Value not matched");

	}

	@Test(priority = 5)
	public void validateTabsHomePage() {
		// Validation of landing page using url
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.konakart.com/konakart/Welcome.action");
		log.info("Landed into correct page");
		// validation of tabs in homepage using breadcrumbs(dynamic xpath is used)
		Xpath = read.readPropertiesFile("loc.click.tab.computer.xpath");
		PageActions.clickOnElement(driver, Xpath);

		Xpath = read.readPropertiesFile("loc.validate.computer.breadcrumb.xpath");
		String computerbreadcrumb = driver.findElement(By.xpath(Xpath)).getText();
		ValidateTestResult.validateData(computerbreadcrumb, "ComputerBreadcrumb", "No match");

	}

}
