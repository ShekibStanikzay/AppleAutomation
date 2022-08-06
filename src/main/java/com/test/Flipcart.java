package com.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://sell.amazon.com/start?ld=seussoagoog-nag004-d");
		driver.manage().window().maximize();
		//driver.manage().window().maximize();
		//System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
	}

}
