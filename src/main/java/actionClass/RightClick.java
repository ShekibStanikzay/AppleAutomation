package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Actions a = new Actions (driver);
	WebElement button = driver.findElement(By.xpath("//*[text()='Double-Click Me To See Alert']"));
	a.doubleClick(button).build().perform();
	driver.switchTo().alert().accept();
	WebElement rightclick = driver.findElement(By.xpath("//*[text()='right click me']"));
	a.moveToElement(rightclick).contextClick().build().perform();
	driver.switchTo().alert().accept();
	}

}
