import java.security.PublicKey;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreshworksFooter {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");

		By footer = By.xpath("//ul[@class='footer-nav']//a");
		ClickonElimentfromsection(footer, "GDPR");

	}

	public static void ClickonElimentfromsection(By locator, String value) {
		List<WebElement> elelist = driver.findElements(locator);
		System.out.println(elelist.size());

		for (WebElement e : elelist) {
			String text = e.getText();
			System.out.println(text);

			// if (text.equals(value)) {
			if (text.contains(value)) {
				e.click();
				break;
			}
		}

	}

}
