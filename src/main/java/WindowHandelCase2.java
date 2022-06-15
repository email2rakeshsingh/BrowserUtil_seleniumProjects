import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandelCase2 {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");

		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();

		Set<String> handel = driver.getWindowHandles();

		Iterator<String> it = handel.iterator();

		String parentwindowID = it.next();
		System.out.println("Parent window id :" + parentwindowID);
		String childwindowID = it.next();
		System.out.println("child window id :" + childwindowID);

		driver.switchTo().window(childwindowID);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindowID);
		System.out.println(driver.getTitle());

	}

}
