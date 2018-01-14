package pl.lodz.uni.math.seleniumTest;

import org.jbehave.core.annotations.Given;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class SeleniumTest {
	private Page page;
@Before
public void setUp()
{
	System.setProperty("webdriver.gecko.driver", "C:/Users/Ana/workspace/seleniumjar/geckodriver.exe");
	page=new Page();
}
@Test
public void testCheckBoxPage() throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	driver.get(page.ReturnWebsite()+"basic-checkbox-demo.html");
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
	driver.get(page.ReturnWebsite()+"basic-first-form-demo.html");
	
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
	driver.get(page.ReturnWebsite()+"basic-radiobutton-demo.html");
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
	driver.get(page.ReturnWebsite()+"basic-select-dropdown-demo.html");
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
	driver.get(page.ReturnWebsite()+"ajax-form-submit-demo.html");
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

@Test 
public void testInputFormPage() throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	driver.get(page.ReturnWebsite()+"input-form-demo.html");
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
	Thread.sleep(1000);
	Assert.assertTrue(driver.getPageSource().contains("Success "));
	Thread.sleep(5000);
	driver.quit();
}
@Test
public void testFileDownloadPage() throws InterruptedException 
{
	WebDriver driver = new FirefoxDriver();
	driver.get(page.ReturnWebsite()+"generate-file-to-download-demo.html");
	
	FileDownloadPage object = new FileDownloadPage(driver);
	object.enterText("Testowanie, Selenium, Input Form ");
	object.clickToGenerateButton();
	object.clickToDownloadButton();
	Assert.assertTrue(driver.getPageSource().contains("Download"));
	
	driver.quit();
}


@Test
public void testAlertBoxPage() throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	driver.get(page.ReturnWebsite()+"javascript-alert-box-demo.html");
	AlertBoxPage object = new AlertBoxPage(driver);
	Thread.sleep(1000);
	object.clickOnMyAlert();
	Thread.sleep(1000);
	Assert.assertTrue(driver.getPageSource().contains("I am an alert box!"));
	object.clickOK();
	Thread.sleep(1000);
	object.clickOnMyConfirm();
	Thread.sleep(1000);
	object.clickOK();
	Thread.sleep(1000);
	Assert.assertTrue(driver.getPageSource().contains("You pressed OK!"));
	Thread.sleep(1000);
	object.clickOnMyPrompt();
	Thread.sleep(1000);
	object.sendName("Ania");
	Thread.sleep(1000);
	object.clickOK();
	Thread.sleep(1000);
	Assert.assertTrue(driver.getPageSource().contains("You have entered 'Ania' !"));
	Thread.sleep(5000);
	driver.quit();
}

@Test
public void testDataLoading() throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	driver.get(page.ReturnWebsite()+"dynamic-data-loading-demo.html");
	DataLoadingPage object = new DataLoadingPage(driver);
	Thread.sleep(1000);
	object.clickGetUser();
	Thread.sleep(1000);
	Assert.assertTrue(driver.getPageSource().contains("loading..."));
	Thread.sleep(5000);
	driver.quit();
}

@Test
public void testDataListFilterPage() throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	driver.get(page.ReturnWebsite()+"data-list-filter-demo.html");
	DataListFilterPage object = new DataListFilterPage(driver);
	Thread.sleep(1000);
	object.sendText("Brenda");
	Thread.sleep(1000);
	Assert.assertTrue(driver.getPageSource().contains("Name: Brenda Tree"));
	Thread.sleep(5000);
	driver.quit();
}

@Test
public void testDownloadPage() throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
	driver.get(page.ReturnWebsite()+"jquery-download-progress-bar-demo.html");
	DownloadPage object = new DownloadPage(driver);
	Thread.sleep(1000);
	object.clickDownloadButton();
	Thread.sleep(1000);
	Assert.assertTrue(driver.getPageSource().contains("File Download"));
	Thread.sleep(1000);
	object.waitOnClose();
	Thread.sleep(1000);
	Assert.assertTrue(driver.getPageSource().contains("Click below button to start download."));
	Thread.sleep(5000);
	driver.quit();
}
@After
public void Null ()
{
	
}
}
