package relativelocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class RelativelocatorsSelenium4 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");

		WebElement ele = driver.findElement(By.linkText("Sooke, Canada"));

		String right = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(right);

		String left = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(left);

		String avobe = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(avobe);
		
		String near= driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(near);

	}

}
