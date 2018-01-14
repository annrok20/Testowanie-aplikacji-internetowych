package pl.lodz.uni.math.seleniumTest;

import org.jbehave.core.annotations.Given;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class SeleniumTest {
@Before
public void setUp()
{
	System.setProperty("webdriver.gecko.driver", "C:/Users/Ana/workspace/seleniumjar/geckodriver.exe");
}
/*@Test
public void testCheckBoxPage() throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
	CheckBoxPage o = new CheckBoxPage(driver);
	o.clickOnCheckBox();
	Thread.sleep(5000);
	o.clickOnCheckButton();
	Assert.assertTrue(driver.getPageSource().contains("Success - Check box is checked"));
	driver.quit();
}

@Test
public void testInputPage() throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.seleniumeasy.com/test/basic-first-form-demo.html");
	
	InputPage object = new InputPage(driver);
  
	object.enterText("Ania");
	Thread.sleep(5000);
	object.enterNumbers("2","5");
	Thread.sleep(5000);
	Assert.assertTrue(driver.getPageSource().contains("7"));
	Assert.assertTrue(driver.getPageSource().contains("Ania"));
	
	driver.quit();
}

@Test
public void testRadioButtonPage() throws InterruptedException
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
	Assert.assertTrue(driver.getPageSource().contains("Age group: 0 - 5"));
	Thread.sleep(5000);
	driver.quit();
}

@Test 
public void testSelectDropdownPage() throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	SelectDropdownPage object = new SelectDropdownPage(driver);
	Thread.sleep(1000);
	object.selectList("Friday");
	Thread.sleep(1000);
	object.selectList("Ohio");
	Thread.sleep(1000);
	object.selectList("Texas");
	Thread.sleep(1000);
	object.clickFirstButtons();
	Thread.sleep(1000);
	object.clickAllButtons();
	Assert.assertTrue(driver.getPageSource().contains("Friday"));
	Assert.assertTrue(driver.getPageSource().contains("Ohio"));
	Assert.assertTrue(driver.getPageSource().contains("Texas"));
	Thread.sleep(5000);
	driver.quit();
}
@Test 
public void testAjaxFormPage() throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
	AjaxFormPage object = new AjaxFormPage(driver);
	Thread.sleep(1000);
	object.sendName("Ania");
	Thread.sleep(1000);
	object.sendDescription("Testowanie, Selenium, Input Form");
	Thread.sleep(1000);
	object.clickSubmit();
	Thread.sleep(1000);
	Assert.assertTrue(driver.getPageSource().contains("Form submited Successfully!"));
	Thread.sleep(5000);
	driver.quit();
}
*/
@Test 
public void testInputFormPage() throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.seleniumeasy.com/test/input-form-demo.html");
	InputFormPage object = new InputFormPage(driver);
	Thread.sleep(1000);
	object.sendFirstName("Anna");
	Thread.sleep(1000);
	object.sendLastName("Rokicka");
	Thread.sleep(1000);
	object.sendEmail("arokicka@wp.pl");
	Thread.sleep(1000);
	object.sendPhone("(123)456-789-6");
	Thread.sleep(1000);
	object.sendAddress("ul Pomorska 123");
	Thread.sleep(1000);
	object.sendCity("Lodz");
	Thread.sleep(1000);
	object.chooseState("Alabama");
	Thread.sleep(1000);
	object.sendZipCode("90036");
	Thread.sleep(1000);
	object.sendWebsite("arokicka.math.uni.lodz.pl");
	Thread.sleep(1000);
	object.clickHosting();
	Thread.sleep(1000);
	object.sendProject("Testowanie, Selenium, Input Form ");
	Thread.sleep(1000);
	object.clickSubmit();
	Thread.sleep(5000);
	driver.quit();
}


@Test
public void testDownloadPage() throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
	DownloadPage object = new DownloadPage(driver);
	Thread.sleep(1000);
	object.clickDownloadButton();
	Thread.sleep(1000);
	object.waitOnClose();
	Thread.sleep(5000);
	driver.quit();
}


@After
public void Null ()
{
	
}
}
