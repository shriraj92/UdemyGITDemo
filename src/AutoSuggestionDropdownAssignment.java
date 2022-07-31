import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestionDropdownAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		List<WebElement> autoSuggestCountries = driver.findElements(By.xpath("//ul/li[@class='ui-menu-item']/div[@class='ui-menu-item-wrapper']"));
		
		/*for(WebElement autoSuggest : autoSuggestCountries)
		{
			if(autoSuggest.getText().equalsIgnoreCase("India"))
			{
				autoSuggest.click();
				break;
			}
		}*/
		
		Actions a = new Actions(driver);
	
		
		for(int i=0;i<autoSuggestCountries.size();i++)
		{
			if(autoSuggestCountries.get(i).getText().equalsIgnoreCase("India"))
			{
				a.moveToElement(autoSuggestCountries.get(i)).click().build().perform();
				break;
			}
		}
}
	
}
