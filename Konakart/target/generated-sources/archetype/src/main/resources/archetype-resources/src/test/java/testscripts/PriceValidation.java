#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.testscripts;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ${package}.testbase.InvokeBrowser;
import ${package}.utils.PageActions;
import ${package}.utils.ValidateTestResult;

public class PriceValidation extends InvokeBrowser {
	@Test(priority = 2)
	public void clickOnHeaders() {
		Xpath = read.readPropertiesFile("loc.headers.computerperipherals.xpath");
		PageActions.clickOnElement(driver, Xpath);
	}

	@Test(priority = 5)
	public static void slider() {
		int x = 10;
		WebElement slider = driver
				.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
		int width = slider.getSize().getWidth();
		Actions move = new Actions(driver);
		move.moveToElement(slider, ((width * x) / 10), 0).click();
		move.build().perform();
		System.out.println("Slider moved");
	}

	@Test(priority = 6)
	public static void validateproduct() {
		String actualproduct = driver.findElement(By.xpath("//a[text()='Bundle Saver']")).getText();
		String expectedproduct = "Bundle Saver";
		ValidateTestResult.validateData(actualproduct, expectedproduct, "actual not equal to expected");
		log.info("Successfully validated product");
	}

}
