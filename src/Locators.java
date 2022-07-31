import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\softwares\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		/*Syntax to write CSS selector
		If class name is present then Tagname.Classname
		If ID is present then Tagname#id
		If ID and class name are not present then generic one is Tagname[attribute='value']
		If unique attribute is not present then Tagname[attribute='value']:nth-child(index no)
		example : input[type='text']:nth-child(3)      */
		
		//driver.findElement(By.id("inputUsername")).sendKeys("shriraj");
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("shriraj");
		
		//driver.findElement(By.name("inputPassword")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[name=inputPassword]")).sendKeys("raj123");
		
		driver.findElement(By.className("signInBtn")).click();
		String error = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(error);
		
		//Different ways to validate CSS selector is unique or not
		//using external plugin Selectorshub---->search with the constructed CSS selector(Tagname.Classname)
		//using browser developer tools----->Go to console--->search with this syntax on the bottom $('constructed CSS selector').example $('p.error')
		
		//How to know a webpage element is link??? Ans: tagname will be a. a means anchor..
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		//Syntax to write xpath 
		//if there is an unique attribute present then   //Tagname[@attribute='value']
		//if unique attribute is not present then 		 //Tagname[@attribute='value'][index no]
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("shriraj");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("shriraj36@dummy.com");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("shriraj36@gmail.com");
		
		/*writing xpath or CSS selector by traversing through parent to child item with tag names
		
		for xpath //parenttagname/childtagname[index]  index is optional and used if multiple same childtag are present
		for CSS selector parenttaganame childtagname  */
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("8197781827");
		
		/* Element intercepted exception--->when the application is changing its state from one view to another.
		During that time if selenium is trying to perform some action on the web element.This exception will be thrown
		example: driver.findElement(By.cssSelector("button.reset-pwd-btn")).click(); 
		
		solution: Wait for some seconds for view to be changed.Use Thread.sleep(millisec) to achieve this. */
		
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*Regular expression CSS Selector and Xpath Syntax
		 
		CSS selector - Tagname[attribute*='value']. Here the value will be partial text which is static everytime
		placeholder=Password
		example - input[placeholder*='Pass'] .Instead of using complete value....partial value is used
		Xpath - //Tagname[contains(@attribute,'value')]
		
		*/
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("shriraj");
		driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@Class,'submit')]")).click();
		
		
		
	}

}
