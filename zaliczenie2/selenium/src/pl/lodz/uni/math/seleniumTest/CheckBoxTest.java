package pl.lodz.uni.math.seleniumTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class CheckBoxTest {
@Before
public void setUp()
{
	System.setProperty("webdriver.gecko.driver", "C:/Users/Ana/workspace/seleniumjar/geckodriver.exe");
}
@Test
public void testPage() throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
	CheckBoxPage o = new CheckBoxPage(driver);
	o.clickOnCheckBox();
	Thread.sleep(5000);
	o.clickOnCheckButton();
	Assert.assertTrue(driver.getPageSource().contains("Success - Check box is checked"));;
	driver.quit();
}
@After
public void Null ()
{
	
}
}
