import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> windowIDs = driver.getWindowHandles();
		Iterator<String> windowID = windowIDs.iterator();
		String parentWindowID = windowID.next();
		String childWindowID = windowID.next();
		driver.switchTo().window(childWindowID);
		System.out.println(driver.findElement(By.cssSelector(".example")).getText());
		driver.switchTo().window(parentWindowID);
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
	}

}
