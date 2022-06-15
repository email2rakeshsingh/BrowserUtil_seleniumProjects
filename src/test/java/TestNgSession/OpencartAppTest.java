package TestNgSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpencartAppTest extends BaseTest2 {
	//WebDriver driver;

//	@BeforeTest
//	public void setUp() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		//driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.get("https://demo.opencart.com/index.php?route=account/login");
//
//	}

	@Test(priority = 1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login");
	}

	@Test(priority = 2)
	public void UrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("Page url test :" + url);
		Assert.assertTrue(url.contains("route=account/login"));
	}
	@Test(priority = 3)
	public void HeaderTest() {
		Boolean flag=driver.findElement(By.xpath("//a[text()='Your Store']")).isDisplayed();
		System.out.println("Page headr of page :"+ flag);
		Assert.assertTrue(flag);
		
	}
	@Test(priority = 4)
	public void lebelTest() {
//	Boolean level=driver.findElement(By.xpath("//h2[text()='New Customer']")).isDisplayed();
//	Assert.assertTrue(level);
	
	WebElement level1=driver.findElement(By.xpath("//h2[text()='New Customer']"));
	System.out.println("Page lebel test :"+ level1);
	Assert.assertTrue(level1.isDisplayed());
	}
	
	@Test(priority = 5)
	public void LoginLinkTest() {
		WebElement login =driver.findElement(By.className("list-group-item"));
		System.out.println("Verify login link :"+ login);
		Assert.assertTrue(login.isDisplayed());
	}
	
	@Test(priority = 6)
	public void EMailAddress(){
		WebElement userid=driver.findElement(By.id("input-email"));
		System.out.println("verify user id :"+ userid);
		Assert.assertTrue(userid.isEnabled());
		
	}
	
	@Test(priority = 7)
	public void button() {
		WebElement btn=driver.findElement(By.xpath("//input[@type='submit']"));
		System.out.println("verify button :"+ btn);
		Assert.assertTrue(btn.isDisplayed());
	}
	@Test(priority = 8)
	public void searchTest() {
		Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());
	}

//	@AfterTest
//	public void tearDown() {
//		driver.close();
//	}
}
