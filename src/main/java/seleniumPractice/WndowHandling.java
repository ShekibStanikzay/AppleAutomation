package seleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WndowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.medplusmart.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.getWindowHandle();
		
	 driver.findElement(By.xpath( "//input[@name='enterval']")).click();
	 Set<String> windows = driver.getWindowHandles();
      Iterator<String> itr = windows.iterator();
      while(itr.hasNext()) {
    	  String windows1=itr.next(); 
    	  driver.switchTo().window("");
    	  if (driver.getTitle().equals(""));
    	  		}
       
	 






	
	//WebElement med = driver.findElement(By.xpath("//*[@classname='row']"));
	//med.click();
	//	driver.findElement(By.xpath("//*[@alt='Get it on Google Play']")).click();
//
}
}