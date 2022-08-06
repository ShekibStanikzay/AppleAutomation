package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class HardAssertion {

		@Test
		public void login()
		{
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	ChromeDriver driver= new ChromeDriver ();
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver\r\n");
	driver.manage().window().maximize();
	String url="https://chercher.tech/practice/practice-pop-ups-selenium-webdriver\r\n";
	Assert.assertTrue(driver.getCurrentUrl().equals(url));
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	

}
}