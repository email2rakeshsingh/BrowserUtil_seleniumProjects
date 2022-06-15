package MyTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest extends BaseTest {

	@DataProvider
	public Object[][] testData() {
		return new Object[][] { 
			    { "email2rakeshsingh@hmail.com", "test@1234" },
				{ "@#$%%keshsingh@hmail.com", "test@1234" }, 
				{ "email2rakeshsingh@@#$%.com", "test@1234" },
				{ "RSETBDD@hmail.com", "test@1234" }, 
				{ "email2rakeshsingh@hmail.com", "test@1234" }, 
				{ "", "" },
				
		};
	}

	@Test(dataProvider = "testData")
	public void LoginNegativeTest(String username,String Password) {

		//driver.get("https://demo.opencart.com/index.php?route=account/login");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Account Login");
		driver.findElement(By.cssSelector("#input-email")).sendKeys(username);
		driver.findElement(By.cssSelector("#input-password")).sendKeys(Password);
		driver.findElement(By.xpath("(//input[@value='Login'])[1]")).click();
		String errorMsg = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		System.out.println(errorMsg);
		Assert.assertTrue(errorMsg.contains("Warning: No match for E-Mail Address and/or Password."));

	}

}
