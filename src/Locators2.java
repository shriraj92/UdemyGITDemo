import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		
		String name = "shriraj";
		
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[contains(@class,'signInBtn')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div h2")).getText(), "Hello "+name+",");
		
		/*Syntax for xpath to identify an element with text
		 //Tagname[text()='value'] or *[text()='value'] this can be used if tag name doesnt impact */
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
		
		//Writing a separate method to extract password from the web page and sending the password dynamically everytime 
		
		
		
	}

}
