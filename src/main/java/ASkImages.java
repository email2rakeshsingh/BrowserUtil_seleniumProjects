import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ASkImages {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ask.com/");
		List<WebElement> askimages = driver.findElements(By.tagName("img"));
		System.out.println(askimages.size());

		for (WebElement e : askimages) {

			String alt1 = e.getAttribute("alt");
			String src1 = e.getAttribute("src");
			
			System.out.println(alt1);
			System.out.println(src1);

		}

	}

}
