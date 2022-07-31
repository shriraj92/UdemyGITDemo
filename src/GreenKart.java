import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};
		int j=0;
		List<WebElement> veggiesLocator = driver.findElements(By.cssSelector("h4.product-name"));
		
	/*	for(int i=0;i<veggiesLocator.size();i++)
		{
			String name = veggiesLocator.get(i).getText();
			if(name.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		} */

		//If there are more than one product need to be added then it is not advisable to have another for loop created for the new product
		//Instead create an array or arraylist and have the product details and use it during runtime
		
		for(int i=0;i<veggiesLocator.size();i++)
		{
			String name = veggiesLocator.get(i).getText();
			String[] nameArray = name.split(" ");
			String extractedVeggie = nameArray[0];
			
			//Convert Array into ArrayList by using Arrays.asList(); pass the Array in the arguements
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			
			//Now in IF statement instead of hardcoding the value.
			//Compare the name extracted from the webpage with the arrayList
			//Here in if statement comparison is done with arraylist and the names extracted from browser because arrayList has contains method that accepts objects in arguments
			//Vice versa not possible because the normal contains method expects char in arguements
			
			
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
