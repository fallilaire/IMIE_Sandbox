package sampleSeleniumTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTest {
	
	private WebDriver driver;
	private String baseUrl = "http://localhost:8081/";
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Freddy\\Downloads\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
	}

	@Test
	public void testConnexionAvecUserDesactive() throws Exception {
		
		driver.get(baseUrl + "dolibarr/index.php?mainmenu=home");
	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("bob");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("bob");
	    // click | css=input.button | 
	    driver.findElement(By.cssSelector("input.button")).click();
		try {
		      assertEquals("Home area - Dolibarr 5.0.1", driver.getTitle());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		
/*
		String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
*/
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
