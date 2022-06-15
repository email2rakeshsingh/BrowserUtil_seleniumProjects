import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpencartLink {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new  ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		By TextFields = By.className("form-control");
		ElementUtil util= new ElementUtil(driver);
		int textfildcount = util.getElementsCount(TextFields);
		System.out.println(textfildcount);
		
		
		
	

	}

}
