package regressionDemoTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeDepo {
	@Test (groups= {"Regression","Sanity"})
	public void homedepo()
	{
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.homedepot.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());}

}
