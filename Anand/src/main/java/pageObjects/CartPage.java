package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponents;

public class CartPage extends AbstractComponents {
	WebDriver driver;
public CartPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	super(driver);
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

@FindBy(xpath = "//*[@id='gh-cart-n']")
WebElement count;

public void goTo() {
	
	driver.get("https://www.ebay.com/");
	
}



public String itemsInCart() throws InterruptedException {
	return count.getText();
}
}
