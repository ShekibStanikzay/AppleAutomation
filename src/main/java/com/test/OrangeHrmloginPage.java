package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmloginPage{
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Ftag%3Dadmarketus-20%26ref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&"
			+ "");
	driver.manage().window().maximize();
	driver.findElement(By.id("ap_email")).sendKeys("qweryyuu@gmail.com");
	driver.findElement(By.className("a-button-input")). click();
	driver.findElement(By.id("ap_password")).sendKeys("wrgfgfdg");
	
	driver.findElement(By.id("signInSubmit")).click();
	driver.findElement(By.className("")).click();
	driver.findElement(By.xpath("//*[@id='ap_customer_name']"));
	driver.findElement(By.xpath("//*[@id='ap_customer_name']")). click();
	
	
	
System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");

	}

}
