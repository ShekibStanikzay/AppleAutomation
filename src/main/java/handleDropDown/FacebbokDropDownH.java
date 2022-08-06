package handleDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebbokDropDownH {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers//Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/c/Return_Policy");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.className("MyAccount__label SimpleFlyout__link--bold")).click();
		driver.findElement(By.className("bttn__content")).click();
		
		
		
;
		
	}

}
