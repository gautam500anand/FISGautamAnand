package TestClasses;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.LandingPage;
import testComponents.BaseTest;

public class BookToCart extends BaseTest {
@Test
	public void addBookToCart() throws IOException, InterruptedException {
		
		launchApp();
		LandingPage lp = new LandingPage(driver);
		lp.goTo();
		
		lp.searchBox();
		Thread.sleep(5000);
		Set<String> st = driver.getWindowHandles();
		Iterator<String> it = st.iterator();
		String parentID = it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		lp.addToCart();
		CartPage cp = new CartPage(driver);
		String numberOfitems = cp.itemsInCart();
		Assert.assertTrue(Integer.parseInt(numberOfitems)==1);
		
		
	}
}
