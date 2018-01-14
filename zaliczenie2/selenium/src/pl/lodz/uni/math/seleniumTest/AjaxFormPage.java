package pl.lodz.uni.math.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AjaxFormPage {
	WebDriver driver;
	By name = By.id("title");
	By description = By.id("description");
	By submit =By.id("btn-submit");
	
	public AjaxFormPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void sendName(String sName) 
	{
		driver.findElement(name).sendKeys(sName);
	}
	public void sendDescription(String sDescription) 
	{
		driver.findElement(description).sendKeys(sDescription);
	}
	public void clickSubmit() 
	{
		driver.findElement(submit).click();
	}
	
}
