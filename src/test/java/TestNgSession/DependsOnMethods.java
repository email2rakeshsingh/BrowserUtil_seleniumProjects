package TestNgSession;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods extends BaseTest2{

//	WebDriver driver;
//
////	@BeforeMethod
////	public void setup() {
////		WebDriverManager.chromedriver().setup();
////		driver = new ChromeDriver();
////		driver.manage().deleteAllCookies();
////		driver.manage().window().maximize();
////		//driver.get("https://www.consumersearch.com/");
//
//	//}

	@Test(priority = 1)
	public void searchProduct() {
		String title = driver.getTitle();
		System.out.println("page title :" + title);
		Assert.assertEquals(title, "ConsumerSearch.com - What's Your Question?");
		//int i=9/0; dependent test case 
	}

	@Test(dependsOnMethods = "searchProduct")
	public void addTocart() {
		System.out.println("product add to cart");

	}

	@Test(dependsOnMethods = "searchProduct")
	public void checkOut() {
		System.out.println("chkout the products ");

	}

//	@AfterMethod
//	public void tearDown() {
//
//	}
}
