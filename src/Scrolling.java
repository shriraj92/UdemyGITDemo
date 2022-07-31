import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Scrolling webpages in automation can be done using JavaScriptExecutor
		//JavaScriptExecutor is used bcoz webpages are made of javascript
		//In this driver is casted with JavascriptExecutor.Now this js object will have methods to handle javascript related scripts
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(2));
		eWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".tableFixHead")));
		//Scrolling webtables in automation can be done using JavaScriptExecutor
		
		//args - document.querySelector(css of the webelement.scrollTop=value)
		//Scrolltop method is used to scroll it down so that column values go to the top
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");

		//Getting values from the column of an webtable and sum it up
		
		List<WebElement> tableValues = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum =0;
		for(int i=0; i<tableValues.size();i++)
		{
			//Converting String to Integer before addition
			sum = sum + Integer.parseInt(tableValues.get(i).getText());
		}
		
		System.out.println(sum);
		
		int total = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);
		driver.close();
	}

}
