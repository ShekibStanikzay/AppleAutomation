package testNG;

import org.testng.annotations.Test;

public class AmazonAddItem extends AmazonCart {
	
	
	@Test(dependsOnMethods="catItem")
	public void AddItemstoCart()
	{
		// we should write code here in real time.
	System.out.println("Chekc items");
	}

}
