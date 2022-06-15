package TestNgSession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation {

	@BeforeSuite
	public void connectwithDB() {
		System.out.println("BS--connect with DB");
	}

	@BeforeTest
	public void createUser() {
		System.out.println("BT---create the user");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC --LAUNCH THE BROWSER");
	}

	@Test
	public void homepagetitle() {
		System.out.println("test- home page launch");

	}

	@Test
	public void urltest() {
		System.out.println("test -- page test ");

	}

	@AfterMethod
	public void logout() {
		System.out.println("logout the page");

	}

	@AfterClass
	public void closethebrowser() {
		System.out.println("close the browser");
	}

	@AfterTest
	public void deleteuser() {
		System.out.println("delete the user");
	}

	@AfterSuite
	public void disscunnectDB() {
		System.out.println("DISSCUNECT WITH DB");

	}

}
