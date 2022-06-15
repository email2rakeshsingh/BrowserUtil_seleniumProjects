import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglesearchbySingleclicking {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("mobile");
		Thread.sleep(4000);
		driver.findElement(
				By.xpath("//ul[@role='listbox']//li//div[@class='wM6W7d']/span[contains(text(),'mobile')]"))
				.click();
		
//		driver.findElement(
//				By.xpath("//ul[@role='listbox']//li//div[@class='wM6W7d']/span[contains(text(),'mobile cover')]"))
//				.click();

	}

}
