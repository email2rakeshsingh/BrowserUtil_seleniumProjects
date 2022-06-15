package MyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;

	@BeforeTest
	@Parameters({"browser","url"})
	public void setup(String browserName, String AppURL) {
		
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
//		else if (browserName.equalsIgnoreCase("ie")) {
//			WebDriverManager.iedriver().setup();
//			driver = new InternetExplorerDriver();
//			
//		}
		else if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
		}
		else {
			System.out.println("Pass the correct browser name :"+browserName);
		}
		
		driver.get(AppURL);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	}

	@AfterTest
	public void tearDown() {
	//	driver.close();

	}

}
