package MyTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import TestNgSession.ExceptionHandling;

public class Amazon extends BaseTest {

	String name = "Rakesh";

	@Test(invocationCount = 2)
	public void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

	}

	@Test(invocationCount = 3)
	public void searchBox() {
		Assert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isDisplayed());

	}

	@Test(expectedExceptions = ArithmeticException.class, invocationCount = 2)
	public void ProductSerchTest() {
		System.out.println("iphone");
		int i = 9 / 0;

	}

	@Test(expectedExceptions = NullPointerException.class, invocationCount = 3)
	public void LogoTest() {
		ExceptionHandling obj = new ExceptionHandling();
		obj = null;
		System.out.println(obj.name);

	}

}
