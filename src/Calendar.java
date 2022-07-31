import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		//April 23
		//selecting month
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='datepicker-switch']")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		List<WebElement> calendarDates = driver.findElements(By.cssSelector("td[class='day']"));
		//selecting day
		for(int i=0;i<calendarDates.size();i++)
		{
			String dates = calendarDates.get(i).getText();
			if(dates.equalsIgnoreCase("23"))
			{
				driver.findElements(By.cssSelector("td[class='day']")).get(i).click();
				break;
			}
		}
		
	}

}
