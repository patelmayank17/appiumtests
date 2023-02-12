package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

/** Tests the CalculatorPage class.
 *  @author Mayank Patel
 *   * @version 02/11/2023
 **/
public class CalculatorPage { 
	
	private static WebElement element = null;

	public static WebElement one(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01"));
		return element;
	}

	public static WebElement two(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02"));
		return element;
	}
	

	public static WebElement three(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03"));
		return element;
	}
	
	public static WebElement four(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_04"));
		return element;
	}
	
	public static WebElement five(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05"));
		return element;
	}
	
	public static WebElement six(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_06"));
		return element;
	}
	
	public static WebElement seven(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07"));
		return element;
	}
	
	public static WebElement eight(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_08"));
		return element;
	}
	
	public static WebElement nine(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09"));
		return element;
	}

	public static WebElement zero(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_00"));
		return element;
	}
	
	
	public static WebElement plusSign(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add"));
		return element;
	}
	
	public static WebElement minusSign(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_sub"));
		return element;
	}
	
	public static WebElement multificationSign(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_mul"));
		return element;
	}
	
	public static WebElement divisionSign(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_div"));
		return element;
	}
	
	public static WebElement percentageSign(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_percentage"));
		return element;
	}
	
	public static WebElement parenthesisSign(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_parenthesis"));
		return element;
	}
	
	public static WebElement clearSign(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_clear"));
		return element;
	}
	
	public static WebElement dotSign(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_dot"));
		return element;
	}
	
	public static WebElement plusMinusSign(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_plusminus"));
		return element;
	}
		
	public static WebElement equalTo(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
		return element;
	}	

	public static WebElement resultTextBox(AndroidDriver driver) {
		element = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));
		return element;
	}
}