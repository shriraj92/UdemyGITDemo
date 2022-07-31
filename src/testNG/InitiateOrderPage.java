package testNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class InitiateOrderPage {

	@Test
	public void customerDetails() {
		System.out.println("Get customer details method");
	}
	
	@Test(dependsOnMethods={"customerDetails"})
	public void customerValidation() {
		System.out.println("Customer validation method");
	}
	
	@Test(groups={"Smoke"})
	public void proceedToPCPage() {
		System.out.println("Clicked on Next button to proceed to PC page");
		Assert.assertTrue(false);
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite method");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before class method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("This is after class method");
	}
}
