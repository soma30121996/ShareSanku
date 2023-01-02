package testNG_basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chronological_Order_Of_Annotations {
	
	@Test
	public void idly() {
		System.out.println("idly");
	}
	
	@Test
	public void chutney() {
		System.out.println("chutney");
	}
	
	@Test
	public void raj() {
		System.out.println("doubt raj");
	}
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Executing BeforeSuite");
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Executing BeforeTest");
	}
	
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Executing BeforeClass");
		System.out.println("----------------------------------");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Executing BeforeMethod");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("Executing AfterSuite");
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("Executing AfterTest");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("Executing AfterClass");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("Executing AfterMethod");
		System.out.println("----------------------------------");
	}
	
	

}
