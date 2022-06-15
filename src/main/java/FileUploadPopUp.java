import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.get("http://hp.myway.com/fromdoctopdf/ttab02/index.html?p2=");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"convertToPDFAppButton\"]/span[1]/img")).click();

		// driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\Rakesh.Singh\\Desktop\\password.txt");

		driver.findElement(By.xpath("//*[@id=\"convertToPDFAppModal\"]/div[2]/div/div/div/div[1]/button"))
				.sendKeys("C:\\Users\\Rakesh.Singh\\Desktop\\password.txt");

		String str = driver.findElement(By.className("text")).getText();
		System.out.println(str);

		String str1 = driver.findElement(By.className("sub-title")).getText();
		System.out.println(str1);
	}

}
