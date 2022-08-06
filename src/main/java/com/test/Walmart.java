package com.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Walmart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
	
		
		driver.close();
		
		
		

	}

}
