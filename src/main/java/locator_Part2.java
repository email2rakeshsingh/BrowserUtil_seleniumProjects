import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.xml.sax.Locator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locator_Part2 {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

//		//1 by name 
//		driver.findElement(By.name("email")).sendKeys("Rakesh@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Rak@1234");
//		
//		
//		//2nd by name
//		By name = By.name("email");
//		By password = By.name("password");
//		ElementUtil util = new ElementUtil(driver);
//		util.doSendKey(name, "Rakesh");
//		util.doSendKey(password, "Rak@1234");

		// 3rd class name
//		
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("email2rakesh@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Rak@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		// By Locoters

//		By email = By.xpath("//*[@id=\"input-email\"]");
//		By pwd = By.xpath("//*[@id=\"input-password\"]");
//		By button = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		By erroMessage = By.className("alert-danger");
//		
//		
//		doSendkey(email, "email@g,ail.com");
//		doSendkey(pwd, "rak@q123");
//		doClick(button);
//		String error = doTextMessage(erroMessage);
//		if (error.contains("Warning")) {
//			
//			System.out.println("correct error message ");
//		}
//		else {
//			System.out.println("Incorect message ");
//		}

// cssselectore : 

		// driver.findElement(By.linkText("Register")).click();
		// tagname

//		
//	By registerlink =	By.linkText("Register") ;
//	doClick(registerlink);
//	
//	By login =	By.linkText("Login") ;
//	doClick(login);

		String header = driver.findElement(By.tagName("h1")).getText();
		System.out.println("header");
	}

	public static String doTextMessage(By Locator) {
		return getElement(Locator).getText();

	}

	public static void doClick(By Locator) {
		getElement(Locator).click();
	}

	public static void doSendkey(By Locator, String values) {
		getElement(Locator).sendKeys(values);

	}

	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);

	}
}
