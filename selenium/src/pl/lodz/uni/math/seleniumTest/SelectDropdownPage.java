package pl.lodz.uni.math.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectDropdownPage {
	WebDriver driver;
	By selectList=By.id("select-demo");	
	By multiSelect=By.id("multi-select");	
	By firstSelected=By.id("printMe");
	By allSelected=By.id("printAll");

	public SelectDropdownPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void selectList(String text)
	{
		driver.findElement(selectList).click();
		String name ="//option[@value='"+text+"']";
		By day = By.xpath(name);
		driver.findElement(day).click();
		
	}
	
	public void multiSelectList(String text) 
	{
		driver.findElement(multiSelect).click();
		String name ="//option[@value='"+text+"']";
		By state = By.xpath(name);
		driver.findElement(state).click();
	}
	
	public void clickFirstButtons()
	{
		driver.findElement(firstSelected).click();
		driver.findElement(allSelected).click();
	}
	
	public void clickAllButtons()
	{
		driver.findElement(allSelected).click();
	}
}
