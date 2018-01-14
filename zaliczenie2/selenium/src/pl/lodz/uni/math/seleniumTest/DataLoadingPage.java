package pl.lodz.uni.math.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataLoadingPage {
	WebDriver driver;
	By getUser=By.id("save");

	public DataLoadingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickGetUser()
	{
		driver.findElement(getUser).click();
	}

}
