#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ${package}.testbase.InvokeBrowser;
import ${package}.utils.PageActions;

public class FourthScenario extends InvokeBrowser {
	@Test(priority = 2)
	public static void fourthscenario() {
		driver.findElement(By.xpath("(//a[@class='menu-item rounded-corners'])[1]")).click();
		for (int x = 10; x <= 100; x += 10) {
		
			if (x == 10) {
				PageActions.slider();
				// ValidationTestResult.validateproduct();
			}
			if (x == 20) {
				PageActions.slider();
				// ValidationTestResult.validateproduct();
			}
			if (x == 30) {
				PageActions.slider();
				// ValidationTestResult.validateproduct();
			}
			if (x == 40) {
				PageActions.slider();
				// ValidationTestResult.validateproduct();
			}
			if (x == 50) {
				PageActions.slider();
				// ValidationTestResult.validateproduct();
			}
			if (x == 60) {
				PageActions.slider();
				// ValidationTestResult.validateproduct();
			}
			if (x == 70) {
				PageActions.slider();
				// ValidationTestResult.validateproduct();
			}
			if (x == 80) {
				PageActions.slider();
				// ValidationTestResult.validateproduct();
			}
			if (x == 90) {
				PageActions.slider();
				// ValidationTestResult.validateproduct();
			}
			if (x == 100) {
				PageActions.slider();
				// ValidationTestResult.validateproduct();
			}
		}
	}
}
