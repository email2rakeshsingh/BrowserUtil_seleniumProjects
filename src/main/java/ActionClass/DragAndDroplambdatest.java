package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class DragAndDroplambdatest {
	
	   static  WebDriver driver;

	public static void main(String[] args) {
		
		ChromeDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/drag-and-drop-demo");
		
		Actions act = new Actions(driver);
		
	

	}

}
