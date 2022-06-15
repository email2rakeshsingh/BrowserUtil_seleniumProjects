package MyTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCart extends BaseTest {

	@Test(priority = 1)
	public void titleTest() {
		String Title = driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "Account Login");

	}

	@Test(priority = 2)
	public void searchBoxTest() {
		// driver.findElement(By.name("search")).isDisplayed();
		Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());
	}

	@Test(priority = 3)
	public void addTocartTest() {
		Assert.assertTrue(driver.findElement(By.id("cart-total")).isDisplayed());
	}

	@Test(priority = 4)
	public void LoginLinkTest() {
		WebElement Loginlink = driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Login']"));
		System.out.println("Login link is displayed :" + Loginlink);
		Assert.assertTrue(Loginlink.isDisplayed());
	}

}
