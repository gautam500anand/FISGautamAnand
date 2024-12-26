package testComponents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTest {
public WebDriver driver;

public WebDriver InitializeWebdriver() throws IOException {
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//resources//GlobalData.properties");
prop.load(fis);
String browser =  prop.getProperty("browser");
if(browser.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();}
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.manage().window().maximize();

	return driver ;
	
}

public void launchApp() throws IOException {
	
	driver = InitializeWebdriver();
}
}
