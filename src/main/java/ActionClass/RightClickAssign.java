package ActionClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickAssign {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement eliment = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act = new Actions(driver);
		act.contextClick(eliment).perform();

		List<WebElement> elimentlist = driver.findElements(By
				.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"));

		for (WebElement e : elimentlist) {
			// System.out.println(e.getText());

			String text = e.getText();
			if (text.equals("Copy")) {
				e.click();
				driver.switchTo().alert().accept();
				
				} else if (text.equals("Edit")) {
				e.click();
				driver.switchTo().alert().accept();
			}

		}

	}
}
