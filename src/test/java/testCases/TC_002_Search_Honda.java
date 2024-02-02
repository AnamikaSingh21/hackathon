package testCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.HondaBikes;
import testBase.BaseClass;

public class TC_002_Search_Honda extends TC_001_Searching_UpcommingBikes {

	
	@Test(priority=2, groups={"regression","masters"})
	public void search_Honda() throws InterruptedException, IOException {
		HondaBikes obj = new HondaBikes(driver);
		
		loger.info("Filtering Honda Bikes");
        obj.selectHonda();
        
        boolean b=obj.ValidateHondaPage();		
		Assert.assertTrue(b);
        
        Thread.sleep(5000);
        
        loger.info("Cicking on View More Button");
        obj.viewMore();
        Thread.sleep(2000);
        
		loger.info("Displaying all Honda Bikes");
		obj.display();
		
		System.out.println();
			
	}
}
