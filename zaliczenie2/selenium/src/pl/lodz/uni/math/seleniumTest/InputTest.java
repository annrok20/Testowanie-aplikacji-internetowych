package pl.lodz.uni.math.seleniumTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class InputTest {
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", "C:/Users/Ana/workspace/seleniumjar/geckodriver.exe");
	}
	@Test
	public void testPage() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
		InputPage o = new InputPage(driver);
		o.enterText("Ania");
		Thread.sleep(1000);
		o.enterNumbers("1", "2");
		Thread.sleep(1000);
		Assert.assertTrue(driver.getPageSource().contains("Your Message:  Ania"));
		//Assert.assertTrue(driver.getPageSource().contains("Total a + b = 3"));
		Thread.sleep(5000);
		driver.quit();
	}
	@After
	public void Null ()
	{
		
	}

}
