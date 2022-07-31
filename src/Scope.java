import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//calculate no of links in the webpage
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//getting no of links present in Footer section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		//Now this footerDriver will act as a driver 
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		//getting no of links present in 1st column of footer section
		WebElement columnDriver = footerDriver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td/ul[1]"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		/*
		By using this way links will not be opening in new tab.once the 1st link is open using for loop 
		then org.openqa.selenium.StaleElementReferenceException will be thrown
		
		for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++)
		{
			columnDriver.findElements(By.tagName("a")).get(i).click();
		}
		*/
		
		//opening links in new tab using keyboard gesture i.e using Keys class in selenium
		String k = Keys.chord(Keys.CONTROL,Keys.ENTER);
		for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++)
		{
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(k);
			
		}
		
		//getting the title of the child webpages opened after clicking on the link
		
		Set<String> windowIDs= driver.getWindowHandles();
		Iterator<String> windowIDIterator = windowIDs.iterator();
		
		while(windowIDIterator.hasNext())
		{
			String currentWindow = windowIDIterator.next();
			driver.switchTo().window(currentWindow);
			System.out.println(driver.getTitle());
		}
	}

}
