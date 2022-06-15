package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasket2nd {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		//WebElement obj=driver.findElement(By.cssSelector("a.meganav-shop"));
		
		doProductCategryLevelSearch("a.meganav-shop", "Fruits & Vegetables", "Fresh Fruits", "Apples & Pomegranate", "Banana");

	}
       public static void doProductCategryLevelSearch(String l1,String l2,String l3,String l4,String l5) throws InterruptedException {
    	   Actions act= new Actions(driver);
   		Thread.sleep(2000);
   		act.moveToElement(driver.findElement(By.cssSelector(l1))).perform();
   		Thread.sleep(2000);
   		act.moveToElement(driver.findElement(By.linkText(l2))).perform();
   		Thread.sleep(2000);
   		act.moveToElement(driver.findElement(By.linkText(l3))).perform();
   		Thread.sleep(2000);
   		act.moveToElement(driver.findElement(By.linkText(l4))).perform();
   		Thread.sleep(2000);
   		act.moveToElement(driver.findElement(By.linkText(l5))).click().build().perform();
   		
	}
}
