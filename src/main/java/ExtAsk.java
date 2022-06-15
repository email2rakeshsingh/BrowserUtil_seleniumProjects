import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtAsk {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://ext.ask.com/");
		driver.findElement(By.xpath("//button[@id='button_1']")).click();

//		String title= driver.getTitle();
//		System.out.println(title);

		Set<String> handel = driver.getWindowHandles();
		Iterator<String> it = handel.iterator();

		String parentwin = it.next();
		System.out.println("parent window id :" + parentwin);

		String childwin = it.next();
		System.out.println("child window id :" + childwin);

		String title = driver.getTitle();
		System.out.println(title);

		// switch to child window
		driver.switchTo().window(childwin);

		String title1 = driver.getTitle();
		System.out.println(title1);

		//// div [@class='g-c-R webstore-test-button-label']/[contains(text()='Add to
		//// Chrome'))] Not working
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div[2]/div/div/div/div")).click();

		Thread.sleep(4000);

		Alert popup = driver.switchTo().alert();
		String text = popup.getText();
		System.out.println(text);

		Thread.sleep(4000);
		popup.accept();

	}

}
