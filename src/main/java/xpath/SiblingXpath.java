package xpath;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SiblingXpath {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page");
		// driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input")).click();

//		String xpath = "//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input";
//
//		driver.findElement(By.xpath(xpath)).click();

		selectUser("Joe.Root");
		selectUser("Garry.White");
		selectUser("Kevin.Mathews");
		
		getUserData("Joe.Root");

	}

	public static void selectUser(String name) {
		String xpath = "//a[text()='" + name + "']/parent::td/preceding-sibling::td/input";
		driver.findElement(By.xpath(xpath)).click();

	}

	public static List<String> getUserData(String name) {
		List<WebElement> colLEle = driver
				.findElements(By.xpath("//a[text()='Joe.Root']/parent::td/following-sibling::td"));
		List<String> collist = new ArrayList<String>();
		for (WebElement e : colLEle) {
			String text = e.getText();
			collist.add(text);

		}
		return collist;
	}

}
