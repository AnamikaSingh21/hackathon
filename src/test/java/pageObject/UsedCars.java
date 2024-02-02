package pageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.Apachi111;

public class UsedCars extends BasePage {
	public UsedCars(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//ul[@class='h-d-nav fnt-16 ']/li[7]")
	WebElement UsedCars;


	@FindBy(xpath="//div[@class='h-dd-r']/ul/li[4]/span")
	WebElement chennai;
	

	@FindBy(xpath="//ul[@class='zw-sr-secLev usedCarMakeModelList popularModels ml-20 mt-10']/li/label")
	public List<WebElement> popularModel;
	
	
	
	public void HoverUsedCars() throws InterruptedException {
		
		driver.navigate().back();
		 Actions a= new Actions(driver);
		 a.moveToElement(UsedCars).build().perform();
	}
	
	public void clickChennai() {
		chennai.click();
	}
	
	public void displayPopularModel() throws IOException {
		int k=1;
		for(WebElement p: popularModel) {
			
			String s=p.getText();
			System.out.println(s);
			Apachi111.writeInExcel("All_Popular_Models", k, 0, s);
			k++;
		}
		 
	}
	
	public void navigateToHomePage() {
		
		driver.navigate().back();
		driver.navigate().back();
	}	
	
}
