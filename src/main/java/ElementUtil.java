import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public By getBy(String locatertype, String locaterVlues) {

		By locater = null;

		switch (locatertype.toLowerCase()) {
		case "id":
			locater = By.id(locaterVlues);
			break;
		case "name":
			locater = By.name(locaterVlues);
			break;
		case "classname":
			locater = By.className(locaterVlues);
			break;
		case "xpath":
			locater = By.xpath(locaterVlues);
			break;
		case "cssSelector":
			locater = By.cssSelector(locaterVlues);
			break;
		case "linktext":
			locater = By.linkText(locaterVlues);
			break;
		case "partialLinkText":
			locater = By.partialLinkText(locaterVlues);
			break;
		case "tagName":
			locater = By.tagName(locaterVlues);
			break;
		default:
			System.out.println("Please pass the right lower case.......");
			break;
		}
		return locater;

	}

	public void doSendKey(By locater, String value) {
		getElement(locater).sendKeys(value);

	}
	
	public  void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	
	public  void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}

	public WebElement getElement(By locater) {
		return driver.findElement(locater);

	}

	public String doTextMessage(By Locator) {
		return getElement(Locator).getText();

	}

	public void doClick(By Locator) {
		getElement(Locator).click();

	}

	public String dogetAttribute(By locator, String attributrName) {
		return getElement(locator).getAttribute(attributrName);

	}

	public boolean doisDisplayed(By locator) {
		return getElement(locator).isDisplayed();

	}

	public int getElementsCount(By Loctor) {
		return getEliments(Loctor).size();

	}

	public List<WebElement> getEliments(By loctore) {
		return driver.findElements(loctore);

	}

	public int getElementsListCount(By Locator) {
		return getEliments (Locator).size();

	}

	public List<String> getElimentsTextList(By locator) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getEliments(locator);

		for (WebElement e : eleList) {
			String text = e.getText();
			eleTextList.add(text);

		}
		return eleTextList;
	}

	public void printAllelementstext(By locator) {
		List<WebElement> eleList = getEliments(locator);

		for (WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text);

		}
	}

	public void ClickonElimentfromsection(By locator, String value) {
		List<WebElement> elelist = getEliments(locator);
		System.out.println(elelist.size());

		for (WebElement e : elelist) {
			String text = e.getText();
			System.out.println(text);

			// if (text.equals(value)) {
			if (text.contains(value)) {
				e.click();
				break;

			}

		}

	}

}
