package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropDown {

	private static Object[] Index;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement country = driver.findElement(By.xpath("//*[@id='country']"));
		Select s = new Select (country);
		s.selectByValue("US");
		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("2136 oakha,jhchgxhgx");
		driver.findElement(By.id("city")).sendKeys("Richmond");
		 WebElement state = driver.findElement(By.xpath("//*[@id='stateList']"));
		 Select Salim=new Select(state);
		 Salim.selectByIndex('4');
			driver.findElement(By.id("zipCode")).sendKeys("12342");
		
			driver.findElement(By.className("filterCheckboxRect")).click();
			driver.findElement(By.xpath("//*[@class='filterCheckboxRect']"));
			driver.findElement(By.className("hThree w-100")).click();
			driver.findElement(By.linkText("Reset password"));
			
		
 
	}

}
