package pl.lodz.uni.math.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage {
	WebDriver driver;
	By radioButton=By.name("optradio");
	By getCheckValue=By.id("buttoncheck");
	By radioButtonGender=By.name("gender");
	By ageGroup=By.name("ageGroup");
	By getValues= By.xpath("//button[@onclick='getValues();']");

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
	public void clickOnRadioButtonGender()
	{
		driver.findElement(radioButtonGender).click();
	}
	public void clickOnAgeGroup()
	{
		driver.findElement(ageGroup).click();
	}
	public void clickOnGetValues()
	{
		driver.findElement(getValues).click();
	}

}
