import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpencartList {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		// OR
		By rightList = By.xpath("//aside[@id=\"column-right\"]//a");
		// printAllelementstext(rightList);
		List<String> actList = getElimentsTextList(rightList);
		System.out.println(actList);

		if (actList.contains("Register")) {
			System.out.println("pass");

		}

		// Calling method using object

//		ElementUtil list = new ElementUtil(driver);
//		list.ClickonElimentfromsection(rightList, "Register");
//		list.doTextMessage(rightList);

	}

	public static int getElementsListCount(By Locator) {
		return driver.findElements(Locator).size();

	}

	public static List<String> getElimentsTextList(By locator) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = driver.findElements(locator);

		for (WebElement e : eleList) {
			String text = e.getText();
			eleTextList.add(text);

		}
		return eleTextList;
	}

	public static void printAllelementstext(By locator) {
		List<WebElement> eleList = driver.findElements(locator);

		for (WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text);

		}
	}
}
