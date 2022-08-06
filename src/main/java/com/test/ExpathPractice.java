package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExpathPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/v1/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement gtp = driver.findElement(By.name("//*[@name='uid']"));
		
		Select Gtp = new Select (gtp);
		driver.findElement(By.xpath("// input[@type='uid' and @name='uid'")).sendKeys("Ahmad");

	}
}
