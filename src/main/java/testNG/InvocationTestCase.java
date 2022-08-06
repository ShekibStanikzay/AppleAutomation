package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationTestCase {
	@Test (invocationCount=2,invocationTimeOut=30000)  ///  By using invocation we can add number of time that we want to run/execute the test case .Here we just put 2. 
	/// By using invocation timeout we give it some time to execute the test before throwing any exception. 
	public void walmart()
	{
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.walmart.com");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());

}
}