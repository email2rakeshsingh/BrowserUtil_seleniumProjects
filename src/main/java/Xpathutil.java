import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xpathutil {

	private WebDriver driver;

	public Xpathutil(WebDriver driver) {
		this.driver = driver;
	}

	public void doSendkey(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);

	}public void doclick(By locator) {
		getElement(locator).click();
		
	}

}
