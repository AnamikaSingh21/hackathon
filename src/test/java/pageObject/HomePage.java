package pageObject;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath="//a[text()='New Bikes']")
	WebElement newBikes;
	
	@FindBy(xpath="//span[text()='Upcoming Bikes']")
	public WebElement upcommingBikes;


	
	public void HoverNewBikes() {
		 Actions a= new Actions(driver);
		 a.moveToElement(newBikes).build().perform();
	}
	
	
	public void clickUpcommingBikes() throws InterruptedException {
		upcommingBikes.click();
		Thread.sleep(5000);
	}

}
