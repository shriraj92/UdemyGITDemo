package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProductConfigPage {
	
	@Test(groups={"Smoke"})
	public void addProducts() {
		System.out.println("Add products method");
	}
	
	@Test(timeOut=2000)
	public void pricinglob() {
		System.out.println("This is pricing lob level method");
	}
	
	@Test(groups={"Smoke"})
	public void pricingorder() {
		System.out.println("This is pricing order level method");
	}
	
	@Test(enabled=false)
	public void seamlessSwitch() {
		System.out.println("Seamless switch method");
	}
	
	@BeforeTest
	public void preRequisite()
	{
		System.out.println("This is BeforeTest method");
	}
	
	@Parameters({"PreviousNetwork","PreviousPlan"})
	@Test
	public void parametersTest(String PreviousNetwork,String PreviousPlan) {
		System.out.println("Migrated from " + PreviousNetwork + " to Bell");
		System.out.println("Previous plan is " + PreviousPlan);
	}
	
}
