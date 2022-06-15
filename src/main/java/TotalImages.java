import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
//		List<WebElement> list = driver.findElements(By.tagName("img"));
//		System.out.println("Images of amazon :" + list.size());
//
//		for (WebElement e : list) {
//			String scrv = e.getAttribute("src");
//			String altv = e.getAttribute("alt");
//			String hight1 = e.getAttribute("hight");
//
//			System.out.println(scrv + ":" + altv + ":" + hight1);
			By images=	By.tagName("img");
			By link=   By.tagName("a");
			
		int imagecount=	getElementsCount(images);
		int linkcount= getElementsCount(link);
		System.out.println("Total count :" +imagecount + ":" + linkcount);
		

	}
	public static int getElementsCount(By Loctor) {
		return getEliments(Loctor).size();
		
	}
	public static List<WebElement> getEliments(By loctore) {
		return driver.findElements(loctore);
		
	}

}
