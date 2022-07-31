import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions1 {

	public static void main(String[] args) {
		//ChromeOptions class1
		//It is used to customize and configure a ChromeDriver session
		//It can handle SSL certification,add extenstion,add proxy and many more
		
		ChromeOptions options = new ChromeOptions();
		//During the automation browser session wherever it needs for SSL Certification.Next line will handle.
		options.setAcceptInsecureCerts(true); 
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		//Add Extenstion to current chromeDriver session using ChromeOptions
		options.addExtensions(); //Inside the parenthesis pass the location of the extension file present
		
		//Add proxy to the current chromeDriver session using ChromeOptions and Proxy class
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("");  //inside the parenthesis pass the proxy details.example ipaddress:portno
		options.setCapability("proxy", proxy);
		
		/*Block all pop up windows....For example in flight booking sites on the left top corner it wl ask for location
		pop up.This can be handled by chromeOptions class */
		
		ChromeOptions options1 = new ChromeOptions();
		options1.setExperimentalOption("excludeSwitches",
		Arrays.asList("disable-popup-blocking"));
		
		/* While downloading files through automation scripts.Files can be downloaded to specific location
		 * This can be done with the help of ChromeOptions
		 */
		
		ChromeOptions options2 = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options2.setExperimentalOption("prefs", prefs);
		
	}

}
