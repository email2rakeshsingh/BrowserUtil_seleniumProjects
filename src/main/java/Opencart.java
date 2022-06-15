import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Opencart {

	public static void main(String[] args) {
		BrowserUtil Opencart = new BrowserUtil();
		WebDriver driver = Opencart.int_driver("chrome");
		Opencart.navigateURL("https://demo.opencart.com/index.php?route=account/register");
		System.out.println(Opencart.getpagetitle());
		System.out.println(Opencart.getpageurl());
		System.out.println(Opencart.getpagesource().contains("Telephone"));
		// OR
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By email = By.id("input-email");
		By phone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmpwd = By.id("input-confirm");

		ElementUtil util = new ElementUtil(driver);
		util.doSendKey(firstname, "Rakesh");
		util.doSendKey(lastname, "Singh");
		util.doSendKey(email, "email2rakesh");
		util.doSendKey(phone, "923654789");
		util.doSendKey(password, "Rak@123");
		util.doSendKey(confirmpwd, "Rak@123");

	}

}
