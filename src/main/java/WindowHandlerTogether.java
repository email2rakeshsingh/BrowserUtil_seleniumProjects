import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerTogether {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parentwindowID = driver.getWindowHandle();

		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();

		Set<String> handel = driver.getWindowHandles();

		Iterator<String> it = handel.iterator();

		while (it.hasNext()) {

			String windowID = it.next();
		
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
			if (!windowID.equals(parentwindowID)) {
				driver.close();
				
			}
			
		}
		driver.switchTo().window(parentwindowID);
		System.out.println(driver.getTitle());

	}

}
