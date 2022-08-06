package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	
	@Test
	public void login()
	
	{
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver ();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver\r\n");
		driver.manage().window().maximize();
		String url="https://chercher.tech/practice/practice-pop-ups-selenium-w";
		SoftAssert sa= new SoftAssert();
		sa.assertTrue(driver.getCurrentUrl().equals(url));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
