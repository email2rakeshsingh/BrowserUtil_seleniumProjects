package SVGElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SvgElements1 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(5000);

		List<WebElement> statesList = driver.findElements(By.xpath(
				"//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='states']//*[name()='g']//*[name()='path']"));
		System.out.println(statesList.size());

		Actions act = new Actions(driver);
		for (WebElement e : statesList) {
			act.moveToElement(e).perform();
			String name = e.getAttribute("name");
			System.out.println(name);
			if (name.equals("Maryland")) {
				act.click(e).perform();

				break;
			}
		}

		Thread.sleep(4000);

		List<WebElement> regionList = driver.findElements(By.xpath(
				"//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='maryland']//*[name()='g' and @class='counties']/*[name()='path']"));

		for (WebElement e : regionList) {
			act.moveToElement(e).perform();
			Thread.sleep(1500);
			String text = driver.findElement(By.cssSelector("div.tooltip-text")).getText();
			System.out.println(text);
		}

	}

}
