package xpath;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrickInfoWebtabale {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/zimbabwe-a-in-nepal-2022-1310914/nepal-vs-zimbabwe-a-3rd-match-1310937/full-scorecard");

		System.out.println(Getwikettakrname("Roy Kaia"));
		System.out.println(getPlayerscoreList("Roy Kaia"));
		System.out.println(Getwikettakrname("Luke Jongwe"));
		System.out.println(getPlayerscoreList("Luke Jongwe"));
		// System.out.println(Getwikettakrname("Tadiwanashe Marumani"));

	}

	// table[ contains(@class, 'ci-scorecard-tabl')]//span[contains(text(), 'Roy
	// Kaia')]/ancestor::td/following-sibling::td

	public static List<String> getPlayerscoreList(String PlayerName) {
		System.out.println("player name :" + PlayerName);
		String x_Path = "//table[contains(@class,'ci-scorecard-tabl')]//span[contains(text(),'"+ PlayerName
				+"')]/ancestor::td/following-sibling::td";
		List<WebElement> scoreList = driver.findElements(By.xpath(x_Path));
		List<String> scoreList1 = new ArrayList<String>();

		for (WebElement e : scoreList) {

			String text = e.getText();
			scoreList1.add(text);

		}
		return scoreList1;
	}

	public static String Getwikettakrname(String PlayerName) {
		String wk_xpath = "//span[contains(text(),'" + PlayerName + "')]/ancestor::td/following-sibling::td";
		return driver.findElement(By.xpath(wk_xpath)).getText();

	}

}
