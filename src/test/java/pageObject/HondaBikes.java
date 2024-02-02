package pageObject;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.Apachi;
import utilities.Apachi111;

public class HondaBikes extends BasePage {

	
	
	public HondaBikes(WebDriver driver) {
		super(driver);
	}
	
	 JavascriptExecutor js= (JavascriptExecutor) driver;
	
	@FindBy(xpath="//select[@class='custom-select']")
	WebElement drp;
	
	@FindBy(xpath="//li[contains(@class,'modelItem')]")
	List<WebElement> Bikes;

	@FindBy(xpath="//li[contains(@class,'modelItem')]/div/div[3]/a/strong")
	List<WebElement> nameOfBikes;
	

	@FindBy(xpath="//li[contains(@class,'modelItem')]/div/div[3]/div[1]")
	List<WebElement> costOfBikes;
	
	@FindBy(xpath="//li[contains(@class,'modelItem')]/div/div[3]/div[2]")
	List<WebElement> launchDateOfBikes;
	
	@FindBy(xpath="//span[@class='zw-cmn-loadMore' and text()='View More Bikes ']")
	WebElement viewMore;
	
	@FindBy(xpath="//h1[contains(text(),'Upcoming Bikes in India ')]")
	public WebElement HondaPage;
	
	
	public void selectHonda() {
		
		 Select drp1= new Select(drp);
		 drp1.selectByVisibleText("Honda");
		  
	}
	
	 public boolean ValidateHondaPage() {
			if(HondaPage.getText().startsWith("Honda")) {
				return true;
			}
			return false;
			
		}
	
	public void viewMore() {
		
		 
		 js.executeScript("arguments[0].scrollIntoView()",viewMore);
		 js.executeScript("arguments[0].click()",viewMore);
		  
	}
	
	public void display() throws IOException {
		
		int k=1;
		 for(int i=0; i<nameOfBikes.size(); i++) {
			 
			 String p = Bikes.get(i).getAttribute("data-price");
			 
			 int a=Integer.valueOf(p);
			 
			 if(a<=400000) {
			  
			  String name=nameOfBikes.get(i).getText();
			  String price1=costOfBikes.get(i).getText();
			  String launchDate=launchDateOfBikes.get(i).getText();
			 
			  System.out.println(name+"    ");
			  System.out.println(price1+"   ");
			  System.out.println(launchDate);
			  Apachi111.writeInExcel("All_Bike_Details", k, 0,name);
			  Apachi111.writeInExcel("All_Bike_Details", k, 1,price1);
			  Apachi111.writeInExcel("All_Bike_Details", k, 2,launchDate);
			
			  k++;

			 } 
			  
		  }
		 
	}
		
}

