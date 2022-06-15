package relativelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkandRadioButoon {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");

		WebElement ele = driver.findElement(By.xpath("//label [ text()= 'Subscribe']"));
		System.out.println(ele);

		driver.findElement(with(By.tagName("input")).toRightOf(ele)).click();

		WebElement ele1 = driver.findElement(By.cssSelector(".btn.btn-primary"));
		System.out.println(ele1);

		driver.findElement(with(By.tagName("input")).toLeftOf(ele1)).click();

	}

}
