package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasket {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");

		doProductcatogerySearch("Foodgrains, Oil & Masala", "Rice & Rice Products", "Poha, Sabudana & Murmura", "Rice");

	}
	public static void doProductcatogerySearch(String l1,String l2,String l3,String l4) throws InterruptedException {
		WebElement ele = driver.findElement(By.cssSelector("a.meganav-shop"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(1500);
		act.moveToElement(driver.findElement(By.linkText(l1))).perform();
		Thread.sleep(1500);
		act.moveToElement(driver.findElement(By.linkText(l2))).perform();
		Thread.sleep(1500);
		act.moveToElement(driver.findElement(By.linkText(l3))).perform();
		Thread.sleep(1500);
		act.moveToElement(driver.findElement(By.linkText(l4))).click().build().perform();
	}
}
