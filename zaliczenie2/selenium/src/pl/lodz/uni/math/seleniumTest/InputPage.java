package pl.lodz.uni.math.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputPage {

	WebDriver driver;
	By input=By.id("user-message");
	By showMessage=By.xpath("//button[@onclick='showInput();']");
	By firstDigit=By.xpath("//input[@id='sum1']");
	By secondDigit=By.xpath("//input[@id='sum2']");
	By getTotal=By.xpath("//button[@onclick='return total();']");
	
	public InputPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void enterText(String text)
	{
		driver.findElement(input).click();
		driver.findElement(input).clear();
		driver.findElement(input).sendKeys(text);
		driver.findElement(showMessage).click();
	}
	
	public void enterNumbers(String text1, String text2)
	{
		driver.findElement(firstDigit).sendKeys(text1);
		driver.findElement(secondDigit).sendKeys(text2);
		driver.findElement(getTotal).click();
	}
	

}
