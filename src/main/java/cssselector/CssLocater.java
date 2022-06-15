package cssselector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssLocater {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
//		driver.findElement(By.cssSelector("#input-email.form-control")).sendKeys("rakesh@gmail.com");
//		driver.findElement(By.cssSelector("input#input-password.form-control")).sendKeys("Rak@123");
//	    driver.findElement(By.cssSelector("input.action#Form_submitForm_action_request")).click();
//      driver.findElement(By.cssSelector("input[id='input-firstname'][class='form-control']")).sendKeys("Rakesh singh");
//		driver.findElement(By.cssSelector("input[id='Form_submitForm_FirstName'][class='text required'][type='text']")).sendKeys("Rakesh");

//		driver.findElement(By.cssSelector("input[id*='username']")).sendKeys("email2rakesh@gmail.com");
//		driver.findElement(By.cssSelector("input[class*='form-control'][id='password']")).sendKeys("Rak@123");
//		driver.findElement(By.cssSelector("input[class^='form-control'][id='username']")).sendKeys("rakesh");
//		driver.findElement(By.cssSelector("input[class$='login-email']")).sendKeys("rakeshsingh");

//		List<WebElement> AllLinks = driver.findElements(By.cssSelector("div.navFooterVerticalRow a"));
//		for (WebElement e : AllLinks) {
//			
//			e.getText();
//
//		
//
//		}

//		List<WebElement> allLink = driver.findElements(By.cssSelector("ul.footer-nav>li:nth-of-type(n)"));
//		for (WebElement e : allLink) {
//			System.out.println(e.getText());
		
		List <WebElement> AllList=driver.findElements(By.cssSelector("input#Form_submitForm_FirstName,[name=LastName],#Form_submitForm_Email, [name='Contact'],#Form_submitForm_action_request"));
		System.out.println(AllList.size());

		}
	 

	}


