package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendFile {



	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/seeker/registration\r\n");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.xpath("//*[@class='browse-text']")); // here we just put xpath of the location where we want to upload the file 
element.click();
element.sendKeys("C://Softwares//Vaccination Declaration Form.pdf");/// here we put the location of the file from our computer
element.click();
	}

}
