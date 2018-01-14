package pl.lodz.uni.math.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadPage {
	WebDriver driver;
	
	By start = By.xpath("//button[@id='downloadButton']");
	By close = By.xpath("//div[@class='ui-dialog-buttonset']");
	By completeText = By.xpath("/html/body/div[3]/div[2]/div[1]");
	
    public DownloadPage(WebDriver driver)
    {
    	this.driver = driver;
    }
    
    public void clickDownloadButton()
    {
    	driver.findElement(start).click();
    }
    public void clickCloseButton()
    {
    	driver.findElement(close).click();
    }

    public void waitOnClose()
    {
    	while (true)
    	{
    		if(driver.findElement(completeText).getText().toString().equals("Complete!"))
    		{
    			clickCloseButton();
    			break;
    		}
    	}
    }
}

