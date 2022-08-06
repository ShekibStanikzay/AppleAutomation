package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClassSendKey {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://myaccount.uscis.gov/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Actions a = new Actions (driver);
		WebElement table = driver.findElement(By.xpath("//input[@class='form-control string email optional form-control']"));
		a.moveToElement(table).sendKeys("asssd").build().perform();
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("aderf123");
	}

}
