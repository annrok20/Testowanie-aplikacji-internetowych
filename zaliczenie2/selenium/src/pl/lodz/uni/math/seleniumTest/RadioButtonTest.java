package pl.lodz.uni.math.seleniumTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class RadioButtonTest {
@Before
public void setUp()
{
	System.setProperty("webdriver.gecko.driver", "C:/Users/Ana/workspace/seleniumjar/geckodriver.exe");
}
@Test
public void testPage() throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
	RadioButtonPage o = new RadioButtonPage(driver);
	o.clickOnRadioButton();
	Thread.sleep(1000);
	o.clickOnCheckValue();
	Assert.assertTrue(driver.getPageSource().contains("Radio button 'Male' is checked"));
	Thread.sleep(1000);
	o.clickOnRadioButtonGender();
	Thread.sleep(1000);
	o.clickOnAgeGroup();
	Thread.sleep(1000);
	o.clickOnGetValues();
	Thread.sleep(1000);
	Assert.assertTrue(driver.getPageSource().contains("Sex : Male"));
	Thread.sleep(1000);
	Assert.assertTrue(driver.getPageSource().contains("Age group: 0 - 5"));
	Thread.sleep(5000);
	driver.quit();
}
@After
public void Null ()
{
	
}
}
