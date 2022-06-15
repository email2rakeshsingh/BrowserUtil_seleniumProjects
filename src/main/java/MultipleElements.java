import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleElements {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> Linklist = driver.findElements(By.tagName("a"));
		System.out.println("Total Links :" + Linklist.size());

//		for (int i = 0; i < Linklist.size(); i++) {
//			String text = Linklist.get(i).getText();
//			String hrefv= Linklist.get(i).getAttribute("href");
//			if (!text.isEmpty()) {
////				System.out.println(text + ": " + hrefv);
//			}
//
//		}
		for (WebElement e : Linklist) {
			String textv = e.getText();
			String hrefv = e.getAttribute("href");
			System.out.println(textv + ":" + hrefv);

		}
	}

}
