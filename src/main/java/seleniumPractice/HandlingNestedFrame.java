package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNestedFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver ();
		driver.get("http://demo.automationtesting.in/Frames.html");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
///driver.switchTo().frame("singleframe");/// this (singleframe) is the Id of Ifram in dom by witch we can use to handle the frame. we also can go by index number and WebEl
		
		WebElement fr = driver.findElement(By.xpath("//*[@type='text']"));
		fr.sendKeys("Ahmad");
		


	}

}
