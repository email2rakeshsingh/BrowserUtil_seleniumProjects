package SVGElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Emipaymentscharts {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://emicalculator.net/");

		List<WebElement> chartList = driver
				.findElements(By.xpath("(//*[name()='rect'][@class='highcharts-point'])[contains(@opacity,'1')]"));

		// "//*[local-name()='svg' and @class='highcharts-root']//*[name()='g' and
		// @class='highcharts-series highcharts-series-0 highcharts-column-series
		// highcharts-tracker']//*"));

		System.out.println(chartList.size());
		Actions act = new Actions(driver);

		for (WebElement e : chartList) {
			Thread.sleep(500);
			act.moveToElement(e).perform();
			String name = e.getAttribute("class");
			System.out.println(name);

		}

	}

}
