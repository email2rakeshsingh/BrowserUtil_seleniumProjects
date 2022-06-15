package xpath;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableHandel {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");

//		driver.findElement(By.xpath(
//				"//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@id='ohrmList_chkSelectRecord_21']"))
//				.click();

//		String xpath = "//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input";
//		driver.findElement(By.xpath(xpath)).click();

		selectUser("Garry.White");
		selectUser("John.Smith");
		selectUser("Joe.Root");
		selectUser("Jasmine.Morgan");

		//// a[text()='Joe.Root']/../following-sibling::td

		System.out.println(getUserdata("Joe.Root"));
		System.out.println(getUserdata("Garry.White"));

	}

	public static List<String> getUserdata(String name) {

		System.out.println("User name is :" + name);

		List<WebElement> colele = driver.findElements(By.xpath("//a[text()='" + name + "']/../following-sibling::td"));
		List<String> colList = new ArrayList<String>();
		for (WebElement e : colele) {
			String text = e.getText();
			colList.add(text);

		}
		return colList;

	}

	public static void selectUser(String name) {
		String xpath = "//a[text()='" + name + "']/parent::td/preceding-sibling::td/input";
		driver.findElement(By.xpath(xpath)).click();

	}

}
