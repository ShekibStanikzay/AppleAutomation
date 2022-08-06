package handleDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeHandleDropD {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver ();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		WebElement fruit=driver.findElement(By.xpath("//*[@id='first']"));
		Select s = new Select(fruit);
		//s.selectByIndex(0);
		s.selectByVisibleText("first");
		driver.findElements(By.id("animals"));
		s.selectByIndex(4);
		
		
		

	}

}
