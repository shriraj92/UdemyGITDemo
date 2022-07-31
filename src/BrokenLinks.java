import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		SoftAssert softAss = new SoftAssert();
		
		List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
			for(WebElement link : links)
		{
			String urllink = link.getAttribute("href");
			HttpURLConnection urlCon = (HttpURLConnection)new URL(urllink).openConnection();
			urlCon.setRequestMethod("HEAD");
			urlCon.connect();
			int respCode = urlCon.getResponseCode();
			//To avoid the above problems....Soft Assertion can be used instead of hard Assertion using TestNG
			//SoftAssertion will continue the execution even after one of the condition is failed.and report the failure at the last
			softAss.assertTrue(respCode<400, link.getText()+" is broken"+" with error"+respCode);
		}
			
			softAss.assertAll();//this step will report all the failure steps
			//if this step is not written then report will only be stored but not reported in console
		
			/*	for(WebElement link : links)
			{
				String urllink = link.getAttribute("href");
				HttpURLConnection urlCon = (HttpURLConnection)new URL(urllink).openConnection();
				urlCon.setRequestMethod("HEAD");
				urlCon.connect();
				int respCode = urlCon.getResponseCode();
				if(respCode>400) {
					System.out.println(link.getText()+" is broken"+" with error"+respCode);
					//Assert.assertTrue(false);//This statement will stop once any status code of a link is >400
				}
			} */
			
			
		/*
		 * handling BrokenLinks in selenium
		 * Broken Links is basically a Broken URL.i.e URL tied up to the link is not working
		 * Example : 404 not found...Any response status that is above 400 is broken
		 * This can be achieved using Java methods(status of link is known without opening it)
		 * step 1 - get all url tied up to the links using selenium getattribute method
		 * step 2 - Java methods will call those URL's and gets the status code
		 */

		//CSS selector with regular expression for href link
		//This step returns the href link
		String soapUIUrl = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		//Use Java openConnection method to test the link.It is present in URL java class
		//Cast it to HttpURLConnection type inorder to access setRequestMethod and getResponseCode method
		
		/*
		 * URL url = new URL(soapUIUrl);
		HttpURLConnection urlCon = (HttpURLConnection)url.openConnection();
		urlCon.setRequestMethod("HEAD");
		urlCon.connect();
		int soapUIUrlResp = urlCon.getResponseCode();
		System.out.println(soapUIUrlResp);
		*/
		
		
		
		
	}

}
