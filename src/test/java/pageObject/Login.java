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

public class Login extends BasePage {

	
	
	public Login(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//div[@id='forum_login_wrap_lg']")
	WebElement Login;

	@FindBy(xpath="//span[text()='Google']")
	WebElement google;
	

	@FindBy(xpath="//input[@class='whsOnd zHQkBf' and @type='email']")
	WebElement Email;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement next;
	
	@FindBy(xpath="//div[@class='o6cuMc Jj6Lae']")
	WebElement msg;
	
	
	
	public String login() {
		// TODO Auto-generated method stub
		Login.click();
		 String s=driver.getWindowHandle();
	     return s;
	}
	
	public void google(String s) {
		
		 google.click();
		 
		 Set<String> windHandle= driver.getWindowHandles();
		   
			String child="";
			for(String str : windHandle) {
				if(!str.equals(s)) {
					child = str;
				}
			}
		
		    driver.switchTo().window(child);
		  
	}

	public void email(String s) {
		// TODO Auto-generated method stub
		Email.sendKeys(s);
		next.click();
		 
	}

	
	public void mssg() throws IOException {
		String s=msg.getText();
		System.out.println();
		System.out.println(s);
		Apachi111.writeInExcel("Error_Message", 1, 0, s);
	}

	

}

