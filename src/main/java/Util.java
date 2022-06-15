import java.net.URL;

public interface Util {
	
	String CHROME_BROWSER="chrome";
	String FIREFOX_BROWSER="firefox";
	String EDGE_BROWSER="edge";
	
	public void navigateURL(String url);
	public void navigateURL(URL url);
	public String getpagetitle();
	public String getpageurl();
	public String getpagesource() ;
	public void closebrowser();
	public void quitbrowser();
	
	
	
	
}
