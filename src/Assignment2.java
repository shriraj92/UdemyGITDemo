import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Shriraj");
		driver.findElement(By.name("email")).sendKeys("rahulshetty@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#exampleCheck1")).click();
		WebElement genderDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select gender = new Select(genderDropdown);
		gender.selectByIndex(0);
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//div[@class='form-group'] //input[@type='date']")).sendKeys("24071922");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		
		
	}

}
