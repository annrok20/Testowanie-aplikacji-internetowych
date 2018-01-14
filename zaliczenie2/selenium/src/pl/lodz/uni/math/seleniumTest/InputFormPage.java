package pl.lodz.uni.math.seleniumTest;

import org.jbehave.core.annotations.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputFormPage {
	WebDriver driver;

	By firstName = By.xpath("//input[@name='first_name']");
	By lastName = By.xpath("//input[@name='last_name']");
	By email = By.xpath("//input[@name='email']");
	By phone = By.xpath("//input[@name='phone']");
	By address = By.xpath("//input[@name='address']");
	By city = By.xpath("//input[@name='city']");
	By state = By.xpath("//select[@name='state']");
	By zipcode = By.xpath("//input[@name='zip']");
	By website = By.xpath("//input[@name='website']");
	By hosting = By.xpath("//input[@name='hosting'][@value='no'][@type='radio']");
	By projectDescription = By.xpath("//textarea[@name='comment']");
	By send = By.xpath("//button[@class='btn btn-default']");
	

	public InputFormPage(WebDriver driver)
	{
		this.driver=driver;
	}
	

	public void contact(String fName, String lname, String Email, String Phone, String Address, String City, String State, String Zip, String Web, String Description) 
	{

//----------
		driver.findElement(hosting).click(); //----------
		driver.findElement(projectDescription).click(); 
		driver.findElement(projectDescription).sendKeys(Description);
		
	}
	public void sendFirstName(String fName) 
	{
		driver.findElement(firstName).sendKeys(fName);
		
	}
	public void sendLastName(String lName) 
	{
		driver.findElement(lastName).sendKeys(lName);
	}
	
	public void sendEmail(String sEmail) 
	{
		driver.findElement(email).sendKeys(sEmail);
	}
	
	public void sendPhone(String sPhone) 
	{
		driver.findElement(phone).sendKeys(sPhone);
	}
	//@Given ("lalallalallallalala")
	public void sendAddress(String sAddress) 
	{
		driver.findElement(address).sendKeys(sAddress);
	}
	public void sendCity(String sCity) 
	{
		driver.findElement(city).sendKeys(sCity);
	}
	public void sendZipCode(String sZipCode) 
	{
		driver.findElement(zipcode).sendKeys(sZipCode);
	}
	public void sendWebsite(String sWebsite) 
	{
		driver.findElement(website).sendKeys(sWebsite);
	}
	public void chooseState(String sState)
	{
		driver.findElement(state).click(); 
		driver.findElement(state).sendKeys(sState);
		driver.findElement(state).click(); 
	}
	public void sendProject(String project) 
	{
		driver.findElement(projectDescription).sendKeys(project);
	}
	public void clickHosting() 
	{
		driver.findElement(hosting).click();
	}
	public void clickSubmit()
	{
		driver.findElement(send).click();
	}

}
