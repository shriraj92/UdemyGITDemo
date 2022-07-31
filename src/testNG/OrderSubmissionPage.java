package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrderSubmissionPage {

	@Test(groups={"Smoke"})
	public void submit() {
		System.out.println("This is submit method");
	}
	
	@AfterTest
	public void postRequisite() {
		System.out.println("This is AfterTest method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after method");
	}
	
	@Test(dataProvider="CustomerDetails")
	public void details(Object Username,Object Rollno) {
		System.out.println(Username);
		System.out.println(Rollno);
	}
	
	@DataProvider(name="CustomerDetails")
	public Object[][] testData() {
		/*Object[][] data = new Object[2][2];
		data[0][0] = "Shriraj";
		data[0][1] = "37";
		data[1][0] = "Shriram";
		data[1][1] = "100";*/
	
		Object[][] data = {{"Shriraj","37"},{"Shriram","100"}};
	
		return data;
	}
}
