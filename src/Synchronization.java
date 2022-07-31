import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Synchronization {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};
		greenKartAddItems(driver,itemsNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		//Explicit wait using WebDriverWait class
		//Explicit waits are used at specific/targetted elements
		
		WebDriverWait eWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		eWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		eWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		driver.findElement(By.cssSelector("span.promoInfo")).getText();
		Assert.assertEquals(driver.findElement(By.cssSelector("span.promoInfo")).getText(), "Code applied ..!");
		System.out.println("PromoCode Applied Successfully");
		
	}

	public static void greenKartAddItems(WebDriver driver, String[] itemsNeeded)
	{
		int j=0;
		List<WebElement> veggiesLocator = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<veggiesLocator.size();i++)
		{
			String name = veggiesLocator.get(i).getText();
			String[] nameArray = name.split(" ");
			String extractedVeggie = nameArray[0];
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(extractedVeggie))   
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeededList.size())
				{
					break;
				}
			}
			
		}	
		
	}
	
}
