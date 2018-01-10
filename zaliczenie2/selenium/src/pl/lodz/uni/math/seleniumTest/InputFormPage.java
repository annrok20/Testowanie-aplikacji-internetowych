package pl.lodz.uni.math.seleniumTest;

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

		driver.findElement(state).click(); //----------
		driver.findElement(state).sendKeys(State);
		driver.findElement(state).click(); //----------
		driver.findElement(zipcode).sendKeys(Zip);
		driver.findElement(website).sendKeys(Web);
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
	
	public void sendEmail(String Email) 
	{
		driver.findElement(email).sendKeys(Email);
	}
	
	public void sendPhone(String Phone) 
	{
		driver.findElement(phone).sendKeys(Phone);
	}
	public void sendAddress(String Address) 
	{
		driver.findElement(address).sendKeys(Address);
	}
	public void sendCity(String City) 
	{
		driver.findElement(city).sendKeys(City);
	}
	public void sendZipCode(String ZipCode) 
	{
		driver.findElement(zipcode).sendKeys(ZipCode);
	}
	
	public void submitButton()
	{
		driver.findElement(send).click();
	}
}
