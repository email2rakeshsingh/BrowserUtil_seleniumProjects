package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		Actions act = new Actions(driver);
		
		WebElement sourctarget= driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		
		//act.clickAndHold(sourctarget).moveToElement(target).release().build().perform();
		
		act.dragAndDrop(sourctarget, target).perform();
		

	}

}
