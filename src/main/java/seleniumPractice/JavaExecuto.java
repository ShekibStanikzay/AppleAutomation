package seleniumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecuto {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('txtUsername').value='Admin';");// this one work as a sendkey with java Executor
	
	JavascriptExecutor user=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('btnLogin').click();");/// this method work as click after sendkey with java executor.

	}

}
