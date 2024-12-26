package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponents;

public class LandingPage extends AbstractComponents {
	WebDriver driver;
public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	super(driver);
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

@FindBy(xpath = "//*[@id='gh-ac']")
WebElement searchBox;
@FindBy(xpath = "//*[@id='gh-btn']")
WebElement searchButton;
@FindBy(xpath = "(//*[@class='s-item s-item__pl-on-bottom'])[3]/div/div[2]/a")
WebElement book;
@FindBy(xpath = "//*[@id=\"atcBtn_btn_1\"]/span")
WebElement addTocart;
public void goTo() {
	
	driver.get("https://www.ebay.com/");
	
}

public void searchBox() throws InterruptedException {
	searchBox.sendKeys("Book");
	Thread.sleep(2000);
	searchButton.click();
	Thread.sleep(5000);
	book.click();
	Thread.sleep(5000);
	
}

public void addToCart() throws InterruptedException {
addTocart.click();
}
}
