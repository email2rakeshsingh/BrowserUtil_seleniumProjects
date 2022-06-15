package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasketCatiteration {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");

		WebElement obj = driver.findElement(By.cssSelector("a.meganav-shop"));

		Actions act = new Actions(driver);
		act.moveToElement(obj).perform();
		Thread.sleep(4000);

		List<WebElement> level1List = driver.findElements(
				By.xpath("//ul[@class='nav nav-tabs nav-stacked col-md-3 bdr-viewall' and @id ='navBarMegaNav']//li"));
		for (WebElement e : level1List) {
			act.moveToElement(e).perform();
			System.out.println(e.getText());

			List<WebElement> level2List = driver
					.findElements(By.xpath("(//ul[contains(@class,'nav-stacked')])[4]//li"));
			for (WebElement e1 : level2List) {

				act.moveToElement(e1).perform();
				System.out.println(e1.getText());
				
				List<WebElement>level3List=driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[3]/li"));
				
				for (WebElement e2 : level3List) {
					act.moveToElement(e2);
					System.out.println(e2.getText());
					
				}
			}
		}

	}

}
