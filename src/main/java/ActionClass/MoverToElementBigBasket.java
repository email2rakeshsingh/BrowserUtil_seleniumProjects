package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoverToElementBigBasket {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");

		WebElement ele = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']"));
		Actions big = new Actions(driver);
		big.moveToElement(ele).build().perform();
		Thread.sleep(4000);

		WebElement eli1 = driver.findElement(By.xpath("//*[@id=\"navBarMegaNav\"]/li[8]/a"));
		Actions big1 = new Actions(driver);
		big1.moveToElement(eli1).build().perform();
		Thread.sleep(4000);
		
		WebElement eli2 = driver.findElement(By.xpath("//a[@class='ng-binding l2select'])[1]"));
		Actions big2 = new Actions(driver);
		big2.moveToElement(eli2).build().perform();

	}

}
