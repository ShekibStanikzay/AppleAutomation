package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver ();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver\r\n");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		WebElement simple = driver.findElement(By.xpath("//*[@name='alert']"));
		simple.click();
		Alert at = driver.switchTo().alert();
		Thread.sleep(5000);
		at.accept();

		WebElement con = driver.findElement(By.xpath("//*[@name='confirmation']"));
		con.click();
		Thread.sleep(5000);
		at.dismiss();
		
		WebElement pmt = driver.findElement(By.xpath("//*[@name='prompt']"));
		pmt.click();
		Thread.sleep(5000);
		at.sendKeys("AAAAA");
		at.accept();
		driver.close();

	}

}
