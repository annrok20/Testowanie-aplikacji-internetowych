package pl.lodz.uni.math.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataListFilterPage {
	WebDriver driver;
	By inputSearch= By.xpath("//input[@id='input-search']");	
	By dataClickBtn = By.xpath("//input[@placeholder='Search Attendees...']");
	
	public DataListFilterPage(WebDriver driver)
    {
    	this.driver = driver;
    }
	
	public void sendText(String text)
	{
		driver.findElement(inputSearch).click();
		driver.findElement(inputSearch).sendKeys(text);
	}
	

}
