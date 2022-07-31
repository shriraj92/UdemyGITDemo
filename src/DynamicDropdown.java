import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\softwares\\\\Eclipse\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		//Dynamic Dropdown - The values or options of the dropdown are loaded based on the user action
		//Example - Two dropdowns are present. The second dropdown options will be loaded based on the option or value selected for the first dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(1000);
		//Here whenever 2 nodes are present then while constructing xpath we shld explicitly mention index
		//example - chennai option was present in from and to dropdown.To select chennai form to dropdown index[2] is used along with wrapped xpath
		
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		//Alternate xpath to construct using parent child relationship - giving xpath of both parent and child at sametime with space
		//Instead of using indexes web element is identified uniquely using parent child relationship
		// Syntax is //Parenttagname[@Attribute='value'] //Childtagname[@Attribute='value']
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//Selecting default calendar date i.e current date by writing CSS selector for class name.
		// if there is an space in class name values then for CSS construction spaces should be replace with .
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		

	}

}
