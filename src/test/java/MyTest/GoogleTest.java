package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	@Test(priority = 1)
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("Google title page :" + title);
		Assert.assertEquals(title, "Google");

	}

	@Test(priority = 2)
	public void GoogleUrlTest() {

		String CurrentURL = driver.getCurrentUrl();
		System.out.println("Current url is displayed :" + CurrentURL);
		Assert.assertTrue(CurrentURL.contains("google"));

	}

}
