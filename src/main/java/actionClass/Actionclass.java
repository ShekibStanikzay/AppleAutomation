package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;


public class Actionclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/?mtc=SEM-BF-CDP-GGL-Multi-Multi-NA-Multi-NA-ETA-NA-NA-NA-NA-BT1-NA-NA-NA-THD&cm_mmc=SEM-BF-CDP-GGL-Multi-Multi-NA-Multi-NA-ETA-NA-NA-NA-NA-BT1-NA-NA-NA-THD-71700000002449093-58700000047538642-43700003817116350&ds_rl=5041&gclid=Cj0KCQjwlK-WBhDjARIsAO2sErTZfXhQckq0YJD8Wq2ShyMReVRXF-SwaB8_Bjfn4O67F3G-nom-z4EaAkzGEALw_wcB&gclsrc=aw.ds");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement table = driver.findElement(By.xpath("//*[@id='headerSearch']"));
		Actions a =new Actions(driver);
		a.sendKeys(table,"chair").build().perform();
		WebElement serch = driver.findElement(By.xpath("//button[@id='headerSearchButton']"));
		a.click(serch).build().perform();

	}

}
