package pl.lodz.uni.math.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertBoxPage{
	
	WebDriver driver;
	By myAlert= By.xpath("//button[@onclick='myAlertFunction()']");
	By myConfirm= By.xpath("//button[@onclick='myConfirmFunction()']");
	By myPrompt= By.xpath("//button[@onclick='myPromptFunction()']");

	public AlertBoxPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnMyAlert()
	{
		driver.findElement(myAlert).click();;
	}
	public void clickOK()
	{
		driver.switchTo().alert().accept();
	}
	public void sendName(String name)
	{
		driver.switchTo().alert().sendKeys(name);
	}
	public void clickOnMyConfirm()
	{
		driver.findElement(myConfirm).click();
	}
	public void clickOnMyPrompt()
	{
		driver.findElement(myPrompt).click();
	}
}
