package pl.lodz.uni.math.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage {
	WebDriver driver;
	By radioButton=By.name("optradio");
	By getCheckValue=By.id("buttoncheck");
	//By unCheckAll=By.xpath("//input[@value='Uncheck All']");	

	public RadioButtonPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnRadioButton()
	{
		driver.findElement(radioButton).click();;
	}
	
	public void clickOnCheckValue()
	{
		driver.findElement(getCheckValue).click();

	} 
}
