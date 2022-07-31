import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscellaneous {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Deleting browser cookies
		//driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed(""); //Pass the cookie name as a string in args
		/*Example - There could be scenarios where once sessionkey cookie is deleted and user do any other action 
		 * then website logs off automatically and lands on home page
		 */
		
		/*Taking screenshots
		 * first cast the driver object with TakesScreenshot and use screenshot method to take it
		 * Then use getScreenshotAs method with OutputType.format
		 * move the file from source to any local folder with FileUtils.copyFile class and method
		 */
		//Donwloaded apache jars from https://commons.apache.org/proper/commons-io/download_io.cgi to support this
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//This step will take SS
		FileUtils.copyFile(src, new File("C:\\Users\\ShrirajS\\Screenshot.png"));//This step will copy the files from the source to the destined local folder
		
	}

	

}
