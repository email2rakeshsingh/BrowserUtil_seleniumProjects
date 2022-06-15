package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ActionsClassSendKey {
	static WebDriver driver;
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		 By FirstName=  By.id("Form_submitForm_FirstName");
		 
		 Actions act = new Actions(driver);
		 
		 act.sendKeys(driver.findElement(FirstName), "Rakesh Singh").perform();
		

	}

}
