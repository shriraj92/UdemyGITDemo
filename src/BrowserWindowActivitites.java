import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowActivitites {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//using driver.get method selenium webdriver will wait for the complete webpage to be loaded.It has internal wait mechanism to handle that
		driver.get("https://www.google.co.in/");
		//when driver.navigate method is used selenium webdriver doesnt wait for complete webpage to load.if some portion is loaded it moves to next steps
		driver.navigate().to("https://rahulshettyacademy.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();

	}

}
