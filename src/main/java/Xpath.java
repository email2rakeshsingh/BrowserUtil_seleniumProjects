import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Xpath {



	public static void main(String[] args) {
		BrowserUtil xpath = new BrowserUtil();
		WebDriver driver = xpath.int_driver("chrome");
		xpath.navigateURL("https://demo.opencart.com/index.php?route=account/register");
		System.out.println(xpath.getpagetitle());
		System.out.println(xpath.getpageurl());
		
		//OR
		
	   By Firstname= By.xpath("//*[@id=\"input-firstname\"]");
	   By lastname = By.xpath("//*[@id=\"input-lastname\"]");
	   //By email = By.xpath("//*[@id=\"input-email\"]");
		

	  Xpathutil util1= new Xpathutil(driver);
	  
	  util1.doSendkey(Firstname, "Rakesh");
	  util1.doSendkey(lastname, "singh");
	  //util1.doSendkey(email, "email2rakesh@gmail.com");
	}

}
