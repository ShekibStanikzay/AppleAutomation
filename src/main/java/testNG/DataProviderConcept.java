package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {

	
	@Test (dataProvider="good")
	public void Amazon()
	{
	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	Actions a = new Actions (driver);
	WebElement log = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
	WebElement sign = driver.findElement(By.xpath("//span[text()='Sign in']"));
	a.moveToElement(log).moveToElement(sign).click().build().perform();
WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
email.sendKeys("adddff");
email.click();
driver.findElement(By.xpath("//input[@id='continue']")).click();
}
	@DataProvider(name="good")
			public static Object [][] uspeople()
			{
	return new Object[][]{{"Admin","Admin123"},{"Ahmad","mohamad"}};
}
}