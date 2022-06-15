import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrnageHRM {

	public static void main(String[] args) {
		
		BrowserUtil HRM= new BrowserUtil();
		WebDriver driver = HRM.int_driver("chrome");
		HRM.navigateURL("https://www.orangehrm.com/hris-hr-software-demo/");
		System.out.println(HRM.getpagetitle());
		System.out.println(HRM.getpageurl());
		//System.out.println(HRM.getpagesource());
		//OR BY ID 
//		By firstname=By.id("Form_submitForm_FirstName");
//		By lastname=By.id("Form_submitForm_LastName");
//		By email= By.id("Form_submitForm_Email");
//		By phone= By.id("Form_submitForm_Contact")
//		
//		ElementUtil util = new ElementUtil(driver);
//		util.doSendKey(firstname, "Rakesh");
//		util.doSendKey(lastname, "Singh");
//		util.doSendKey(email, "email2rakesh");
//		util.doSendKey(phone, "923654789");
//		BY NAME 
		
		By firstName = By.name("FirstName");
		By lastname = By.name("LastName");
		By email = By.name("Email");
		By phone = By.name("Contact");
		
		ElementUtil util = new ElementUtil(driver);
		util.doSendKey(firstName, "Rakesh");
		util.doSendKey(lastname, "singh");
		util.doSendKey(email, "email2rakeshsingh");
		util.doSendKey(phone, "9039014433");
		
		
	}

}
