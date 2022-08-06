package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActionClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/luna/landing-page/?_encoding=UTF8&ref_=ods_gw_ogw_tm_h1_dth_st&pf_rd_r=PJSXBE6M192TGQPH6CDF&pf_rd_p=da99dd5d-fef6-4a82-873f-f59134ec37f2&pd_rd_r=bbb3ded5-e79a-4059-a02d-d7847934d4a2&pd_rd_w=bqzKQ&pd_rd_wg=D0MGc");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Actions a = new Actions (driver);
		WebElement log = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		WebElement sign = driver.findElement(By.xpath("//span[text()='Sign in']"));
		a.moveToElement(log).moveToElement(sign).click().build().perform();
WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
email.sendKeys("adddff");
email.click();
driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		
		
		
	}
	

}
