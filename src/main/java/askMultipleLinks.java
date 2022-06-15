import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class askMultipleLinks {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ask.com/");
		List<WebElement> List = driver.findElements(By.tagName("a"));
		System.out.println("List of ask :" + List.size());

//		for (int i = 0; i < List.size(); i++) {
//			String text = List.get(i).getText();
//			String hrefv = List.get(i).getAttribute("href");
//
//			if (!text.isEmpty()) {
//				System.out.println(text + ":" + hrefv);
//			}
//
//		}

		for (WebElement e : List) {
			String list = e.getText();
			String hrefv = e.getAttribute("href");
			System.out.println(list + ":" + hrefv);

		}
	}

}
