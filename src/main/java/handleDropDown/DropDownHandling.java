package handleDropDown;


import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class DropDownHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		WebElement country=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		
		Select s=new Select(country);
		s.selectByIndex(0);/// this option find the name of the country by its number in the list
	//	s.selectByValue("Af");
		//s.selectByVisibleText("Afghanistan");
		List<WebElement> li = s.getOptions();
		Iterator<WebElement>it=li.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		

	}

}
