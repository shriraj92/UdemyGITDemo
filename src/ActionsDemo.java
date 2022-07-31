import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;

public class ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//Actions-----This class is used to handle Mouse and keyboard gestures in applications
		//example - mouse hover on particular web element
		
		
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("a#nav-link-accountList"))).build().perform();
		//Sending text in capital letter to text box with the help of actions class in selenium
		a.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Trackpants").build().perform();
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).clear();
		//Selecting the text entered in the text box by using 
		a.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Trackpants").doubleClick().build().perform();
		//right click on a webelement using context click method
		a.moveToElement(driver.findElement(By.cssSelector("a#nav-link-accountList"))).contextClick().build().perform();
	}

}
