import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.className("blinkingText")).click();
		//getWindowHandles method is provided by selenium to get the no of windows opened.i.e wl get the windowIDs of each window
		//https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/ alternate way expalined in this site with while loop
		Set<String> windowIDs = driver.getWindowHandles();
		Iterator<String> windowID = windowIDs.iterator();
		String parentWindowID = windowID.next();
		String childWindowID = windowID.next();
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getTitle());
		String userName = driver.findElement(By.className("red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(userName);
		driver.close();
		driver.switchTo().window(parentWindowID);
		driver.findElement(By.id("username")).sendKeys(userName);
		
	}

}
