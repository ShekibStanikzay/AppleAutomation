package seleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowHandlingTeacherCode {
public static String parent,linkedIn,facebook,youtube,twitter;
	public static Set<String> all;
	public static Iterator<String> it;



	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		parent=driver.getWindowHandle();
		System.out.println("HRM UniqueId: "+parent);

		WebElement lk = driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']"));
		lk.click();
		System.out.println(driver.getTitle());
		 all = driver.getWindowHandles();
		 System.out.println("Total Windows Opened: "+all.size());
		 it = all.iterator();
		while(it.hasNext())
		{
			linkedIn=it.next();
			if(!parent.equals(linkedIn))
			{
				driver.switchTo().window(linkedIn);
			}
		}
		System.out.println(driver.getTitle());
		WebElement email = driver.findElement(By.xpath("//input[@name='email-or-phone']"));
		email.sendKeys("Ramarao");
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		WebElement fb = driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']"));
		fb.click();
		all = driver.getWindowHandles();
		System.out.println("Total Windows Opened: "+all.size());
		it = all.iterator();
		while(it.hasNext())
		{
			facebook=it.next();
			if(!parent.equals(facebook))
			{
				driver.switchTo().window(facebook);
			}
		}
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		WebElement phone = driver.findElement(By.xpath("//input[@name='email']"));
		phone.sendKeys("9032268711");
		driver.switchTo().window(linkedIn);

			

		

	}

}
