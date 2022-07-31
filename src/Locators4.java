import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Parent to child traverse and sibling traverse
		//Syntax to write an xpath to traverse from parent to child and then moving to the following childs
		
		// Relative Xpath  //ParentTagname/childTagnames[index]/following-sibling::childtaganme[index] 
		//Here index is optional based on scenario and no of childtagname varies based on the web applications
		
		// Above url has 4 buttons.in order to go to login button from practice button below is used
		// example //header/div/button[1]/following-sibling::button[1]
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		//Xpath to traverse from child to parent. First go to child from parent and then go back again to parent
		//    Relative Xpath   //ParentTagname/childTagnames[index]/parent::parenttagname/parent::parenttagname
		//no of parent or child tagname varies based on the web applications
		
		//example //header/div/button[1]/parent::div/parent::header
		
		//Below code is traversed from parent to child and then to parent and then again to child
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		driver.close();
		
		
	}

}
