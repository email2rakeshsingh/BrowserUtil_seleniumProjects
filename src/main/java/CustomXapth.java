import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXapth {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("((//div[@class='navFooterLinkCol navAccessibility']/ul)[last()]/li)[last()]/a")).click();
		driver.get("https://www.bigbasket.com/");
		
//		Thread.sleep(4000);
//	   driver.
//	   findElement
//	   (By.xpath("//img[contains(@src,'https://cdn.45tu1c0.com/account/74042/200/1521228087176.jpg')] ")).click();

		// HtmlTag [@attr='value']
		//((//div[@class='navFooterLinkCol navAccessibility']/ul)[last()]/li)[last()]/a
	   
//	   driver.
//	   findElement
//	   (By.xpath
//	   ("//img[contains(@src,'https://static-02.veve.com/48x48/9dbe6edb2e96ae51.png')]"))
//	   .click();
//	   
//	   driver.
//	   findElement
//	   (By.xpath
//			   ("//img[contains (@src, 'https://static-02.veve.com/48x48/0c02d002b81a0937.png')]"))
//	   .click();
		
		
		driver.findElement(By.xpath("//input [contains(@id,'input') and @qa='searchBar']")).click();

	}

}
