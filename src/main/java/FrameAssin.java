import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameAssin {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.xpath("//*[@id=\"imageTemplateContainer\"]")).click();
		// driver.switchTo().frame(2);
		driver.switchTo().frame("frame-one748593425");
		System.out.println(driver.getTitle());
		//driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Rakesh");
		//driver.switchTo().frame(driver.findElement(By.name("main")));
		//OR
		By Vehicleyear = By.id("RESULT_TextField-2");
		By Vehiclemake= By.id("RESULT_TextField-3");
		By Vehiclemodel   = By.id("RESULT_TextField-4");
		By Color = By.id("RESULT_TextField-5");
		By Mileage   = By.id("RESULT_TextField-6");
		By VehicleIdentificationNumber = By.id("RESULT_TextField-7");
		By Name= By.name("RESULT_TextField-8");
		By Address  = By.name("RESULT_TextField-9");
		By City   = By.id("RESULT_TextField-11");
		By State = By.id("RESULT_RadioButton-12");
		By Zip = By.name("RESULT_TextField-13");
		By Phone  = By.name("RESULT_TextField-14");
		By Emailaddress  = By.name("RESULT_TextField-15");
		By Submit  = By.id("FSsubmit");
		By Thankyou = By.className("success-title");
		By successtext=By.className("success-text");
		
		ElementUtil frame= new ElementUtil(driver);
		frame.doSendKey(Vehicleyear, "2022");
		frame.doSendKey(Vehiclemake, "BMW");
		frame.doSendKey(Vehiclemodel, "E2021");
		frame.doSendKey(Color, "Black");
		frame.doSendKey(Mileage, "120");
		frame.doSendKey(VehicleIdentificationNumber, "B2021345C");
		frame.doSendKey(Name, "BMW");
		frame.doSendKey(Address, "Sudama Nagar Indore");
		frame.doSendKey(City, "indore");
		frame.doSendKey(State, "mp");
		frame.doSendKey(Zip, "452009");
		frame.doSendKey(Address, "Sudama Nagar Indore");
		frame.doSendKey(Phone, "9035465879");
		frame.doSendKey(Emailaddress, "email2rakesh@gmail.com");
		frame.doClick(Submit);
		Thread.sleep(4000);
		System.out.println(frame.doTextMessage(Thankyou));
		System.out.println(frame.doTextMessage(successtext));
		
		System.out.println(driver.getTitle());
			
		}
	}


