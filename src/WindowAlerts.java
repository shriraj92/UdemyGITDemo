import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowAlerts {

	public static void main(String[] args) {
		
		String name = "shriraj";
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		
		//selenium offers an mechanism to move the control to window alerts of an webpage
		System.out.println(driver.switchTo().alert().getText());
		String nameAlertText = driver.switchTo().alert().getText();
		String[] nameAlertTextArray = nameAlertText.split(",");
		String[] nameAlertTextArray2 = nameAlertTextArray[0].split(" ");
		String actualName = nameAlertTextArray2[1];
		Assert.assertEquals(actualName, name);
		System.out.println("Actual Name is " + actualName);
		
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
