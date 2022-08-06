package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotation {

	
	@BeforeTest
	public void one()
	{
		System.out.println("one method");
	}
	
	@AfterSuite
	public void two()
	{
		System.out.println("two method");
	}
	
	@BeforeClass
	public void three()
	{
		System.out.println("three method");
	}
	
	@AfterClass
	public void four()
	{
		System.out.println("four method");
	}
	
	@BeforeMethod
	public void five()
	{
		System.out.println("five method");
	}
	
	@AfterMethod
	public void six()
	{
		System.out.println("six method");
	}
	
	@BeforeTest
	public void seven()
	{
		System.out.println("seven method");
	}
	
	@AfterTest
	public void eight()
	{
		System.out.println("eight method");
	}
	
	@Test
	public void nine()
	{
		System.out.println("nine method");
	
	}
}
