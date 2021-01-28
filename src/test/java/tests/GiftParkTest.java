package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GiftParkTest {

	private WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\browser\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	//capturar whatsapp de site
	//fazer login
	//asserts
	//etc

	@Test
	public void testeGoogle() {
		try {
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("Java");
			WebElement searchbutton = driver.findElement(By.name("btnK"));
			searchbutton.submit();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
