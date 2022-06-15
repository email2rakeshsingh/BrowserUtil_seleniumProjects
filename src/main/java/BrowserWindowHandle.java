import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		String title = driver.getTitle();
		System.out.println(title);

		Set<String> handels = driver.getWindowHandles();
		Iterator<String> it = handels.iterator();

		String parentwindow = it.next();
		System.out.println("parent window id " + parentwindow);

		String chieldwindow = it.next();
		System.out.println("chield window id " + chieldwindow);

		String title1 = driver.getTitle();
		System.out.println(title1);

		driver.switchTo().window(chieldwindow);

		String str1 = driver.getTitle();
		System.out.println(str1);

		Thread.sleep(4000);
		driver.findElement(By.className("main__sign-in-link")).click();

		driver.close();
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
	}

}
