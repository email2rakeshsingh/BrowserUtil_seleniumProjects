package TestNgSession;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaePrortiesTest extends BaseTest2{

	//WebDriver driver;

//	@BeforeMethod
//	public void setup() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
	//}
	@Test(priority = -1)
	public void pageTitleTest() {
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		Assert.assertEquals(pageTitle, "Sign Up for a Free HR Software Demo | OrangeHRM");
	}
	@Test(priority = 0)
	public void TestUrlTest() {
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		Assert.assertTrue(currentURL.contains("hris-hr-software-demo/"));
	}
	@Test(enabled = true,priority = 1)
	public void LogoTest() {
		Assert.assertTrue(driver.findElement(By.cssSelector("img.nav-logo")).isDisplayed());
	}
	@Test(priority = 2)
	public void footerLink() {
	boolean footerlink=driver.findElement(By.xpath("//a[text()='Our Offices']")).isDisplayed();
	System.out.println("Footer link :"+footerlink);
	Assert.assertTrue(footerlink);
	}
//	@AfterMethod
//	public void tearDown() {
//		driver.close();
//
//	}

}
