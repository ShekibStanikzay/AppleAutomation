package regressionDemoTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class ParametrizationTest {
	@Test
	@org.testng.annotations.Parameters({"Username"})
	public void login(String data1) {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement user = driver.findElement(By.id("comp-izp8qiib0label"));
		user.sendKeys (data1);
		driver.findElement(By.name("FullName"));
}
}