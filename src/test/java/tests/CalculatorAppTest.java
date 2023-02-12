package tests;

import static org.testng.Assert.assertEquals;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import pages.CalculatorPage;

/** Tests the CalculatorAppTest class.
 *  @author Mayank Patel
 *   * @version 02/11/2023
 **/

public class CalculatorAppTest {	  
	
	private static AndroidDriver driver;
	
	@BeforeSuite  
	public void setUp() throws InterruptedException, MalformedURLException{ 
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "Galaxy A54 5G");
			cap.setCapability("udid", "10.0.0.105:7777");
			cap.setCapability("platformName", "android" );
			cap.setCapability("platformVersion", "13" );
			cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
			cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator" );
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver(url, cap);		
	} 
	
	@AfterSuite
	public void tearDown() throws InterruptedException {
		 driver.quit();
	     Thread.sleep(1000);  
	} 
		 
	@Test 
	public static void additionTest() throws InterruptedException {
			Thread.sleep(1000);
			CalculatorPage.one(driver).click();
			CalculatorPage.seven(driver).click();
		
			CalculatorPage.plusSign(driver).click();
		
			CalculatorPage.three(driver).click();
		
			CalculatorPage.equalTo(driver).click();
			assertEquals(Integer.parseInt(CalculatorPage.resultTextBox(driver).getText()), 20);
			System.out.println("Addition Test Passed successfully.");
	}
		
	@Test
	public static void subtractionTest() throws InterruptedException {
			Thread.sleep(1000);
			CalculatorPage.clearSign(driver).click();
			
			CalculatorPage.nine(driver).click();
			CalculatorPage.two(driver).click();
		
			CalculatorPage.minusSign(driver).click();
		
			CalculatorPage.nine(driver).click();
			CalculatorPage.plusMinusSign(driver).click();
			CalculatorPage.parenthesisSign(driver).click();
		
			CalculatorPage.equalTo(driver).click();
			assertEquals(Integer.parseInt(CalculatorPage.resultTextBox(driver).getText()), 101);
			System.out.println("Subtraction Test Passed successfully.");
	}
		
	@Test
	public static void multiplicationTest() throws InterruptedException {
			Thread.sleep(1000);
			CalculatorPage.clearSign(driver).click();
			
			CalculatorPage.four(driver).click();
			CalculatorPage.zero(driver).click();
			CalculatorPage.six(driver).click();
		
			CalculatorPage.multificationSign(driver).click();
		
			CalculatorPage.eight(driver).click();
		
			CalculatorPage.equalTo(driver).click();
			assertEquals(CalculatorPage.resultTextBox(driver).getText(), "3,248");
			System.out.println("Multiplication Test Passed successfully.");
	}
	
	@Test
	public static void divisionTest() throws InterruptedException {
			Thread.sleep(1000);
			CalculatorPage.clearSign(driver).click();
			
			CalculatorPage.one(driver).click();
			CalculatorPage.five(driver).click();
			CalculatorPage.three(driver).click();
			CalculatorPage.dotSign(driver).click();
			CalculatorPage.five(driver).click();
		
			CalculatorPage.divisionSign(driver).click();
		
			CalculatorPage.two(driver).click();
		
			CalculatorPage.equalTo(driver).click();
			assertEquals(Float.parseFloat(CalculatorPage.resultTextBox(driver).getText()), 76.75);
			System.out.println("Division Test Passed successfully.");
	}
	 
	@Test
	public static void percentageTest() throws InterruptedException {
			Thread.sleep(1000);
			CalculatorPage.clearSign(driver).click();
			CalculatorPage.parenthesisSign(driver).click();
			CalculatorPage.five(driver).click();
			CalculatorPage.zero(driver).click();
			CalculatorPage.zero(driver).click();
			
			CalculatorPage.plusSign(driver).click();
			
			CalculatorPage.one(driver).click();
			CalculatorPage.zero(driver).click();
			CalculatorPage.percentageSign(driver).click();
			CalculatorPage.parenthesisSign(driver).click();
			
			CalculatorPage.equalTo(driver).click();
			assertEquals(CalculatorPage.resultTextBox(driver).getText(), "550");				
			System.out.println("Percentage Test Passed successfully.");			
	}
}