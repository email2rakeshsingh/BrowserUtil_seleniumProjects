import java.net.MalformedURLException;

public class AmazonTest {

	public static void main(String[] args) throws MalformedURLException{

		BrowserUtil brutil = new BrowserUtil();
		brutil.int_driver("edge");
		brutil.navigateURL("https://www.amazon.com");
		String title = brutil.getpagetitle();
		System.out.println("Title is :" + title);

		if (title.contains("Amazon")) {
			System.out.println("Correct Title");

		} else {
			System.out.println("incorrect Title ");
			
		}
		System.out.println(brutil.getpagesource().contains("Actionable Analytics"));
		System.out.println(brutil.getpagetitle().concat("Amazon"));
		System.out.println(brutil.getpageurl().contains("https://www.amazon.com/"));
		brutil.closebrowser();
	}

}
