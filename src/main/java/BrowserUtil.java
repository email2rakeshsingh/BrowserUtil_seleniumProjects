import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil implements Util {

	public WebDriver driver;

	public WebDriver int_driver(String browserName) {
		System.out.println("Browser name is :" + browserName);
		if (browserName.equals(CHROME_BROWSER)) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equals(FIREFOX_BROWSER)) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equals(EDGE_BROWSER)) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		} else {
			System.out.println("pass the correct browser name :" + browserName);

		}
		return driver;
	}

	@Override
	public void navigateURL(String url) {
		if (url == null) {
			return;

		}
		if (url.isEmpty()) {
			return;

		}
		if (url.indexOf("http") == -1 || url.indexOf("https") == -1) {
			System.out.println("Pass the correct urls using https is missing:");
			return;
		}
		driver.get(url);
	}

	@Override
	public void navigateURL(URL url) {
		driver.navigate().to(url);

	}

	@Override
	public String getpagetitle() {
		return driver.getTitle();

	}

	@Override
	public String getpageurl() {
		return driver.getCurrentUrl();

	}

	@Override
	public String getpagesource() {
		return driver.getPageSource();

	}

	@Override
	public void closebrowser() {
		driver.close();

	}

	@Override
	public void quitbrowser() {
		driver.quit();

	}

}
