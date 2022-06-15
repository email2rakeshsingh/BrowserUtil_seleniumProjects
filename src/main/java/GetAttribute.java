import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");
//		String place = driver.findElement(By.id("Form_submitForm_Email")).getAttribute("placeholder");
//		System.out.println(place);
//
//		driver.findElement(By.id("Form_submitForm_Name")).sendKeys("Rakesh");
//		String value = driver.findElement(By.id("Form_submitForm_Name")).getAttribute("value");
//		System.out.println(value);

		// create utility

		By email = By.id("Form_submitForm_Email");
		By name = By.id("Form_submitForm_Name");

		System.out.println(dogetAttribute(email, "placeholder"));
		doSendKey(name, "Rakesh");
		System.out.println(dogetAttribute(name, "value"));
		
		if (doisDisplayed(email)) {
			System.out.println("true");
			
		}

	}
	
	public static boolean doisDisplayed(By locator) {
		return getElement(locator).isDisplayed();		
		
	}

	public static void doSendKey(By locater, String value) {
		getElement(locater).sendKeys(value);
	}

	public static String dogetAttribute(By locator, String attributrName) {
		return getElement(locator).getAttribute(attributrName);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

}
