import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpencartReg {
	

	public static void main(String[] args) {
		
		BrowserUtil reg = new BrowserUtil();
		
		WebDriver driver = reg.int_driver("chrome");
		reg.navigateURL("https://demo.opencart.com/index.php?route=account/register");
		System.out.println(reg.getpagetitle());
		System.out.println(reg.getpageurl());
		
		// Create OR FOR ID 
		
		By firstname= By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By email    = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password  = By.id("input-password");
		By confirm = By.id("input-confirm");
		By checkbox= By.name("agree");
		By button = By.name("btn btn-primary");
		
		
		// call idutil
		
		IdUtil idconcept= new IdUtil(driver);
		idconcept.doSendkey(firstname, "rakesh");
		idconcept.doSendkey(lastname, "singh");
		idconcept.doSendkey(email, "email2rakesh");
		idconcept.doSendkey(telephone, "9039014433");
		idconcept.doSendkey(password, "Rak@123");
		idconcept.doSendkey(confirm, "Rak@123");
		idconcept.doclick(checkbox);
		idconcept.doclick(button);
	
		
		
		
		
	}

}
