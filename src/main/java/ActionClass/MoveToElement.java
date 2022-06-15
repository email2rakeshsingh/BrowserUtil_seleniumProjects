package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		WebElement eli = driver.findElement(By.className("menulink"));
		Actions act = new Actions(driver);
		act.moveToElement(eli).perform();
		Thread.sleep(4000);

		driver.findElement(By.linkText("COURSES")).click();

	}

}
