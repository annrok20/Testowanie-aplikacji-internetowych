package pl.lodz.uni.math.seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileDownloadPage {
	WebDriver driver;
	
	By description = By.xpath("//textarea[@id='textbox']");
	By generate = By.xpath("//button[@id='create']");
	By download = By.xpath("//a[@id='link-to-download']");

    
    public FileDownloadPage(WebDriver driver)
    {
    	this.driver = driver;
    }
    

    public void enterText(String text)
    {
    	driver.findElement(description).sendKeys(text);
    }

    public void clickToGenerateButton()
    {
    	driver.findElement(generate).click();
    }
    
    public void clickToDownloadButton()
    {
    	driver.findElement(download).click();
    }
}
