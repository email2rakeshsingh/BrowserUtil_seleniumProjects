package TestNgSession;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExceptionHandling extends BaseTest2 {

	//WebDriver driver;

	public String name = "Rakesh";

//	@BeforeMethod
//	public void setup() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		//driver.get("https://www.amazon.in/");
//
//	}

	@Test(priority = 1)
	public void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

	}

	@Test(priority = 2)
	public void searchBox() {
		Assert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isDisplayed());

	}

	@Test(expectedExceptions = ArithmeticException.class)
	public void ProductSerchTest() {
		System.out.println("iphone");
		int i = 9 / 0;

	}

	@Test(expectedExceptions = NullPointerException.class)
	public void LogoTest() {
		ExceptionHandling obj = new ExceptionHandling();
		obj = null;
		System.out.println(obj.name);

	}

//	@AfterMethod
//	public void tearDown() {
//		driver.close();
//
//	}

}
